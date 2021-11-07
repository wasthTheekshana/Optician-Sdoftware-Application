package gui;

import Class.Loger;
import database.data;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Theekshana
 */
public class monthly_attendence extends javax.swing.JPanel {

    static monthly_attendence r;

    public monthly_attendence() {
        initComponents();
        design();
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

        jButton1 = new javax.swing.JButton();
        nic = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(44, 102, 176));
        jButton1.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 70, 190, 40));

        nic.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        nic.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nic.setText(" ");
        nic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nicKeyReleased(evt);
            }
        });
        add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 215, 40));

        jLabel3.setBackground(new java.awt.Color(32, 46, 128));
        jLabel3.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Monthly Attendence Report");
        jLabel3.setOpaque(true);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 41));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee NIC", "Date", "In Time", "Out Time"
            }
        ));
        jTable1.setRowHeight(27);
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 880, 360));
        add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 220, 179, 30));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 170, 179, 31));

        jButton2.setBackground(new java.awt.Color(44, 102, 176));
        jButton2.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 270, 190, 40));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(225, 218, 224));
        jTextField4.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 134, 39));
    }// </editor-fold>//GEN-END:initComponents

    private void nicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicKeyReleased
        String id = nic.getText();
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = data.search("SELECT * FROM `attendence` WHERE `employee_nic` LIKE '%"+id+"%'");
            while (rs.next()) {                
                Vector<String> vr = new Vector<>();
                vr.add(rs.getString("employee_nic"));
                vr.add(rs.getString("date"));
                vr.add(rs.getString("inTime"));
                vr.add(rs.getString("outTime"));
                dtm.addRow(vr);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_nicKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Nic = nic.getText();
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = data.search("SELECT * FROM `attendence` WHERE  employee_nic = '" + Nic + "'");
            int i = 0 ;
                
            while (rs.next()) {
                Vector<String> vr = new Vector<>();
                vr.add(rs.getString("employee_nic"));
                vr.add(rs.getString("date"));
                vr.add(rs.getString("inTime"));
                vr.add(rs.getString("outTime"));
                dtm.addRow(vr);
                i++;
//                if (Nic.equals(rs.getString("employee_nic"))) {
//                    load(Nic);
//                } else {
//                    JOptionPane.showMessageDialog(this, "Please Enter Valid Employee", "Inform", JOptionPane.INFORMATION_MESSAGE);
//                    nic.setText(null);
//
//                }
            }
            jTextField4.setText(String.valueOf(i));
                

        } catch (Exception e) {
            nic.setText("");
            Loger.log.info(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            Date date = jDateChooser1.getDate();
            Date date1 = jDateChooser2.getDate();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String sd1 = sd.format(date);
            String sd2 = sd.format(date1);
            int i = 0;
            ResultSet rs = data.search("SELECT * FROM `attendence` WHERE `date` BETWEEN '" + sd1 + "' AND '" + sd2 + "'");
            while (rs.next()) {
                Vector<String> vr = new Vector<>();
                vr.add(rs.getString("employee_nic"));
                vr.add(rs.getString("date"));
                vr.add(rs.getString("inTime"));
                vr.add(rs.getString("outTime"));
                dtm.addRow(vr);
                
                i++;
            }
            jTextField4.setText(String.valueOf(i));
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static monthly_attendence viem1() {
        if (r == null) {
            r = new monthly_attendence();
        }
        return r;
    }

//     public void design() {
//
//        Font font = new Font("Maiandra GD", Font.BOLD, 18);
//        JTableHeader header = jTable2.getTableHeader();
//        header.setFont(font);
//        header.setOpaque(false);
//        header.setBackground(new Color(32,136,203));
//        header.setForeground(new Color(255,255,255));
//        
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField nic;
    // End of variables declaration//GEN-END:variables

//    public void loademployee(){
//    ResultSet rs = database.data.search("SELECT * FROM employee");
//        TableModel tdm = jTable2.getModel();
//        DefaultTableModel dtm = (DefaultTableModel) tdm;
//        dtm.setRowCount(0);
//
//        try {
//            while (rs.next()) {
//                Vector<String> vr = new Vector<>();
//                vr.add(rs.getString("nic"));
//                vr.add(rs.getString("efname"));
//                vr.add(rs.getString("lname"));
//                vr.add(rs.getString("dob"));
//                vr.add(rs.getString("mobile"));
//                vr.add(rs.getString("email"));
//
//                ResultSet rs1 = database.data.search("SELECT `name` FROM bank WHERE bankId = '" + rs.getString("bank_bankId") + "';");
//
//                if (rs1.next()) {
//                    vr.add(rs1.getString("name"));
//
//                }
//                vr.add(rs.getString("accountNo"));
//                dtm.addRow(vr);
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    
//    }
    public void load(String nic1) {
        try {
            ResultSet r = data.search("select * from attendence where employee_nic ='" + nic.getText() + "' ");
            while (r.next()) {
                Vector v = new Vector();
                v.add(r.getString("Date"));
                v.add(r.getString("inTime"));
                v.add(r.getString("outTime"));
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.addRow(v);
            }
        } catch (Exception ex) {
            Loger.log.info(ex);
        }
    }
}
