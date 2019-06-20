package com.cache.loader;

import lombok.extern.slf4j.Slf4j;

import javax.cache.integration.CacheLoader;
import javax.cache.integration.CacheLoaderException;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class SimpleCacheLoader implements CacheLoader<String, String> {

    @Override
    public String load(String key) throws CacheLoaderException {
        log.info("load method");
        return "from simple cache: " + key;
    }

    @Override
    public Map<String, String> loadAll(Iterable<? extends String> keys) throws CacheLoaderException {
        log.info("loadAll method");
        Map<String, String> map = new HashMap<>();
        for(String key : keys){
            map.put(key, load(key));
        }

        return map;
    }
}
