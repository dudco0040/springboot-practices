package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @SpringBootApplication Meta Annotaion
 * 
 * + @SpringBootConfiguration ex) ex01, ex02
 * + @ComppnentScan ex04를 포함, 하부 패키지를 스캔한다. ex) ex03
 * + @EnableAutoConfiguration:
 * 	  1. MVC, AOP, Security, JPA 설정 등을 자동으로 설정
 *	  2. 발견된 Starter Dependency(Library) 기반으로 설정 ( 관례를 따르는 default 설정)
 *    3. application.properties or application.yaml 안에 미세 설정 (필수)
 *    4. Spring Boot의 Auto Configuration이나 미세설정으로 불가능 할 경우, Java 설정
 */

@SpringBootApplication
public class MyApplication {
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)){
		}
	}
}
