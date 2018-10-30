package com.xyj.cloud.provide.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xyj97 on 2018/10/23.
 */

@RestController
@RequestMapping("/my")
public class ProvideController {

    @RequestMapping("/test")
    public @ResponseBody  String test() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "this is from provider";
    }
}
