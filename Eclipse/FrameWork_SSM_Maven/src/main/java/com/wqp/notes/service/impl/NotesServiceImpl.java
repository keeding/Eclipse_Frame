package com.wqp.notes.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wqp.notes.dao.NotesMapper;
import com.wqp.notes.po.Notes;
import com.wqp.notes.service.NotesService;

@Service
public class NotesServiceImpl implements NotesService {
	@Resource
	private NotesMapper notesMapper;
	
	public Notes getNotes(int id){
		Notes n = notesMapper.findUser(id);
		return n;
	}

}
