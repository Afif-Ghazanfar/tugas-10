/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pertemuan11_guilanjutan;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author irzir
 */
public class LoginPage extends javax.swing.JPanel {

    public LoginPage(MainFrame frame) {
       setLayout(null);

        JLabel title = new JLabel("Login Sistem Perpustakaan");
        title.setFont(new Font("Segoe UI", Font.BOLD, 18));
        title.setBounds(200, 60, 300, 30);
        add(title);

        JLabel lblUser = new JLabel("Username:");
        lblUser.setBounds(200, 120, 80, 25);
        add(lblUser);

        JTextField txtUser = new JTextField();
        txtUser.setBounds(280, 120, 150, 25);
        add(txtUser);

        JLabel lblPass = new JLabel("Password:");
        lblPass.setBounds(200, 160, 80, 25);
        add(lblPass);

        JPasswordField txtPass = new JPasswordField();
        txtPass.setBounds(280, 160, 150, 25);
        add(txtPass);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(260, 210, 100, 30);
        add(btnLogin);

        JLabel lblMsg = new JLabel("", SwingConstants.CENTER);
        lblMsg.setBounds(150, 260, 400, 25);
        lblMsg.setForeground(Color.RED);
        add(lblMsg);

        btnLogin.addActionListener(e -> {
            // Login btn logic
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
