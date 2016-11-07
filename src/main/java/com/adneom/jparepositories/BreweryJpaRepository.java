package com.adneom.jparepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adneom.data.Brewery;

public interface BreweryJpaRepository extends JpaRepository<Brewery, Integer> {

	Brewery findById(Integer id);

}
