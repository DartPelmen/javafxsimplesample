module com.example.javafxsimplesample {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.javafxsimplesample to javafx.fxml;
    exports com.example.javafxsimplesample;
}