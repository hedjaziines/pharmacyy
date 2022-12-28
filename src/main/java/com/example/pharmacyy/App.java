package com.example.pharmacyy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent parent= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/Fxml/Products.fxml")));
        Scene scene=new Scene(parent);
        stage.setTitle("product");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
