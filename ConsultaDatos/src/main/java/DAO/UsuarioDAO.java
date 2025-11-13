/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author aacev
 */
import Controlador.Conn;
import Modelo.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    
    /**
     * Valida un usuario por nombre y contraseña
     */
    public Usuario validarUsuario(String nombre, String contrasena) throws SQLException {
        String sql = "SELECT * FROM usuarios WHERE nombre = ? AND contrasena = ?";
        
        try (Connection conn = Conn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, nombre);
            pstmt.setString(2, contrasena);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new Usuario(
                        rs.getInt("id_usuario"),
                        rs.getString("nombre"),
                        rs.getString("contrasena"), 
                        rs.getString("rol")
                    );
                }
            }
        }
        return null; // Usuario no encontrado
    }
    
    /**
     * Registra un nuevo usuario en la base de datos
     */
    public boolean registrarUsuario(String nombre, String contrasena, String rol) throws SQLException {
        String sql = "INSERT INTO usuarios (nombre, contrasena, rol) VALUES (?, ?, ?)";
        
        try (Connection conn = Conn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, nombre);
            pstmt.setString(2, contrasena);
            pstmt.setString(3, rol);
            
            int filasAfectadas = pstmt.executeUpdate();
            return filasAfectadas > 0;
        }
    }
    
    /**
     * Verifica si un usuario ya existe por nombre
     */
    public boolean usuarioExiste(String nombre) throws SQLException {
        String sql = "SELECT COUNT(*) FROM usuarios WHERE nombre = ?";
        
        try (Connection conn = Conn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, nombre);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        }
        return false;
    }
    
    /**
     * Obtiene todos los usuarios de la base de datos
     */
    public List<Usuario> obtenerTodosUsuarios() throws SQLException {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuarios ORDER BY id_usuario";
        
        try (Connection conn = Conn.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Usuario usuario = new Usuario(
                    rs.getInt("id_usuario"),
                    rs.getString("nombre"),
                    rs.getString("contrasena"),
                    rs.getString("rol")
                );
                usuarios.add(usuario);
            }
        }
        return usuarios;
    }
    
    /**
     * Obtiene un usuario por su ID
     */
    public Usuario obtenerUsuarioPorId(int idUsuario) throws SQLException {
        String sql = "SELECT * FROM usuarios WHERE id_usuario = ?";
        
        try (Connection conn = Conn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, idUsuario);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new Usuario(
                        rs.getInt("id_usuario"),
                        rs.getString("nombre"),
                        rs.getString("contrasena"),
                        rs.getString("rol")
                    );
                }
            }
        }
        return null;
    }
    
    /**
     * Actualiza un usuario existente
     */
    public boolean actualizarUsuario(Usuario usuario) throws SQLException {
        String sql = "UPDATE usuarios SET nombre = ?, contrasena = ?, rol = ? WHERE id_usuario = ?";
        
        try (Connection conn = Conn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, usuario.getNombre());
            pstmt.setString(2, usuario.getContrasena());
            pstmt.setString(3, usuario.getRol());
            pstmt.setInt(4, usuario.getIdUsuario());
            
            int filasAfectadas = pstmt.executeUpdate();
            return filasAfectadas > 0;
        }
    }
    
    /**
     * Elimina un usuario por su ID
     */
    public boolean eliminarUsuario(int idUsuario) throws SQLException {
        String sql = "DELETE FROM usuarios WHERE id_usuario = ?";
        
        try (Connection conn = Conn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, idUsuario);
            
            int filasAfectadas = pstmt.executeUpdate();
            return filasAfectadas > 0;
        }
    }
    
    /**
     * Cambia el rol de un usuario
     */
    public boolean cambiarRolUsuario(int idUsuario, String nuevoRol) throws SQLException {
        String sql = "UPDATE usuarios SET rol = ? WHERE id_usuario = ?";
        
        try (Connection conn = Conn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, nuevoRol);
            pstmt.setInt(2, idUsuario);
            
            int filasAfectadas = pstmt.executeUpdate();
            return filasAfectadas > 0;
        }
    }
    
    /**
     * Busca usuarios por nombre (para búsquedas)
     */
    public List<Usuario> buscarUsuariosPorNombre(String nombre) throws SQLException {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuarios WHERE nombre LIKE ? ORDER BY nombre";
        
        try (Connection conn = Conn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, "%" + nombre + "%");
            
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Usuario usuario = new Usuario(
                        rs.getInt("id_usuario"),
                        rs.getString("nombre"),
                        rs.getString("contrasena"),
                        rs.getString("rol")
                    );
                    usuarios.add(usuario);
                }
            }
        }
        return usuarios;
    }
    
    /**
     * Obtiene estadísticas de usuarios
     */
    public int contarUsuariosPorRol(String rol) throws SQLException {
        String sql = "SELECT COUNT(*) FROM usuarios WHERE rol = ?";
        
        try (Connection conn = Conn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, rol);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
        }
        return 0;
    }
}
