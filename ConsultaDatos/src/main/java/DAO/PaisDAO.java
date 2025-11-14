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
import Modelo.Pais;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PaisDAO implements PaisCRUD {

    @Override
    public List<Pais> obtenerTodosPaises() throws SQLException {
        List<Pais> paises = new ArrayList<>();
        String sql = "SELECT * FROM paises";
        
        try (Connection conn = Conn.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Pais pais = mapearPais(rs);
                paises.add(pais);
            }
        }
        return paises;
    }
    
    @Override
    public Pais obtenerPaisPorId(int idPais) throws SQLException {
        String sql = "SELECT * FROM paises WHERE id_pais = ?";
        
        try (Connection conn = Conn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, idPais);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return mapearPais(rs);
                }
            }
        }
        return null;
    }
    
    
    @Override
    public Pais obtenerPaisPorCodigo(String codPais) throws SQLException {
        String sql = "SELECT * FROM paises WHERE codPais = ?";
        
        try (Connection conn = Conn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, codPais);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return mapearPais(rs);
                }
            }
        }
        return null;
    }
    
    @Override
    public int insertarPais(Pais pais) throws SQLException {
        String sql = "INSERT INTO paises (nombre, continente, region, superficie, " +
                    "anioIndependencia, poblacion, expectLife, pib, gobierno, " +
                    "jefeGobierno, capital, codPais) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = Conn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            
            establecerParametrosPais(pstmt, pais);
            pstmt.executeUpdate();
            
            try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1);
                }
            }
        }
        return -1;
    }
    @Override
    public boolean actualizarPais(Pais pais) throws SQLException {
        String sql = "UPDATE paises SET nombre=?, continente=?, region=?, superficie=?, " +
                    "anioIndependencia=?, poblacion=?, expectLife=?, pib=?, gobierno=?, " +
                    "jefeGobierno=?, capital=?, codPais=? WHERE id_pais=?";
        
        try (Connection conn = Conn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            establecerParametrosPais(pstmt, pais);
            pstmt.setInt(13, pais.getIdPais());
            
            return pstmt.executeUpdate() > 0;
        }
    }
    @Override
    public boolean eliminarPais(int idPais) throws SQLException {
        String sql = "DELETE FROM paises WHERE id_pais = ?";
        
        try (Connection conn = Conn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, idPais);
            return pstmt.executeUpdate() > 0;
        }
    }
    
    private Pais mapearPais(ResultSet rs) throws SQLException {
        return new Pais(
            rs.getInt("id_pais"),
            rs.getString("nombre"),
            rs.getString("continente"),
            rs.getString("region"),
            rs.getFloat("superficie"),
            rs.getInt("anioIndependencia"),
            rs.getInt("poblacion"),
            rs.getFloat("expectLife"),
            rs.getFloat("pib"),
            rs.getString("gobierno"),
            rs.getString("jefeGobierno"),
            rs.getString("capital"),
            rs.getString("codPais")
        );
    }
    
    private void establecerParametrosPais(PreparedStatement pstmt, Pais pais) throws SQLException {
        pstmt.setString(1, pais.getNombre());
        pstmt.setString(2, pais.getContinente());
        pstmt.setString(3, pais.getRegion());
        pstmt.setFloat(4, pais.getSuperficie());
        pstmt.setInt(5, pais.getAnioIndependencia());
        pstmt.setInt(6, pais.getPoblacion());
        pstmt.setFloat(7, pais.getExpectLife());
        pstmt.setFloat(8, pais.getPib());
        pstmt.setString(9, pais.getGobierno());
        pstmt.setString(10, pais.getJefeGobierno());
        pstmt.setString(11, pais.getCapital());
        pstmt.setString(12, pais.getCodPais());
    }
}
