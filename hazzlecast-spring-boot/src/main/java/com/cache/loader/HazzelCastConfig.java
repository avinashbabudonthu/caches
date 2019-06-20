package com.cache.loader;

import com.hazelcast.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazzelCastConfig {

    @Bean
    public Config config(){
        return new Config();
    }
}
