package com.bamshadit.javafxmysql1.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Customer {
    //String firstName;
    private StringProperty firstName = new SimpleStringProperty();
    public final StringProperty firstNameProperty() {
        return firstName;
    }
    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String value) {
        firstName.set(value);
    }
    private StringProperty lastName;
    private StringProperty address;
    private StringProperty city;
    private StringProperty postCode;
    private StringProperty country;
    private StringProperty email;
    private StringProperty phone;

    private StringProperty currency;

    public Customer(SimpleStringProperty firstName, SimpleStringProperty lastName, SimpleStringProperty address, SimpleStringProperty city, SimpleStringProperty postCode, SimpleStringProperty country, SimpleStringProperty email, SimpleStringProperty phone, SimpleStringProperty currency) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.postCode = postCode;
        this.country = country;
        this.email = email;
        this.phone = phone;
        this.currency = currency;
    }

    public String getLastName() {
        return lastName.get();
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public String getAddress() {
        return address.get();
    }

    public StringProperty addressProperty() {
        return address;
    }

    public void setAddress(String address) {
        this.address.set(address);
    }

    public String getCity() {
        return city.get();
    }

    public StringProperty cityProperty() {
        return city;
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public String getPostCode() {
        return postCode.get();
    }

    public StringProperty postCodeProperty() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode.set(postCode);
    }

    public String getCountry() {
        return country.get();
    }

    public StringProperty countryProperty() {
        return country;
    }

    public void setCountry(String country) {
        this.country.set(country);
    }

    public String getEmail() {
        return email.get();
    }

    public StringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getPhone() {
        return phone.get();
    }

    public StringProperty phoneProperty() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone.set(phone);
    }

    public String getCurrency() {
        return currency.get();
    }

    public StringProperty currencyProperty() {
        return currency;
    }

    public void setCurrency(String currrency) {
        this.currency.set(currrency);
    }
}
