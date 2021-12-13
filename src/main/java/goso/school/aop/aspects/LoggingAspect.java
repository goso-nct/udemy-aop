package goso.school.aop.aspects;

import goso.school.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    @Before("goso.school.aop.aspects.Pointcuts.allBook()")
    public void beforeBookLoggingAdvice(JoinPoint joinPoint) {
        System.out.println("(beforeBookLoggingAdvice) Логируем работу с книгой.");
    }

    @Before("goso.school.aop.aspects.Pointcuts.allMagazine()")
    public void beforeMagazineLoggingAdvice() {
        System.out.println("(beforeMagazineLoggingAdvice) Логируем работу с журналом.");
    }

    @Before("goso.school.aop.aspects.Pointcuts.allGetNoParam()")
    public void beforeGetLoggingAdvice(JoinPoint joinPoint) {
        System.out.println("(beforeGetLoggingAdvice) Попытка получить предмет.");
        System.out.println("  метод: " + joinPoint.getSignature());
    }

    @Before("goso.school.aop.aspects.Pointcuts.allAdd()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        System.out.println("(beforeAddLoggingAdvice) Попытка добавить предмет.");
        System.out.println(joinPoint.getSignature());
        if (joinPoint.getSignature().getName().contains("addBook")) {
            Object arguments[] = joinPoint.getArgs();
            for (Object arg : arguments) {
                if (arg instanceof Book) {
                    System.out.println("  " + (Book) arg);
                } else if (arg instanceof String) {
                    System.out.println("  Добавил: " + arg);
                }
            }
        }
    }
}
