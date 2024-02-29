package com.yaravazquez.rentapeliculas;

import com.yaravazquez.rentapeliculas.controllers.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Video club");
        stage.setScene(scene);
        stage.show();
         LoginController loginController = fxmlLoader.getController();
        loginController.setStage(stage);
    }

    
    public static void main(String[] args) {
        launch();
    }
}

