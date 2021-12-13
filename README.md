Раздел 2. AOP

Книга  
@Before("execution(public void getBook())")  
public void beforeGetBookAdvice() {

Книга и Журнал  
@Before("execution(public void get*())")  
public void beforeGetAdvice() {

execution(* *(..)) 
- любой возвращаемый тип
- любое имя метода
- любое к-во параметров

@Pointcut("execution(* get*())")  
public void allGetNoParam() {}  

Через JoinPoint можно получить инфу о методе в котором сработал advice.  

@AfterReturning перехватывает отработку целевого метода и может менять результат его работы.    
@AfterReturning(pointcut = "execution(* getStudents())", returning = "students")  

@AfterThrowing может залоггировать, что-то обработать, но не позволяет отменить проброску эксепшена наверх  

@Around д.сам вызывать целевой метод через ProceedingJoinPoint  
позволяет обработать исключение  



