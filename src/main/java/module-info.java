module com.bamshadit.javafxmysql1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.bamshadit.javafxmysql1 to javafx.fxml;
    exports com.bamshadit.javafxmysql1;
}