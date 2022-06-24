/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package btqlvb.view;

import btqlvb.model.VB;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Manh Ha
 */
public class QLVBJPanel extends javax.swing.JPanel {
    public List<VB> listVB;
    public DefaultTableModel tableModel;
    private int index;
    /**
     * Creates new form QLVBJPanel
     */
    public QLVBJPanel() {
        initComponents();
        listVB = new ArrayList<>();
        tableModel = (DefaultTableModel) tblVB.getModel();
        index =1;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlbSHVB = new javax.swing.JLabel();
        jlbTenVB = new javax.swing.JLabel();
        jlbLoaiVB = new javax.swing.JLabel();
        txtSHVB = new javax.swing.JTextField();
        txtTenVB = new javax.swing.JTextField();
        txtLoaiVB = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbbKieuVB = new javax.swing.JComboBox<>();
        txtNgayGuiNhan = new javax.swing.JTextField();
        txtCoQuan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNgayKy = new javax.swing.JTextField();
        txtNguoiKy = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtNoiDung = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVB = new javax.swing.JTable();

        jButton1.setText("jButton1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jlbSHVB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbSHVB.setText("Số Hiệu Văn Bản");
        jlbSHVB.setVerifyInputWhenFocusTarget(false);

        jlbTenVB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbTenVB.setText("Tên Văn Bản");
        jlbTenVB.setVerifyInputWhenFocusTarget(false);

        jlbLoaiVB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbLoaiVB.setText("Loại Văn Bản");
        jlbLoaiVB.setVerifyInputWhenFocusTarget(false);

        txtSHVB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSHVB.setText("128QDCP");
        txtSHVB.setAutoscrolls(false);
        txtSHVB.setVerifyInputWhenFocusTarget(false);
        txtSHVB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSHVBActionPerformed(evt);
            }
        });

        txtTenVB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTenVB.setText("Hướng dẫn ....");
        txtTenVB.setAutoscrolls(false);
        txtTenVB.setVerifyInputWhenFocusTarget(false);

        txtLoaiVB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoaiVB.setText("Chỉ thị");
        txtLoaiVB.setAutoscrolls(false);
        txtLoaiVB.setVerifyInputWhenFocusTarget(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ngày Gửi/Nhận");
        jLabel4.setVerifyInputWhenFocusTarget(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Cơ Quan Gửi/ Nhận");
        jLabel5.setVerifyInputWhenFocusTarget(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Kiểu văn bản");
        jLabel6.setVerifyInputWhenFocusTarget(false);

        cbbKieuVB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbbKieuVB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Văn bản đi", "Văn bản đến", " " }));
        cbbKieuVB.setVerifyInputWhenFocusTarget(false);
        cbbKieuVB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbKieuVBActionPerformed(evt);
            }
        });

        txtNgayGuiNhan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNgayGuiNhan.setText("24/06/2022");
        txtNgayGuiNhan.setAutoscrolls(false);
        txtNgayGuiNhan.setVerifyInputWhenFocusTarget(false);

        txtCoQuan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCoQuan.setText("BAN CO YEU CP");
        txtCoQuan.setAutoscrolls(false);
        txtCoQuan.setVerifyInputWhenFocusTarget(false);
        txtCoQuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCoQuanActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Ngày ký");
        jLabel7.setVerifyInputWhenFocusTarget(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Người ký");
        jLabel8.setVerifyInputWhenFocusTarget(false);

        txtNgayKy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNgayKy.setText("23/06/2022");
        txtNgayKy.setAutoscrolls(false);
        txtNgayKy.setVerifyInputWhenFocusTarget(false);

        txtNguoiKy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNguoiKy.setText("abc");
        txtNguoiKy.setAutoscrolls(false);
        txtNguoiKy.setVerifyInputWhenFocusTarget(false);

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setText("Thêm mới");
        btnThem.setVerifyInputWhenFocusTarget(false);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbSHVB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbTenVB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbLoaiVB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLoaiVB, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(txtSHVB, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(txtTenVB, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbKieuVB, 0, 128, Short.MAX_VALUE)
                    .addComponent(txtNgayGuiNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(txtCoQuan, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNgayKy, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(txtNguoiKy, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlbSHVB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSHVB, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNgayGuiNhan)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNgayKy))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbTenVB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNguoiKy, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenVB)
                            .addComponent(txtCoQuan))
                        .addGap(18, 18, 18)))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLoaiVB)
                    .addComponent(jlbLoaiVB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbbKieuVB)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        txtNoiDung.setColumns(20);
        txtNoiDung.setRows(5);
        jScrollPane3.setViewportView(txtNoiDung);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblVB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "SỐ HIỆU VĂN BẢN", "TÊN VĂN BẢN", "LOẠI VĂN BẢN", "CƠ QUAN GỬI /NHÂN", "NGÀY GỬI/NHẬN", "NGÀY KÝ", "NGƯỜI KÝ", "KIỂU VĂN BẢN", "NỘI DUNG "
            }
        ));
        jScrollPane2.setViewportView(tblVB);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if(!txtSHVB.getText().isEmpty() && !txtTenVB.getText().isEmpty()&& !txtLoaiVB.getText().isEmpty()
            && !txtNgayGuiNhan.getText().isEmpty() && !txtCoQuan.getText().isEmpty()
            && !txtNgayKy.getText().isEmpty() && !txtNguoiKy.getText().isEmpty()){
            var soVB = txtSHVB.getText();
            var tenVB = txtTenVB.getText();
            var loaiVB = txtLoaiVB.getText();
            var coquan = txtCoQuan.getText();
            var ngayGN = txtNgayGuiNhan.getText();
            var ngayKy = txtNgayKy.getText();
            var nguoiKy = txtNguoiKy.getText();
            var kieuVB = cbbKieuVB.getSelectedItem().toString();
            var noidung = txtNoiDung.getText();
            VB vb = new VB(soVB , tenVB, loaiVB, coquan, ngayGN, ngayKy, nguoiKy, kieuVB, noidung);
            listVB.add(vb);
            JOptionPane.showMessageDialog(txtCoQuan, "Da them thanh cong");
            showtbl(vb);

        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtCoQuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCoQuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCoQuanActionPerformed

    private void cbbKieuVBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbKieuVBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbKieuVBActionPerformed

    private void txtSHVBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSHVBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSHVBActionPerformed
    
       private void showtbl(VB vb) {
        var row = new Object[]{
            index++, vb.getSoVB(),vb.getTenVB(),vb.getLoaiVB(),vb.getCoquan(),vb.getNgayGuiNhan(),
            vb.getNgayKy(),vb.getNguoiKy(),vb.getKieuvb(),vb.getNoiDung()
        };
        tableModel.addRow(row);
        tableModel.fireTableDataChanged();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cbbKieuVB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlbLoaiVB;
    private javax.swing.JLabel jlbSHVB;
    private javax.swing.JLabel jlbTenVB;
    private javax.swing.JTable tblVB;
    private javax.swing.JTextField txtCoQuan;
    private javax.swing.JTextField txtLoaiVB;
    private javax.swing.JTextField txtNgayGuiNhan;
    private javax.swing.JTextField txtNgayKy;
    private javax.swing.JTextField txtNguoiKy;
    private javax.swing.JTextArea txtNoiDung;
    private javax.swing.JTextField txtSHVB;
    private javax.swing.JTextField txtTenVB;
    // End of variables declaration//GEN-END:variables
}
