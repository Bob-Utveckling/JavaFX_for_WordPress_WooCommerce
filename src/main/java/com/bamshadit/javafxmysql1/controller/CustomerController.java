package com.bamshadit.javafxmysql1.controller;

import com.bamshadit.javafxmysql1.Dao.JdbcDao;
import com.bamshadit.javafxmysql1.model.Customer;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
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
    public void temp_getDBCustomers() {
        JdbcDao jdbcDao = new JdbcDao();
        jdbcDao.getAllCustomers();
    }

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
    private TableColumn<Customer, String> LastNameCol;
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


    public void initializeCols() {
        FirstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        LastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        AddressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        CityCol.setCellValueFactory(new PropertyValueFactory<>("city"));
        PostCodeCol.setCellValueFactory(new PropertyValueFactory<>("postCode"));
        CountryCol.setCellValueFactory(new PropertyValueFactory<>("country"));
        EmailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
        PhoneCol.setCellValueFactory(new PropertyValueFactory<>("phone"));
        CurrencyCol.setCellValueFactory(new PropertyValueFactory<>("currency"));

    }
    public void updateTable() {
        SimpleStringProperty name = new SimpleStringProperty();
        name.set("B");
        ObservableList<Customer> custList = FXCollections.observableArrayList();
        custList.add(new Customer(
                new SimpleStringProperty("Bob"),
                new SimpleStringProperty("L."),
                new SimpleStringProperty("123 Södra"),
                new SimpleStringProperty("Nöd"),
                new SimpleStringProperty("44931"),
                new SimpleStringProperty("Swe"),
                new SimpleStringProperty("b@b.se"),
                new SimpleStringProperty("123"),
                new SimpleStringProperty("SEK")
            )
        );

        CustomerTable.setItems(custList);
    }

}
