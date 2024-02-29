package com.yaravazquez.rentapeliculas.controllers;

import com.yaravazquez.rentapeliculas.App;
import com.yaravazquez.rentapeliculas.models.Administrador;
import com.yaravazquez.rentapeliculas.models.Empleado;
import com.yaravazquez.rentapeliculas.models.Videoclub;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class Empleadocontroller {


    @FXML
    private TextArea empleadoText;

    private Administrador administrador;
    private Stage stage;


    public void ingresarEmpleado(Administrador administrador1) {
        this.administrador = administrador1;
    }

    @FXML
    void registrarEmpleado(MouseEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        Empleado newEmpleado = new Empleado();
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Registro del empleado:");
        ButtonType registrarEmpleado = new ButtonType("Si");
        ButtonType noresgistrar = new ButtonType("No");
        alert.getButtonTypes().setAll(registrarEmpleado, noresgistrar);
        alert.setTitle("Agregar");
        alert.setHeaderText("¿Desea agregar un empleado?");
        alert.showAndWait().ifPresent(respuesta1 -> {
            if (respuesta1 == registrarEmpleado) {
                administrador.setNewEmpleado(agregarEmpeado());
            }
            verEmpleado();
        });
    }

    public Empleado agregarEmpeado() {
        Empleado newEmpleado = new Empleado();
        TextInputDialog dialog = new TextInputDialog();
        dialog.setHeaderText("Nombre:");
        Optional<String> result = dialog.showAndWait();
        result.ifPresent(newEmpleado::setNombre);
        dialog.getEditor().clear();
        dialog.setHeaderText("Apellido:");
        Optional<String> director = dialog.showAndWait();
        director.ifPresent(newEmpleado::setApellido);
        dialog.getEditor().clear();
        dialog.setHeaderText("Edad:");
        Optional<String> edad = dialog.showAndWait();
        edad.ifPresent(edad1 -> newEmpleado.setEdad(Integer.parseInt(edad1)));
        dialog.getEditor().clear();
        return newEmpleado;
    }


    public void verEmpleado() {
        empleadoText.setText(administrador.mostrarEmpleado());
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    void eliminar(MouseEvent event) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Eliminar empleado");
        dialog.setHeaderText("Ingrese nombre del Empleado");
        Optional<String> empleadoSelect = dialog.showAndWait();
        empleadoSelect.ifPresent(empleado -> {
            int i = 0;
            int cambio = -1;
            for (Empleado empleado1: administrador.getListaempleados()){
                if (empleado1.getNombre().equals(empleado)){
                    cambio = i;
                }
                i++;
            }
            if (cambio != -1){
                administrador.eliminarEmpleado(cambio);
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Eliminar");
                alert.setHeaderText("Empleado eliminado");
                alert.showAndWait();
                verEmpleado();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("No ha sido encontrado el empleado");
                alert.showAndWait();
            }
        });
    }

    @FXML
    void salir2(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("VideoClub");
        stage.setScene(scene);
        stage.show();
        LoginController loginController = fxmlLoader.getController();
        loginController.setStage(stage);
    }

}

