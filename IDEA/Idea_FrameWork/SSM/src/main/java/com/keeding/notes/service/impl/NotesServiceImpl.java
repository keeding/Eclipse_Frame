package com.keeding.notes.service.impl;

import javax.annotation.Resource;

import com.keeding.notes.dao.NotesMapper;
import com.keeding.notes.po.Notes;
import com.keeding.notes.service.NotesService;
import org.springframework.stereotype.Service;


@Service
public class NotesServiceImpl implements NotesService {
	@Resource
	private NotesMapper notesMapper;
	
	public Notes getNotes(int id){
		Notes n = notesMapper.findUser(id);
		return n;
	}

}
