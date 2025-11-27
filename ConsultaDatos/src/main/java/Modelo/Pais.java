/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Modelo;

/**
 *
 * @author Santo Tomas
 */

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private int idPais;
    private String nombre; 
    private String continente; 
    private String region; 
    private float superficie;
    private int anioIndependencia;
    private int poblacion; 
    private float expectLife; 
    private float pib;  
    private String gobierno; 
    private String jefeGobierno; 
    private String codPais; // ej; 'CHL' 
    private List<Ciudad> ciudades = new ArrayList<>(); 
    private List<IdiomaPais> idiomas = new ArrayList<>(); 

    public Pais() {
        this.ciudades = new ArrayList<>();
        this.idiomas = new ArrayList<>();
    }

    public Pais(int idPais, String nombre, String continente, String region, float superficie, 
                int anioIndependencia, int poblacion, float expectLife, float pib, String gobierno, 
                String jefeGobierno, String codPais, 
                List<Ciudad> ciudades, List<IdiomaPais> idiomas) {
        
        this.idPais = idPais;
        this.nombre = nombre;
        this.continente = continente;
        this.region = region;
        this.superficie = superficie;
        this.anioIndependencia = anioIndependencia;
        this.poblacion = poblacion;
        this.expectLife = expectLife;
        this.pib = pib;
        this.gobierno = gobierno;
        this.jefeGobierno = jefeGobierno;
        this.codPais = codPais;
        this.ciudades = ciudades != null ? ciudades : new ArrayList<>();
        this.idiomas = idiomas != null ? idiomas : new ArrayList<>();
    }

    public Pais(String nombre, String continente, String region, float superficie, 
                int anioIndependencia, int poblacion, float expectLife, float pib, 
                String gobierno, String jefeGobierno, String codPais) {
        
        this.idPais = 0;
        this.nombre = nombre;
        this.continente = continente;
        this.region = region;
        this.superficie = superficie;
        this.anioIndependencia = anioIndependencia;
        this.poblacion = poblacion;
        this.expectLife = expectLife;
        this.pib = pib;
        this.gobierno = gobierno;
        this.jefeGobierno = jefeGobierno;
        this.codPais = codPais;
        this.ciudades = new ArrayList<>();
        this.idiomas = new ArrayList<>();
    }

    public Pais(int idPais, String nombre, String continente, String region, float superficie, 
                int anioIndependencia, int poblacion, float expectLife, float pib, 
                String gobierno, String jefeGobierno, String codPais) {
        this.idPais = idPais;
        this.nombre = nombre;
        this.continente = continente;
        this.region = region;
        this.superficie = superficie;
        this.anioIndependencia = anioIndependencia;
        this.poblacion = poblacion;
        this.expectLife = expectLife;
        this.pib = pib;
        this.gobierno = gobierno;
        this.jefeGobierno = jefeGobierno;
        this.codPais = codPais;
        this.ciudades = new ArrayList<>();
        this.idiomas = new ArrayList<>();
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public int getAnioIndependencia() {
        return anioIndependencia;
    }

    public void setAnioIndependencia(int anioIndependencia) {
        this.anioIndependencia = anioIndependencia;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public float getExpectLife() {
        return expectLife;
    }

    public void setExpectLife(float expectLife) {
        this.expectLife = expectLife;
    }

    public float getPib() {
        return pib;
    }

    public void setPib(float pib) {
        this.pib = pib;
    }

    public String getGobierno() {
        return gobierno;
    }

    public void setGobierno(String gobierno) {
        this.gobierno = gobierno;
    }

    public String getJefeGobierno() {
        return jefeGobierno;
    }

    public void setJefeGobierno(String jefeGobierno) {
        this.jefeGobierno = jefeGobierno;
    }

    public String getCodPais() {
        return codPais;
    }

    public void setCodPais(String codPais) {
        this.codPais = codPais;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public List<IdiomaPais> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<IdiomaPais> idiomas) {
        this.idiomas = idiomas;
    }

    public void agregarCiudad(Ciudad ciudad) {
        this.ciudades.add(ciudad);
    }

    public void agregarIdioma(IdiomaPais idioma) {
        this.idiomas.add(idioma);
    }

    public void removerCiudad(Ciudad ciudad) {
        this.ciudades.remove(ciudad);
    }

    public void removerIdioma(IdiomaPais idioma) {
        this.idiomas.remove(idioma);
    }

    @Override
    public String toString() {
        return this.nombre + " (" + this.codPais + ")";
    }
    
    private String capitalNombre;   //es mas que nada porque quitamos capital a la clase

    public String getCapitalNombre() {
        return (capitalNombre != null) ? capitalNombre : "No definida";
    }

    public void setCapitalNombre(String capitalNombre) {
        this.capitalNombre = capitalNombre;
    }
}