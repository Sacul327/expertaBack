package com.pubs.pubs.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
		
//		Pubs pub = new Pubs();
//		Pubs pub2 = new Pubs();
//		pub.setCuit("123123123");
//		pub.setDomicilio("acoyte 1000");
//		pub.setId(1);
//		pub.setEmail("lb@gmail.com");
//		pub.setHorario("19 a 3hs");
//		pub.setName("barsinso");
//		pub.setParking(1);
//		pub.setPhone("111111111");
//		pub.setPuntuacion(4);
//		
//		pub2.setCuit("123123123");
//		pub2.setDomicilio("caracas 707");
//		pub2.setId(2);
//		pub2.setEmail("julia00@gmail.com");
//		pub2.setHorario("19 a 3hs");
//		pub2.setName("La Rural");
//		pub2.setParking(1);
//		pub2.setPhone("222222222");
//		pub2.setPuntuacion(4);
//		pubList.add(pub);
//		pubList.add(pub2);
		
		pubList = pubsDao.findAll();
		
		
		return pubList;
	}
	
	@PostMapping("/add")
	public void addBar(@RequestBody Pubs newPub) {
		pubsDao.save(newPub);
	}
	
}
