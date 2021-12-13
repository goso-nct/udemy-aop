package goso.school.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(* get*())")
    public void allGetNoParam() {}
}
