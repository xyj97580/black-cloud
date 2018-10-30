package com.xyj.cloud.feign;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xyj97 on 2018/10/23.
 */
@Configuration
public class FeignConfig {

    @Bean
    public Contract contractF() {
        return new feign.Contract.Default();
    }
}
