package goso.school.aop.aspects;

import goso.school.aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class ReturnAspect {

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningAdvice(List<Student> students) {
        //Student st0 = students.get(0);
        students.get(0).setName("Mr. " + students.get(0).getName());
        students.get(0).setAvgBall(students.get(0).getAvgBall() + 0.5);
    }

}
