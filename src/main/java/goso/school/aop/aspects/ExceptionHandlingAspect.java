package goso.school.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {

    @Before("goso.school.aop.aspects.Pointcuts.allGetNoParam()")
    public void beforeGetExceptionHandling() {
        System.out.println("30 (beforeGetExceptionHandling) Обработка эксепшена при попытки взятия");
    }
}
