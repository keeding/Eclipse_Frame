package com.wqp.notes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notes")
public class NotesController {
	
    /**
     * Rest风格
     * 访问地址：http://localhost:8080/rest/test/path/123456
     * @return
     */
    @RequestMapping("getNotes/{a}")
    private String rest(@PathVariable String a) {
        System.out.println(a);
        return "SpringMVC";
    }
    
	@RequestMapping("springMVC")
    private String toJsp() {
        return "SpringMVC";
    }
}
