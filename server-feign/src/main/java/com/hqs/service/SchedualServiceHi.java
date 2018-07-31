package com.hqs.service;

import com.hqs.service.impl.HiServiceError;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = HiServiceError.class)   // 指定要调用的服务,fallback 错误指定类
@Service
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)  // 调用服务里面的某个接口
    String sarHiClientOne(@RequestParam(value = "name") String name);

}
