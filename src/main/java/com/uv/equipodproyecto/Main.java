package com.uv.equipodproyecto;

import com.uv.equipodproyecto.Login.Login;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public Main() {
    }

    public void start(Stage stage) throws IOException {
        Pane menu = new Login(stage);
        Scene scene = new Scene(menu, 900.0, 500.0);
        //scene.getStylesheets().add(this.getClass().getResourceAsStream("style.css").toExternalForm());
        scene.getStylesheets().add("styles.css");
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(new String[0]);
    }
}