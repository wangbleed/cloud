package com.ryan.cloud.feignserice.component;

import com.ryan.cloud.feignserice.api.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by xudongwang on 2017/10/18.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
