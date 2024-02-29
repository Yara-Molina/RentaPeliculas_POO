package com.yaravazquez.rentapeliculas.controllers;

import java.io.IOException;

import com.yaravazquez.rentapeliculas.models.Administrador;
import com.yaravazquez.rentapeliculas.models.Videoclub;

import javafx.fxml.FXML;
import com.yaravazquez.rentapeliculas.App;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController {

    Videoclub videoclub1 = new Videoclub();
    Administrador administrador1=new Administrador();
    private Stage stage;


    @FXML
    void onClickEmpleadoButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("empleado-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Video club");
        stage.setScene(scene);
        stage.show();

        Empleadocontroller clientcontroller = fxmlLoader.getController();
        clientcontroller.ingresarEmpleado(administrador1);
        clientcontroller.setStage(stage);
        clientcontroller.verEmpleado();
    }

    @FXML
    void onClickAdmin1Button(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("admin1-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Vista administrador");
        stage.setScene(scene);
        stage.show();
        Admin1Controller admin1Controller = fxmlLoader.getController();
        admin1Controller.ingresarVideoclub(videoclub1);
        admin1Controller.setStage(stage);
        admin1Controller.verInventarioMov();
    }
@FXML
void salir0(MouseEvent event){
        stage.close();
}
    public void setStage(Stage stage){
        this.stage= stage;
    }

}





