package com.bamshadit.javafxmysql1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.sql.SQLException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void getAllCustomers(ActionEvent event) throws SQLException {
        JdbcDao jdbcDao = new JdbcDao();
        jdbcDao.getAllCustomers();
    }
    @FXML
        public void register(ActionEvent event) throws SQLException {


        JdbcDao jdbcDao = new JdbcDao();
        jdbcDao.insertRecord("Bamshad","bob@fripost.org");

    }
}