/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DTO.SanPham_DTO;
import BUS.XuLyDatabase_BUS;
/**
 *
 * @author mend
 */
public class SanPham_DAO {
    
    private XuLyDatabase_BUS xuLyDB = null;
    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet resultSet = null;
    
    
    public ArrayList<SanPham_DTO> getAllProducts() throws ClassNotFoundException{
        
        ArrayList<SanPham_DTO> resultArray = new ArrayList<SanPham_DTO>();
        String query = "SELECT * FROM tbl_sanpham";
        
        try{
            xuLyDB = new XuLyDatabase_BUS();
            connection = xuLyDB.openConnection();
            
            ps = connection.prepareStatement(query);
            resultSet = ps.executeQuery();
            
            while ( resultSet.next() ){
                SanPham_DTO sanphamDTO = new SanPham_DTO();
                sanphamDTO.setMaSP(resultSet.getInt("maSP"));
                sanphamDTO.setTenSP(resultSet.getString("tenSP"));
                       
                resultArray.add(SanPham_DTO);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        
        //Dong ket noi
        finally{
            try{
                xuLyDB.closeConnection(connection);
                ps.close();
                resultSet.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        
        return resultArray;
    }
 
    
    
    
    
    
    
}
