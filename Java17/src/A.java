/**
 * @author Ayuan
 * @Description: 密封类型
 * @date 2022/9/30 16:44
 */
public final class A {
    //添加final关键字后，不允许对此类继承
    //如果添加了final关键字，那么无论是谁，包括我们自己也是没办法实现继承的，但是现在我们有一个需求，只允许我们自己写的类继承A，但是不允许别人写的类继承A，这时该咋写？在Java 17之前想要实现就很麻烦。


    //在class关键字前添加sealed关键字，表示此类为密封类型，permits后面跟上允许继承的类型，多个子类使用逗号隔开
//    public sealed class A permits B{
//
//    }

}
