/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

import java.util.*;
//import java.swing.*;

/**
 *
 * @author sourabh
 */
public class login extends javax.swing.JFrame {

    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        showdate();
      //  login.setEnabled(false);
    }
    
    void showdate()
    {
       Date d=new Date();
        SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
         SimpleDateFormat s1=new SimpleDateFormat("hh:mm:ss a");
       da.setText(s.format(d)); 
       jLabel4.setText(s1.format(d));
     
    }
    
  /*  void showTime()
    {
       new Timer(0,new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       })
        {
            @override
            public void actionPerformed(ActionEvent e)
            {
                Date d=new Date();
                SimpleDateFormat s=new SimpleDateFormat("hh:mm:ss a");
                time.setText(s.format(d));
            }
        }).start();
    
    
    }*/
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
  
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pwd = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        da = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(237, 243, 129));
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPanel1FocusLost(evt);
            }
        });
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel1KeyTyped(evt);
            }
        });

        jLabel2.setText("Username:");
        jLabel2.setPreferredSize(new java.awt.Dimension(17, 17));

        uname.setToolTipText("");
        uname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                unameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                unameFocusLost(evt);
            }
        });
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        uname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unameKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                unameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unameKeyReleased(evt);
            }
        });

        jLabel3.setText("Password:");

        pwd.setToolTipText("");
        pwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwdFocusLost(evt);
            }
        });
        pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdActionPerformed(evt);
            }
        });
        pwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pwdKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwdKeyReleased(evt);
            }
        });

        login.setText("Login");
        login.setEnabled(false);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(java.awt.Color.white);

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(35, 15, 174));
        jLabel12.setText("Admin Login");
        jLabel12.setMaximumSize(new java.awt.Dimension(242, 34));

        jLabel13.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel13.setForeground(java.awt.Color.red);
        jLabel13.setText("AGRO AGENCY");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/logo.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel13))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/signup.png"))); // NOI18N

        da.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel5.setText("Date:");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel6.setText("Time:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(da, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(login)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(da, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(17, 17, 17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(jButton2))
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
         try{
             String s1=uname.getText();
             String s2=pwd.getText();
             
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","root");
            
            String q = "select * from admin where username=? and password=? "; /*enter your table name*/
            pst = con.prepareStatement(q);
         pst.setString(1, s1);
          pst.setString(2, s2);
            rs = pst.executeQuery();
        
        
         if(rs.next())
        
        
         { JOptionPane.showMessageDialog(null,"Login Succesfully!!");
              home h=new home ();
        h.setVisible(true);
        
        
        this.dispose();

         }else
         JOptionPane.showMessageDialog(null,"Wrong Username or Password!!!");
        
         }
         catch(Exception e)
         {
             System.out.print(e);
         }
        
        
        
        
        
    }//GEN-LAST:event_loginActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
uname.setText("");
        pwd.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void unameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unameFocusLost
        // TODO add your handling code here:
         int flag=0;// TODO add your handling code here:
         if((pwd.getText().equals("")) && uname.getText().equals(""))
        {
           flag=1;
        }
        if(flag==1)
        {
             login.setEnabled(false);
        }
        else
        {
             login.setEnabled(true);
        }
    }//GEN-LAST:event_unameFocusLost

    private void pwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdFocusLost
        int flag=0;// TODO add your handling code here:
        if((pwd.getText().equals("")) && uname.getText().equals(""))
        {
           flag=1;
        }
        if(flag==1)
        {
             login.setEnabled(false);
        }
        else
        {
             login.setEnabled(true);
        }
            
    }//GEN-LAST:event_pwdFocusLost

    private void jPanel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyTyped
 
             // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyTyped

    private void unameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unameKeyPressed
 int flag=0;// TODO add your handling code here:
        if((pwd.getText().equals("")) && uname.getText().equals(""))
        {
           flag=1;
        }
        if(flag==1)
        {
             login.setEnabled(false);
        }
        else
        {
             login.setEnabled(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_unameKeyPressed

    private void unameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unameKeyReleased
 int flag=0;// TODO add your handling code here:
       if((pwd.getText().equals("")) && uname.getText().equals(""))
        {
           flag=1;
        }
        if(flag==1)
        {
             login.setEnabled(false);
        }
        else
        {
             login.setEnabled(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_unameKeyReleased

    private void pwdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdKeyPressed
        // TODO add your handling code here:
        
        int flag=0;// TODO add your handling code here:
        if((pwd.getText().equals("")) && uname.getText().equals(""))
        {
           flag=1;
        }
        if(flag==1)
        {
             login.setEnabled(false);
        }
        else
        {
             login.setEnabled(true);
        } 
    }//GEN-LAST:event_pwdKeyPressed

    private void pwdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdKeyReleased

        int flag=0;// TODO add your handling code here:
        boolean b;
         if((pwd.getText().equals("")) && uname.getText().equals(""))
        {
           
           flag=1;
        }
        if(flag==1)
        {
             login.setEnabled(false);
        }
        else
        {
             login.setEnabled(true);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_pwdKeyReleased

    private void unameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unameFocusGained
         int flag=0;// TODO add your handling code here:
        boolean b;
         if((pwd.getText().equals("")) && uname.getText().equals(""))
        {
           
           flag=1;
        }
        if(flag==1)
        {
             login.setEnabled(false);
        }
        else
        {
             login.setEnabled(true);
        }// TODO add your handling code here:
    }//GEN-LAST:event_unameFocusGained

    private void unameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unameKeyTyped
 int flag=0;// TODO add your handling code here:
        boolean b;
         if((pwd.getText().equals("")) && uname.getText().equals(""))
        {
           
           flag=1;
        }
        if(flag==1)
        {
             login.setEnabled(false);
        }
        else
        {
             login.setEnabled(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_unameKeyTyped

    private void pwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdFocusGained
      // TODO add your handling code here:
    }//GEN-LAST:event_pwdFocusGained

    private void pwdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdKeyTyped
    }//GEN-LAST:event_pwdKeyTyped

    private void jPanel1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1FocusLost

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel da;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
