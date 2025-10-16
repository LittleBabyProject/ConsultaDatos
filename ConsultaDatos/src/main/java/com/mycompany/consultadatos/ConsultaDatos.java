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
    
    public static void main(String[] args) {
        Usuario admin1 = new Usuario(1, "Admin1", "Admin123", "Admin");
        Usuario admin2 = new Usuario(2, "Admin2", "Admin123", "Admin");
        Usuario usuario1 = new Usuario(3, "Alex", "Alex123", "Usuario");
        Usuario usuario2 = new Usuario(4, "Cachupin", "Cachupin123", "Usuario");
        Usuario usuario3 = new Usuario(5, "Merluzin3", "Merluzin123", "Usuario");
        listaUsuarios.put(admin1.getId(), admin1);
        listaUsuarios.put(admin2.getId(), admin2);
        listaUsuarios.put(usuario1.getId(), usuario1);
        listaUsuarios.put(usuario2.getId(), usuario2);
        listaUsuarios.put(usuario3.getId(), usuario3);
        
        VistaLogin login = new VistaLogin(listaUsuarios);
        login.setVisible(true);
    }
}
