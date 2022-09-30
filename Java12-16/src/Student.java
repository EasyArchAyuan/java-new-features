/**
 * @author Ayuan
 * @Description: 在使用instanceof判断类型成立后，会自动强制转换类型为指定类型
 * @date 2022/9/30 15:33
 */
public class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

//    @Override
//    public boolean equals(Object obj) {
//        //首先判断是否为Student类型
//        if (obj instanceof Student) {
//            //如果是，那么就类型转换
//            Student student = (Student) obj;
//            //最后比对属性是否一样
//            return student.name.equals(this.name);
//        }
//        return false;
//    }

    @Override
    public boolean equals(Object obj) {
        //在比较完成的屁股后面，直接写变量名字，而这个变量就是类型转换之后的
        if (obj instanceof Student student) {
            return student.name.equals(this.name);
        }
        return false;
    }
}
