package com.adneom.repositories;

import java.util.List;

import com.adneom.data.Brewery;

public interface BreweryRepository {
	List<Brewery> findAll();
}
