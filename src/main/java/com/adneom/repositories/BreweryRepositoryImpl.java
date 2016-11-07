package com.adneom.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.adneom.data.Brewery;

@Repository
public class BreweryRepositoryImpl implements BreweryRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Brewery> findAll() {
		return entityManager.createNamedQuery("Brewery.findAll").getResultList();
	}
}
