package com.yaravazquez.rentapeliculas.models;

import java.util.ArrayList;

public class Administrador {

    ArrayList<Empleado> empleados = new ArrayList<>();

    public ArrayList<Empleado> getListaempleados(){
        return empleados;
    }

    public void setNewEmpleado(Empleado Newempleado){
        empleados.add(Newempleado);
    }
    public String mostrarEmpleado() {
        String empleado = "";
        for (Empleado iterador : empleados) {
            empleado = empleado + iterador + "\n";
        }
        return empleado;
    }

    public void eliminarEmpleado(int contEmpleado){
        empleados.remove(contEmpleado);
    }
}
