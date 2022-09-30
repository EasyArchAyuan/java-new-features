package com.test;

/**
 * @author Ayuan
 * @Description: 钻石运算符进行自动类型推断
 * @date 2022/9/30 14:36
 */
public abstract class Text<T> {
    public T t;

    public Text(T t) {
        this.t = t;
    }

    public abstract T text();


    public static void main(String[] args) {
        //在低版本这样写是会直接报错的，因为匿名内部类不支持自动类型推断，但是很明显我们这里给的参数是String类型的，所以明明有机会进行类型推断，却还是要我们自己填类型，就很蠢
        Text<String> test = new Text<>("AAA") {
            @Override
            //在Java 9之后，这样的写法终于可以编译通过了
            public String text() {
                return t;
            }
        };
    }
}
