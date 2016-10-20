package com.adneom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adneom.data.Beer;

@Controller
@RequestMapping("/beer")
public class BeerController {

	@RequestMapping(value = "/beerForm", method = RequestMethod.POST)
	public String beerFormPost(@ModelAttribute("beerData") Beer beer, Model model) {
		return "result";
	}
}
