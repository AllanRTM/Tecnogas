/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematecnogas;

import java.sql.*;
import java.beans.Statement;
import servicios.conexion;
import javax.swing.table.DefaultTableModel;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;


/**
 *
 * @author Wilfredo Serrano
 */
public class Productos extends javax.swing.JFrame {

    
    conexion cc=new conexion();
    Connection cn = cc.conexion();
     java.sql.Statement sent;
       DefaultTableModel model;
       
     
    public Productos() {
      initComponents();
      
      
      //categoria
            try{
        sent=cn.createStatement();
        String sql="SELECT * FROM `categoria_productos` ";
             java.sql.Statement st=cn.createStatement();
        java.sql.ResultSet rs=sent.executeQuery(sql);
        cmbcategoria.addItem("seleccione categoria");
        while(rs.next()){
         
            this.cmbcategoria.addItem(rs.getString("id_categoria_productos"));
        }
        }catch(Exception e){
            
        }
            
       //estado

                    try{
        sent=cn.createStatement();
        String sql="SELECT * FROM `estado` ";
             java.sql.Statement st=cn.createStatement();
        java.sql.ResultSet rs=sent.executeQuery(sql);
        cmbestado.addItem("seleccione estado");
        while(rs.next()){
         
            this.cmbestado.addItem(rs.getString("id_estado"));
        }
        }catch(Exception e){
            
        }          
            
                    
                   try{
        sent=cn.createStatement();
        String sql="SELECT * FROM `usuarios` ";
             java.sql.Statement st=cn.createStatement();
        java.sql.ResultSet rs=sent.executeQuery(sql);
        cmbusuario.addItem("seleccione usaurio");
        while(rs.next()){
         
            this.cmbusuario.addItem(rs.getString("id_usuario"));
        }
        }catch(Exception e){
            
        }      
     
    }

    
     void Deshabilitar(){
        txtnombre.setEditable(false);
        txtid.setEditable(false);
        txtprecio.setEditable(false);    
    }
    
    
     void Limpiar(){
         txtnombre.setText("");
        txtid.setText("");
        txtprecio.setText("");
    }
    
    void Habilitar(){
        txtnombre.setEditable(true);
        txtid.setEditable(true);
        txtprecio.setEditable(true);
        txtnombre.requestFocus();
    }
    
    
    
        void Llenar(){
        try{
           
            String [] titulos={"id_producto","nombre_producto","precio_producto","fecha_creacion","fecha_actualizacion","id_categoria_productos","estado_productos","id_usuario"};
            String sql="select * from productos";
            model=new DefaultTableModel(null, titulos);
            sent=cn.createStatement();
            java.sql.ResultSet rs=sent.executeQuery(sql);
            
            String fila []= new String [8];
            while(rs.next()){
            fila[0]=rs.getString("id_producto");
            fila[1]=rs.getString("nombre_producto");
            fila[2]=rs.getString("precio_producto");
            fila[3]=rs.getString("fecha_creacion");
            fila[4]=rs.getString("fecha_Actualizacion");
            fila[5]=rs.getString("id_categoria_productos");
            fila[6]=rs.getString("estado_productos");
            fila[7]=rs.getString("id_usuario");
            

               model.addRow(fila);
            }tablaproductos.setModel(model);
            
        }catch(Exception e){
            e.printStackTrace();
               
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtcreacion = new javax.swing.JTextField();
        txtactualizacion = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        cmbestado = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbusuario = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cmbcategoria = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaproductos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Productos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nombre del producto:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Precio:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Fecha de ingreso del producto:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Fecha de modificación del producto:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Buscar:");

        jTextField5.setText("jTextField5");

        cmbestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbestadoActionPerformed(evt);
            }
        });

        jLabel9.setText("estado del producto:");

        cmbusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbusuarioActionPerformed(evt);
            }
        });

        jLabel10.setText("Usuario:");

        cmbcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcategoriaActionPerformed(evt);
            }
        });

        jLabel11.setText("categoria del producto:");

        tablaproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre_Producto", "Id_Producto", "Id_Estado", "Id_Categoria", "Precio", "Fecha_Actualizacion", "Fecha_Creacion", "Id_Usuarios"
            }
        ));
        tablaproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaproductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaproductos);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("ID del producto:");

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnmodificar.setText("Modificar");

        btneliminar.setText("Eliminar");

        btnnuevo.setText("Nuevo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(46, 46, 46)
                                        .addComponent(txtcreacion))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtactualizacion, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(101, 101, 101)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtnombre)
                                            .addComponent(txtprecio)
                                            .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(176, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnguardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnmodificar)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnnuevo)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtcreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtactualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnmodificar)
                    .addComponent(btneliminar)
                    .addComponent(btnnuevo))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbestadoActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_cmbestadoActionPerformed

    private void cmbusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbusuarioActionPerformed

    private void cmbcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbcategoriaActionPerformed

    private void tablaproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaproductosMouseClicked
   if (evt.getButton()==1){
    try{
        Habilitar();
        int fila=tablaproductos.getSelectedRow();
        String dao=(String)tablaproductos.getValueAt(fila,0);
        String sql="";
        PreparedStatement ps=cn.prepareCall(sql);
        ps.setString(1,txtnombre.getText());
        ps.setString(2,txtid.getText());
        ps.setString(5,txtprecio.getText()); 
         ps.setString(5,txtcreacion.getText());
         ps.setString(5,txtactualizacion.getText());
        
                 String value=cmbcategoria.getSelectedItem().toString();
         ps.setString(4,value);
        
         String value1=cmbestado.getSelectedItem().toString();
         ps.setString(3,value1);
         
         
                           String value2=cmbusuario.getSelectedItem().toString();
         ps.setString(8,value2);
       
     
        
        
        
    }catch(Exception e){
        e.printStackTrace();
    }
}
    }//GEN-LAST:event_tablaproductosMouseClicked

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
   try{
         String sql="INSERT INTO `productos`(`nombre_producto`,`id_producto`,`precio_producto`,`fecha_creacion`,`fecha_actualizacion`,`id_categoria_productos`,`estado_productos`,`id_usuario`) VALUES (?,?,?,?,?,?,?,?)"; 
         PreparedStatement ps=cn.prepareCall(sql);
         ps.setString(1,txtnombre.getText());
         ps.setString(2,txtid.getText());
         ps.setString(3,txtprecio.getText());
         ps.setString(4,txtcreacion.getText());
           
        ps.setString(5,txtactualizacion.getText());
         
         
         String value=cmbcategoria.getSelectedItem().toString();
         ps.setString(6,value);
         String value1=cmbestado.getSelectedItem().toString();
         ps.setString(7,value1);
         String value2=cmbusuario.getSelectedItem().toString();
         ps.setString(8,value2);

         
         int n=ps.executeUpdate();
         if(n>0)
             JOptionPane.showMessageDialog(null, "datos guardados");
         
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error"+ e.getMessage());
        }
        Llenar();
        Limpiar();
    
                 
    }//GEN-LAST:event_btnguardarActionPerformed

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JComboBox<String> cmbcategoria;
    private javax.swing.JComboBox<String> cmbestado;
    private javax.swing.JComboBox<String> cmbusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tablaproductos;
    private javax.swing.JTextField txtactualizacion;
    private javax.swing.JTextField txtcreacion;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
