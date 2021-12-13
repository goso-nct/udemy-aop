package goso.school.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    String lib = "Университета";

    @Override
    public void getBook() {
        System.out.println(">> Берем Книгу из библиотеки " + lib);
    }
    @Override
    public void returnBook() { System.out.println(">> Возвращаем Книгу в библиотеку " + lib); }
    @Override
    public void addBook() { System.out.println(">> Добавляем Книгу в библиотеку " + lib); }

    @Override
    public void getMagazine() { System.out.println(">> Берем Журнал из библиотеки " + lib); }
    @Override
    public void returnMagazine() { System.out.println(">> Возвращаем Журнал в библиотеку " + lib); }
    @Override
    public void addMagazine() { System.out.println(">> Добавляем Журнал в библиотеку " + lib); }

}
