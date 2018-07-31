package com.hqs.service.impl;

import com.hqs.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class HiServiceError implements SchedualServiceHi {

    @Override
    public String sarHiClientOne(String name) {
        return name+"---> sorry,error";
    }
}
