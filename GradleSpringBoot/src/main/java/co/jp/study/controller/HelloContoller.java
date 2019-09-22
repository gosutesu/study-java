package co.jp.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * サンプルRestControllerクラス
 */
@RestController("/")
public class HelloContoller {

	@RequestMapping
	public String hello() {
		System.out.println("rest controller");
		a();
		return "Hello World!";
	}
	
	private void a() {
		System.out.println("aaaa");
	}

}
