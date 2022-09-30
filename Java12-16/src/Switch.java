/**
 * @author Ayuan
 * @Description: TODO
 * @date 2022/9/30 15:26
 */
public class Switch {

    /**
     * java12之前
     */
    public static String grade(int score) {
        score /= 10;  //既然分数段都是整数，那就直接整除10
        String res = null;
        switch (score) {
            case 10:
            case 9:
                res = "优秀";   //不同的分数段就可以返回不同的等级了
                break;   //别忘了break，不然会贯穿到后面
            case 8:
            case 7:
                res = "良好";
                break;
            case 6:
                res = "及格";
                break;
            default:
                res = "不及格";
                break;
        }
        return res;
    }

    /**
     * 新特性改进增强switch
     */
    public static String newGrade(int score) {
        score /= 10;
        return switch (score) {
            case 10, 9 -> "优秀";
            case 8, 7 -> "良好";
            case 6 -> "及格";
            default -> "不及格";
        };
    }


    /**
     * var res = switch (obj) {   //这里和之前的switch语句是一样的，但是注意这样的switch是有返回值的，所以可以被变量接收
     *     case [匹配值, ...] -> "优秀";   //case后直接添加匹配值，匹配值可以存在多个，需要使用逗号隔开，使用 -> 来返回如果匹配此case语句的结果
     *     case ...   //根据不同的分支，可以存在多个case
     *     default -> "不及格";   //注意，表达式要求必须涵盖所有的可能，所以是需要添加default的
     * };
     */


    /**
     * var res = switch (obj) {   //增强版switch语法
     *     case [匹配值, ...] -> "优秀";
     *     default -> {   //我们可以使用花括号来将整套逻辑括起来
     *         //... 我是其他要做的事情
     *         yield  "不及格";  //注意处理完成后需要返回最终结果，但是这样并不是使用return，而是yield关键字
     *     }
     * };
     */

    /**
     * var res = switch (args.length) {   //增强版switch语法
     *     case [匹配值, ...]:
     *         yield "AAA";   //传统的:写法，通过yield指定返回结果，同样不需要break
     *     default:
     *     		System.out.println("默认情况");
     *         yield "BBB";
     * };
     */
}
