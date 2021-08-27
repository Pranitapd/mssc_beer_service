package com.example.mssc_beer_service.services;

import com.example.mssc_beer_service.repositories.BeerRepository;
import com.example.mssc_beer_service.web.mappers.BeerMapper;
import com.example.mssc_beer_service.web.mappers.DateMapper;
import com.example.mssc_beer_service.web.model.BeerDto;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeerById(UUID beerId, BeerDto beerDto);
}
