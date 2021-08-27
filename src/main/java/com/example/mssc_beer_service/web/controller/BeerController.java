package com.example.mssc_beer_service.web.controller;

import com.example.mssc_beer_service.services.BeerService;
import com.example.mssc_beer_service.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    public final BeerService beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable UUID beerId){
    //public BeerDto getBeerById(@PathVariable UUID beerId){
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
        //return beerService.getBeerById(beerId);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody @Validated BeerDto beerDto){
    //public BeerDto saveNewBeer(@RequestBody @Validated BeerDto beerDto){
        //todo implement
        return new ResponseEntity<>(beerService.saveNewBeer(beerDto),HttpStatus.CREATED);
        //return beerService.saveNewBeer(beerDto);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable UUID beerId, @RequestBody @Validated BeerDto beerDto){
    //public BeerDto updateBeerById(@PathVariable UUID beerId, @RequestBody @Validated BeerDto beerDto){
        return new ResponseEntity(beerService.updateBeerById(beerId,beerDto),HttpStatus.NO_CONTENT);
        //return beerService.updateBeerById(beerId, beerDto);
    }
}
