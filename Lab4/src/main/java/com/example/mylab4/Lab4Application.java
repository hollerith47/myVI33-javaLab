package com.example.mylab4;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Lab4Application extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Lab4Application.class.getResource("lab4.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Lab4 java");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
