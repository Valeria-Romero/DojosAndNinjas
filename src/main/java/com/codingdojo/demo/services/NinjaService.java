package com.codingdojo.demo.services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.codingdojo.demo.models.Ninja;
import com.codingdojo.demo.models.Dojo;
import com.codingdojo.demo.repositories.DojoRepository;
import com.codingdojo.demo.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepository;
	private final DojoRepository dojoRepository;
	public NinjaService(NinjaRepository repository, DojoRepository dRepository) {
		ninjaRepository = repository;
		dojoRepository = dRepository;
	}
	
	public List<Ninja> allNinjas(){
		return ninjaRepository.findAll();
	}
	
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
	
	public Dojo findDojoById(Long id) {
		return dojoRepository.findById(id).orElse(null);
	}
	
}
