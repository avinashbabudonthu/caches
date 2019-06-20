package com.cache.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.cache.annotation.CacheResult;
import java.util.List;

@RestController
public class AppController {

    @Autowired
    private Table1Service table1Service;

    @CacheResult(cacheName = "table1Cache")
    @GetMapping(value = "/table1s", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Table1Entity> findAll(){
        return table1Service.findAll();
    }

}