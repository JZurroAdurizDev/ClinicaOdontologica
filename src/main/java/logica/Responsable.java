/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author Jabier Zurro Aduriz
 */
@Entity
public class Responsable extends Persona {
    //private int idResponsable;
    private String tipoResponsabilidad;

    public Responsable() {
    }

    public Responsable(String tipoResponsabilidad, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNaci) {
        super(id, dni, nombre, apellido, telefono, direccion, fechaNaci);
        this.tipoResponsabilidad = tipoResponsabilidad;
    }

    /*public int getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }*/

    public String getTipoResponsabilidad() {
        return tipoResponsabilidad;
    }

    public void setTipoResponsabilidad(String tipoResponsabilidad) {
        this.tipoResponsabilidad = tipoResponsabilidad;
    }
    
    
}
