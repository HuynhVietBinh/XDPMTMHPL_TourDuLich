package GUI;

import BLL.DoanBLL;
import BLL.KhachHangBLL;
import DAL.KhachHangDAL;
import DAL.MySQLConnect;
import DTO.DoanDTO;
import DTO.KhachHangDTO;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Win 10
 */
public class Panel_KhachHang extends javax.swing.JPanel {
    
    DefaultTableModel dtmkh, dtmd;
    private ArrayList<KhachHangDTO> khList;
    private ArrayList<DoanDTO> dList;

    public Panel_KhachHang() {
        
        initComponents();
        this.setBounds(0, 0, 786, 632);
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        dtmkh = (DefaultTableModel) tblKH.getModel();
        dtmd = (DefaultTableModel) tblD.getModel();
        showKhachHang();
        ShowDoan();
        
    }

    public void showKhachHang() {
        khList = new KhachHangBLL().loadDataKhachHang();
        
        dtmkh.setRowCount(0);
        khList.forEach((KhachHangDTO) -> {
            dtmkh.addRow(new Object[]{KhachHangDTO.getMakh(), KhachHangDTO.getMadoan(),
                KhachHangDTO.getTenkh(), KhachHangDTO.getSdt(), KhachHangDTO.getNgaysinh(), KhachHangDTO.getEmail()});
        });
    }
    
    public void ShowDoan() {
        dList = new DoanBLL().loadDataDoan();
        
        dtmd.setRowCount(0);
        dList.forEach((DoanDTO) -> {
            dtmd.addRow(new Object[]{DoanDTO.getMadoan(), DoanDTO.getMatour(),
                DoanDTO.getTendoan(), DoanDTO.getNgaydi(), DoanDTO.getNgayve(),
                DoanDTO.getChitietchuongtrinh()});
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKH = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblMaKH = new javax.swing.JLabel();
        lblTenKH = new javax.swing.JLabel();
        lblSdt = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        btnLamMoi = new javax.swing.JButton();
        txtTenKH = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        txtTimkiem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaDoan = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblD = new javax.swing.JTable();
        txtMaKH = new javax.swing.JTextField();
        jdcNgaySinh = new com.toedter.calendar.JDateChooser();

        setPreferredSize(new java.awt.Dimension(786, 629));

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        tblKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã khách hàng", "Mã đoàn", "Tên khách hàng", "Số điện thoại", "Ngày sinh", "Email"
            }
        ));
        tblKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKH);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("KHÁCH HÀNG");

        lblMaKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMaKH.setText("Mã khách hàng:");

        lblTenKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTenKH.setText("Tên khách hàng:");

        lblSdt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSdt.setText("Số điện thoại:");

        lblDiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDiaChi.setText("Ngày sinh:");

        btnLamMoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        txtTenKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTenKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTenKHMouseClicked(evt);
            }
        });

        txtSdt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSdt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSdtMouseClicked(evt);
            }
        });

        txtTimkiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Email:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mã đoàn:");

        txtMaDoan.setEditable(false);
        txtMaDoan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tìm kiếm:");

        tblD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã đoàn", "Mã tour", "Tên đoàn", "Ngày đi", "Ngày về", "Chi tiết chương trình"
            }
        ));
        tblD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblD);

        txtMaKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 545, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDiaChi)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTenKH, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblSdt))
                            .addComponent(jLabel3)
                            .addComponent(lblMaKH))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(txtMaDoan, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(txtEmail)
                            .addComponent(txtSdt)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdcNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaKH)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTenKH))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSdt))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDiaChi)
                            .addComponent(jdcNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaDoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTenKHMouseClicked
        // TODO add your handling code here:
//        if(evt.getSource() == txtTenKH){
//            txtTenKH.setText("");
//        }
    }//GEN-LAST:event_txtTenKHMouseClicked

    private void txtSdtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSdtMouseClicked
        // TODO add your handling code here:
//        if(evt.getSource() == txtSdt){
//            txtSdt.setText("");
//        }
    }//GEN-LAST:event_txtSdtMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        boolean isOK = true;
        KhachHangDTO kh = new KhachHangDTO();
        kh.setMakh(txtMaKH.getText());
        kh.setMadoan(txtMaDoan.getText());
        kh.setTenkh(txtTenKH.getText());
        kh.setSdt(txtSdt.getText());
        kh.setNgaysinh(new SimpleDateFormat("yyyy-MM-dd").format(jdcNgaySinh.getDate()));
        kh.setEmail(txtEmail.getText());
        
        if (txtMaKH.getText().length() > 0) {
            Random rand = new Random();
            int i = rand.nextInt(1000) + 1;
            for (KhachHangDTO k : khList) {
                if (k.getMakh().matches(txtMaKH.getText())) {
                    JOptionPane.showMessageDialog(this, "Mã khách hàng không được trùng");
                    isOK = false;
                    txtMaKH.setText(txtMaKH.getText() + Integer.toString(i));
                }
            }
        }
        
        if (evt.getSource() == btnThem) {
            KhachHangBLL.addKhachHang(kh);
            showKhachHang();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String makh = txtMaKH.getText();
        int option = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa?");
        if (option == 0) {
            KhachHangBLL.removeKhachHang(makh);
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            showKhachHang();            
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKHMouseClicked
        // TODO add your handling code here:
        int index = tblKH.getSelectedRow();
        txtMaKH.setText((String) (dtmkh.getValueAt(index, 0)));
        txtMaDoan.setText((String) (dtmkh.getValueAt(index, 1)));        
        txtTenKH.setText((String) (dtmkh.getValueAt(index, 2)));
        txtSdt.setText((String) (dtmkh.getValueAt(index, 3)));
        try {
            jdcNgaySinh.setDate(new SimpleDateFormat("yyyy-MM-dd").parse((String) dtmkh.getValueAt(index, 4)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        txtEmail.setText((String) (dtmkh.getValueAt(index, 5)));
    }//GEN-LAST:event_tblKHMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        KhachHangDTO kh = new KhachHangDTO();
        kh.setMakh(txtMaKH.getText());
        kh.setMadoan(txtMaDoan.getText());
        kh.setTenkh(txtTenKH.getText());
        kh.setSdt(txtSdt.getText());
        kh.setNgaysinh(new SimpleDateFormat("yyyy-MM-dd").format(jdcNgaySinh.getDate()));
        kh.setEmail(txtEmail.getText());
        
        KhachHangBLL.editKhachHang(kh);
        JOptionPane.showMessageDialog(this, "Sửa thành công");
        showKhachHang();
        

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == btnLamMoi) {
            txtMaKH.setText("");
            txtMaDoan.setText("");
            txtTenKH.setText("");
            txtSdt.setText("");
            jdcNgaySinh.setCalendar(null);
            txtEmail.setText("");
            tblD.setRowSelectionAllowed(false);
            tblKH.setRowSelectionAllowed(false);
        }
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void tblDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDMouseClicked
        int indexTour = tblD.getSelectedRow();
        txtMaDoan.setText(dtmd.getValueAt(indexTour, 0).toString());
    }//GEN-LAST:event_tblDMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdcNgaySinh;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblMaKH;
    private javax.swing.JLabel lblSdt;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JTable tblD;
    private javax.swing.JTable tblKH;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaDoan;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables
}
