package com.alok.account;

public class Address {

    private String street;
    private String city;
    private String state;
    private long pincode;

    public Address() {
    }

    public Address(String street, String city, String state, long pincode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPincode() {
        return this.pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public Address street(String street) {
        setStreet(street);
        return this;
    }

    public Address city(String city) {
        setCity(city);
        return this;
    }

    public Address state(String state) {
        setState(state);
        return this;
    }

    public Address pincode(long pincode) {
        setPincode(pincode);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " street='" + getStreet() + "'" +
            ", city='" + getCity() + "'" +
            ", state='" + getState() + "'" +
            ", pincode='" + getPincode() + "'" +
            "}";
    }

}
