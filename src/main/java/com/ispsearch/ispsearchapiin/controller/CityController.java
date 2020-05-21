package com.ispsearch.ispsearchapiin.controller;

import com.ispsearch.ispsearchapiin.model.City;
import com.ispsearch.ispsearchapiin.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    // POST method to add a single city to db
    @PostMapping("/addCity")
    public City addCity(@RequestBody City city){
        return cityService.saveCity(city);
    }

    // POST method to add list of cities to db
    @PostMapping("/addCities")
    public List<City> addCities(@RequestBody List<City> cities){
        return cityService.saveCities(cities);
    }

    // GET method to retrieve a list of cities present in db
    @GetMapping("/getAllCities")
    public List<City> getAllCities(){
        return cityService.getCities();
    }

    // GET method to retrieve city based on id
    @GetMapping("/getCityById/{id}")
    public City getCityById(@PathVariable int id){
        return cityService.getCity(id);
    }

    // GET method to retrieve city based on name
    @GetMapping("/getCityByName/{name}")
    public City getCityByName(@PathVariable String name){
        return cityService.getCity(name);
    }

    // DELETE method to delete a city based on id
    @DeleteMapping("/deleteCityById/{id}")
    public String deleteCityById(@PathVariable int id){
        return cityService.deleteCity(id);
    }

    // DELETE method to delete a city based on name
    @DeleteMapping("/deleteCityByName/{name}")
    public String deleteCityById(@PathVariable String name){
        return cityService.deleteCity(name);
    }

    // PUT method to update a city
    // updates all the values sent via request as is
    // Note- column values not sent in the req are overriden to be null
    // ********To be changed- check if all column values are entered by client
    @PutMapping("/updateCity")
    public City updateCity(@RequestBody City city){
        return cityService.updateCity(city);
    }






}
