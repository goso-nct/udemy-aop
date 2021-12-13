package goso.school.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("goso.school.aop.aspects.Pointcuts.allGetNoParam()")
    public void beforeGetLoggingAdvice() {
        System.out.println("(beforeGetLoggingAdvice) Попытка получить предмет.");
    }
}
