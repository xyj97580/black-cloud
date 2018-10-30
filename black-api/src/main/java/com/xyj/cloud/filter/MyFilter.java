package com.xyj.cloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.annotation.WebFilter;

/**
 * Created by xyj97 on 2018/8/31.
 */
@Component
public class MyFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        System.out.println("should i filter?");
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("000000");
        return null;
    }
}
