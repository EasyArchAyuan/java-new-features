Java11(LTS)新特性：
1.GC垃圾回收器：Linux版本新增了ZGC.ZGC是一个基于region，压缩型的垃圾收集器。只有root扫描阶段回STW,因此GC停顿时间不会随着堆的增长和存活对象的增长而增长。
2.用于Lambda的形参局部变量语法
3.针对于String类的方法增强
4.全新的HttpClient使用