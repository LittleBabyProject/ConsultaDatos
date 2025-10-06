/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Santo Tomas
 */
public class Ciudad {
    private String nombre;
    private String paisOrigen;
    private String distrito;
    private int problacion;

    public Ciudad() {
    }

    public Ciudad(String nombre, String paisOrigen, String distrito, int problacion) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.distrito = distrito;
        this.problacion = problacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getProblacion() {
        return problacion;
    }

    public void setProblacion(int problacion) {
        this.problacion = problacion;
    }
    
    
    
}
