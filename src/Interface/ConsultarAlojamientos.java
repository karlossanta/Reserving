/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Iterator.AgregadoConcreto;
import Iterator.Iterador;
import Strategy.Contexto;
import Strategy.Estrategia;
import Strategy.EstrategiaConcretaCliente;
import Strategy.EstrategiaConcretaGerente;
import FactoryAlojaminentos.Alojamiento;
import FactoryAlojaminentos.Apartamento;
import FactoryAlojaminentos.CasaRural;
import Decorator.UsuarioGeneral;
import Decorator.UsuarioCliente;
import alojamiento.GestionAlojamientos;
import FactoryAlojaminentos.Hotel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author karlos
 */
public class ConsultarAlojamientos extends javax.swing.JFrame {

    private JFrame ventanaAnt;
    AgregadoConcreto ac;
    Iterador iteradorAlojamientos;
    Alojamiento alojamientoActual;
    UsuarioCliente cliente;
    Contexto ctx;
    
    /**
     * Creates new form NewJFrame
     */
    public ConsultarAlojamientos(JFrame ventana) {
        initComponents();
        cliente = null;
        this.ventanaAnt = ventana;
        iniciarIterador();
        Estrategia est = new EstrategiaConcretaGerente();
        ctx = new Contexto(est, this);
        ctx.ejecutaEstrategia();
    }
    
    public ConsultarAlojamientos(JFrame ventana, UsuarioCliente cliente) {
        initComponents();
        this.ventanaAnt = ventana;
        iniciarIterador();
        this.cliente=cliente;
        Estrategia est = new EstrategiaConcretaCliente();
        ctx = new Contexto(est, this);
        ctx.ejecutaEstrategia();
    }
    
    public void botonCliente() {
        jButton4.setText("Reservar");
    }
    public void botonGerente() {
        jButton4.setText("Eliminar");
    }
    
    private void iniciarIterador() {
        ac = new AgregadoConcreto(GestionAlojamientos.getAlojamientos());
        iteradorAlojamientos = ac.crearIterador();
        if (!iteradorAlojamientos.estaVacio()) {
            alojamientoActual = (Alojamiento) iteradorAlojamientos.primero();
            mostrarDatos(alojamientoActual);
        } else {
            JOptionPane.showMessageDialog(this, "No existen Alojamientos.");
        }
    }
    
    private void mostrarDatos(Alojamiento alojamiento) {
        String tipoAlojamiento = alojamiento.getClass().getSimpleName();
        jLabelTipoAlojamiento.setText(tipoAlojamiento);
        jTextField1.setText(alojamiento.getId());
        jTextField2.setText(alojamiento.getDireccion());
        jTextField3.setText(String.valueOf(alojamiento.getPlazas()));
        jTextField4.setText(alojamiento.paraMascotas() ? "Si" : "No");
        jTextField5.setText(alojamiento.paraDiscapacitados() ? "Si" : "No");
        jTextField6.setText(String.valueOf(alojamiento.getValoracion()));
        jTextField7.setText(String.valueOf(alojamiento.getPrecio_noche()));
        if (tipoAlojamiento.equals("Apartamento")) {
            mostrarApartamento((Apartamento) alojamiento);
        } else if (tipoAlojamiento.equals("CasaRural")) {
            mostrarCasaRural((CasaRural) alojamiento);
        } else {
            mostrarHotel((Hotel) alojamiento);
        }
    }
    
    private void mostrarApartamento(Apartamento apartamento) {
        jLabel11.setVisible(true);
        jTextField10.setVisible(true);
        jLabel12.setVisible(false);
        jTextField11.setVisible(false);
        jLabel9.setText("Habitaciones:");
        jTextField8.setText(String.valueOf(apartamento.getHabitaciones()));
        jLabel10.setText("Camas:");
        jTextField9.setText(String.valueOf(apartamento.getCamas()));
        jLabel11.setText("Aparcamientos:");
        jTextField10.setText(apartamento.tieneAparcamiento() ? "Si" : "No");
    }
    private void mostrarCasaRural(CasaRural casaRural) {
        jLabel11.setVisible(true);
        jTextField10.setVisible(true);
        jLabel12.setVisible(true);
        jTextField11.setVisible(true);
        jLabel9.setText("Piscina:");
        jTextField8.setText(casaRural.tienePiscina() ? "Si" : "No");
        jLabel10.setText("Barbacoa:");
        jTextField9.setText(casaRural.tieneBarbacoa() ? "Si" : "No");
        jLabel11.setText("Habitaciones:");
        jTextField10.setText(String.valueOf(casaRural.getHabitaciones()));
        jLabel12.setText("Camas:");
        jTextField11.setText(String.valueOf(casaRural.getCamas()));
    }
    private void mostrarHotel(Hotel hotel) {
        jLabel11.setVisible(false);
        jTextField10.setVisible(false);
        jLabel12.setVisible(false);
        jTextField11.setVisible(false);
        jLabel9.setText("Estrellas:");
        jTextField8.setText(String.valueOf(hotel.getEstrellas()));
        jLabel10.setText("Pensión Completa:");
        jTextField9.setText(hotel.tienePensionCompleta() ? "Si" : "No");
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
        jLabelID = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelTipoAlojamiento = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Alojamientos");

        jLabelID.setText("ID:");

        jLabelDireccion.setText("Dirección:");

        jLabel4.setText("Plazas:");

        jLabel5.setText("Se permiten Mascotas:");

        jLabel6.setText("Habilitado para Discapacitados:");

        jLabel7.setText("Valoración:");

        jLabel8.setText("Precio por Noche:");

        jLabel9.setText("Habitaciones:");

        jLabel10.setText("Camas:");

        jLabel11.setText("Aparcamientos:");

        jLabel12.setText("jLabel12");

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(">");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabelTipoAlojamiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTipoAlojamiento.setText("ALOJAMIENTO");

        jButton3.setText("Buscar Alojamiento");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(119, 119, 119))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabelDireccion)
                                            .addComponent(jLabelID))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField1)
                                            .addComponent(jTextField2)
                                            .addComponent(jTextField3)
                                            .addComponent(jTextField4)
                                            .addComponent(jTextField5)
                                            .addComponent(jTextField6)
                                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField8)
                                            .addComponent(jTextField9)
                                            .addComponent(jTextField10)
                                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelTipoAlojamiento)
                                .addGap(151, 151, 151))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField12))
                            .addComponent(jButton3))
                        .addGap(37, 37, 37)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jLabelTipoAlojamiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDireccion)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        ventanaAnt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (iteradorAlojamientos.hayMas()) {
            alojamientoActual = (Alojamiento) iteradorAlojamientos.siguiente();
            mostrarDatos(alojamientoActual);
        } else {
            JOptionPane.showMessageDialog(this, "No hay más alojamientos.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (iteradorAlojamientos.hayMasAtras()) {
            alojamientoActual = (Alojamiento) iteradorAlojamientos.anterior();
            mostrarDatos(alojamientoActual);
        } else {
            JOptionPane.showMessageDialog(this, "No hay más alojamientos.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (cliente == null) {
            GestionAlojamientos.eliminarAlojamiento(alojamientoActual);
            iniciarIterador();
        } else {
            VReserva vr = new VReserva(this, cliente, alojamientoActual);
            vr.setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        alojamientoActual = GestionAlojamientos.buscarAlojamiento(GestionAlojamientos.getAlojamientos(), jTextField12.getText());
        mostrarDatos(alojamientoActual);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelTipoAlojamiento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
