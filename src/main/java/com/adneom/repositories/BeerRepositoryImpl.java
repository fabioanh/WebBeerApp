package com.adneom.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.adneom.data.Beer;

@Repository
@Transactional
public class BeerRepositoryImpl implements BeerRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Beer> findAll() {
		return entityManager.createNamedQuery("Beer.findAll").getResultList();
	}

}
