/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import FactoryAlojaminentos.Alojamiento;
import Memento.Conserje;
import Memento.Originador;
import Memento.Recuerdo;
import alojamiento.Cliente;
import alojamiento.GestionAlojamientos;
import alojamiento.GestionReservas;
import alojamiento.Usuario;
import alojamiento.Usuarios;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author karlos
 */
public class Login extends javax.swing.JFrame {

    
    private Originador originador;
    private Conserje conserje;
    /**
     * Creates new form Login2
     */
    public Login() {
        initComponents();
        this.originador = new Originador();   //originador
        this.conserje = new Conserje(); //conserje
        this.cargarDatos();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Nuevo Usuario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(jPasswordField2))
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButton1)
                .addGap(32, 32, 32)
                .addComponent(jButton2)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nombreUsuario = jTextField1.getText();
        String contrasenna = String.copyValueOf(jPasswordField2.getPassword());
        System.out.println(Usuarios.validarUsuario(nombreUsuario, contrasenna));
        if (Usuarios.validarUsuario(nombreUsuario, contrasenna)){
            Usuario usuario = Usuarios.getUsuario(nombreUsuario);
            System.out.println(usuario.getClass().getSimpleName());
            if (usuario.getClass().getSimpleName().equals("Gerente")) {
                VMenuAlojamientoGerente vmag = new VMenuAlojamientoGerente(this);
                vmag.setVisible(true);
                this.setVisible(false);
            } else {
                VMenuAlojamientoCliente vmac = new VMenuAlojamientoCliente(this, (Cliente) usuario);
                vmac.setVisible(true);
                this.setVisible(false);
            }                
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String nombreUsuario = jTextField1.getText();
        String contrasenna = String.copyValueOf(jPasswordField2.getPassword());
        System.out.println(Usuarios.validarUsuario(nombreUsuario, contrasenna));
        if (Usuarios.validarUsuario(nombreUsuario, contrasenna)){
            Usuario usuario = Usuarios.getUsuario(nombreUsuario);
            System.out.println(usuario.getClass().getSimpleName());
            //creamos una nueva ventana a la que le decimos si el usuario introducido es gerente o no
            NuevoUsuario nu = new NuevoUsuario(usuario.getClass().getSimpleName().equals("Gerente"), this);
            nu.setVisible(true);
            this.setVisible(false);
        } else {
            NuevoUsuario nu = new NuevoUsuario(false, this);
            nu.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.guardarDatos();
    }//GEN-LAST:event_formWindowClosing

    
    public void cargarDatos(){
        originador.cargarAlojamientos(conserje.getRecuerdo(0));
        originador.cargarReserva(conserje.getRecuerdo(1));
        originador.cargarUsuarios(conserje.getRecuerdo(2));
        
//        originador.setRecuerdo(GestionAlojamientos.getAlojamientos(), conserje.getRecuerdo(0));
//        originador.setRecuerdo(conserje.getRecuerdo(1), GestionReservas.getReservas());
//        originador.setRecuerdo(Usuarios.getUsuarios(), conserje.getRecuerdo(2));
//        originador.setRecuerdo(Usuarios.getNGerentes(), conserje.getRecuerdo(3));
    }
    
    public void guardarDatos(){
        
        
        Recuerdo r1 = originador.crearRecuerdo();
        r1.setAlojamientosR(GestionAlojamientos.getAlojamientos());
        originador.guardarAlojamiento(r1);
        conserje.setRecuerdo(r1);
        
        Recuerdo r2 = originador.crearRecuerdo();
        r2.setReservasR(GestionReservas.getReservas());
        originador.guardarReserva(r2);
        conserje.setRecuerdo(r2);
        
        Recuerdo r3 = originador.crearRecuerdo();
        r3.setUsuariosR(Usuarios.getUsuarios());
        r3.setNgerenteR(Usuarios.getNGerentes());
        originador.guardarUsuarios(r3);
        conserje.setRecuerdo(r3);
        
//        originador.setRecuerdo(GestionAlojamientos.getAlojamientos(), originador.crearRecuerdo());
//        originador.setRecuerdo(originador.crearRecuerdo(), GestionReservas.getReservas());
//        originador.setRecuerdo(Usuarios.getUsuarios(), originador.crearRecuerdo());
//        originador.setRecuerdo(Usuarios.getNGerentes(), originador.crearRecuerdo());
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
