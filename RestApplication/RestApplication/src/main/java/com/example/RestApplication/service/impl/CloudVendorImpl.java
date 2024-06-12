package com.example.RestApplication.service.impl;

import com.example.RestApplication.exception.CloudVendorExceptionNotFound;
import com.example.RestApplication.model.CloudVendor;
import com.example.RestApplication.repository.CloudVendorRepository;
import com.example.RestApplication.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CloudVendorImpl implements CloudVendorService {
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Successfully";
    }

    @Override
    //more business logic should be written here
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Successfully";
    }



    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "null";
    }



    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return cloudVendorRepository.findAll();


    }

    @Override
    public List<CloudVendor> getByVendorName(String cloudVendorId) {
        if(cloudVendorRepository.findById(cloudVendorId).isEmpty())
            throw new CloudVendorExceptionNotFound("Requested Cloud Vendor does not exist");
        return (List<CloudVendor>) cloudVendorRepository.findById(cloudVendorId).get();
    }




}


