package com.xyj.cloud.fallback;

import com.xyj.cloud.feign.IRemote;
import org.springframework.stereotype.Component;

/**
 * Created by xyj97 on 2018/8/31.
 */
@Component
public class IRemoteFallBack implements IRemote {
    @Override
    public String remoteMethod() {
        System.out.println("---feign fall back---");
        return "sorry, something is wrong, this is from fall-back message";
    }
}
