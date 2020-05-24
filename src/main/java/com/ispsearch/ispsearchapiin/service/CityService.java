package com.ispsearch.ispsearchapiin.service;

import com.ispsearch.ispsearchapiin.repository.BookmarkIspRepository;
import com.ispsearch.ispsearchapiin.repository.BookmarkPlanRepository;
import com.ispsearch.ispsearchapiin.repository.CityPincodeRepository;
import com.ispsearch.ispsearchapiin.repository.CityRepository;
import com.ispsearch.ispsearchapiin.repository.CommentRepository;
import com.ispsearch.ispsearchapiin.repository.CustomerRepository;
import com.ispsearch.ispsearchapiin.repository.IspPincodeRepository;
import com.ispsearch.ispsearchapiin.repository.IspRepository;
import com.ispsearch.ispsearchapiin.repository.IspReviewRepository;
import com.ispsearch.ispsearchapiin.repository.PincodeRepository;
import com.ispsearch.ispsearchapiin.repository.PlanPincodeRepository;
import com.ispsearch.ispsearchapiin.repository.PlanRepository;
import com.ispsearch.ispsearchapiin.repository.PlanReviewRepository;
import com.ispsearch.ispsearchapiin.repository.StateCityRepository;
import com.ispsearch.ispsearchapiin.repository.StateRepository;
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
        if (cityRepository.findByCityName(name)==null){
            throw new RuntimeException("City does not exist in db");
        }
        return cityRepository.findByCityName(name);
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
        if(dbCity != null){
            dbCity.setCityName(newCity.getCityName());
            return cityRepository.save(dbCity);
        }
        else throw new RuntimeException("City not found!");

    }
}
