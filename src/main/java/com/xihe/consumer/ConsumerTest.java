package com.xihe.consumer;

import com.xihe.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xihe on 2016/9/17.
 */
public class ConsumerTest {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");

    context.start();

    DemoService demoService = (DemoService) context.getBean("demoService");
    System.out.println(demoService.getMsg("xihe"));


  }
}
