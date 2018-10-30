package com.xyj.cloud.controller;

import com.xyj.cloud.feign.IRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.function.Supplier;

/**
 * Created by xyj97 on 2018/8/31.
 */
@Controller
public class BlackController {
    @Autowired
    private IRemote remote;
    @RequestMapping("/gateway")
    public @ResponseBody void apitest() {
        System.out.println("--1--");
        String respMes = remote.remoteMethod();
        System.out.println(respMes);
        System.out.println("--2--");
        Supplier<String> s = () -> "dd";

    }
}
