module com.yaravazquez.rentapeliculas {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.gluonhq.charm.glisten;
    requires com.gluonhq.attach.display;

    requires org.kordamp.bootstrapfx.core;

    opens com.yaravazquez.rentapeliculas to javafx.fxml;
    exports com.yaravazquez.rentapeliculas;
    exports com.yaravazquez.rentapeliculas.controllers;
    opens com.yaravazquez.rentapeliculas.controllers to javafx.fxml;
}