/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;
import Modelo.IdiomaPais;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Santo Tomas
 */
public interface IdiomaPaisCRUD {
    int insertarIdioma(IdiomaPais idiomaPais) throws SQLException;
    IdiomaPais obtenerIdiomaPorId(int idIdioma) throws SQLException;
    boolean actualizarIdioma(IdiomaPais idiomaPais) throws SQLException;
    boolean eliminarIdioma(int idIdioma) throws SQLException;
    
    List<IdiomaPais> obtenerTodosIdiomas() throws SQLException;
    List<IdiomaPais> obtenerIdiomasPorPais(int idPais) throws SQLException;
    List<IdiomaPais> obtenerIdiomasOficiales() throws SQLException;
    List<IdiomaPais> obtenerIdiomasOficialesPorPais(int idPais) throws SQLException;
    
    boolean eliminarIdiomasPorPais(int idPais) throws SQLException;
    int contarIdiomasPorPais(int idPais) throws SQLException;
}
