package goso.school.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("goso.school.aop")
@EnableAspectJAutoProxy
public class AppConfig {
}
