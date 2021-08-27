package com.example.mssc_beer_service.services;

import com.example.mssc_beer_service.domain.Beer;
import com.example.mssc_beer_service.repositories.BeerRepository;
import com.example.mssc_beer_service.web.controller.NotFoundException;
import com.example.mssc_beer_service.web.mappers.BeerMapper;
import com.example.mssc_beer_service.web.model.BeerDto;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper;

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return beerMapper.beerToBeerDto((Beer) beerRepository.findById(beerId).orElseThrow(NotFoundException::new));
        //since findById will provide optional so we are throwing the exception
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return beerMapper.beerToBeerDto(beerRepository.save(beerMapper.beerDtoToBeer(beerDto)));
        //since beerRepository saves Beer. so beerMapper is converting beerDto to beer
    }

    @Override
    public BeerDto updateBeerById(UUID beerId, BeerDto beerDto) {
        Beer beer = (Beer) beerRepository.findById(beerId).orElseThrow(NotFoundException::new);

        beer.setBeerName(beerDto.getBeerName());
        beer.setBeerStyle(beerDto.getBeerStyle().name());
        beer.setPrice(beerDto.getPrice());
        beer.setUpc(beerDto.getUpc());
        return null;
    }
}
