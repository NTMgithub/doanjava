/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BUS;

import DAO.XuLyDatabase_DAO;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class XuLyDatabase_BUS {
    XuLyDatabase_DAO xuLyDB = new XuLyDatabase_DAO();
    
    public Connection openConnection() throws ClassNotFoundException{
        return xuLyDB.openConnection();
    }
    
    public void closeConnection(Connection conn){
        xuLyDB.closeConnection(conn);
    }
    
    public void LoginQuanTri(String tenTaiKhoanNV, String matKhauNV){
        xuLyDB.LoginQuanTri(tenTaiKhoanNV, matKhauNV);
    }
    
}
