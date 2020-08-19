package com.pubs.pubs.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pubs.pubs.dao.PubsDao;
import com.pubs.pubs.models.Pubs;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PubsController {
	
	@Autowired
	private PubsDao pubsDao;

	@RequestMapping("/getPubs")
	public List<Pubs> getPubs() {
		List<Pubs> pubList = new ArrayList<Pubs>();
		pubList = pubsDao.findAll();
		return pubList;
	}
	
	@PostMapping("/add")
	public void addBar(@RequestBody Pubs newPub) {
		pubsDao.save(newPub);
	}
	
	@DeleteMapping("delete/{id}")  
    public void deleteBar(@PathVariable("id") Long id) {  
		pubsDao.deleteById(id);
	}
	
}
