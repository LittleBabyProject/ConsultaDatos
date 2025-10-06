/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Santo Tomas
 */
public class IdiomaPais {
    private String idioma;
    private boolean esOficial;
    private float porcentajeHablante;

    public IdiomaPais() {
    }

    public IdiomaPais(String idioma, boolean esOficial, float porcentajeHablante) {
        this.idioma = idioma;
        this.esOficial = esOficial;
        this.porcentajeHablante = porcentajeHablante;
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
