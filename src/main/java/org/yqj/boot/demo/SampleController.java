package org.yqj.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yaoqijun.
 * Date:2015-12-14
 * Email:yaoqj@terminus.io
 * Descirbe:
 */
@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "hello world";
    }

    public static void main(String[] args) {
        System.out.println("test sample controller test");
        SpringApplication.run(SampleController.class,args);
    }
}
