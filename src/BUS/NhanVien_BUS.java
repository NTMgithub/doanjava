/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.NhanVien_DAO;
import DTO.NhanVien_DTO;
import java.util.ArrayList;

/**
 *
 * @author mend
 */
public class NhanVien_BUS {
    NhanVien_DAO nhanvienDAO = new NhanVien_DAO();
    
    public ArrayList<NhanVien_DTO> getAllNhanVien() throws ClassNotFoundException{
        return nhanvienDAO.getAllNhanVien();
    }
    
    public int ThemNhanVien(NhanVien_DTO nhanvienDTO){
        int result = nhanvienDAO.ThemNhanVien(nhanvienDTO);
        return result;
    }
    
}
