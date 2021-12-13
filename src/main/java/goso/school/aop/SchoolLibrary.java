package goso.school.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

    String lib = "Школы";

    @Override
    public void getBook() {
        System.out.println(">> Берем Книгу из библиотеки " + lib + "\n");
    }
    @Override
    public void returnBook() { System.out.println(">> Возвращаем Книгу в библиотеку " + lib + "\n"); }

    @Override
    public void addBook(String user, Book book) {
        System.out.println(">> Добавляем Книгу в библиотеку " + lib + "\n");
    }

    @Override
    public void getMagazine() { System.out.println(">> Берем Журнал из библиотеки " + lib + "\n"); }
    @Override
    public void returnMagazine() { System.out.println(">> Возвращаем Журнал в библиотеку " + lib + "\n"); }
    @Override
    public void addMagazine() { System.out.println(">> Добавляем Журнал в библиотеку " + lib + "\n"); }

}
