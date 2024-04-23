package com.hitema.intro.services;

import com.hitema.intro.models.City;
import com.hitema.intro.repositories.CityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CityServiceTest {
    @Autowired
    private CityService service;

    @Test
    public void testCreateReadDelete() {
        City city = new City();
        city.setName("Test City");
        city = service.create(city);

        assertNotNull(service.read(city.getId()));

        service.delete(city.getId());
        assertNull(service.read(city.getId()));
    }
}
