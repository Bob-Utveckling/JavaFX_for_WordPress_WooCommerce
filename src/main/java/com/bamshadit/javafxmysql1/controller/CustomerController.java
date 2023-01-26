package com.bamshadit.javafxmysql1.controller;

import com.bamshadit.javafxmysql1.model.Customer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.List;

public class CustomerController {

    @FXML
    public void temp_getCustomers() {
        System.out.println("Load customers");
        initializeCols();
        updateTable();
    }

    @FXML
    TableView<Customer> CustomerTable;
    @FXML
    private TableColumn<Customer, String> FirstNameCol;
    @FXML
    private TableColumn<Customer, String> LastNameNameCol;
    @FXML
    private TableColumn<Customer, String> AddressCol;
    @FXML
    private TableColumn<Customer, String> CityCol;
    @FXML
    private TableColumn<Customer, String> PostCodeCol;
    @FXML
    private TableColumn<Customer, String> CountryCol;
    @FXML
    private TableColumn<Customer, String> EmailCol;
    @FXML
    private TableColumn<Customer, String> PhoneCol;
    @FXML
    private TableColumn<Customer, String> CurrencyCol;

    public List<Customer> getCustomers() {
        Customer c1 = new Customer("B","L","123 Södra","Nöd","44931","Swe","b@b.se","123","SEK");
        Customer c2 = new Customer("B","L","123 Södra","Nöd","44931","Swe","b@b.se","123","SEK");
        Customer c3 = new Customer("B","L","123 Södra","Nöd","44931","Swe","b@b.se","123","SEK");
        Customer c4 = new Customer("B","L","123 Södra","Nöd","44931","Swe","b@b.se","123","SEK");
        List<Customer> Customers = new ArrayList<>();
        Customers.add(c1);
        Customers.add(c2);
        Customers.add(c3);
        Customers.add(c4);
        return Customers;
    }

    public void initializeCols() {
        FirstNameCol.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
    }
    public void updateTable() {
        ObservableList<Customer> custList = FXCollections.observableArrayList();
        custList.add(new Customer("B","L","123 Södra","Nöd","44931","Swe","b@b.se","123","SEK"));
        custList.add(new Customer("B","L","123 Södra","Nöd","44931","Swe","b@b.se","123","SEK"));
        CustomerTable.setItems(custList);
    }

}
