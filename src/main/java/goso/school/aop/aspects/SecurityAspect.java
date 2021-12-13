package goso.school.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecurityAspect {

    @Before("goso.school.aop.aspects.Pointcuts.allGetNoParam()")
    public void beforeGetSecurityAdvice() {
        System.out.println("(beforeGetSecurityAdvice) Проверка возможности взять.");
    }
}
