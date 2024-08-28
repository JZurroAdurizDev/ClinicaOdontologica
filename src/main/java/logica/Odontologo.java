/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Jabier Zurro Aduriz
 */
public class Odontologo extends Persona {
    private int idOdontologo;
    private String especialidad;
    private List<Cita> unaCita;
    private Usuario unUsuario;
    private Horario unHorario;

    public Odontologo() {
    }

    public Odontologo(int idOdontologo, String especialidad, List<Cita> unaCita, Usuario unUsuario, Horario unHorario, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNaci) {
        super(dni, nombre, apellido, telefono, direccion, fechaNaci);
        this.idOdontologo = idOdontologo;
        this.especialidad = especialidad;
        this.unaCita = unaCita;
        this.unUsuario = unUsuario;
        this.unHorario = unHorario;
    }

    public int getIdOdontologo() {
        return idOdontologo;
    }

    public void setIdOdontologo(int idOdontologo) {
        this.idOdontologo = idOdontologo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Cita> getUnaCita() {
        return unaCita;
    }

    public void setUnaCita(List<Cita> unaCita) {
        this.unaCita = unaCita;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    public Horario getUnHorario() {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }
    
    
}
