/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematecnogas;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.ImageIcon;





/**
 *
 * @author radioshack
 */
public class panelcentral extends javax.swing.JFrame {

    /**
     * Creates new form panelcentral
     */
    public panelcentral() {
        initComponents();
        //fecha_pantalla.setText(fecha());
        fecha_pantalla.setText(fecha());
         setTitle("Panel Central");
        setIconImage(new ImageIcon(getClass().getResource("/Imagen/logo_tecnogas_transp.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        usuario = new javax.swing.JButton();
        bombas = new javax.swing.JButton();
        productos = new javax.swing.JButton();
        usuario3 = new javax.swing.JButton();
        usuario5 = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fecha_pantalla = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        categorias = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        proveedores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ingreso de proveedores");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 190, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Control diario de Combustible");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 220, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Ingreso de usuarios");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 150, 23));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Ingreso de categorías");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 160, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Precio actual de gasolina");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 180, 30));

        usuario.setBackground(new java.awt.Color(204, 204, 204));
        usuario.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        usuario.setText("Ingresar");
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioMouseClicked(evt);
            }
        });
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 109, -1));

        bombas.setBackground(new java.awt.Color(204, 204, 204));
        bombas.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        bombas.setText("Ingresar");
        bombas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bombasMouseClicked(evt);
            }
        });
        bombas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bombasActionPerformed(evt);
            }
        });
        getContentPane().add(bombas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 109, -1));

        productos.setBackground(new java.awt.Color(204, 204, 204));
        productos.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        productos.setText("Ingresar");
        productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productosMouseClicked(evt);
            }
        });
        productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosActionPerformed(evt);
            }
        });
        getContentPane().add(productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 109, -1));

        usuario3.setBackground(new java.awt.Color(204, 204, 204));
        usuario3.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        usuario3.setText("Ingresar");
        usuario3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuario3MouseClicked(evt);
            }
        });
        usuario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuario3ActionPerformed(evt);
            }
        });
        getContentPane().add(usuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 110, -1));

        usuario5.setBackground(new java.awt.Color(204, 204, 204));
        usuario5.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        usuario5.setText("Ingresar");
        usuario5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuario5MouseClicked(evt);
            }
        });
        getContentPane().add(usuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 109, -1));

        atras.setBackground(new java.awt.Color(204, 204, 204));
        atras.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        atras.setText("Salir del sistema");
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasMouseClicked(evt);
            }
        });
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 150, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 153));
        jLabel11.setText("Menú de TecnoGas");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 245, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Fecha:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 40, -1));

        fecha_pantalla.setText("DD//MM/YYYY");
        getContentPane().add(fecha_pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 70, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 560, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Ingreso de Productos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 160, 30));

        categorias.setBackground(new java.awt.Color(204, 204, 204));
        categorias.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        categorias.setText("Ingresar");
        categorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoriasMouseClicked(evt);
            }
        });
        categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriasActionPerformed(evt);
            }
        });
        getContentPane().add(categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Ingreso de bombas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 160, 20));

        proveedores.setBackground(new java.awt.Color(204, 204, 204));
        proveedores.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        proveedores.setText("Ingresar");
        proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proveedoresMouseClicked(evt);
            }
        });
        proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedoresActionPerformed(evt);
            }
        });
        getContentPane().add(proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 109, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String fecha(){
    Date fecha = new Date();
    SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
           return formatofecha.format(fecha);
    }
    
    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
       // ingresoDeUsuarios ingresar = new ingresoDeUsuarios();
                   // ingresar.setVisible(true);
    }//GEN-LAST:event_usuarioActionPerformed

    private void bombasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bombasActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_bombasActionPerformed

    private void productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_productosActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
        Login salir = new Login();
                    salir.setVisible(true);
    }//GEN-LAST:event_atrasActionPerformed

    private void categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriasActionPerformed

    private void proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proveedoresActionPerformed

    private void usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseClicked
       IngresoDeUsuarios boton_usuario = new IngresoDeUsuarios();
       boton_usuario.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_usuarioMouseClicked

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_atrasMouseClicked

    private void bombasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bombasMouseClicked
Ingreso_Bombas botonbombas = new Ingreso_Bombas();
botonbombas.setVisible(true);
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_bombasMouseClicked

    private void proveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proveedoresMouseClicked
Proveedores boton_proveedores = new Proveedores();
boton_proveedores.setVisible(true);
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_proveedoresMouseClicked

    private void productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosMouseClicked
Productos boton_productos = new Productos();
boton_productos.setVisible(true);
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_productosMouseClicked

    private void categoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriasMouseClicked
Categoria boton_categoria = new Categoria();
boton_categoria.setVisible(true);
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_categoriasMouseClicked

    private void usuario3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuario3MouseClicked
Ingreso_PrecioActual_Combustible boton_precioactual = new Ingreso_PrecioActual_Combustible();
boton_precioactual.setVisible(true);
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_usuario3MouseClicked

    private void usuario5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuario5MouseClicked
Control_Combustible_Diario boton_controlcd = new Control_Combustible_Diario();
boton_controlcd.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_usuario5MouseClicked

    private void usuario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuario3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuario3ActionPerformed

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
            java.util.logging.Logger.getLogger(panelcentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panelcentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panelcentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panelcentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panelcentral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton bombas;
    private javax.swing.JButton categorias;
    private javax.swing.JLabel fecha_pantalla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton productos;
    private javax.swing.JButton proveedores;
    private javax.swing.JButton usuario;
    private javax.swing.JButton usuario3;
    private javax.swing.JButton usuario5;
    // End of variables declaration//GEN-END:variables
}
