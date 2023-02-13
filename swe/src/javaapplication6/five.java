/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harsh
 */
public class five extends javax.swing.JFrame {

    /**
     * Creates new form five
     */
    public five() {
        initComponents();
    }
public five(String para){
        initComponents();
       
        mID.setText(para);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        city = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        seller = new javax.swing.JTable();
        title = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sbill = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        mID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sellers");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setLayout(null);

        city.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        city.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(city);
        city.setBounds(190, 20, 180, 20);

        seller.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Seller_ID", "Seller_Name", "Account_Number", "Seller_EMail", "Mobile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(seller);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 540, 100);

        title.setText("Seller:");
        jPanel1.add(title);
        title.setBounds(20, 60, 70, 16);

        sbill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Seller_ID", "Product_ID", "Quantity", "Price", "Date_purchased"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sbill.setOpaque(false);
        jScrollPane2.setViewportView(sbill);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 250, 540, 110);

        jLabel2.setText("Seller Bill:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 220, 70, 16);

        exit.setText("Sign Out");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(420, 470, 110, 25);

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(30, 465, 70, 30);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication6/emp_image.png"))); // NOI18N
        image.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                imageComponentShown(evt);
            }
        });
        jPanel1.add(image);
        image.setBounds(0, 0, 560, 550);

        mID.setOpaque(true);
        jPanel1.add(mID);
        mID.setBounds(110, 520, 80, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "You have been successfully signed out!");
        dispose();
        new one().setVisible(true);
    }//GEN-LAST:event_exitActionPerformed

    private void imageComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_imageComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_imageComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
       String url="jdbc:mysql://localhost:3306/project?useSSL=true";
       String user="root";
       String pass="harsh";
       
               try{

             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection conn=DriverManager.getConnection(url,user,pass);
            
            
             //setting table values 
           
            
          
             String sql2="select * from seller";
             PreparedStatement pst1=conn.prepareStatement(sql2);
             ResultSet rs1=pst1.executeQuery();
             
             
             
             DefaultTableModel tm=(DefaultTableModel)seller.getModel();
             tm.setRowCount(0);
              while(rs1.next())
                        {
                           Object o[]={rs1.getInt("seller_id"),rs1.getString("sname"),rs1.getInt("bank_acc"),rs1.getString("semail"),rs1.getString("phno")};
                              tm.addRow(o);
                        }
            
              
             String sql5="select * from seller_bill";
             PreparedStatement pst5=conn.prepareStatement(sql5);
             ResultSet rs3=pst5.executeQuery();
             
             
             
             DefaultTableModel tm1=(DefaultTableModel)sbill.getModel();
             tm1.setRowCount(0);
              while(rs3.next())
                        {
                           Object o[]={rs3.getInt("seller_id"),rs3.getInt("product_id"),rs3.getInt("squantity"),rs3.getString("sprice"),rs3.getString("sdate")};
                              tm1.addRow(o);
                        }
            
             
             
              
              
             String sql3 = "Select city from branch where manager_id=?";
             PreparedStatement pst2 = conn.prepareStatement(sql3);
             pst2.setString(1, mID.getText());
             ResultSet rs4 = pst2.executeQuery();
            
             rs4.next();
             String op=rs4.getString(1);
            
             
             city.setText(op+" Branch");
             conn.close();
      }catch(Exception e){System.out.println(e);}
        
    }//GEN-LAST:event_formComponentShown

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
         String a=(mID.getText());
             
            
    
            
                dispose();
          new four(a).setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(five.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(five.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(five.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(five.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new five().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel city;
    private javax.swing.JButton exit;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mID;
    private javax.swing.JTable sbill;
    private javax.swing.JTable seller;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
