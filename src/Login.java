
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author y
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        jLabel2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jName1 = new javax.swing.JTextField();
        jPassword1 = new javax.swing.JPasswordField();
        jBtnlogin1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1980, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 380, 300, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 43, -1));

        jLabel2.setBackground(new java.awt.Color(255, 51, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jLabel2.setText("Incorrect Username or Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 450, -1, 30));

        jName1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jName1.setText("Enter Username");
        jName1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jName1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jName1FocusLost(evt);
            }
        });
        getContentPane().add(jName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 490, 330, 40));

        jPassword1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPassword1.setText("jPasswordField1");
        jPassword1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPassword1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPassword1FocusLost(evt);
            }
        });
        jPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassword1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 540, 330, 40));

        jBtnlogin1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnlogin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.png"))); // NOI18N
        jBtnlogin1.setText("Login");
        jBtnlogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnlogin1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnlogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 600, -1, 30));

        jCheckBox1.setBackground(new java.awt.Color(153, 153, 153));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 600, 150, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image2/1513073.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int a=JOptionPane.showConfirmDialog(null,"You Want To Exit Program","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jName1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jName1FocusGained
        jLabel2.setVisible(false);
        if(jName1.getText().equals(""))
        {
            jName1.setText("Enter Username");
            jName1.setForeground(new Color(0,51,51));
        }
    }//GEN-LAST:event_jName1FocusGained

    private void jName1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jName1FocusLost
        jLabel2.setVisible(false);
        if(jName1.getText().equals(""))
        {
            jName1.setText("Enter Username");
            jName1.setForeground(new Color(0,51,51));
        }
    }//GEN-LAST:event_jName1FocusLost

    private void jPassword1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPassword1FocusGained
        jLabel2.setVisible(false);
        if(jPassword1.getText().equals(""))
        {
            jPassword1.setText("Enter Password");
            jPassword1.setForeground(new Color(0,51,51));
        }
    }//GEN-LAST:event_jPassword1FocusGained

    private void jPassword1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPassword1FocusLost
        jLabel2.setVisible(false);
        if(jPassword1.getText().equals(""))
        {
            jPassword1.setText("Enter Password");
            jPassword1.setForeground(new Color(0,51,51));
        }
    }//GEN-LAST:event_jPassword1FocusLost

    private void jBtnlogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnlogin1ActionPerformed
       if(jName1.getText().equals("gms") && jPassword1.getText().equals("admin"))
       {
           setVisible(false);
           new Home().setVisible(true);
       }
       else
           jLabel2.setVisible(true);
    }//GEN-LAST:event_jBtnlogin1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected())
        {
            jPassword1.setEchoChar((char)0);
        }
        else
        {
            jPassword1.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassword1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnlogin1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jName1;
    private javax.swing.JPasswordField jPassword1;
    // End of variables declaration//GEN-END:variables
}
