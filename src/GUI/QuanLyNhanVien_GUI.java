/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import BUS.NhanVien_BUS;
import DTO.NhanVien_DTO;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class QuanLyNhanVien_GUI extends javax.swing.JPanel {
    
    NhanVien_BUS nhanvienBUS = new NhanVien_BUS();
    /**
     * Creates new form pnQuanLyNguoiDung
     */
    public QuanLyNhanVien_GUI() {
        initComponents();
        
        LoadAllNhanVien();
        nhanvienBUS.getAllChucVuCBB(cbbMaChucVu);
        getGiaTriCV();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblQuanLyNhanVien = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbMaNV = new javax.swing.JLabel();
        lbMaChucVu = new javax.swing.JLabel();
        txfTenTaiKhoan = new javax.swing.JTextField();
        lbTenTaiKhoan = new javax.swing.JLabel();
        lbHoTen = new javax.swing.JLabel();
        txfHoTen = new javax.swing.JTextField();
        txfDiaChi = new javax.swing.JTextField();
        lbDiaChi = new javax.swing.JLabel();
        txfSDT = new javax.swing.JTextField();
        lbSDT = new javax.swing.JLabel();
        lbCMND = new javax.swing.JLabel();
        txfCMND = new javax.swing.JTextField();
        txfGioiTinh = new javax.swing.JTextField();
        lbGioiTinh = new javax.swing.JLabel();
        txfMaNV = new javax.swing.JTextField();
        AnhNhanVien = new javax.swing.JLabel();
        lbAnhNhanVien = new javax.swing.JLabel();
        lbMatKhau = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txfTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        btnTaiLai = new javax.swing.JButton();
        cbbMaChucVu = new javax.swing.JComboBox<>();
        txfMatKhau = new javax.swing.JTextField();
        txfTenChucVu = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));

        lblQuanLyNhanVien.setBackground(new java.awt.Color(102, 102, 255));
        lblQuanLyNhanVien.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblQuanLyNhanVien.setForeground(new java.awt.Color(0, 0, 0));
        lblQuanLyNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-change-user-30.png"))); // NOI18N
        lblQuanLyNhanVien.setText("QUẢN LÝ NHÂN VIÊN");
        lblQuanLyNhanVien.setToolTipText("");

        lbMaNV.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbMaNV.setText("Mã nhân viên:");

        lbMaChucVu.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbMaChucVu.setText("Mã chức vụ:");

        txfTenTaiKhoan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfTenTaiKhoanKeyPressed(evt);
            }
        });

        lbTenTaiKhoan.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbTenTaiKhoan.setText("Tên tài khoản:");

        lbHoTen.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbHoTen.setText("Họ tên:");

        txfHoTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfHoTenKeyPressed(evt);
            }
        });

        txfDiaChi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfDiaChiKeyPressed(evt);
            }
        });

        lbDiaChi.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbDiaChi.setText("Địa chỉ:");

        txfSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfSDTKeyPressed(evt);
            }
        });

        lbSDT.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbSDT.setText("SDT:");

        lbCMND.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbCMND.setText("CMND:");

        txfCMND.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfCMNDKeyPressed(evt);
            }
        });

        txfGioiTinh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfGioiTinhKeyPressed(evt);
            }
        });

        lbGioiTinh.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbGioiTinh.setText("Giới tính:");

        txfMaNV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfMaNVKeyPressed(evt);
            }
        });

        AnhNhanVien.setBackground(new java.awt.Color(204, 255, 204));
        AnhNhanVien.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        AnhNhanVien.setText("Hình ảnh ở đây");

        lbAnhNhanVien.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbAnhNhanVien.setText("Ảnh nhân viên:");

        lbMatKhau.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbMatKhau.setText("Mật khẩu:");

        btnThem.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-add-27.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setPreferredSize(new java.awt.Dimension(104, 27));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-update-left-rotation-27.png"))); // NOI18N
        btnCapNhat.setText("Cập nhật");

        btnXoa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-delete-27.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setPreferredSize(new java.awt.Dimension(104, 27));

        btnTimKiem.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-search-27.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.setPreferredSize(new java.awt.Dimension(104, 27));
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnTaiLai.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-refresh-27.png"))); // NOI18N
        btnTaiLai.setText("Tải lại danh sách");
        btnTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiLaiActionPerformed(evt);
            }
        });

        cbbMaChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMaChucVuActionPerformed(evt);
            }
        });
        cbbMaChucVu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbbMaChucVuKeyPressed(evt);
            }
        });

        txfMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfMatKhauKeyPressed(evt);
            }
        });

        txfTenChucVu.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(587, 587, 587)
                        .addComponent(lbAnhNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbSDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbDiaChi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbCMND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbHoTen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(6, 6, 6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbTenTaiKhoan)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbMaChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txfTenTaiKhoan)
                                    .addComponent(txfMaNV)
                                    .addComponent(txfHoTen)
                                    .addComponent(txfMatKhau)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbbMaChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txfTenChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCapNhat)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(AnhNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))))))
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(txfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTaiLai)
                .addGap(0, 54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAnhNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AnhNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMaChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(cbbMaChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(txfTenChucVu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCapNhat)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Mã chức vụ", "Tên tài khoản", "Họ tên", "Địa chỉ", "SDT", "CMND", "Giới tính", "Ảnh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblNhanVien);
        if (tblNhanVien.getColumnModel().getColumnCount() > 0) {
            tblNhanVien.getColumnModel().getColumn(0).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(1).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(2).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(3).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(4).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(5).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(6).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(7).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(8).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblQuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(285, 285, 285))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblQuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        ThemNV();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiLaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTaiLaiActionPerformed

    private void cbbMaChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMaChucVuActionPerformed
        getGiaTriCV();
    }//GEN-LAST:event_cbbMaChucVuActionPerformed

    private void txfMaNVKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfMaNVKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            cbbMaChucVu.requestFocus();
        }
    }//GEN-LAST:event_txfMaNVKeyPressed

    private void cbbMaChucVuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbbMaChucVuKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            focusInput(txfTenTaiKhoan);
        }
    }//GEN-LAST:event_cbbMaChucVuKeyPressed

    private void txfTenTaiKhoanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfTenTaiKhoanKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            focusInput(txfMatKhau);
        }
    }//GEN-LAST:event_txfTenTaiKhoanKeyPressed

    private void txfMatKhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfMatKhauKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            focusInput(txfHoTen);
        }
    }//GEN-LAST:event_txfMatKhauKeyPressed

    private void txfHoTenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfHoTenKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            focusInput(txfDiaChi);
        }
    }//GEN-LAST:event_txfHoTenKeyPressed

    private void txfDiaChiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfDiaChiKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            focusInput(txfSDT);
        }
    }//GEN-LAST:event_txfDiaChiKeyPressed

    private void txfCMNDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCMNDKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            focusInput(txfGioiTinh);
        }
    }//GEN-LAST:event_txfCMNDKeyPressed

    private void txfSDTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfSDTKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            focusInput(txfCMND);
        }
    }//GEN-LAST:event_txfSDTKeyPressed

    private void txfGioiTinhKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfGioiTinhKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            JOptionPane.showMessageDialog(null, "Vui lòng chọn yêu cầu!");
        }
    }//GEN-LAST:event_txfGioiTinhKeyPressed

    private void LoadAllNhanVien(){
        ArrayList<NhanVien_DTO> nhanvienArr = new ArrayList<NhanVien_DTO>();
        DefaultTableModel modelNV = (DefaultTableModel)tblNhanVien.getModel();
        
        NhanVien_BUS nhanvienBUS = new NhanVien_BUS();
        
        try {
            nhanvienArr = nhanvienBUS.getAllNhanVien();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuanLyNhanVien_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        NhanVien_DTO nhanvienDTO = new NhanVien_DTO();
        
        for (int i=0; i < nhanvienArr.size(); i++ ){
            nhanvienDTO = nhanvienArr.get(i);
            
            int maNV = nhanvienDTO.getMaNV();
            int maChucVu = nhanvienDTO.getMaChucVu();
            String tenTaiKhoanNV = nhanvienDTO.getTenTaiKhoanNV();
            String matKhauNV = nhanvienDTO.getMatKhauNV();
            String hoTenNV = nhanvienDTO.getHoTenNV();
            String diaChiNV = nhanvienDTO.getDiaChiNV();
            String sdtNV = nhanvienDTO.getSdtNV();
            String cmndNV = nhanvienDTO.getCmndNV();
            String gioiTinhNV = nhanvienDTO.getGioiTinhNV();
            String anhNV = nhanvienDTO.getAnhNV();
            
            Object[] row = { maNV, maChucVu, tenTaiKhoanNV, hoTenNV, diaChiNV, sdtNV, cmndNV, gioiTinhNV, anhNV};
            
            modelNV.addRow(row);
        }  
    }
    
    private void ThemNV(){
        ArrayList<NhanVien_DTO> nhanvienArr = new ArrayList<NhanVien_DTO>();
        NhanVien_DTO nhanvienDTO = new NhanVien_DTO();
        int getMaNV;
        
        if (txfMaNV.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập mã nhân viên!");
            txfMaNV.requestFocus();
        }
        else if (txfTenTaiKhoan.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập tên tài khoản!");
            txfTenTaiKhoan.requestFocus();
        }
        else if (txfMatKhau.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập mật khẩu!");
            txfMatKhau.requestFocus();
        }
        else if (txfHoTen.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập họ tên!");
            txfHoTen.requestFocus();
        }
        else if (txfDiaChi.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập địa chỉ!");
            txfDiaChi.requestFocus();
        }
        else if (txfSDT.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập SDT !");
            txfSDT.requestFocus();
        }
        else if (txfCMND.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập CMND !");
            txfCMND.requestFocus();
        }
        else if (txfGioiTinh.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập giới tính !");
            txfGioiTinh.requestFocus();
        }else{
            
            try{
                getMaNV = Integer.parseInt(txfMaNV.getText());
            }catch(NumberFormatException e){ //Kiểm tra có phải số nguyên hay không
                JOptionPane.showMessageDialog(null, "Mã nhân viên phải là số nguyên!");
                txfMaNV.requestFocus();
            }
                    getMaNV = Integer.parseInt(txfMaNV.getText());
                    nhanvienDTO.setMaNV(getMaNV);
                    int cbbMaCV = Integer.parseInt((String) cbbMaChucVu.getSelectedItem());
                    nhanvienDTO.setMaChucVu(cbbMaCV);
                    nhanvienDTO.setTenTaiKhoanNV(txfTenTaiKhoan.getText());
                    nhanvienDTO.setMatKhauNV(txfMatKhau.getText());
                    nhanvienDTO.setHoTenNV(txfHoTen.getText());
                    nhanvienDTO.setDiaChiNV(txfDiaChi.getText());
                    nhanvienDTO.setSdtNV(txfSDT.getText());
                    nhanvienDTO.setCmndNV(txfCMND.getText());
                    nhanvienDTO.setGioiTinhNV(txfGioiTinh.getText());
                    //nhanvienDTO.setAnhNV(lblAnh.getText());

                    NhanVien_BUS nhanvienBUS = new NhanVien_BUS();

                    try {
                        int result = nhanvienBUS.ThemNhanVien(nhanvienDTO);

                        if (result != 0) {
                            JOptionPane.showMessageDialog(null,"Thêm nhân viên thành công!");

                        }else {
                            System.out.println("Thêm nhân viên thất bại!");
                            JOptionPane.showMessageDialog(null,"Mã nhân viên đã tồn tại! VUi lòng nhập lại!"); //Chưa ràng buộc tên tài khoản
                            txfMaNV.requestFocus();
                        }


                        LoadAllNhanVien();

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    
        }
 
    }
    
    private void getGiaTriCV(){
       NhanVien_BUS nhanvienBUS = new NhanVien_BUS();
       int cbbMaCV = Integer.parseInt((String) cbbMaChucVu.getSelectedItem());
       
       switch (cbbMaCV){
           case 1: {               
                String tenCV = nhanvienBUS.getTenChucVu(cbbMaCV);
                txfTenChucVu.setText(tenCV);
                break;
           }
           case 2: {
               String tenCV = nhanvienBUS.getTenChucVu(cbbMaCV);
               txfTenChucVu.setText(tenCV);
               break;
           }
       }
   
   }
    
    private void focusInput(JTextField nameTextField){
        nameTextField.requestFocus();
    }
   
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnhNhanVien;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnTaiLai;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbMaChucVu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbAnhNhanVien;
    private javax.swing.JLabel lbCMND;
    private javax.swing.JLabel lbDiaChi;
    private javax.swing.JLabel lbGioiTinh;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbMaChucVu;
    private javax.swing.JLabel lbMaNV;
    private javax.swing.JLabel lbMatKhau;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JLabel lbTenTaiKhoan;
    private javax.swing.JLabel lblQuanLyNhanVien;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txfCMND;
    private javax.swing.JTextField txfDiaChi;
    private javax.swing.JTextField txfGioiTinh;
    private javax.swing.JTextField txfHoTen;
    private javax.swing.JTextField txfMaNV;
    private javax.swing.JTextField txfMatKhau;
    private javax.swing.JTextField txfSDT;
    private javax.swing.JTextField txfTenChucVu;
    private javax.swing.JTextField txfTenTaiKhoan;
    private javax.swing.JTextField txfTimKiem;
    // End of variables declaration//GEN-END:variables
}
