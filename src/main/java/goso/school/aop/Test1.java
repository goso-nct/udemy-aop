package goso.school.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        var book1 = new Book("Лев Толстой", "Война и мир");
        var book2 = new Book("Федор Достоевский", "Преступление и наказание");

        var uniLib = context.getBean("uniLibrary", UniLibrary.class);
        uniLib.getBook();
        uniLib.returnBook();
        uniLib.addBook("Иванов", book1);
        uniLib.getMagazine();
        uniLib.addMagazine();

        var schoolLib = context.getBean("schoolLibrary", SchoolLibrary.class);
        schoolLib.addBook("Петров", book2);
        schoolLib.getBook();
        schoolLib.getMagazine();

        context.close();
    }
}
