/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Date;

/**
 *
 * @author Jabier Zurro Aduriz
 */
public class Responsable extends Persona {
    private int idResponsable;
    private String tipoResponsabilidad;

    public Responsable() {
    }

    public Responsable(int idResponsable, String tipoResponsabilidad, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNaci) {
        super(dni, nombre, apellido, telefono, direccion, fechaNaci);
        this.idResponsable = idResponsable;
        this.tipoResponsabilidad = tipoResponsabilidad;
    }

    public int getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }

    public String getTipoResponsabilidad() {
        return tipoResponsabilidad;
    }

    public void setTipoResponsabilidad(String tipoResponsabilidad) {
        this.tipoResponsabilidad = tipoResponsabilidad;
    }
    
    
}
