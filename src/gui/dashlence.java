/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.data;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

/**
 *
 * @author Theekshana
 */
public class dashlence extends javax.swing.JPanel {

    static dashlence r ; 
    
    public dashlence() {
        initComponents();
        loadtable();
        design();
    }

    public void design() {

        Font font = new Font("Maiandra GD", Font.BOLD, 18);
        JTableHeader header = jTable1.getTableHeader();
        header.setFont(font);
        header.setOpaque(false);
        header.setBackground(new Color(9,0,82));
        header.setForeground(new Color(255,255,255));
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 153));

        jTable1.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lence Number", "purpose", "meterial", "catagory", "payment"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setRowHeight(27);
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        jScrollPane2.getAccessibleContext().setAccessibleParent(jScrollPane2);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public static dashlence dash(){
    
    if(r == null){
    r = new dashlence();
    }
    
    return r;
    }


        public void loadtable() {
        TableModel tdm = jTable1.getModel();
        DefaultTableModel dtm = (DefaultTableModel) tdm;
        dtm.setRowCount(0);
        try {
            ResultSet rs = data.search("SELECT * FROM lences");

            while (rs.next()) {
                Vector<String> vr = new Vector<>();
                vr.add(rs.getString("lenceId"));
                ResultSet rs1 = data.search("SELECT `type` FROM `presciptionlence` WHERE `lecnceID` = '" + rs.getString("presciptionLence_lecnceID") + "'");

                if (rs1.next()) {
                    vr.add(rs1.getString("type"));
                    ResultSet rs2 = data.search("SELECT `type` FROM `catgarylence` WHERE `Cat_lenceId` = '" + rs.getString("catgaryLence_Cat_lenceId") + "'");
                    if (rs2.next()) {
                        vr.add(rs2.getString("type"));
                        ResultSet rs3 = data.search("SELECT `material` FROM `lencematerial` WHERE `MaterialId` = '" + rs.getString("LenceMaterial_MaterialId") + "'");
                        if (rs3.next()) {
                            vr.add(rs3.getString("material"));
                        }
                    }
                }
                vr.add(rs.getString("payment"));

                dtm.addRow(vr);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
