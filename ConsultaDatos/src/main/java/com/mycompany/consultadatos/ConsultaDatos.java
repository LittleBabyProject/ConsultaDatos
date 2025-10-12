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
    public static Usuario admin;
    public static Map<Integer, Usuario> listaUsuarios = new LinkedHashMap<>();
    
    public static void main(String[] args) {
        admin = new Usuario(1, "Admin", "Admin123", "Admin");
        listaUsuarios.put(admin.getId(), admin);
        
        VistaLogin login = new VistaLogin(admin, listaUsuarios);
        login.setVisible(true);
    }
}
