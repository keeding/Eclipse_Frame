package com.keeding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestController {
    @RequestMapping("springMVC")
    private String toJsp() {
        return "jsp";
    }

    /**
     * Rest风格
     * 访问地址：http://localhost:8080/rest/test/path/123456
     * @return
     */
    @RequestMapping("path/{a}")
    private String rest(@PathVariable String a) {
        System.out.println(a);
        return "jsp";
    }
}
