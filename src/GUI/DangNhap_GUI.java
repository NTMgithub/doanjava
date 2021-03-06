/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import BUS.NhanVien_BUS;
import GUI.Admin_GUI;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrator
 */
public class DangNhap_GUI extends javax.swing.JFrame {
    /**
     * Creates new form LoginAdmin
     */
    public static String hoTenOnline;
    public static int maNVOnline;
    
    int mousepX;
    int mousepY;
    public DangNhap_GUI() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnDangNhap = new javax.swing.JPanel();
        lblDangNhap = new javax.swing.JLabel();
        lblTenTaiKhoan = new javax.swing.JLabel();
        txfTenTaiKhoan = new javax.swing.JTextField();
        lblMatKhau = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();
        txfMatKhau = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblImage = new javax.swing.JLabel();
        pnTitle = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();
        lbMinimize = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ĐĂNG NHẬP QUẢN TRỊ");
        setBackground(new java.awt.Color(102, 163, 222));
        setName("Đăng nhập Admin"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        pnDangNhap.setBackground(new java.awt.Color(102, 163, 222));
        pnDangNhap.setForeground(new java.awt.Color(255, 255, 255));

        lblDangNhap.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        lblDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        lblDangNhap.setText("ĐĂNG NHẬP QUẢN TRỊ");

        lblTenTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        lblTenTaiKhoan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTenTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        lblTenTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-username-50.png"))); // NOI18N
        lblTenTaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txfTenTaiKhoan.setForeground(new java.awt.Color(153, 153, 153));
        txfTenTaiKhoan.setText("Nhập tên tài khoản...");
        txfTenTaiKhoan.setToolTipText("Nhập tên tài khoản...");
        txfTenTaiKhoan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txfTenTaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txfTenTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txfTenTaiKhoanMousePressed(evt);
            }
        });
        txfTenTaiKhoan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfTenTaiKhoanKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfTenTaiKhoanKeyReleased(evt);
            }
        });

        lblMatKhau.setBackground(new java.awt.Color(255, 255, 255));
        lblMatKhau.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        lblMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-password-52.png"))); // NOI18N
        lblMatKhau.setToolTipText("");

        btnDangNhap.setBackground(new java.awt.Color(0, 204, 255));
        btnDangNhap.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-login-30.png"))); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setBorder(null);
        btnDangNhap.setBorderPainted(false);
        btnDangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDangNhapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDangNhapMouseExited(evt);
            }
        });
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        txfMatKhau.setForeground(new java.awt.Color(153, 153, 153));
        txfMatKhau.setText("Nhập mật khẩu...");
        txfMatKhau.setToolTipText("Nhập mật khẩu...");
        txfMatKhau.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txfMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txfMatKhauMousePressed(evt);
            }
        });
        txfMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfMatKhauKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfMatKhauKeyReleased(evt);
            }
        });

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/276-2764901_www-agisac-gov-in-admin-png.png"))); // NOI18N

        javax.swing.GroupLayout pnDangNhapLayout = new javax.swing.GroupLayout(pnDangNhap);
        pnDangNhap.setLayout(pnDangNhapLayout);
        pnDangNhapLayout.setHorizontalGroup(
            pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator1)
            .addGroup(pnDangNhapLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnDangNhapLayout.createSequentialGroup()
                        .addComponent(lblTenTaiKhoan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txfTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnDangNhapLayout.createSequentialGroup()
                        .addComponent(lblMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfMatKhau)))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDangNhapLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDangNhapLayout.createSequentialGroup()
                        .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDangNhapLayout.createSequentialGroup()
                                .addComponent(lblImage)
                                .addGap(92, 92, 92))
                            .addComponent(lblDangNhap, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDangNhapLayout.createSequentialGroup()
                        .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))))
        );
        pnDangNhapLayout.setVerticalGroup(
            pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDangNhapLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblImage)
                .addGap(11, 11, 11)
                .addComponent(lblDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnDangNhapLayout.createSequentialGroup()
                        .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(txfMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pnTitle.setBackground(new java.awt.Color(102, 102, 102));
        pnTitle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnTitleMouseDragged(evt);
            }
        });
        pnTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnTitleMousePressed(evt);
            }
        });

        lbExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-xbox-x-20.png"))); // NOI18N
        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExitMouseClicked(evt);
            }
        });

        lbMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-minimize-window-20.png"))); // NOI18N
        lbMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMinimizeMouseClicked(evt);
            }
        });

        lbTitle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setText("SNEAKER STORE");
        lbTitle.setMaximumSize(new java.awt.Dimension(20, 20));
        lbTitle.setMinimumSize(new java.awt.Dimension(20, 20));
        lbTitle.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout pnTitleLayout = new javax.swing.GroupLayout(pnTitle);
        pnTitle.setLayout(pnTitleLayout);
        pnTitleLayout.setHorizontalGroup(
            pnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(lbMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbExit)
                .addContainerGap())
        );
        pnTitleLayout.setVerticalGroup(
            pnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbExit, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
            .addComponent(lbMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTitleLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void txfTenTaiKhoanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfTenTaiKhoanKeyPressed

        if (txfTenTaiKhoan.getForeground() != Color.BLACK ){
            if (txfTenTaiKhoan.getText().isEmpty() == false){
                txfTenTaiKhoan.setText("");
            }
        }
        txfTenTaiKhoan.setForeground(Color.BLACK);
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){            
                txfMatKhau.requestFocus();
      }
        
    }//GEN-LAST:event_txfTenTaiKhoanKeyPressed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
           Login();
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void txfMatKhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfMatKhauKeyPressed

        if (txfMatKhau.getForeground() != Color.BLACK ){
            if (txfMatKhau.getText().isEmpty() == false){
                txfMatKhau.setText("");
            }
        } 
        txfMatKhau.setForeground(Color.BLACK);
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
           Login();
      }
    }//GEN-LAST:event_txfMatKhauKeyPressed

    private void btnDangNhapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangNhapMouseEntered
        btnDangNhap.setBackground(new Color(128,216,255));
    }//GEN-LAST:event_btnDangNhapMouseEntered

    private void btnDangNhapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangNhapMouseExited
        btnDangNhap.setBackground(new Color(0,204,255));
    }//GEN-LAST:event_btnDangNhapMouseExited

    private void txfTenTaiKhoanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfTenTaiKhoanKeyReleased
         if (txfTenTaiKhoan.getText().isEmpty() == true){
                txfTenTaiKhoan.setText("Nhập tên tài khoản...");
                txfTenTaiKhoan.setCaretPosition(0); //Dấu 
                txfTenTaiKhoan.setForeground(new java.awt.Color(153,153,153));
            }

    }//GEN-LAST:event_txfTenTaiKhoanKeyReleased

    private void txfTenTaiKhoanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfTenTaiKhoanMousePressed
        if (txfTenTaiKhoan.getText().isEmpty() == true || txfTenTaiKhoan.getText().equals("Nhập tên tài khoản...") ){
           txfTenTaiKhoan.setCaretPosition(0);
       }
    }//GEN-LAST:event_txfTenTaiKhoanMousePressed

    private void txfMatKhauKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfMatKhauKeyReleased

        if (txfMatKhau.getText().isEmpty() == true){
                txfMatKhau.setText("Nhập mật khẩu...");
                txfMatKhau.setCaretPosition(0);
                txfMatKhau.setForeground(new java.awt.Color(153,153,153));
            }
    }//GEN-LAST:event_txfMatKhauKeyReleased

    private void txfMatKhauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfMatKhauMousePressed
       if (txfMatKhau.getText().isEmpty() == true || txfMatKhau.getText().equals("Nhập mật khẩu...") ){
           txfMatKhau.setCaretPosition(0);
       }
        
    }//GEN-LAST:event_txfMatKhauMousePressed

    private void lbMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lbMinimizeMouseClicked

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbExitMouseClicked

    private void pnTitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnTitleMousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_pnTitleMousePressed

    private void pnTitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnTitleMouseDragged
        int toaDoX = evt.getXOnScreen();
        int toaDoY = evt.getYOnScreen();
        
        this.setLocation(toaDoX - mousepX, toaDoY - mousepY);
    }//GEN-LAST:event_pnTitleMouseDragged
    
    public void Login(){
        ResultSet resultLogin = null;
        NhanVien_BUS nvBUS = new NhanVien_BUS();
        String tenTaiKhoan = txfTenTaiKhoan.getText();
        String matKhau = txfMatKhau.getText();

            if (tenTaiKhoan.isEmpty() == true || tenTaiKhoan.equals("Nhập tên tài khoản...")){
                JOptionPane.showMessageDialog(this,"Vui lòng nhập tên tài khoản!");
                txfTenTaiKhoan.requestFocus();
            }
            else if (matKhau.isEmpty() == true || matKhau.equals("Nhập mật khẩu...")){
                JOptionPane.showMessageDialog(this,"Vui lòng nhập mật khẩu!");
                txfMatKhau.requestFocus();
            }
            else{                
                try{
                     resultLogin = nvBUS.LoginQuanTri(tenTaiKhoan, matKhau);
                    
                    if (resultLogin.next()){
                        if (resultLogin.getString("trangThaiNV").equals("Mở")){
                            hoTenOnline = resultLogin.getString("hoTenNV");
                            maNVOnline = resultLogin.getInt("maNV");
                                    
                            if (resultLogin.getInt("maChucVu") == 1){
                                
                                JOptionPane.showMessageDialog(null, "Đăng nhập thành công!"); 
                                Admin_GUI frmAdmin = new Admin_GUI();
                                frmAdmin.setVisible(true);
                                this.setVisible(false);
                                
                            }else if (resultLogin.getInt("maChucVu") == 2){
                                JOptionPane.showMessageDialog(null, "Đăng nhập thành công!"); 
                                Manager_GUI frmManager = new Manager_GUI();
                                frmManager.setVisible(true);
                                this.setVisible(false);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Tài khoản đã bị khóa!"); 
                        }
                        
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Sai thông tin đăng nhập! Vui lòng nhập lại!");
                        txfTenTaiKhoan.requestFocus();
                    }
                
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
    }
    
   
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangNhap_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                new DangNhap_GUI().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbMinimize;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lblDangNhap;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblTenTaiKhoan;
    private javax.swing.JPanel pnDangNhap;
    private javax.swing.JPanel pnTitle;
    private javax.swing.JPasswordField txfMatKhau;
    private javax.swing.JTextField txfTenTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
