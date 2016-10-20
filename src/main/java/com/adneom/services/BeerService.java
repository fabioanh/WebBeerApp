package com.adneom.services;

import java.util.List;

import com.adneom.data.Beer;

public interface BeerService {

	/**
	 * Finds all the available beers in the system
	 * 
	 * @return
	 */
	List<Beer> findAll();
}
