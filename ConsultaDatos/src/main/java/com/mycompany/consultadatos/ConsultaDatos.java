/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consultadatos;
import java.util.ArrayList;
import Clases.*;
import java.util.List;
/**
 *
 * @author aacev
 */
public class ConsultaDatos {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Ciudad> ciudades = new ArrayList<>();
        List<IdiomaPais> idiomas = new ArrayList<>();
        ciudades.add(new Ciudad("Santiago","Chile","latinoamerica",20));
        Pais pais1 = new Pais("Chile","America","Latinoamerica",200f,1818,20000,80f,28f,"Comunistas qls","Merluzo","Santiago es chile","CHL",ciudades,idiomas);
        System.out.println(""+ pais1.getCiudades());
    }
}
