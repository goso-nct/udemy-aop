package goso.school.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {

    @Before("goso.school.aop.aspects.Pointcuts.allGetNoParam()")
    public void beforeGetSecurityAdvice() {
        System.out.println("(beforeGetSecurityAdvice) Проверка возможности взять предмет.");
    }
}
