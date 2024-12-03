module com.fxexample {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.fxexample to javafx.fxml;
    exports com.fxexample;
}
