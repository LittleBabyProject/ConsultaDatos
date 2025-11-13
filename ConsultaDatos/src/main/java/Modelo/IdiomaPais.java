/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Santo Tomas
 */

public class IdiomaPais {
    private int idIdioma;
    private int idPais;
    private String idioma;
    private boolean esOficial;
    private float porcentajeHablante;

    public IdiomaPais() {
    }

    public IdiomaPais(int idPais, String idioma, boolean esOficial, float porcentajeHablante) {
        this.idPais = idPais;
        this.idioma = idioma;
        this.esOficial = esOficial;
        this.porcentajeHablante = porcentajeHablante;
    }

    public int getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(int idIdioma) {
        this.idIdioma = idIdioma;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isEsOficial() {
        return esOficial;
    }

    public void setEsOficial(boolean esOficial) {
        this.esOficial = esOficial;
    }

    public float getPorcentajeHablante() {
        return porcentajeHablante;
    }

    public void setPorcentajeHablante(float porcentajeHablante) {
        this.porcentajeHablante = porcentajeHablante;
    }
    
}
