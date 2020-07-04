package com.example.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Huzi114
 * @ClassName: DemoController
 * @Description:
 * @date 2020/7/4 10:00
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/hello")
    public String helloDemo() {
        return "hello demo!";
    }
}
