package com.example.RestApplication.repository;

import com.example.RestApplication.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;// it give all the Meathod no need to create

import java.util.List;

//Give the model/entity class as argument and  entity primary key  data type pass it
public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {


}
