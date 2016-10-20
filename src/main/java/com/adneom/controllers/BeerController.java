package com.adneom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adneom.data.Beer;
import com.adneom.services.BeerService;

@Controller
@RequestMapping("/beer")
public class BeerController {

	@Autowired
	private BeerService beerService;

	@RequestMapping(value = "/beerForm", method = RequestMethod.POST)
	public String beerFormPost(@ModelAttribute("beerData") Beer beer, Model model) {
		model.addAttribute("beers", beerService.findByType(beer.getType()));
		return "result";
	}
}
