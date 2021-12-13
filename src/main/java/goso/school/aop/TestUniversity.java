package goso.school.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class TestUniversity {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        University un = context.getBean("university", University.class);
        List<Student> sts = un.getStudents();
        System.out.println(sts);
        context.close();
    }
}
