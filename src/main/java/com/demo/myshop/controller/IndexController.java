package com.demo.myshop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // 메인페이지 -> 추후 랜딩페이지로 디벨롭
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
