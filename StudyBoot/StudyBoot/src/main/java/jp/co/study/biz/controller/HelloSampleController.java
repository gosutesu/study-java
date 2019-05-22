package jp.co.study.biz.controller;

import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello用サンプルコントローラー
 */
@RestController
@RequestMapping(path="/hello")
public class HelloSampleController {

  @RequestMapping(path="/")
  public String init() {
    return "Hello!" + LocalDateTime.now();
  }

}
