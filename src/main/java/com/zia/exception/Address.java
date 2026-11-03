package com.zia.exception;

public class Address {
    private String streetName;
    private String city;
    private String Address;

    public Address(String streetName, String city, String address) {
        this.streetName = streetName;
        this.city = city;
        Address = address;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return Address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
