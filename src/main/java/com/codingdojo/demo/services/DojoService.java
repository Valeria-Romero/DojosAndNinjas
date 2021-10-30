package com.codingdojo.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.demo.models.Dojo;
import com.codingdojo.demo.models.Ninja;
import com.codingdojo.demo.repositories.DojoRepository;
import com.codingdojo.demo.repositories.NinjaRepository;

@Service
public class DojoService {
	private final DojoRepository dojoRepository;
	private final NinjaRepository ninjaRepository;
	public DojoService(DojoRepository repository, NinjaRepository nrepository) {
		dojoRepository = repository;
		ninjaRepository = nrepository;
		
	}
	
	public List<Dojo> allDojos() {
		return dojoRepository.findAll();
	}
	
	public Dojo findDojo(Long id) {
		return dojoRepository.findById(id).orElse(null);
	}
	
	public Dojo createDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
	
	public List<Ninja> findNinjas() {
		return ninjaRepository.findAll();
	}

}
