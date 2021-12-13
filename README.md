Раздел 2. AOP

Книга  
@Before("execution(public void getBook())")  
public void beforeGetBookAdvice() {

Книга и Журнал  
@Before("execution(public void get*())")  
public void beforeGetAdvice() {