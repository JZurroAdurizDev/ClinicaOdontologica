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
public class Paciente extends Persona {
    private int idPaciente;
    private boolean tieneSeguro;
    private String grupoSanguineo;
    private Responsable uResponsable;
    private List<Cita> listaCitas;

    public Paciente() {
    }

    public Paciente(int idPaciente, boolean tieneSeguro, String grupoSanguineo, Responsable uResponsable, List<Cita> listaCitas, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNaci) {
        super(dni, nombre, apellido, telefono, direccion, fechaNaci);
        this.idPaciente = idPaciente;
        this.tieneSeguro = tieneSeguro;
        this.grupoSanguineo = grupoSanguineo;
        this.uResponsable = uResponsable;
        this.listaCitas = listaCitas;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public boolean isTieneSeguro() {
        return tieneSeguro;
    }

    public void setTieneSeguro(boolean tieneSeguro) {
        this.tieneSeguro = tieneSeguro;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public Responsable getuResponsable() {
        return uResponsable;
    }

    public void setuResponsable(Responsable uResponsable) {
        this.uResponsable = uResponsable;
    }

    public List<Cita> getListaCitas() {
        return listaCitas;
    }

    public void setListaCitas(List<Cita> listaCitas) {
        this.listaCitas = listaCitas;
    }
    
}
