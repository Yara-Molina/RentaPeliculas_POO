package com.yaravazquez.rentapeliculas.controllers;
import com.yaravazquez.rentapeliculas.App;
import com.yaravazquez.rentapeliculas.models.Pelicula;
import com.yaravazquez.rentapeliculas.models.Videoclub;
import com.yaravazquez.rentapeliculas.models.Blueray;
import com.yaravazquez.rentapeliculas.models.Dvd;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Admin1Controller {
    @FXML
    private TextArea movieText;
    private Videoclub videoclub;

private Stage stage;


    @FXML
    void agregar(MouseEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        ButtonType dvd=new ButtonType("DVD");
        ButtonType blueray=new ButtonType("BlueRay");
        alert.getButtonTypes().setAll(dvd,blueray);
        alert.setTitle("Agregar Pelicula");
        alert.setHeaderText("¿Que tipo de formato es?");
        alert.showAndWait().ifPresent(respuesta ->{
            if(respuesta==dvd){
                videoclub.setNewPelicula(perdirDvd());
            }else {
                videoclub.setNewPelicula(perdirBlueray());
            }
        });
        verInventarioMov();
    }

    public void ingresarVideoclub(Videoclub videoclub1){
        this.videoclub=videoclub1;
    }
    public void setStage(Stage stage){
        this.stage=stage;}

    public void verInventarioMov(){
        movieText.setText(videoclub.mostrarPelicula());
    }

public Dvd perdirDvd(){
        Dvd newDvd = new Dvd();
    TextInputDialog dialog = new TextInputDialog();
    dialog.setTitle("Agregar Pelicula:");
    dialog.setHeaderText("Nombre del DVD:");
    Optional<String> result = dialog.showAndWait();
    result.ifPresent(newDvd::setTitle);
    dialog.getEditor().clear();
    dialog.setHeaderText("Director:");
    Optional<String> director = dialog.showAndWait();
    director.ifPresent(newDvd::setDirector);
    dialog.getEditor().clear();
    dialog.setHeaderText("Año:");
    Optional<String> year = dialog.showAndWait();
    year.ifPresent(yearMovie -> newDvd.setYear(Integer.parseInt(yearMovie)));
    dialog.getEditor().clear();
    dialog.setHeaderText("Genero:");
    Optional<String> gender = dialog.showAndWait();
    gender.ifPresent(newDvd::setGender);
    dialog.getEditor().clear();
    dialog.setHeaderText("Precio:");
    Optional<String> precio = dialog.showAndWait();
    precio.ifPresent(Peliculaprecio -> newDvd.setPrecio(Integer.parseInt(Peliculaprecio)));
    dialog.getEditor().clear();
    dialog.setHeaderText("Idioma original:");
    Optional<String> idioma = dialog.showAndWait();
    idioma.ifPresent(newDvd::setIdiomaAudio);
    dialog.getEditor().clear();
    dialog.setHeaderText("Subtitulos:");
    Optional<String> subtitulos = dialog.showAndWait();
    subtitulos.ifPresent(newDvd::setIdiomasSubtitulos);
    dialog.getEditor().clear();
    return newDvd;
}

    public Blueray perdirBlueray(){
        Blueray newBlueray = new Blueray();
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Agregar Pelicula");
        dialog.setHeaderText("Nombre del BlueRay:");
        Optional<String> result = dialog.showAndWait();
        result.ifPresent(newBlueray::setTitle);
        dialog.getEditor().clear();
        dialog.setHeaderText("Director:");
        Optional<String> director = dialog.showAndWait();
        director.ifPresent(newBlueray::setDirector);
        dialog.getEditor().clear();
        dialog.setHeaderText("Año:");
        Optional<String> year = dialog.showAndWait();
        year.ifPresent(yearMovie -> newBlueray.setYear(Integer.parseInt(yearMovie)));
        dialog.getEditor().clear();
        dialog.setHeaderText("Genero:");
        Optional<String> gender = dialog.showAndWait();
        gender.ifPresent(newBlueray::setGender);
        dialog.getEditor().clear();
        dialog.setHeaderText("Precio");
        Optional<String> precio = dialog.showAndWait();
        precio.ifPresent(Peliculaprecio -> newBlueray.setPrecio(Integer.parseInt(Peliculaprecio)));
        dialog.getEditor().clear();
        dialog.setHeaderText("Capacidad:");
        Optional<String> estipo3D = dialog.showAndWait();
        estipo3D.ifPresent(newBlueray::setCapacidad);
        dialog.getEditor().clear();
        dialog.setHeaderText("Resolucion:");
        Optional<String> resolucionMov = dialog.showAndWait();
        resolucionMov.ifPresent(newBlueray::setResolucion);
        dialog.getEditor().clear();
        return newBlueray;
    }
    @FXML
    void Salir1(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("VideoClub");
        stage.setScene(scene);
        stage.show();
        LoginController loginController = fxmlLoader.getController();
        loginController.setStage(stage);
    }

}




