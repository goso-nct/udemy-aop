package goso.school.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        var uniLib = context.getBean("uniLibrary", UniLibrary.class);
        uniLib.getBook();

        var schoolLib = context.getBean("schoolLibrary", SchoolLibrary.class);
        schoolLib.getBook();

        context.close();
    }
}
