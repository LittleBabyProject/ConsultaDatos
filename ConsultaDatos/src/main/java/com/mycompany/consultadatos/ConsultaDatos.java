/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consultadatos;
import java.util.ArrayList;
import Clases.*;
import java.util.List;
import Vistas.VistaLogin;
/**
 *
 * @author aacev
 */
public class ConsultaDatos {
    
    public static Usuario admin;

    public static void main(String[] args) {
        // Objeto solo de prueba
        admin = new Usuario(0, "Admin", "Admin123", "Admin");
        
        VistaLogin login = new VistaLogin(admin);
        login.setVisible(true);
    }
}
