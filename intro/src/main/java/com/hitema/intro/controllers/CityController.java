package com.hitema.intro.controllers;

import com.hitema.intro.models.City;
import com.hitema.intro.services.CityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {
    private final CityService service;

    public CityController(CityService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<City> readAll(){
        return service.readAll();
    }

    @GetMapping("/{id}")
    public City getOne(@PathVariable Long id){
        return service.read(id);
    }

    @PostMapping("/")
    public City create(@RequestBody City city){
        return service.create(city);
    }

    @PutMapping("/{id}")
    public City update(@PathVariable Long id, @RequestBody City city){
        city.setId(id);
        return service.update(city);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Long id){
        return service.delete(id);
    }
}
