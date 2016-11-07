package com.adneom.controllers.rest;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adneom.data.Brewery;
import com.adneom.repositories.BreweryRepository;

@RestController
@RequestMapping("/breweries")
public class BreweryRestController {

	@Inject
	BreweryRepository breweryRepository;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Brewery>> findAll() {
		return ResponseEntity.ok(breweryRepository.findAll());

	}

}
