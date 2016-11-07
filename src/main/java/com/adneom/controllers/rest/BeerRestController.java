package com.adneom.controllers.rest;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adneom.data.Beer;
import com.adneom.jparepositories.BeerJpaRepository;
import com.adneom.repositories.BeerRepository;

@RestController
@RequestMapping("/beers")
public class BeerRestController {

	@Inject
	BeerRepository beerRepository;

	@Inject
	BeerJpaRepository beerJpaRepository;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Beer>> findAll() {
		return ResponseEntity.ok(beerRepository.findAll());

	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public ResponseEntity<Beer> findById(@PathVariable Integer id) {
		return ResponseEntity.ok(beerJpaRepository.findById(id));
	}

}
