/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BUS.XuLyDatabase_BUS;
import DTO.NhanVien_DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author mend
 */
public class NhanVien_DAO {
    private XuLyDatabase_BUS xuLyDB = null;
    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet resultSet = null;
    
    public ArrayList<NhanVien_DTO> getAllNhanVien() throws ClassNotFoundException{
        
        ArrayList<NhanVien_DTO> resultArray = new ArrayList<NhanVien_DTO>();
        String query = "SELECT * FROM tbl_nhanvien";
        
        try{
            xuLyDB = new XuLyDatabase_BUS();
            connection = xuLyDB.openConnection();
            
            ps = connection.prepareStatement(query);
            resultSet = ps.executeQuery();
            
            while (resultSet.next()){
                NhanVien_DTO nhanvienDTO = new NhanVien_DTO();
                nhanvienDTO.setMaNV(resultSet.getInt("maNV"));
                nhanvienDTO.setMaChucVu(resultSet.getInt("maChucVu"));
                nhanvienDTO.setTenTaiKhoanNV(resultSet.getString("tenTaiKhoanNV"));
                nhanvienDTO.setMatKhauNV(resultSet.getString("matKhauNV"));
                nhanvienDTO.setHoTenNV(resultSet.getString("hoTenNV"));
                nhanvienDTO.setDiaChiNV(resultSet.getString("diaChiNV"));
                nhanvienDTO.setSdtNV(resultSet.getString("sdtNV"));
                nhanvienDTO.setCmndNV(resultSet.getString("cmndNV"));
                nhanvienDTO.setGioiTinhNV(resultSet.getString("gioiTinhNV"));
                nhanvienDTO.setAnhNV(resultSet.getString("anhNV"));
                
                resultArray.add(nhanvienDTO);
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
    
    public void getAllChucVuCBB(JComboBox cbbName){
        String query = "SELECT * FROM tbl_chucvu";
        
        try{
            xuLyDB = new XuLyDatabase_BUS();
            connection = xuLyDB.openConnection();
            
            ps = connection.prepareStatement(query);
            resultSet = ps.executeQuery();
            while (resultSet.next()){
                cbbName.addItem(resultSet.getString("maChucVu"));
            }
            
        }catch(Exception e){
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
        
    }
    
    public String getTenChucVu(int maChucVu){
        String query = "SELECT * FROM tbl_chucvu";
        
        try{
            xuLyDB = new XuLyDatabase_BUS();
            connection = xuLyDB.openConnection();
            
            ps = connection.prepareStatement(query);
            resultSet = ps.executeQuery();
            while (resultSet.next()){
                int maCV = resultSet.getInt("maChucVu");
                if ( maCV == maChucVu){
                    return resultSet.getString("tenChucVu");
                }
            }
            
        }catch(Exception e){
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
        return null;
        
    }
    
    public int ThemNhanVien(NhanVien_DTO nhanvienDTO){ //Chưa có chức năng thêm ảnh      
        int result = 0;
        String query = "INSERT INTO tbl_nhanvien(maNV, maChucVu, tenTaiKhoanNV, matKhauNV, hoTenNV, diaChiNV, sdtNV, cmndNV, gioiTinhNV) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?) ";
        
        try{
            xuLyDB = new XuLyDatabase_BUS();
            try { 
                connection = xuLyDB.openConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(NhanVien_DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            ps = connection.prepareStatement(query);
            
            ps.setInt(1, nhanvienDTO.getMaNV());
            ps.setInt(2, nhanvienDTO.getMaChucVu());
            ps.setString(3, nhanvienDTO.getTenTaiKhoanNV());
            ps.setString(4, nhanvienDTO.getMatKhauNV());
            ps.setString(5, nhanvienDTO.getHoTenNV());
            ps.setString(6, nhanvienDTO.getDiaChiNV());
            ps.setString(7, nhanvienDTO.getSdtNV());
            ps.setString(8, nhanvienDTO.getCmndNV());
            ps.setString(9, nhanvienDTO.getGioiTinhNV());
//            ps.setString(9, nhanvienDTO.getAnhNV());
            
            result = ps.executeUpdate();
   
        }catch (SQLException e){
            e.printStackTrace();
        }
        
        //Dong ket noi
        finally{
            try{
                xuLyDB.closeConnection(connection);
                ps.close();
//                resultSet.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        
        return result;
    }
    
}
