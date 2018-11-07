package com.zju.cst.simplefitserver.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;
import java.util.Arrays;


@Configuration
public class CacheConfig {


    @Bean("MethodNameAndArgsKey")
    public KeyGenerator keyGenerator(){

        return new KeyGenerator() {
            @Override
            public Object generate(Object o, Method method, Object... objects) {
                return method.getName()+Arrays.asList(objects).toString();
            }
        };

    }

}
