package com.keeding.notes.controller;

import javax.annotation.Resource;

import com.keeding.notes.po.Notes;
import com.keeding.notes.service.NotesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


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
	@RequestMapping("getNote")
	public void getNote(){
		System.out.println();
	}
}
