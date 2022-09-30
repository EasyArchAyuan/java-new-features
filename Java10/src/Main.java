import java.util.List;

/**
 * @author Ayuan
 * @Description: 局部变量类型推断
 * @date 2022/9/30 14:45
 */
public class Main {

   // var a = "AAA";  var关键字仅适用于局部变量

    public Main(){

    }

    public static void main(String[] args) {
        //之前我们定义变量必须指定类型
        String a = "Hello World!";
        //Java10支持自动类型推断
        var b = "Hello World!";
        //var c;  var关键字必须位于有初始值设定的变量上
        System.out.println(b.getClass());

        var c = List.of(1,2,3,4);
        System.out.println();
    }
}
