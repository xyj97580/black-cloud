package com.xyj.cloud.feign;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xyj97 on 2018/10/23.
 */

@FeignClient(name = "xx",url = "${remote.url}")

public interface FeignClient1 {
    @RequestLine("POST /my/test")
    String test();
}
