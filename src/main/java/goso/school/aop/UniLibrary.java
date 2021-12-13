package goso.school.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("Берем книгу из библиотеки Университета");
    }

    @Override
    public void getMagazine() {
        System.out.println("Берем Журнал из библиотеки Университета");
    }
}
