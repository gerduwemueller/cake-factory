package com.gerdmueller.cakefactory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.gerdmueller.cakefactory.data.CakeDataService;

@Controller
public class HomeController {
	
	@Autowired
	CakeDataService dataService;
	
	@ModelAttribute
	public void addCakesToModel(Model model) {
		model.addAttribute("cakes", dataService.getAll());
	}
	
	@GetMapping("/")
	public String home() {
		return "home";
	}

}
