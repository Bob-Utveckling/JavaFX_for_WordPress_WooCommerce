module com.bamshadit.javafxmysql1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.bamshadit.javafxmysql1 to javafx.fxml;
    exports com.bamshadit.javafxmysql1;
    exports com.bamshadit.javafxmysql1.controller;
    opens com.bamshadit.javafxmysql1.controller to javafx.fxml;
    exports com.bamshadit.javafxmysql1.Dao;
    opens com.bamshadit.javafxmysql1.Dao to javafx.fxml;
}