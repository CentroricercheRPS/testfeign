package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.Device;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SomeService {
    private OtherServiceClient otherServiceClient;

    //@Inject
    public SomeService(OtherServiceClient otherServiceClient) {
        this.otherServiceClient = otherServiceClient;
    }

    public List<Device> getDevices(){
        return otherServiceClient.getResourcesFromOtherService();
    }
}
