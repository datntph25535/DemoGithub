/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Icon.ImageI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author PC
 */
public class MenuChinhForm extends javax.swing.JFrame {

    /**
     * Creates new form MenuChinh
     */
    public MenuChinhForm() {
        initComponents();
        this.setIconImage(ImageI.iconx());
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                SimpleDateFormat formater = new SimpleDateFormat("hh:mm a");
                String text = formater.format(now);
                lb_dongHo.setText(text);
            }
        }).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem7 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        lb_dongHo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem8 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem9 = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem6 = new javax.swing.JCheckBoxMenuItem();
        mni_chucVu = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem11 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem12 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem13 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem14 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem15 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem16 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem17 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem18 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem19 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem20 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem21 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();

        jMenu3.setText("jMenu3");

        jCheckBoxMenuItem7.setSelected(true);
        jCheckBoxMenuItem7.setText("jCheckBoxMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giao diện chính");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/FPoly.png"))); // NOI18N

        lb_dongHo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_dongHo.setText("jLabel2");

        jMenu2.setText("Hệ thống");

        jCheckBoxMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem8.setSelected(true);
        jCheckBoxMenuItem8.setText("Đăng nhập");
        jCheckBoxMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/login.png"))); // NOI18N
        jMenu2.add(jCheckBoxMenuItem8);

        jCheckBoxMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem9.setSelected(true);
        jCheckBoxMenuItem9.setText("Đổi mật khẩu");
        jCheckBoxMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/password.png"))); // NOI18N
        jMenu2.add(jCheckBoxMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Quản lý");

        jCheckBoxMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem6.setSelected(true);
        jCheckBoxMenuItem6.setText("Chức vụ");
        jCheckBoxMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/black-circle.png"))); // NOI18N
        jCheckBoxMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem6);

        mni_chucVu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        mni_chucVu.setSelected(true);
        mni_chucVu.setText("Cửa hàng");
        mni_chucVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/black-circle.png"))); // NOI18N
        mni_chucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_chucVuActionPerformed(evt);
            }
        });
        jMenu4.add(mni_chucVu);

        jCheckBoxMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem11.setSelected(true);
        jCheckBoxMenuItem11.setText("Nhân viên");
        jCheckBoxMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/black-circle.png"))); // NOI18N
        jCheckBoxMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem11);

        jCheckBoxMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem12.setSelected(true);
        jCheckBoxMenuItem12.setText("Khách hàng");
        jCheckBoxMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/black-circle.png"))); // NOI18N
        jCheckBoxMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem12);

        jCheckBoxMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem13.setSelected(true);
        jCheckBoxMenuItem13.setText("Hóa đơn");
        jCheckBoxMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/black-circle.png"))); // NOI18N
        jCheckBoxMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem13);

        jCheckBoxMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem14.setSelected(true);
        jCheckBoxMenuItem14.setText("Giỏ hàng");
        jCheckBoxMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/black-circle.png"))); // NOI18N
        jCheckBoxMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem14ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem14);

        jCheckBoxMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem15.setSelected(true);
        jCheckBoxMenuItem15.setText("Sản phẩm");
        jCheckBoxMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/black-circle.png"))); // NOI18N
        jCheckBoxMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem15);

        jCheckBoxMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem16.setSelected(true);
        jCheckBoxMenuItem16.setText("NSX");
        jCheckBoxMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/black-circle.png"))); // NOI18N
        jCheckBoxMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem16ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem16);

        jCheckBoxMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem17.setSelected(true);
        jCheckBoxMenuItem17.setText("Màu sắc");
        jCheckBoxMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/black-circle.png"))); // NOI18N
        jCheckBoxMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem17ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem17);

        jCheckBoxMenuItem18.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem18.setSelected(true);
        jCheckBoxMenuItem18.setText("Đồng SP");
        jCheckBoxMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/black-circle.png"))); // NOI18N
        jCheckBoxMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem18ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem18);

        jCheckBoxMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem19.setSelected(true);
        jCheckBoxMenuItem19.setText("Chi tiết SP");
        jCheckBoxMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/black-circle.png"))); // NOI18N
        jCheckBoxMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem19ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem19);

        jCheckBoxMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem20.setSelected(true);
        jCheckBoxMenuItem20.setText("Hóa đơn chi tiết");
        jCheckBoxMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/black-circle.png"))); // NOI18N
        jCheckBoxMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem20ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem20);

        jCheckBoxMenuItem21.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem21.setSelected(true);
        jCheckBoxMenuItem21.setText("Giỏ hàng chi tiết");
        jCheckBoxMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/black-circle.png"))); // NOI18N
        jCheckBoxMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem21ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem21);

        jMenuBar1.add(jMenu4);

        jMenu1.setText("Bán hàng");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Bán hàng");
        jCheckBoxMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/store.png"))); // NOI18N
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_dongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(lb_dongHo)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem6ActionPerformed
        ChucVuForm cv = new ChucVuForm();
        cv.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem6ActionPerformed

    private void mni_chucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_chucVuActionPerformed
        CuaHangForm ch = new CuaHangForm();
        ch.setVisible(true);
    }//GEN-LAST:event_mni_chucVuActionPerformed

    private void jCheckBoxMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem11ActionPerformed
        NhanVienForm nv = new NhanVienForm();
        nv.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem11ActionPerformed

    private void jCheckBoxMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem12ActionPerformed
        KhachHangForm kh = new KhachHangForm();
        kh.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem12ActionPerformed

    private void jCheckBoxMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem13ActionPerformed
        HoaDonForm hd = new HoaDonForm();
        hd.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem13ActionPerformed

    private void jCheckBoxMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem14ActionPerformed
        GioHangForm gh = new GioHangForm();
        gh.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem14ActionPerformed

    private void jCheckBoxMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem15ActionPerformed
        SanPhamForm sp = new SanPhamForm();
        sp.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem15ActionPerformed

    private void jCheckBoxMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem16ActionPerformed
        NSXForm nsx = new NSXForm();
        nsx.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem16ActionPerformed

    private void jCheckBoxMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem17ActionPerformed
        MauSacForm ms = new MauSacForm();
        ms.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem17ActionPerformed

    private void jCheckBoxMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem18ActionPerformed
        DongSPForm dsp = new DongSPForm();
        dsp.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem18ActionPerformed

    private void jCheckBoxMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem19ActionPerformed
        ChiTietSPForm ctsp = new ChiTietSPForm();
        ctsp.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem19ActionPerformed

    private void jCheckBoxMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem20ActionPerformed
        HoaDonChiTietForm hd = new HoaDonChiTietForm();
        hd.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem20ActionPerformed

    private void jCheckBoxMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem21ActionPerformed
        GioHangChiTietForm gh = new GioHangChiTietForm();
        gh.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem21ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        BanHangForm bh = new BanHangForm();
        bh.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuChinhForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuChinhForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuChinhForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuChinhForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuChinhForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem11;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem12;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem13;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem14;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem15;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem16;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem17;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem18;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem19;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem20;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem21;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem7;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem8;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lb_dongHo;
    private javax.swing.JCheckBoxMenuItem mni_chucVu;
    // End of variables declaration//GEN-END:variables
}
