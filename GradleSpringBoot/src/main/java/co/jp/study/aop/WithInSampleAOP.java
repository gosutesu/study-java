package co.jp.study.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * withinを使用したサンプルAOP
 */
@Component
@Aspect
public class WithInSampleAOP {

	// privateメソッドには実行されない
	// ワイルドカードを使用した指定の仕方はできない。@within(*.RestController)
	// Caused by: org.springframework.beans.factory.BeanCreationException: Error
	// creating bean with name
	// 'org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryConfiguration$EmbeddedTomcat':
	// Initialization of bean failed; nested exception is
	// java.lang.IllegalArgumentException: Pointcut is not well-formed: expecting
	// 'identifier' at character position 8
	// @within(*.RestController)
	@Before("@within(org.springframework.web.bind.annotation.RestController)")
	public void within() {
		System.out.println("before within pointcut");
	}
}
