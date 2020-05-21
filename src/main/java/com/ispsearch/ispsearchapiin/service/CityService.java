package com.ispsearch.ispsearchapiin.service;

import com.ispsearch.ispsearchapiin.dao.CityDAO;
import com.ispsearch.ispsearchapiin.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityDAO citydao;

    // saves a new city to db
    public City saveCity(City city){
        return citydao.save(city);
    }

    // saves a list of cities to db
    public List<City> saveCities(List<City> cities){
        return citydao.saveAll(cities);
    }

    // retrieve all city names in the db
    public List<City> getCities(){
        return citydao.findAll();
    }

    //retrieve a single city based on id
    public City getCity(int id){
        return citydao.findById(id).orElse(null);
    }

    //retrieve city based on name
    public City getCity(String name){
        if (citydao.findByName(name)==null){
            throw new RuntimeException("City does not exist in db");
        }
        return citydao.findByName(name);
    }

    //delete city based on id
    public String deleteCity(int id){
        citydao.deleteById(id);
        return "City with id- "+id+" is deleted";
    }
    //delete city based on name
    public String deleteCity(String name){
        int cityId = this.getCity(name).getId();
        citydao.deleteById(cityId);
        return "City "+name+" is deleted";
    }

    //update a city
    public City updateCity(City newCity){
        City dbCity = citydao.findById(newCity.getId()).orElse(null);
        dbCity.setName(newCity.getName());
        return citydao.save(dbCity);
    }
}
