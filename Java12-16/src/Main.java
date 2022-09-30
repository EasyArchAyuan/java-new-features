/**
 * @author Ayuan
 * @Description: TODO
 * @date 2022/9/30 15:37
 */
public class Main {
    public static void main(String[] args) {
        //空指针异常的改进
        test("1231231",null);

        Account account1 = new Account("Admin","12345");
        Account account2 = new Account("Admin","12345");
        System.out.println(account1.equals(account2));
    }


    public static void test(String a, String b){
        //可能给进来的a或是b为null
        int length = a.length() + b.length();
        System.out.println(length);
    }

    //记录类型record: 替换lombok
    public record Account(String username, String password) {
    }
}
