package com.example.RestApplication.model;

public class CloudVendor {
    private String vendorId;
    private String vendorAddress;
    private String vendorName;
    private String vendorPhone;

    public CloudVendor() {

    }

    public CloudVendor(String vendorId,String vendorAddress,String vendorName,String vendorPhone) {
        this.vendorId = vendorId;
        this.vendorAddress = vendorAddress;
        this.vendorName = vendorName;
        this.vendorPhone= vendorPhone;


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
