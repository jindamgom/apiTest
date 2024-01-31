package com.jin.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * getMapping에 아무것도 없을 때 = switch의 default = 문자열반환
 * 
 */
@Controller
@Slf4j
public class HomeController {
    /*
    * 0123
    * index.html 적용
    * */
    @GetMapping("/")
    public String home()
    {
        //index 페이지 필요한 리소스 작업
        System.out.println("index controller");
        return "index"; //thymeleaf 의존 반드시 추가
    }
}
