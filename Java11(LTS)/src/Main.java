import java.util.function.Consumer;

/**
 * @author Ayuan
 * @Description: 用于Lambda的形参局部变量语法
 * @date 2022/9/30 14:55
 */
public class Main {
    public static void main(String[] args) {
        //Java11:支持在lambda中使用var
        Consumer<String> consumer = (var str) -> {
        };


        var str = "AB\nC\nD";
        //isBlank方法用于判断是否字符串为空或者是仅包含空格
        System.out.println(str.isBlank());

        //Java11:lines()根据字符串中的\n换行符进行切割，分为多个字符串，并转换为Stream进行操作
        str.lines().forEach(System.out::println);

        String str2 = "ABCD";
        //Java11:repeat()基于原本字符串的重复字符串
        System.out.println(str.repeat(2));

        String str3 = " A B C D ";
        //去除首位空格
        System.out.println(str.strip());
        //去除首部空格
        System.out.println(str.stripLeading());
        //去除尾部空格
        System.out.println(str.stripTrailing());

    }
}
