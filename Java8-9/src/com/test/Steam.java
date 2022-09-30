package com.test;

import java.util.stream.Stream;

/**
 * @author Ayuan
 * @Description: Stream加强
 * @date 2022/9/30 14:28
 */
public class Steam {
    public static void main(String[] args) {
        //Java8:Stream
        Stream  //这里我们可以直接将一些元素封装到Stream中
                .of("A", "B", "C", "D")
                //通过过滤器过滤
                .filter(s -> s.equals("B"))
                //去重
                .distinct()
                //最后打印
                .forEach(System.out::println);

        //如果传入null会报错
        Stream.of(null).forEach(System.out::println);
        //Java9:使用新增的ofNullable方法，这样就不会了，不过这样的话流里面就没东西了
        Stream.ofNullable(null).forEach(System.out::println);

        //Java8:只能像这样生成无限的流，第一个参数是种子，就是后面的UnaryOperator的参数i一开始的值，最后会返回一个值作为i的新值，每一轮都会执行UnaryOperator并生成一个新值到流中，这个是源源不断的，如果不加limit()进行限制的话，将无限生成下去。
        Stream.iterate(0, i -> i + 1)
                //这里限制生成20个
                .limit(20)
                .forEach(System.out::println);

        //Java9:快速生成一组0~19的int数据，中间可以添加一个断言，表示什么时候结束生成
        Stream.iterate(0, i -> i < 20, i -> i + 1)
                .forEach(System.out::println);


        Stream.iterate(0, i -> i + 1)
                .limit(20)
                //Java9:当i小于10时正常通过，一旦大于等于10直接截断
                .takeWhile(i -> i < 10)
                .forEach(System.out::println);


        Stream.iterate(0, i -> i + 1)
                .limit(20)
                //Java9:和上面相反，上来就是截断状态，只有当满足条件时再开始通过
                .dropWhile(i->i<10)
                .forEach(System.out::println);

    }
}
