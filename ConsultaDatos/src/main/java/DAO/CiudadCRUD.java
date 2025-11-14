/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;
import Modelo.Ciudad;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Santo Tomas
 */
public interface CiudadCRUD {
    void insertar(Ciudad ciudad) throws SQLException;
    Ciudad obtenerPorId(int idCiudad) throws SQLException;
    void actualizar(Ciudad ciudad) throws SQLException;
    void eliminar(int idCiudad) throws SQLException;
    
    List<Ciudad> obtenerTodas() throws SQLException;
    List<Ciudad> obtenerPorNombre(String nombre) throws SQLException;
    List<Ciudad> obtenerPorPais(int idPais) throws SQLException;
    List<Ciudad> obtenerPorDistrito(String distrito) throws SQLException;
    List<Ciudad> obtenerPorPoblacionMayorA(int poblacionMinima) throws SQLException;
    List<Ciudad> obtenerPorPoblacionMenorA(int poblacionMaxima) throws SQLException;
    
    int contarTotalCiudades() throws SQLException;
    int contarPorPais(int idPais) throws SQLException;
}
