module com.uv.equipodproyecto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uv.equipodproyecto to javafx.fxml;
    exports com.uv.equipodproyecto;
}