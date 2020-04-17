/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematecnogas;

import Atxy2k.CustomTextField.RestrictedTextField;
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
      validar();
      Llenar();
     
      
          validacion1.setVisible(false);
    validacion2.setVisible(false);
    txtactualizacion.setVisible(false);
    txtcreacion.setVisible(false);
      
      //categoria
            try{
        sent=cn.createStatement();
        String sql="SELECT * FROM `categoria_productos` ";
             java.sql.Statement st=cn.createStatement();
        java.sql.ResultSet rs=sent.executeQuery(sql);
        cmbcategoria.addItem("seleccione categoria");
        while(rs.next()){
         
            this.cmbcategoria.addItem(rs.getString("categoria"));
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
         
            this.cmbestado.addItem(rs.getString("estado"));
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
         
            this.cmbusuario.addItem(rs.getString("nombre"));
        }
        }catch(Exception e){
            
        }      
     
    }
    
     public void limita(){
    txtnombre.setDocument(new limitar(txtnombre,3,20));
    txtprecio.setDocument(new limitar(txtprecio,1,12));
     }
    
    
    void validar(){
    RestrictedTextField limitar0 =new RestrictedTextField(txtnombre);
    limitar0.setLimit(11);
    
    
    RestrictedTextField limitar1 =new RestrictedTextField(txtprecio);
    limitar1.setLimit(11);
    
    }
    

    
    
     void Limpiar(){
         txtnombre.setText("");
        txtid.setText("");
        txtprecio.setText("");
    }
    
    void Habilitar(){
        txtnombre.setEditable(true);
       
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
        jLabel6 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtbuscar = new javax.swing.JTextField();
        cmbestado = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbusuario = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cmbcategoria = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaproductos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        txtid = new javax.swing.JLabel();
        leyenda1 = new javax.swing.JLabel();
        leyenda2 = new javax.swing.JLabel();
        btnatras = new javax.swing.JButton();
        validacion1 = new javax.swing.JLabel();
        validacion2 = new javax.swing.JLabel();
        txtactualizacion = new javax.swing.JLabel();
        txtcreacion = new javax.swing.JLabel();
        btnmostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Productos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nombre del producto:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Precio:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Buscar:");

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbuscarKeyPressed(evt);
            }
        });

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
                "Nombre", "Id de Producto", "Estado", "Categoria", "Precio", "Fecha de Creacion", "Fecha de Actualiacion ", "Usuario"
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

        btnguardar.setText("Ingresar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnnuevo.setText("Limpiar");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        leyenda1.setForeground(new java.awt.Color(255, 0, 51));
        leyenda1.setText(". . .");

        leyenda2.setForeground(new java.awt.Color(255, 0, 51));
        leyenda2.setText(". . .");

        btnatras.setText("Atras");
        btnatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasActionPerformed(evt);
            }
        });

        validacion1.setForeground(new java.awt.Color(255, 0, 51));
        validacion1.setText("*");

        validacion2.setForeground(new java.awt.Color(255, 0, 51));
        validacion2.setText("*");

        btnmostrar.setText("Mostrar Todos");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(validacion1))
                                            .addComponent(leyenda1))
                                        .addGap(72, 72, 72)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(leyenda2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(validacion2)))
                                                .addGap(90, 90, 90)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtcreacion)
                                                    .addComponent(txtactualizacion)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnmostrar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(49, 49, 49)
                                    .addComponent(btnatras, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(136, 136, 136)
                                    .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(txtactualizacion)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(validacion1)
                            .addComponent(validacion2)
                            .addComponent(txtcreacion)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leyenda1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnguardar))))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnmostrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnmodificar)
                            .addComponent(btnnuevo)
                            .addComponent(btnatras))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leyenda2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
int row=tablaproductos.getSelectedRow();
txtid.setText(tablaproductos.getValueAt(row, 0).toString());   
txtnombre.setText(tablaproductos.getValueAt(row, 1).toString());
txtprecio.setText(tablaproductos.getValueAt(row, 2).toString());
txtcreacion.setText(tablaproductos.getValueAt(row, 3).toString());
txtactualizacion.setText(tablaproductos.getValueAt(row, 4).toString());
cmbcategoria.setSelectedItem(tablaproductos.getValueAt(row,5).toString());
cmbestado.setSelectedItem(tablaproductos.getValueAt(row,6).toString());
cmbusuario.setSelectedItem(tablaproductos.getValueAt(row,7).toString());
    }//GEN-LAST:event_tablaproductosMouseClicked

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
   try{
         String sql="INSERT INTO `productos`(`nombre_producto`,`id_producto`,`precio_producto`,`fecha_creacion`,`fecha_actualizacion`,`id_categoria_productos`,`estado_productos`,`id_usuario`) VALUES (?,?,?,SYSDATE(),SYSDATE(),?,?,?)"; 
         PreparedStatement ps=cn.prepareCall(sql);
         ps.setString(1,txtnombre.getText());
         ps.setString(2,null);
         ps.setString(3,txtprecio.getText());

           
           
         
         ps.setInt(4,cmbcategoria.getSelectedIndex());
        
         ps.setInt(5,cmbestado.getSelectedIndex());
        
          ps.setInt(6,cmbusuario.getSelectedIndex());
         int n=ps.executeUpdate();
         if(n>0)
             JOptionPane.showMessageDialog(null, "datos guardados");
         
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error"+ e.getMessage());
        }
        Llenar();
      
        if(txtnombre.getText().equals("")){
            validacion1.setVisible(true);
        }else{
            validacion1.setVisible(false);
        }
         if(txtprecio.getText().equals("")){
            validacion2.setVisible(true);
        }else{
             validacion2.setVisible(false);
         }
        
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasActionPerformed
        this.dispose();
        panelcentral ingresar = new panelcentral();
                    ingresar.setVisible(true);
    }//GEN-LAST:event_btnatrasActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        try{
        String sql="UPDATE `productos` SET `nombre_producto`=?,`precio_producto`=?,`fecha_actualizacion`=SYSDATE(),`id_categoria_productos`=?,"
                + "`estado_productos`=?,`id_usuario`=? WHERE `id_producto`=?" ;
        int fila=tablaproductos.getSelectedRow();
        String dao=(String)tablaproductos.getValueAt(fila,0);
         PreparedStatement ps=cn.prepareStatement(sql);
         
      ps.setString(1,txtnombre.getText());
         ps.setString(2,txtprecio.getText());
         
         ps.setInt(3,cmbcategoria.getSelectedIndex());
         ps.setInt(4,cmbestado.getSelectedIndex());
         ps.setInt(5,cmbusuario.getSelectedIndex());
         
         ps.setString(6,dao);
         int n=ps.executeUpdate();
         if(n>0){
            
             Llenar();
          JOptionPane.showMessageDialog(null,"datos modificados");
      }
         
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"error"+e.getMessage());
    }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
         Limpiar();  
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            leyenda1.setText("Solo Letras");
        }
        
         if(evt.getKeyChar()>=33 && evt.getKeyChar()<=64
        || evt.getKeyChar()>=91 && evt.getKeyChar()<=96
        || evt.getKeyChar()>=123 && evt.getKeyChar()<=208
        || evt.getKeyChar()>=210 && evt.getKeyChar()<=240
        || evt.getKeyChar()>=242 && evt.getKeyChar()<=255){
            evt.consume();
            leyenda1.setText("solo letras");
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            leyenda2.setText("Solo Numeros");
        }   
        
    if(!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!='.' ){
            evt.consume();
  }        if(evt.getKeyChar()=='.'&&txtprecio.getText().contains(".")){
          evt.consume();
 }
    }//GEN-LAST:event_txtprecioKeyTyped

    private void txtbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyPressed
        String[] titulos={"id_producto","nombre_producto","precio_producto","fecha_creacion","fecha_actualizacion","id_categoria_productos","estado_productos","id_usuario"};
    String[] registros=new String[50];
    String sql="SELECT * FROM `productos` WHERE id_producto LIKE '%"+txtbuscar.getText()+"%' "
    +"OR nombre_producto LIKE '%"+txtbuscar.getText()+"%'";
            
    
    model= new DefaultTableModel(null,titulos);
   
    try{
        java.sql.Statement st = (java.sql.Statement) cn.createStatement();
        java.sql.ResultSet rs = st.executeQuery(sql);
        while(rs.next()){ 
            registros[0]=rs.getString("id_producto");
            registros[1]=rs.getString("nombre_producto");
            registros[2]=rs.getString("precio_producto");
            registros[3]=rs.getString("fecha_creacion");
            registros[4]=rs.getString("fecha_actualizacion");
            registros[5]=rs.getString("id_categoria_productos");
            registros[6]=rs.getString("estado_productos");
            registros[7]=rs.getString("id_usuario");
              model.addRow(registros);
        }
          tablaproductos.setModel(model);
    }catch(java.sql.SQLException ex){
       JOptionPane.showMessageDialog(null,ex);
    }
    
    }//GEN-LAST:event_txtbuscarKeyPressed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
               String mostrar="SELECT `id_producto`,`nombre_producto`,`precio_producto`,`fecha_creacion`,`fecha_actualizacion`,`id_categoria_productos`,`estado_productos`,`id_usuario` FROM  `productos`WHERE 1";
        
        
            String [] titulos={"id_producto","nombre_producto","precio_producto","fecha_creacion","fecha_actualizacion","id_categoria_productos","estado_productos","id_usuario"};
            model=new DefaultTableModel(null, titulos);
            String fila []= new String [8];
     try{
            
            sent=cn.createStatement();
            java.sql.ResultSet rs=sent.executeQuery(mostrar);
            
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
    }//GEN-LAST:event_btnmostrarActionPerformed

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
    private javax.swing.JButton btnatras;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JComboBox<String> cmbcategoria;
    private javax.swing.JComboBox<String> cmbestado;
    private javax.swing.JComboBox<String> cmbusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel leyenda1;
    private javax.swing.JLabel leyenda2;
    private javax.swing.JTable tablaproductos;
    private javax.swing.JLabel txtactualizacion;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JLabel txtcreacion;
    private javax.swing.JLabel txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JLabel validacion1;
    private javax.swing.JLabel validacion2;
    // End of variables declaration//GEN-END:variables
}
