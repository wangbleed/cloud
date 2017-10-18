package com.ryan.cloud.ribbonservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xudongwang on 2017/10/17.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    //断路器错误转向
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }

    private String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

}
