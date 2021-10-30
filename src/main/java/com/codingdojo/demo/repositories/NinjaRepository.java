package com.codingdojo.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.demo.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long>{
	List<Ninja> findAll();
}
