package com.jin.app.moive.controller;


import com.jin.app.moive.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/movie")
public class MovieContoller {

    @Autowired
    private MovieService movieService;

    @GetMapping("/api1.do")
    public ResponseEntity<?> json(String targetDt) {
        log.debug("-------------- api1 --------------");
        System.out.println("진흥위원회 test");
        return movieService.json(targetDt);

    }

}
