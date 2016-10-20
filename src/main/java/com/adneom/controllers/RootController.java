package com.adneom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adneom.data.Beer;

@Controller
@RequestMapping("/")
public class RootController {

	public String getBeerForm(Model model) {
		model.addAttribute("beerData", new Beer());
		return "beerForm";
	}
}
