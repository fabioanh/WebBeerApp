package com.adneom.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.adneom.data.Beer;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public List<Beer> findAll() {
		List<Beer> beers = new ArrayList<>();
		beers.add(new Beer("Abdis Blond", "Brewery Riva", "blond"));
		beers.add(new Beer("Angélus Blonde", "Brasserie Brootcoorens", "blond"));
		beers.add(new Beer("Cuvée Jeun'homme", "Brewery De Leite", "blond"));
		beers.add(new Beer("Boerke Bruin", "Brewery Angerik", "bruin"));
		beers.add(new Beer("Maredsous bruin", "Brewery Duvel Moortgat", "bruin"));
		beers.add(new Beer("Potteloereke", "Huisbrouwerij Sint-Canarus", "bruin"));
		beers.add(new Beer("Stropken", "Brewery Bios", "amber"));
		beers.add(new Beer("Montagnarde", "Brasserie de l'Abbaye des Rocs", "amber"));
		beers.add(new Beer("Hoftrol", "'t Hofbrouwerijke", "amber"));
		return beers;
	}

	@Override
	public List<Beer> findByType(String type) {
		return findAll().stream().filter(b -> b.getType().equals(type))
				.collect(Collectors.toList());
	}

}
