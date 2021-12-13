package goso.school.aop;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class University {

    String name;
    List<Student> students = List.of(
            new Student("Иванов", 2, 7.1),
            new Student("Птров", 1, 8.2),
            new Student("Сидорова", 3, 7.7)
    );

    public List<Student> getStudents() {
        System.out.println("метод getStudents():\n" + students);
        return students;
    }

}
