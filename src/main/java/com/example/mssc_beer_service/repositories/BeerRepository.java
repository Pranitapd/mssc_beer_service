package com.example.mssc_beer_service.repositories;

import com.example.mssc_beer_service.domain.Beer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BeerRepository extends PagingAndSortingRepository<Beer, Long> {
}
