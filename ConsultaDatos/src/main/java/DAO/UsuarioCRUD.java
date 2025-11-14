/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;
import Modelo.Usuario;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Santo Tomas
 */
public interface UsuarioCRUD {
    Usuario validarUsuario(String nombre, String contrasena) throws SQLException;
    boolean registrarUsuario(String nombre, String contrasena, String rol) throws SQLException;
    boolean usuarioExiste(String nombre) throws SQLException;
    Usuario obtenerUsuarioPorId(int idUsuario) throws SQLException;
    List<Usuario> obtenerTodosUsuarios() throws SQLException;
    boolean actualizarUsuario(Usuario usuario) throws SQLException;
    boolean eliminarUsuario(int idUsuario) throws SQLException;
    boolean cambiarRolUsuario(int idUsuario, String nuevoRol) throws SQLException;
    List<Usuario> buscarUsuariosPorNombre(String nombre) throws SQLException;
    int contarUsuariosPorRol(String rol) throws SQLException; 
}
