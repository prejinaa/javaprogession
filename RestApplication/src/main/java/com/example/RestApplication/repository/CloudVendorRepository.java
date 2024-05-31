package com.example.RestApplication.repository;

import com.example.RestApplication.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;// it give all the Meathod no need to create

import java.util.List;

//Give the argument inside the jpa repository pass model name and its data type as an argument
public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {


}
