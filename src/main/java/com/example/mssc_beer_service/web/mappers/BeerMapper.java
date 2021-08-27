package com.example.mssc_beer_service.web.mappers;

import com.example.mssc_beer_service.domain.Beer;
import com.example.mssc_beer_service.web.model.BeerDto;

public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
