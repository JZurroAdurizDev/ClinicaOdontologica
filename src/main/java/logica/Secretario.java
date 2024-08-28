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
public class Secretario extends Persona {
    private int idSecretario;
    private String sector;
    private Usuario unUsuario;

    public Secretario() {
    }

    public Secretario(int idSecretario, String sector, Usuario unUsuario, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNaci) {
        super(dni, nombre, apellido, telefono, direccion, fechaNaci);
        this.idSecretario = idSecretario;
        this.sector = sector;
        this.unUsuario = unUsuario;
    }

    public int getIdSecretario() {
        return idSecretario;
    }

    public void setIdSecretario(int idSecretario) {
        this.idSecretario = idSecretario;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }
    
    
}
