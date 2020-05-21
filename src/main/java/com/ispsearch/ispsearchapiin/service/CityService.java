package com.ispsearch.ispsearchapiin.service;

import com.ispsearch.ispsearchapiin.repository.CityRepository;
import com.ispsearch.ispsearchapiin.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    // saves a new city to db
    public City saveCity(City city){
        return cityRepository.save(city);
    }

    // saves a list of cities to db
    public List<City> saveCities(List<City> cities){
        return cityRepository.saveAll(cities);
    }

    // retrieve all city names in the db
    public List<City> getCities(){
        return cityRepository.findAll();
    }

    //retrieve a single city based on id
    public City getCity(int id){
        return cityRepository.findById(id).orElse(null);
    }

    //retrieve city based on name
    public City getCity(String name){
        if (cityRepository.findByName(name)==null){
            throw new RuntimeException("City does not exist in db");
        }
        return cityRepository.findByName(name);
    }

    //delete city based on id
    public String deleteCity(int id){
        cityRepository.deleteById(id);
        return "City with id- "+id+" is deleted";
    }
    //delete city based on name
    public String deleteCity(String name){
        int cityId = this.getCity(name).getCityId();
        cityRepository.deleteById(cityId);
        return "City "+name+" is deleted";
    }

    //update a city
    public City updateCity(City newCity){
        City dbCity = cityRepository.findById(newCity.getCityId()).orElse(null);
        dbCity.setCityName(newCity.getCityName());
        return cityRepository.save(dbCity);
    }
}
