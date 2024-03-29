package goso.school.aop;

abstract class AbstractLibrary {

    String name;

    abstract public void getBook();
    abstract public void returnBook();
    abstract public void addBook(String user, Book book);

    abstract public void getMagazine();
    abstract public void returnMagazine();
    abstract public void addMagazine();

}
