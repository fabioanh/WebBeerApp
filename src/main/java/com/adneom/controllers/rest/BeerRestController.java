package com.adneom.controllers.rest;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adneom.data.Beer;
import com.adneom.repositories.BeerRepository;

@RestController
@RequestMapping("/beers")
public class BeerRestController {

	@Inject
	BeerRepository beerRepository;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Beer>> findAll() {
		return ResponseEntity.ok(beerRepository.findAll());

	}

}
