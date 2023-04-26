module com.example.targetheartratecalculatorapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.targetheartratecalculatorapp to javafx.fxml;
    exports com.example.targetheartratecalculatorapp;
}