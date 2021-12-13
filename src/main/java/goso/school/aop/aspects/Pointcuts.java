package goso.school.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(* get*())") public void allGetNoParam() {}
    @Pointcut("execution(* return*())") public void allReturn() {}
    @Pointcut("execution(* add*(..))") public void allAdd() {}
    @Pointcut("execution(* *Book())") public void allBook() {}
    @Pointcut("execution(* *Magazine())") public void allMagazine() {}

}
