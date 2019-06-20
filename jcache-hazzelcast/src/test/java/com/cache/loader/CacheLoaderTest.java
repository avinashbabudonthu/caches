package com.cache.loader;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import javax.cache.Cache;
import javax.cache.CacheManager;
import javax.cache.Caching;
import javax.cache.configuration.FactoryBuilder;
import javax.cache.configuration.MutableConfiguration;
import javax.cache.spi.CachingProvider;

@Slf4j
public class CacheLoaderTest {

    private Cache<String, String> cache;

    @SuppressWarnings("unchecked")
    @Before
    public void setup(){
        CachingProvider cachingProvider = Caching.getCachingProvider();
        CacheManager cacheManager = cachingProvider.getCacheManager();
        MutableConfiguration<String, String> configuration = new MutableConfiguration<>()
                .setReadThrough(true)
                .setCacheLoaderFactory(new FactoryBuilder.SingletonFactory(new SimpleCacheLoader()));
        this.cache = cacheManager.createCache("simpleCache", configuration);
    }

    @Test
    public void readFromCache(){
        for(int i=0;i<5;i++){
            String value = cache.get(""+i);
            log.info("value={}", value);
        }
    }

}
