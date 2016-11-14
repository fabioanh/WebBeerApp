package com.adneom.controllers.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adneom.data.Brewery;
import com.adneom.jparepositories.BreweryJpaRepository;
import com.adneom.repositories.BreweryRepository;

@RestController
@RequestMapping("/breweries")
public class BreweryRestController {

	@Autowired
	private BreweryRepository breweryRepository;

	@Autowired
	private BreweryJpaRepository breweryJpaRepository;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Brewery>> findAll() {
		return ResponseEntity.ok(breweryRepository.findAll());
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Brewery> findById(@PathVariable Integer id) {
		return ResponseEntity.ok(breweryJpaRepository.findById(id));

	}

}