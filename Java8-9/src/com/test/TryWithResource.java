package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Optional;

/**
 * @author Ayuan
 * @Description: Try-with-resource语法
 * @date 2022/9/30 14:29
 */
public class TryWithResource {
    public static void main(String[] args) throws IOException {
        //Java9:不需要再完整的声明一个变量了，我们可以直接将现有的变量丢进去
        InputStream inputStream = Files.newInputStream(Paths.get("pom.xml"));
        try (inputStream) { //单独丢进try中，效果是一样的
            for (int i = 0; i < 100; i++) {
                System.out.println((char) inputStream.read());
            }
        }


        test(null);
        String str = null;
        Optional.ofNullable(str)
                //Java9:如果当前被包装的类不是null，依然返回自己，但是如果是null，那就返回Supplier提供的另一个Optional包装
                .or(() -> Optional.of("AAA"))
                .ifPresent(System.out::println);





    }

    public static void test(String s) {
        //比如现在我们想执行 System.out.println(str.toLowerCase())
        //但是由于我们不清楚给进来的str到底是不是null，如果是null的话会引起空指针异常
        //但是去单独进行一次null判断写起来又不太简洁，这时我们可以考虑使用Optional进行包装
        Optional.ofNullable(s)
                .ifPresent(str -> System.out.println(str.toLowerCase(Locale.ROOT)));
    }


}
