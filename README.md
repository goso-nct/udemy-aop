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


