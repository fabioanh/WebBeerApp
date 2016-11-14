package com.adneom.jparepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adneom.data.Beer;

public interface BeerJpaRepository extends JpaRepository<Beer, Integer> {

	Beer findById(Integer id);

}
