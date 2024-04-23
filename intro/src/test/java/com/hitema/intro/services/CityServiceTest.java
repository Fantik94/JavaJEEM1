package com.hitema.intro.services;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CityServiceTest {

    private static final Logger log = LoggerFactory.getLogger(CityServiceTest.class);

    @Autowired
    CityService service;

    @Test
    void read() {
        log.info("DEBUT TESTS Read City");
        Long id = 2L;
        var city = service.read(id);
        log.trace("{}", city);
        log.info("FIN TESTS Read City");
    }

    @Test
    void readAll() {
        log.info("DEBUT TESTS Read All");
        service.readAll().forEach(c -> log.trace("{}", c));
        log.error("<<<ERROR>>>");
        log.info("FIN TESTS Read All");
    }
}