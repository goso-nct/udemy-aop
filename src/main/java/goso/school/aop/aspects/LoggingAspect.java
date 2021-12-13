package goso.school.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    @Before("goso.school.aop.aspects.Pointcuts.allBook()")
    public void beforeBookLoggingAdvice() {
        System.out.println("10 (beforeBookLoggingAdvice) Логируем работу с книгой.");
    }

    @Before("goso.school.aop.aspects.Pointcuts.allMagazine()")
    public void beforeMagazineLoggingAdvice() {
        System.out.println("10 (beforeMagazineLoggingAdvice) Логируем работу с журналом.");
    }

    @Before("goso.school.aop.aspects.Pointcuts.allGetNoParam()")
    public void beforeGetLoggingAdvice() {
        System.out.println("10 (beforeGetLoggingAdvice) Попытка получить предмет.");
    }

}
