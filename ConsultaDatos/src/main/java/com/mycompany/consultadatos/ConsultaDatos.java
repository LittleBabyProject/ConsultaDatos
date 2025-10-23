/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consultadatos;
import java.util.ArrayList;
import Clases.*;
import java.util.List;
import Vistas.VistaLogin;
import java.util.LinkedHashMap;
import java.util.Map;
/**
 *
 * @author aacev
 */
public class ConsultaDatos {

    public static Map<Integer, Usuario> listaUsuarios = new LinkedHashMap<>();
    private static List<Pais> listaMaestraDePaises;
    
    public static void main(String[] args) {
        Usuario admin1 = new Usuario(1, "Admin", "Admin123", "Admin");
        Usuario admin2 = new Usuario(2, "Dueño", "Dueño123", "Admin");
        Usuario usuario1 = new Usuario(3, "Alex", "Alex123", "Usuario");
        Usuario usuario2 = new Usuario(4, "Cachupin", "Cachupin123", "Usuario");
        Usuario usuario3 = new Usuario(5, "Merluzin3", "Merluzin123", "Usuario");
        listaUsuarios.put(admin1.getId(), admin1);
        listaUsuarios.put(admin2.getId(), admin2);
        listaUsuarios.put(usuario1.getId(), usuario1);
        listaUsuarios.put(usuario2.getId(), usuario2);
        listaUsuarios.put(usuario3.getId(), usuario3);
        
        listaMaestraDePaises = new ArrayList<>();
        listaMaestraDePaises.add(new Pais("Chile", "South America", "South America", 700000.0f, 1810, 19000000, 80.5f, 200.0f, "Republic", "Gabriel Boric", "Santiago", "CHL"));
        listaMaestraDePaises.add(new Pais("Argentina", "South America", "South America", 2700000.0f, 1816, 40000000, 76.7f, 300.1f, "Republic", "Javier Milei", "Buenos Aires", "ARG"));
        listaMaestraDePaises.add(new Pais("Japón", "Asia", "Eastern Asia", 300000.0f, -660, 125000000, 84.5f, 5000.0f, "Constitutional Monarchy", "Fumio Kishida", "Tokyo", "JPN"));
        
        
        VistaLogin login = new VistaLogin(listaUsuarios, listaMaestraDePaises);
        login.setVisible(true);
    }
}
