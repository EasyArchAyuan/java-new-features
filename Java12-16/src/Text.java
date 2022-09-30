/**
 * @author Ayuan
 * @Description: 三引号语法
 * @date 2022/9/30 15:31
 */
public class Text {
    public static void main(String[] args) {

        //#当我们需要使用复杂字符串时，可能字符串中包含了很多需要转义的字符，比如双引号等，这时我们就可以使用三引号来囊括字符串
        var s = """
                fuck
                you
                bitch
                """;

        System.out.println(s);



    }
}
