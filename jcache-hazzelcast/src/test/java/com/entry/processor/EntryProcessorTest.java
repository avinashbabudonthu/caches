package com.entry.processor;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import javax.cache.Cache;
import javax.cache.CacheManager;
import javax.cache.Caching;
import javax.cache.configuration.MutableConfiguration;
import javax.cache.spi.CachingProvider;

@Slf4j
public class EntryProcessorTest {

    @Test
    public void entryProcessor(){
        CachingProvider cachingProvider = Caching.getCachingProvider();
        CacheManager cacheManager = cachingProvider.getCacheManager();
        MutableConfiguration<String, String> config = new MutableConfiguration<>();
        Cache<String, String> cache = cacheManager.createCache("simpleCache", config);
        cache.put("key", "value");
        cache.invoke("key", new SimpleEntryProcessor());

        log.info("updated value={}", cache.get("key"));
    }
}
