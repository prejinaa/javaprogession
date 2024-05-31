package com.example.RestApplication.controller;

import com.example.RestApplication.model.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorREstAPI {
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){

        return  new CloudVendor("C1","ktm","Ram","*****");
    }
}
