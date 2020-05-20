package com.mycompany.myapp.service;

import com.mycompany.myapp.client.AuthorizedFeignClient;
import com.mycompany.myapp.domain.Device;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@AuthorizedFeignClient(name = "devicemicroservice")
interface OtherServiceClient {
    @RequestMapping(value = "/api/devices")
    List<Device> getResourcesFromOtherService();
}
