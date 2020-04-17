/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematecnogas;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import static java.time.Clock.system;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import servicios.conexion;
import static sistematecnogas.Login.fecha;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wilfredo Serrano
 */
public class Ingreso_PrecioActual_Combustible extends javax.swing.JFrame {
    conexion cc = new conexion();
    Connection cn = cc.conexion();
   
    
    //valores_conection
    
    private String driver="com.mysql.jc.jdbc.Driver";
    private String cadenaConexion="jdbc:mysql://localhost:3306/tecnogas"+"?useTimezone=true&serverTimezone=UTC";
    private String usuario="root";
    private String contraseña="1234";
    public Connection con;
    
    PreparedStatement ps;
    ResultSet rs;
    
    public Connection conexion(){
        try {
            con=DriverManager.getConnection(cadenaConexion,usuario,contraseña);
       //     JOptionPane.showMessageDialog(null,"Exito al establecer conexion con la base de datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se pudo establecer conexion con la base de datos"+ e.getMessage());
        }
        return con;
             
    }
    
    public void limpiarcajas(){
    precio_super.setText(null);
    precio_diesel.setText(null);
    };
    void cargar(String valor){
 
    String mostrar="SELECT `id_precio_combustible`, `precio`, `id_tipo_combustible`, `decha_precio_combustible` FROM `precio_combustible` WHERE `id_precio_combustible` LIKE '%"+valor+"%'";
    String []titulos={"Id de precio","Precio","Id tipo combustible","Fecha"};
    String []Registros=new String[6];
    DefaultTableModel model = new DefaultTableModel(null,titulos);
  
        try {
              Statement st = cn.createStatement();
              java.sql.ResultSet rs = st.executeQuery(mostrar);
              
              while(rs.next())
              {
                  Registros[0]= rs.getString("id_precio_combustible");
                  Registros[1]= rs.getString("precio");
                  Registros[2]= rs.getString("id_tipo_combustible");
                  Registros[3]= rs.getString("decha_precio_combustible");
                 
                           
                  model.addRow(Registros);
              }
              tabla.setModel(model);
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    
  }
   
    
    
    public Ingreso_PrecioActual_Combustible() {
        initComponents();
         cargar("");
        setLocationRelativeTo(null);
        
        fecha_pantalla.setText(fecha());
        setTitle("Precio Actual de Combustible");
       // setIconImage(new ImageIcon(getClass().getResource("/Imagen/logo_tecnogas_transp.png")).getImage());
        
    }
    
    public void ingresar(){
    try {
            String sql="INSERT INTO `precio_combustible` (`id_precio_combustible`, `precio`, `id_tipo_combustible`, `decha_precio_combustible`) VALUES (1, ?, ?, SYSDATE())";
            PreparedStatement pst  = cn.prepareStatement(sql);
            
  
            pst.setString(1, precio_super.getText());
            pst.setString(2, "1");
         
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro Guardado con Exito");
            cargar("");
            
           
        } catch (java.sql.SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Error: "+ex);
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
        public static String fecha(){
    Date fecha = new Date();
    SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
           return formatofecha.format(fecha);
    }
    
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fecha_pantalla = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        precio_diesel = new java.awt.TextField();
        precio_super = new java.awt.TextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        buttom_modificar = new java.awt.Button();
        buttom_limpiar = new java.awt.Button();
        buttom_insert_preciosuper = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        buscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Precio actual del combustible");

        jLabel2.setText("Ingrese los siguientes datos:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Precio combustible Super:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Precio combustible Diesel:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Fecha actual:");

        fecha_pantalla.setText("dd/MM/YYYY");

        jButton1.setText("Atrás");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Litro");

        jLabel9.setText("Litro");

        precio_super.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_superActionPerformed(evt);
            }
        });

        jLabel10.setText("L.");

        jLabel11.setText("L.");

        buttom_modificar.setLabel("Modificar");

        buttom_limpiar.setActionCommand("Limpiar");
        buttom_limpiar.setLabel("Limpiar");
        buttom_limpiar.setName(""); // NOI18N
        buttom_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttom_limpiarActionPerformed(evt);
            }
        });

        buttom_insert_preciosuper.setText("Inserte precio de Super");
        buttom_insert_preciosuper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttom_insert_preciosuperActionPerformed(evt);
            }
        });

        jButton2.setText("Inserte precio de Diesel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Buscar: ");

        jLabel12.setText("Id: ");

        id.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(335, 335, 335)
                                .addComponent(buttom_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttom_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(fecha_pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(precio_super, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel4))
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(precio_diesel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttom_insert_preciosuper, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fecha_pantalla)
                    .addComponent(jLabel12)
                    .addComponent(id))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel10))
                            .addComponent(precio_super, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(buttom_insert_preciosuper))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel11))
                            .addComponent(precio_diesel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttom_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttom_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        buttom_limpiar.getAccessibleContext().setAccessibleName("buttom_limpiar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
panelcentral botonatras = new panelcentral();
botonatras.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void buttom_insert_preciosuperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttom_insert_preciosuperActionPerformed
        ingresar();
        
    }//GEN-LAST:event_buttom_insert_preciosuperActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void buttom_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttom_limpiarActionPerformed
        limpiarcajas();
    }//GEN-LAST:event_buttom_limpiarActionPerformed

    private void precio_superActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_superActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_superActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        int seleccionar = tabla.rowAtPoint(evt.getPoint());

        precio_diesel.setText(String.valueOf(tabla.getValueAt(seleccionar,0)));
        precio_super.setText(String.valueOf(tabla.getValueAt(seleccionar,1)));
        

    }//GEN-LAST:event_tablaMouseClicked

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
          cargar(buscar.getText());
    }//GEN-LAST:event_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(Ingreso_PrecioActual_Combustible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso_PrecioActual_Combustible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso_PrecioActual_Combustible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso_PrecioActual_Combustible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso_PrecioActual_Combustible().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscar;
    private javax.swing.JButton buttom_insert_preciosuper;
    private java.awt.Button buttom_limpiar;
    private java.awt.Button buttom_modificar;
    private javax.swing.JLabel fecha_pantalla;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.TextField precio_diesel;
    private java.awt.TextField precio_super;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
