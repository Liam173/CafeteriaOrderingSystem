/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import Login.Login;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author TFVBLDVY9
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setSize(455, 654);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        item3 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        item1 = new javax.swing.JSpinner();
        item2 = new javax.swing.JSpinner();
        item4 = new javax.swing.JSpinner();
        item8 = new javax.swing.JSpinner();
        item7 = new javax.swing.JSpinner();
        item5 = new javax.swing.JSpinner();
        item6 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bacon Sandwich");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 450, 110, 40);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Water");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(260, 450, 40, 40);

        item3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        item3.setBorder(null);
        getContentPane().add(item3);
        item3.setBounds(170, 520, 55, 22);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cheese Burger");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 480, 110, 40);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Coke");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(260, 480, 40, 40);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hawaian Pizza");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 551, 80, 20);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Milkshake");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(240, 510, 60, 40);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fries");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(120, 520, 80, 20);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Coffee");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(250, 541, 50, 40);

        item1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        item1.setAlignmentX(1.0F);
        item1.setAlignmentY(1.0F);
        item1.setBorder(null);
        getContentPane().add(item1);
        item1.setBounds(170, 460, 55, 22);

        item2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        item2.setBorder(null);
        getContentPane().add(item2);
        item2.setBounds(170, 490, 55, 22);

        item4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        item4.setBorder(null);
        getContentPane().add(item4);
        item4.setBounds(170, 550, 55, 22);

        item8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        item8.setBorder(null);
        getContentPane().add(item8);
        item8.setBounds(310, 550, 55, 22);

        item7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        item7.setBorder(null);
        getContentPane().add(item7);
        item7.setBounds(310, 520, 55, 22);

        item5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        item5.setBorder(null);
        getContentPane().add(item5);
        item5.setBounds(310, 460, 55, 22);

        item6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        item6.setBorder(null);
        getContentPane().add(item6);
        item6.setBounds(310, 490, 55, 22);

        jButton1.setText("Checkout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 590, 90, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/resources/background-1206941__340.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 240, 450, 430);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/resources/feedem logo.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -30, 450, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static String order[][] = new String[8][2];

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login login = new Login();
        
        //Im done bitches
        //Im tired
        //Take notes
        
        Checkout.Checkout checkout = new Checkout.Checkout();
        String baconSandwich = item1.getValue() + "";
        String cheeseBurger = item2.getValue() + "";
        String fries = item3.getValue() + "";
        String hawaianPizza = item4.getValue() + "";
        String water = item5.getValue() + "";
        String coke = item6.getValue() + "";
        String milkshake = item7.getValue() + "";
        String coffee = item8.getValue() + "";
        System.out.println("Brendan, what the???");

        order[0][0] = "Sandwich";
        order[1][0] = "Cheese Burger";
        order[2][0] = "Fries";
        order[3][0] = "Hawaian Pizza";
        order[4][0] = "Water";
        order[5][0] = "Coke";
        order[6][0] = "Milkshake";
        order[7][0] = "Coffee";

        order[0][1] = baconSandwich;
        order[1][1] = cheeseBurger;
        order[2][1] = fries;
        order[3][1] = hawaianPizza;
        order[4][1] = water;
        order[5][1] = coke;
        order[6][1] = milkshake;
        order[7][1] = coffee;

        dispose();
        checkout.getOrder();
        checkout.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public String[][] getOrders() {
        return order;
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner item1;
    private javax.swing.JSpinner item2;
    private javax.swing.JSpinner item3;
    private javax.swing.JSpinner item4;
    private javax.swing.JSpinner item5;
    private javax.swing.JSpinner item6;
    private javax.swing.JSpinner item7;
    private javax.swing.JSpinner item8;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
