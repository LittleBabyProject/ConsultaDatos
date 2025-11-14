/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import Modelo.Pais;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Santo Tomas
 */
public interface PaisCRUD {
    List<Pais> obtenerTodosPaises() throws SQLException;
    Pais obtenerPaisPorId(int idPais) throws SQLException;
    Pais obtenerPaisPorCodigo(String codPais) throws SQLException;
    
    int insertarPais(Pais pais) throws SQLException;
    boolean actualizarPais(Pais pais) throws SQLException;
    boolean eliminarPais(int idPais) throws SQLException;
}
