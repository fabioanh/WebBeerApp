package com.adneom.repositories;

import java.util.List;

import com.adneom.data.Beer;

public interface BeerRepository {

	List<Beer> findAll();

}
