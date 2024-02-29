package com.example.demo.controller;

// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

// @Controller
// public class test {
//     @RequestMapping("/test")
//     @ResponseBody
//     public String test(){
//         return "test";
//     }
// }



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class test {
    @RequestMapping("/")
    @ResponseBody
    public String test(){
        // 获取当前时间
        LocalDateTime now = LocalDateTime.now();
        // 定义时间格式，精确到秒
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // 格式化当前时间为字符串
        String currentTime = now.format(formatter);
        // 返回当前时间字符串
        return "hello zrq  ##  Current Time: " + currentTime;
    }
}
