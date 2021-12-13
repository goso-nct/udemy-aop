package goso.school.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("Берем Книгу из библиотеки Школы");
    }

    @Override
    public void getMagazine() { System.out.println("Берем Журнал из библиотеки Школы"); }
}
