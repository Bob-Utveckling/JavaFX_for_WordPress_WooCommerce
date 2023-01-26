package com.bamshadit.javafxmysql1.model;

public class Customer {
    String FirstName;
    String LastName;
    String Address;
    String City;
    String PostCode;
    String Country;
    String Email;
    String Phone;
    String Currrency;

    public Customer(String firstName, String lastName, String address, String city, String postCode, String country, String email, String phone, String currrency) {
        FirstName = firstName;
        LastName = lastName;
        Address = address;
        City = city;
        PostCode = postCode;
        Country = country;
        Email = email;
        Phone = phone;
        Currrency = currrency;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getPostCode() {
        return PostCode;
    }

    public void setPostCode(String postCode) {
        PostCode = postCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getCurrrency() {
        return Currrency;
    }

    public void setCurrrency(String currrency) {
        Currrency = currrency;
    }
}
