
package DAO;

import GUI.Admin_GUI;
import GUI.DangNhap_GUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class XuLyDatabase_DAO {
    private static String dbURL = "jdbc:mysql://localhost:3306/doanjava";
    private static String userName = "root";
    private static String password = "";
    
//    public static Connection conn = null;
        
        //Start Hàm kết nối cơ sở dữ liệu
        public Connection openConnection() throws ClassNotFoundException{
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(dbURL, userName, password);
                if(conn != null){
                    System.out.println("Kết nối DB thành công!");
                    return conn;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Kết nối DB thất bại!");
                System.out.println("Kết nối DB thất bại!");
                ex.printStackTrace();
            }      
        return null;
        }
        //End Hàm kết nối cơ sở dữ liệu
        
        //Start Hàm ĐÓNG kết nối cơ sở dữ liệu
        public void closeConnection(Connection conn){
            try {
                if(conn!=null)
                    conn.close();
                    System.out.println("Đóng kết nối DB thành công!");
            } catch (SQLException ex) {
                System.out.println("Đóng kết nối DB thất bại!");
                ex.printStackTrace();
            }
        }
        //End Hàm ĐÓNG kết nối cơ sở dữ liệu
        
        //Start Hàm đăng nhập quản trị
        public void LoginQuanTri(String tenTaiKhoanNV, String matKhauNV){  
            PreparedStatement ps = null;
            ResultSet result = null;
            Connection connection = null;
            
            try {
                    connection = this.openConnection();
                    String query = "SELECT * FROM tbl_nhanvien\n" + "WHERE tenTaiKhoanNV = ? AND matKhauNV = ?";

                    ps = connection.prepareStatement(query);
                    ps.setString(1, tenTaiKhoanNV);
                    ps.setString(2, matKhauNV);

                    result = ps.executeQuery();
                    
                    if (result.next()){
                        JOptionPane.showMessageDialog(null,"Đăng nhập thành công!");
                        Admin_GUI frmAdmin = new Admin_GUI();
                        DangNhap_GUI dnAdmin = new DangNhap_GUI();
                        frmAdmin.setVisible(true);
                        dnAdmin.setVisible(false);
                        
                    }else{
                        JOptionPane.showMessageDialog(null,"Sai thông tin đăng nhập! Mời nhập lại!");
//                        txfTenTaiKhoan.requestFocus();
                    }
                    
                }catch(Exception e){
                        System.out.print(e);
                }
            
            finally{
            try{
                this.closeConnection(connection);
//                ps.close();
//                result.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
 
        }
        //End Hàm đăng nhập quản trị
        
        
        
    }

