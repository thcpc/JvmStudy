package jvm.parser.loader.support.token;

import jvm.parser.clazz.constant.pools.ConstantUtf8Info;

import jvm.parser.datatype.U2;
import jvm.parser.loader.ClazzLoader;
import jvm.parser.loader.support.ConstantToken;


import java.io.IOException;
import java.io.InputStream;
import java.io.UTFDataFormatException;

public class ConstantUtf8Token implements ConstantToken,U2 {
    private int utflen;

    private ConstantUtf8Info constantUtf8Info;

    @Override
    public ConstantUtf8Info getConstantInfo() {
        return constantUtf8Info;
    }

    @Override
    public void accept(ClazzLoader visitor, InputStream inputStream) {
        this.utflen = this.readU2(inputStream);
        byte[] bytearr = new byte[this.utflen];
        try {
            inputStream.read(bytearr);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        try {
            this.constantUtf8Info = new ConstantUtf8Info(this.readUtf8(bytearr));
        } catch (UTFDataFormatException e) {
            throw new RuntimeException(e);
        }
    }

    private String readUtf8(byte[] bytearr) throws UTFDataFormatException {

        char[] chararr = new char[utflen];

        int c, char2, char3;
        int count = 0;
        int chararr_count=0;



        while (count < utflen) {
            c = (int) bytearr[count] & 0xff;
            if (c > 127) break;
            count++;
            chararr[chararr_count++]=(char)c;
        }

        while (count < utflen) {
            c = (int) bytearr[count] & 0xff;
            switch (c >> 4) {
                case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7:
                    /* 0xxxxxxx*/
                    count++;
                    chararr[chararr_count++]=(char)c;
                    break;
                case 12: case 13:
                    /* 110x xxxx   10xx xxxx*/
                    count += 2;
                    if (count > utflen)
                        throw new UTFDataFormatException(
                                "malformed input: partial character at end");
                    char2 = (int) bytearr[count-1];
                    if ((char2 & 0xC0) != 0x80)
                        throw new UTFDataFormatException(
                                "malformed input around byte " + count);
                    chararr[chararr_count++]=(char)(((c & 0x1F) << 6) |
                            (char2 & 0x3F));
                    break;
                case 14:
                    /* 1110 xxxx  10xx xxxx  10xx xxxx */
                    count += 3;
                    if (count > utflen)
                        throw new UTFDataFormatException(
                                "malformed input: partial character at end");
                    char2 = (int) bytearr[count-2];
                    char3 = (int) bytearr[count-1];
                    if (((char2 & 0xC0) != 0x80) || ((char3 & 0xC0) != 0x80))
                        throw new UTFDataFormatException(
                                "malformed input around byte " + (count-1));
                    chararr[chararr_count++]=(char)(((c     & 0x0F) << 12) |
                            ((char2 & 0x3F) << 6)  |
                            ((char3 & 0x3F) << 0));
                    break;
                default:
                    /* 10xx xxxx,  1111 xxxx */
                    throw new UTFDataFormatException(
                            "malformed input around byte " + count);
            }
        }
        // The number of chars produced may be less than utflen
        return new String(chararr, 0, chararr_count);
    }

}
