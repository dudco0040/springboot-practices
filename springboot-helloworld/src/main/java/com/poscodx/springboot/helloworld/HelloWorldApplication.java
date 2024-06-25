package com.poscodx.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 1. 스프링 어플리케이션의 부트 스트래핑 역할(모든 준비를 끝마침) - Bootstrapping Class
 * 2. 설정 클래스: Configuration Class
 */

@SpringBootApplication
public class HelloWorldApplication {
	
	public static void main(String[] args) {
		/**
		 * SpringApplication.run(...) 안에서 일어나는 일
		 * 1. 어플리케이션 컨텍스(Application Context, Spring Container) 생성
		 * 2. 만약, 웹 어플리케이션이면 웹 어플리케이션 타입 결정(Spring MVC, Reactive)
		 * 3. Annotation scanning + Configuration Class를 통해서 빈 생성/등록/와이어링 작업
		 * 4. 만약, 웹 어플리케이션이고 타입이 Spring MVC이면 
		 * 	 - 내장(embeded) 서버(TomcatEmbededServiceContainer) 인스턴스 생성
		 * 	 - 서버 인스턴스에 웹 어플리케이션을 배포
		 * 	 - 서버 인스턴스를 실행 -> tomcat 서버가 뜸
		 * 5. ApplicationRunner 인스페이스를 구현한 빈을 APpplication Context에서 찾아서  
		 */
		try(ConfigurableApplicationContext ac = SpringApplication.run(HelloWorldApplication.class, args)){
				
		}
		
//		ApplicationContext ac = null;
//		try {
//			ac = SpringApplication.run(HelloWorldApplication.class, args);
//		} catch(Throwable ex) {
//			
//		} finally {
//			((ConfigurableApplicationContext)ac).close();
//		}
	}
}
