package com.hello.world;

import org.junit.Test;

import javax.cache.Cache;
import javax.cache.CacheManager;
import javax.cache.Caching;
import javax.cache.configuration.MutableConfiguration;
import javax.cache.spi.CachingProvider;

public class CacheHelloWorld {

    @Test
    public void simpleCache(){
        CachingProvider cachingProvider = Caching.getCachingProvider();
        CacheManager cacheManager = cachingProvider.getCacheManager();
        MutableConfiguration<String, Object> mutableConfiguration = new MutableConfiguration<>();
        Cache<String, Object> cache = cacheManager.createCache("simpleCache", mutableConfiguration);
        cache.put("1", "one");
        cache.put("2", "two");
        cacheManager.close();



    }
}
