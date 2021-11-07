/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Class.Log;
import database.data;
import static gui.invoice.jTable1;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

/**
 *
 * @author Theekshana
 */
public class add_product extends javax.swing.JPanel {

    static add_product r;

    public add_product() {
        initComponents();
//        brand();
        loadtable();
//        autoid();
        design();
//        setFrame();
//        setsunglass();
//         new add_product_detail(jRadioButton1, jRadioButton2, jTextField1);
    }

    public void design() {

        Font font = new Font("Maiandra GD", Font.BOLD, 18);
        JTableHeader header = jTable1.getTableHeader();
        header.setFont(font);
        header.setOpaque(false);
        header.setBackground(new Color(9, 0, 82));
        header.setForeground(new Color(255, 255, 255));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1346, 673));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1346, 673));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        jTable1.setFont(new java.awt.Font("Maiandra GD", 0, 22)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stock Id", "Model", "Type", "Company", "Unit price", "Qty", "Stock Price"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setRowHeight(27);
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton6.setBackground(new java.awt.Color(44, 102, 176));
        jButton6.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit_graph_report_30px.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);
        jButton6.setOpaque(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(44, 102, 176));
        jButton3.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("MRN");
        jButton3.setContentAreaFilled(false);
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(44, 102, 176));
        jButton4.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("MIN");
        jButton4.setContentAreaFilled(false);
        jButton4.setOpaque(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "price low to high", "price high to low", "qty low to high", "qty high to low" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jRadioButton1.setText("Type");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jRadioButton2.setText("Company");

        jButton7.setBackground(new java.awt.Color(44, 102, 176));
        jButton7.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Refersh");
        jButton7.setContentAreaFilled(false);
        jButton7.setOpaque(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(60, 60, 60)
                                .addComponent(jRadioButton2))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        product_detail_report_61 prd = new product_detail_report_61();
        prd.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        if (evt.getButton() == 3) {
            JPopupMenu jp = new JPopupMenu();
            JMenuItem i1 = new JMenuItem();
            i1.setText("Copy");

            JMenuItem i2 = new JMenuItem();
            i2.setText("Cut");

            JMenuItem i3 = new JMenuItem();
            i3.setText("Paste");

            JMenuItem i4 = new JMenuItem();
            i4.setText("Refresh");

            ActionListener a1 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            };

            ActionListener a2;
            a2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int VK_X = KeyEvent.VK_X;
                }

            };
            i4.addActionListener(a1);
            i2.addActionListener(a2);
            jp.add(i1);
            jp.add(i2);
            jp.add(i3);
            jp.add(i4);

            jp.show(this, evt.getX(), evt.getY());

        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();

        String stockId = jTable1.getValueAt(row, 0).toString();
        String model = jTable1.getValueAt(row, 1).toString();
        String barcode = jTable1.getValueAt(row, 2).toString();
        String company = jTable1.getValueAt(row, 3).toString();
        String price = jTable1.getValueAt(row, 4).toString();
        String qty = jTable1.getValueAt(row, 5).toString();

        updateProduct up = new updateProduct(stockId, model, barcode, company, price, qty);
        up.setVisible(true);

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MRN mrn = new MRN();
        mrn.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MIN mrn = new MIN();
        mrn.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
//        String text = jTextField1.getText();
//        TableModel tm = jTable1.getModel();
//        DefaultTableModel tdm = (DefaultTableModel) tm;
//        tdm.setRowCount(0);
//
//        if (model.isSelected()) {
//            ResultSet rs = data.search("SELECT * FROM `stock` WHERE `model` = '" + text + "'");
//            try {
//                if (rs.next()) {
//                  
//             
//                        while (rs.next()) {
//                            Vector<String> vr = new Vector<>();
//                            vr.add(rs.getString("stock_id"));
//                            vr.add(rs.getString("model"));
//                            vr.add(rs.getString("Type"));
//                            vr.add(rs.getString("Company"));
//                            vr.add(rs.getString("price"));
//                            vr.add(rs.getString("qty"));
//                            tdm.addRow(vr);
//                        }
//
//                    
//                }
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(this, "Enter The Data", "Inform", JOptionPane.INFORMATION_MESSAGE);
//                Log.warning(e);
//            }
//
//        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String text = jTextField1.getText();
        TableModel tm = jTable1.getModel();
        DefaultTableModel tdm = (DefaultTableModel) tm;
        tdm.setRowCount(0);

        if (jRadioButton1.isSelected()) {
            try {
                ResultSet rs = data.search("SELECT * FROM `stock` WHERE `Type` LIKE '%" + text + "%'");

                while (rs.next()) {
                    Vector<String> vr = new Vector<>();
                    vr.add(rs.getString("stock_id"));
                    vr.add(rs.getString("model"));
                    vr.add(rs.getString("Type"));
                    vr.add(rs.getString("Company"));
                    vr.add(rs.getString("Unit_Price"));
                    vr.add(rs.getString("qty"));
                    vr.add(rs.getString("stock_price"));
                    tdm.addRow(vr);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Enter The Data", "Inform", JOptionPane.INFORMATION_MESSAGE);
                Log.warning(e);
            }
        } else if (jRadioButton2.isSelected()) {
            try {
                ResultSet rs1 = data.search("SELECT * FROM `stock` WHERE `Company` LIKE '%" + text + "%'");

                while (rs1.next()) {
                    Vector<String> vr = new Vector<>();
                    vr.add(rs1.getString("stock_id"));
                    vr.add(rs1.getString("model"));
                    vr.add(rs1.getString("Type"));
                    vr.add(rs1.getString("Company"));
                    vr.add(rs1.getString("Unit_Price"));
                    vr.add(rs1.getString("qty"));
                    vr.add(rs1.getString("stock_price"));
                    tdm.addRow(vr);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Enter The Data", "Inform", JOptionPane.INFORMATION_MESSAGE);
                Log.warning(e);
            }

        } else {
            try {
                ResultSet rs2 = data.search("SELECT * FROM `stock` WHERE `model` LIKE '%" + text + "%'");

                while (rs2.next()) {
                    Vector<String> vr = new Vector<>();
                    vr.add(rs2.getString("stock_id"));
                    vr.add(rs2.getString("model"));
                    vr.add(rs2.getString("Type"));
                    vr.add(rs2.getString("Company"));
                    vr.add(rs2.getString("Unit_Price"));
                    vr.add(rs2.getString("qty"));
                    vr.add(rs2.getString("stock_price"));
                    tdm.addRow(vr);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Enter The Data", "Inform", JOptionPane.INFORMATION_MESSAGE);
                Log.warning(e);
            }

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        loadtable();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String txt = jComboBox1.getSelectedItem().toString();
        String col = "stock_price";
        String typ = "";

        if (txt.equals("price low to high")) {
            typ = "ASC";
        } else if (txt.equals("price high to low")) {
            typ = "DESC";
        } else if (txt.equals("qty low to high")) {
            col = "qty";
            typ = "ASC";
        } else if (txt.equals("qty high to low")) {
            col = "qty";
            typ = "DESC";
        }

        try {
            ResultSet rs2 = data.search("SELECT * FROM `stock` ORDER BY `" + col + "` " + typ + " ");
            TableModel tm = jTable1.getModel();
            DefaultTableModel tdm = (DefaultTableModel) tm;
            tdm.setRowCount(0);
            while (rs2.next()) {
                Vector<String> vr = new Vector<>();
                vr.add(rs2.getString("stock_id"));
                vr.add(rs2.getString("model"));
                vr.add(rs2.getString("Type"));
                vr.add(rs2.getString("Company"));
                vr.add(rs2.getString("Unit_Price"));
                vr.add(rs2.getString("qty"));
                vr.add(rs2.getString("stock_price"));
                tdm.addRow(vr);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    public static add_product pro() {
        if (r == null) {
            r = new add_product();
        }
        return r;
    }

//    public void setFrame() {
//
//        ResultSet rs = data.search("SELECT `model` FROM `frame` ");
//        Vector<String> vr = new Vector<>();
//        try {
//
//            while (rs.next()) {
//                vr.add(rs.getString("model"));
//            }
//            DefaultComboBoxModel cmd = new DefaultComboBoxModel(vr);
//            jComboBox1.setModel(cmd);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//    }
//    public void setsunglass() {
//
//        ResultSet rs = data.search("SELECT `model` FROM `sunglass` ");
//        Vector<String> vr = new Vector<>();
//        try {
//
//            while (rs.next()) {
//                vr.add(rs.getString("model"));
//            }
//            DefaultComboBoxModel cmd = new DefaultComboBoxModel(vr);
//            jComboBox1.setModel(cmd);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//    }
//    public static void brand() {
//
//        try {
//            ResultSet rs = data.search("SELECT `brand` FROM brand");
//            Vector<String> v = new Vector<>();
//
//            while (rs.next()) {
//                v.add(rs.getString("brand"));
//            }
//
//            DefaultComboBoxModel cmd = new DefaultComboBoxModel(v);
//            jComboBox2.setModel(cmd);
//
//        } catch (Exception e) {
//        }
//
//    }
    public void loadtable() {

        ResultSet rs = data.search("SELECT * FROM stock");
        TableModel tm = jTable1.getModel();
        DefaultTableModel tdm = (DefaultTableModel) tm;
        tdm.setRowCount(0);

        try {
            while (rs.next()) {
                Vector<String> vr = new Vector<>();
                vr.add(rs.getString("stock_id"));
                vr.add(rs.getString("model"));
                vr.add(rs.getString("Type"));
                vr.add(rs.getString("Company"));
                vr.add(rs.getString("Unit_Price"));
                vr.add(rs.getString("qty"));
                vr.add(rs.getString("stock_price"));
                tdm.addRow(vr);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

//    int getvalue;
//
//    public void autoid() {
//        ResultSet rs = data.search("SELECT COUNT(`stock_id`)+1 FROM `stock`;");
//        try {
//            if (rs.next()) {
//                getvalue = Integer.parseInt(rs.getString(1));
//
//                jTextField1.setText(String.valueOf(getvalue));
//                System.out.println(getvalue);
//
//            }
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//    }
}
