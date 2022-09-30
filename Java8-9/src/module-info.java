module NewHelloWorld {
    //使用requires导入模块
    requires java.logging;

    //使用exports把com.test包暴露出去，其他模块才能导入
    exports com.test;

    //还可以to某个模块指定暴露给谁
    //exports com.test to module.b

    //使用transitive来向其他模块传递此依赖
    requires transitive java.se;

    //通过使用opens关键字来为其他模块开放反射权限
    opens com.test;

    //也可以指定目标开放反射
    //opens com.test to module.b;

    //使用uses指定，Test是一个接口（比如需要的服务等），模块需要使用到
    uses com.test.Test;

    //声明此模块提供了Test的实现类
    provides com.test.Test with com.test.TestImpl;
}