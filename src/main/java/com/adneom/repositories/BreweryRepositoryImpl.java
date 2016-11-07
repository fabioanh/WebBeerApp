package com.adneom.repositories;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

@Repository
public class BreweryRepositoryImpl implements BreweryRepository {
	
	@PersistenceUnit
	private EntityManagerFactory emf;

}
