package com.wqp.notes.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wqp.notes.po.Notes;
import com.wqp.notes.service.NotesService;

@Controller
@RequestMapping("/notes")
public class NotesController {
	@Resource
	private NotesService ns;
	
	@RequestMapping("getNotes/{id}")
	@ResponseBody
	public Notes getNotes(@PathVariable int id){
		Notes n = ns.getNotes(id);
		System.out.println(n);
		return n;
	}
}
