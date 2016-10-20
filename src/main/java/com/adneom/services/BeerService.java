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

	/**
	 * Returns the list of beers of the system filtered by type
	 * 
	 * @param type
	 * @return
	 */
	List<Beer> findByType(String type);

}
