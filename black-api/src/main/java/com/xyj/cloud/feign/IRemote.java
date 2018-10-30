package com.xyj.cloud.feign;

import com.xyj.cloud.fallback.IRemoteFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xyj97 on 2018/8/31.
 */
@FeignClient( name = "black-consume",fallback = IRemoteFallBack.class)
public interface IRemote {

    @RequestMapping("/remote/test")
    public String remoteMethod();
}
