package com.codingdojo.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.codingdojo.demo.models.Dojo;
import com.codingdojo.demo.services.*;

@Controller
public class DojoController {
	private final DojoService dojoService;
	public DojoController(DojoService service) {
		dojoService = service;
	}
	
	@RequestMapping("/dojos/new")
	public String Index() {
		return "index.jsp";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String CreateDojo( @RequestParam( value = "dojo" ) String dojoName){
		Dojo dojo = new Dojo(dojoName);
		dojoService.createDojo(dojo);
        return "redirect:/dojos/new";
	}
	
	@RequestMapping("/ninjas/new")
	public String AddNinja(Model model) {
		List<Dojo> dojosList = dojoService.allDojos();
		
		model.addAttribute("dojosList",dojosList);
		return "newninja.jsp";
	}
	
	@RequestMapping("/dojos/{id}")
	public String Show(@PathVariable("id")Long id, Model model) {
		Dojo dojoinfo = dojoService.findDojo(id);
		model.addAttribute("dojoinfo",dojoinfo);
		System.out.println(dojoinfo.getName());
		return "show.jsp";
	}
}
