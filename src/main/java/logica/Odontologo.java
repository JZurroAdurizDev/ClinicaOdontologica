/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Jabier Zurro Aduriz
 */
@Entity
public class Odontologo extends Persona implements Serializable {
    //private int idOdontologo;
    private String especialidad;
    @OneToMany(mappedBy = "odonto")
    private List<Cita> unaCita;
    @OneToOne
    private Usuario unUsuario;
    @OneToOne
    private Horario unHorario;

    public Odontologo() {
    }

    public Odontologo(String especialidad, List<Cita> unaCita, Usuario unUsuario, Horario unHorario, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNaci) {
        super(id, dni, nombre, apellido, telefono, direccion, fechaNaci);
        this.especialidad = especialidad;
        this.unaCita = unaCita;
        this.unUsuario = unUsuario;
        this.unHorario = unHorario;
    }

    /*public int getIdOdontologo() {
        return idOdontologo;
    }

    public void setIdOdontologo(int idOdontologo) {
        this.idOdontologo = idOdontologo;
    }*/

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
