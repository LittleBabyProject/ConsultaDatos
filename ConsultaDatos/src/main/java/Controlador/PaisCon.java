/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Clases.IdiomaPais;
import Clases.Pais;
import java.util.List;
/**
 *
 * @author guerr
 */
public class PaisCon {
   private List<Pais> listaPaises;

    public PaisCon(List<Pais> listaMaestra) {
        this.listaPaises = listaMaestra;
    }
    
    public List<Pais> getListaPaises() {
        return this.listaPaises;
    }
    
    public Pais getPais(int i) {
        if (i >= 0 && i < listaPaises.size()) {
            return listaPaises.get(i);
        }
        return null;
    }
    
    public String getPrimerIdioma(Pais pais) { 
        if (pais == null || pais.getIdiomas().isEmpty()) {
            return "";          
        } else {
            return pais.getIdiomas().get(0).getIdioma();
        }
    }
    
    public void agregarPais(String codigo, String nombre, String continente, String poblacionStr, String capital, String idioma) throws Exception {
        if (codigo.isEmpty() || nombre.isEmpty() || continente.isEmpty() || poblacionStr.isEmpty() || capital.isEmpty()) {
            throw new Exception("Complete todos los campos requeridos");
        }
        for (Pais p : listaPaises) {
            if (p.getCodPais().equalsIgnoreCase(codigo)) {
                throw new Exception("El codigo del pais ya existe");
            }
        }
        int poblacion = Integer.parseInt(poblacionStr);
        Pais nuevoPais = new Pais(nombre, continente, "", 0f, 0, poblacion, 0f, 0f, "", "", capital, codigo);
        if (!idioma.isEmpty()) {
            nuevoPais.getIdiomas().add(new IdiomaPais(idioma, true, 100f));
        }
        this.listaPaises.add(nuevoPais);
    }
    public void modificarPais(int fila, String codigo, String nombre, String continente, String poblacion, String capital, String idiomaStr) throws Exception {
        if (codigo.isEmpty() || nombre.isEmpty() || continente.isEmpty() || poblacion.isEmpty() || capital.isEmpty()) {
            throw new Exception("Complete todos los campos requeridos antes de modificar");
        }
        int pobla = Integer.parseInt(poblacion);
        Pais paisModificar = this.listaPaises.get(fila);
        paisModificar.setCodPais(codigo);
        paisModificar.setNombre(nombre);
        paisModificar.setContinente(continente);
        paisModificar.setPoblacion(pobla);
        paisModificar.setCapital(capital);
        if (paisModificar.getIdiomas().isEmpty()) {
            if (!idiomaStr.isEmpty()) {
                paisModificar.getIdiomas().add(new IdiomaPais(idiomaStr, true, 100f));
            }
        } else {
            paisModificar.getIdiomas().get(0).setIdioma(idiomaStr);
        }
    } 
}
