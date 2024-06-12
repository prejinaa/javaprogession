package com.example.RestApplication.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor {
    @Id // PK
    @JsonProperty("vendor_id")
    private String vendorId;
    @JsonProperty("vendor_address")
    private String vendorAddress;
    @JsonProperty("vendor_name")
    private String vendorName;
    @JsonProperty("vendor_number")
    private String vendorPhone;


    public CloudVendor() {
    }
    public CloudVendor(String vendorId,String vendorAddress,String vendorName,String vendorPhone) {
        this.vendorId = vendorId;
        this.vendorAddress = vendorAddress;
        this.vendorName = vendorName;
        this.vendorPhone = vendorPhone;

    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorPhone() {
        return vendorPhone;
    }

    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone;
    }
}
