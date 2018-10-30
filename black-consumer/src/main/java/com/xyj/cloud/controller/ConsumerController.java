package com.xyj.cloud.controller;

import com.xyj.cloud.common.validator.groups.QueryGroup;
import com.xyj.cloud.common.validator.groups.QueryGroup2;
import com.xyj.cloud.feign.FeignClient1;
import com.xyj.cloud.model.OperateDto;
import com.xyj.cloud.model.QueryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by xyj97 on 2018/9/1.
 */
@RestController
@RequestMapping("/remote")
public class ConsumerController {

    @Autowired
    FeignClient1 client;

    @RequestMapping("/test")
    public @ResponseBody String consumer() {
        System.out.println("hi ,I'm in");
        return "congratulate ,this is from consumer service";
    }

    @RequestMapping("/valid")
    public @ResponseBody String validTest(@RequestBody @Validated(value = {QueryGroup.class,QueryGroup2.class}) OperateDto dto)  {
//        throw new BindException("dsf","fds");
        return "ddddddd";
    }


    @RequestMapping("/validated")
//    public @ResponseBody String validatedTest(@RequestBody @Validated(QueryGroup.class) QueryDto dto)  {
    public @ResponseBody String validatedTest(@RequestBody @Validated QueryDto dto)  {
//        throw new BindException("dsf","fds");
        return "ddddddd";
    }

    @RequestMapping("/testFeign")
    public @ResponseBody String testFeign() {
//        return "this is from consumer";
        return client.test();
    }
    @RequestMapping("/validatedGroup")
//    public @ResponseBody String validatedTest(@RequestBody @Validated(QueryGroup.class) QueryDto dto)  {
    public @ResponseBody String validatedGroup(@RequestBody @Validated(QueryGroup2.class) QueryDto dto)  {
//        throw new BindException("dsf","fds");
        return "ddddddd";
    }
}
