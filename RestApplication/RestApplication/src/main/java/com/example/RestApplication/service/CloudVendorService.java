package com.example.RestApplication.service;

import com.example.RestApplication.model.CloudVendor;

import java.util.List;
//we have to implement interface in a class //In interface we only use method .it should be always public

public interface
CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String id);

    public List<CloudVendor> getAllCloudVendor();

    public List<CloudVendor> getByVendorName(String vendorName);



}
