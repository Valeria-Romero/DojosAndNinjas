package com.codingdojo.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.demo.models.Dojo;
import com.codingdojo.demo.models.Ninja;
import com.codingdojo.demo.services.NinjaService;

@Controller
public class NinjaController {
	private final NinjaService ninjaService;
	public NinjaController(NinjaService service) {
		ninjaService = service;
	}
	
	@RequestMapping(value="/add/ninja", method= RequestMethod.POST)
	public String CreateNinja(@RequestParam(value="firstName")String firstName,
							  @RequestParam("lastName")String lastName,
							  @RequestParam("age")int age,
							  @RequestParam("dojoId")Long dojoId) {
		
		Dojo dojoinfo = ninjaService.findDojoById(dojoId);
		Ninja ninja = new Ninja(firstName, lastName, age, dojoinfo);
		ninjaService.createNinja(ninja);
		return "redirect:/dojos/new";
	}

}
