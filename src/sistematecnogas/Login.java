/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematecnogas;

import java.awt.Dimension;
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import servicios.conexion;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.GregorianCalendar;
import static sistematecnogas.panelcentral.fecha;


/**
 *
 * @author radioshack
 */
public class Login extends javax.swing.JFrame {

    
   
    /*
     * Creates new form Login
     */
    public class Imagen extends javax.swing.JPanel {
 

 
//Se crea un método cuyo parámetro debe ser un objeto Graphics
 
public void paint(Graphics grafico) {
Dimension height = getSize();
 
//Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
 
ImageIcon Img = new ImageIcon(getClass().getResource("/Imagen/logo_tecnogas_transp.png")); 
 
//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
 
grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
 
setOpaque(false);
super.paintComponent(grafico);
}
}
    
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        
        fecha_pantalla.setText(fecha());
        
        
        
        
        
       
        
    }
    void acceder(String usuario, String pass)
    {
       String cap="";
       /*String sql="SELECT * FROM `usuario` WHERE `id_usuario` =" +usuario+ "&& `contraseña` = + "+ pass;*/
       String sql="SELECT `id_usuario`, `nombre`, `contraseña`, `tipo_usuario`, `estado_usuario`, `fecha_creacion_usuario`, `fecha_actualizacion` FROM `usuarios` WHERE `nombre` = '"+usuario+"' and `contraseña` = '"+pass+"'";
       //String sql="SELECT `id_usuario`, `nombre`, `contraseña`, `tipodeusuario` FROM `usuario` WHERE `id_usuario` = '"+usuario+"' and `contraseña` = '"+pass+"'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                cap=rs.getString("tipo_usuario");
            }
            if(cap.equals("1"))
            {
                    panelcentral ingresar = new panelcentral();
                    ingresar.setVisible(true);
                   
            }
            if((!cap.equals("1")))
            {
                JOptionPane.showMessageDialog(this, "No existe su usuario por favor comunicarse con el administrador");
            }
        } catch (SQLException ex) {
            /*Logger.getLogger(IngresoSistema.class.getName()).log(Level.SEVERE, null, ex);*/
        }
       
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonLogin = new javax.swing.JButton();
        usuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_iconotecnogas = new javax.swing.JLabel();
        label_titulobienvenidos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fecha_pantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonLogin.setForeground(new java.awt.Color(0, 23, 23));
        botonLogin.setText("Inicio");
        botonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(botonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 299, 109, -1));

        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 210, 17));

        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 210, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ingrese nombre de usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        label_iconotecnogas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logo_tecnogas_transp.png"))); // NOI18N
        label_iconotecnogas.setText("jLabel4");
        label_iconotecnogas.setPreferredSize(new java.awt.Dimension(270, 134));
        getContentPane().add(label_iconotecnogas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 100));

        label_titulobienvenidos.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        label_titulobienvenidos.setForeground(new java.awt.Color(0, 51, 102));
        label_titulobienvenidos.setText("¡Bienvenido!");
        getContentPane().add(label_titulobienvenidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 250, 60));

        jLabel1.setText("Fecha:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        fecha_pantalla.setText("dd-MM-YYYY");
        getContentPane().add(fecha_pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

      public static String fecha(){
    Date fecha = new Date();
    SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
           return formatofecha.format(fecha);
    }
    
    
    
    private void botonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLoginActionPerformed
    String usu =usuario.getText();
    String pas =new String(contraseña.getPassword());
    acceder(usu, pas);
        
        
    }//GEN-LAST:event_botonLoginActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
        usuario.requestFocus();
    }//GEN-LAST:event_usuarioActionPerformed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaActionPerformed

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        
    }
    conexion cc = new conexion();
    Connection cn = cc.conexion();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonLogin;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel fecha_pantalla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label_iconotecnogas;
    private javax.swing.JLabel label_titulobienvenidos;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
