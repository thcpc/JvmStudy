# Class 文件组成



| 名字                          | 长度            | 含义                                       |
| ----------------------------- | --------------- | ------------------------------------------ |
| MagicNumber                   | u4              | 0xCAFEBABE,表示该文件为Java的Class文件     |
| MinorVerion                   | u2              | 版本号-副版本号                            |
| MajorVersion                  | u2              | 版本号-主版本号                            |
| ConstPoolCount                | u2              | 常量池大小                                 |
| ConstPool[ConstPoolCount -1 ] | cp_info         | 常量池项集合，有效索引为1～n-1， 0为保留段 |
| accessFlags                   | u2              |                                            |
| thisClass                     | u2              |                                            |
| InterfaceCount                | u2              |                                            |
| Interfaces[InterfaceCount]    | u2              |                                            |
| FieldsCount                   | u2              |                                            |
| Fields[FieldsCount]           | filed_info      |                                            |
| methodsCount                  | u2              |                                            |
| methods[methodsCount]         | method_info     |                                            |
| attributesCount               | u2              |                                            |
| attributes[attributesCount]   | attributes_info |                                            |



