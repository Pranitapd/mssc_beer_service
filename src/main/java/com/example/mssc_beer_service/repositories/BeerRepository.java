package com.example.mssc_beer_service.repositories;

import com.example.mssc_beer_service.domain.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;
import java.util.UUID;

public interface BeerRepository extends JpaRepository<Beer, Long> {
    Optional<Object> findById(UUID beerId);
}
