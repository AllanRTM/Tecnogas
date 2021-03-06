/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematecnogas;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
//import Atxy2k.CustomTextField.RestrictedTextField;
import javax.swing.table.DefaultTableModel;
import servicios.conexion;
import Atxy2k.CustomTextField.RestrictedTextField;

/**
 *
 * @author radioshack
 */
public class ingresarUsuario extends javax.swing.JFrame {

    Statement sent;

    public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }

    public ingresarUsuario() {
        initComponents();
        asterisco();
        txtID.setEnabled(false);
        lblFechaCreacion.setText(fecha());
        try {
            sent = cn.createStatement();
            String sql = "SELECT * FROM `estado` ";
            java.sql.Statement st = cn.createStatement();
            java.sql.ResultSet rs = sent.executeQuery(sql);
            comboEstado.addItem("seleccione estado");
            while (rs.next()) {

                this.comboEstado.addItem(rs.getString("estado"));
            }
        } catch (Exception e) {

        }

        try {
            sent = cn.createStatement();
            String sql = "SELECT * FROM `tipo_usuario` ";
            java.sql.Statement st = cn.createStatement();
            java.sql.ResultSet rs = sent.executeQuery(sql);
            comboTipo.addItem("seleccione tipo");
            while (rs.next()) {

                this.comboTipo.addItem(rs.getString("tipo"));
            }
        } catch (Exception e) {

        }
    }

    public void asterisco() {
        if (txtNombre.getText().isEmpty()) {
            asteriscoNombre.setText("*");
        } else {
            asteriscoNombre.setText(" ");
        }
        if (txtPassword.getText().isEmpty()) {
            asteriscoPassword.setText("*");
        } else {
            asteriscoPassword.setText(" ");
        }

        if (comboEstado.getSelectedItem() == comboEstado.getItemAt(0)) {
            asteriscoEstado.setText("*");
        } else {
            asteriscoEstado.setText("");
        }
        if (comboTipo.getSelectedItem() == comboTipo.getItemAt(0)) {
            asteriscoTipo.setText("*");
        } else {
            asteriscoTipo.setText("");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblFechaCreacion = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        comboEstado = new javax.swing.JComboBox<>();
        btnAtras = new javax.swing.JButton();
        btnMostrarTodo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        asteriscoNombre = new javax.swing.JLabel();
        asteriscoPassword = new javax.swing.JLabel();
        asteriscoTipo = new javax.swing.JLabel();
        asteriscoEstado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Contraseña:");

        jLabel3.setText("Tipo Usuario:");

        jLabel4.setText("Estado Usuario:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Registro de Usuario");

        jButton1.setText("Registrar Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("ID Usuario:");

        lblFechaCreacion.setText("dd/MM/YYYY");

        comboTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboTipoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comboTipoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                comboTipoKeyTyped(evt);
            }
        });

        comboEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comboEstadoKeyReleased(evt);
            }
        });

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnMostrarTodo.setText("Mostrar todos los usuarios");
        btnMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodoActionPerformed(evt);
            }
        });

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuario);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        asteriscoNombre.setBackground(new java.awt.Color(255, 0, 0));
        asteriscoNombre.setForeground(new java.awt.Color(255, 0, 0));
        asteriscoNombre.setText("jlabel");

        asteriscoPassword.setBackground(new java.awt.Color(255, 0, 0));
        asteriscoPassword.setForeground(new java.awt.Color(255, 0, 0));
        asteriscoPassword.setText("jLabel7");

        asteriscoTipo.setBackground(new java.awt.Color(255, 0, 0));
        asteriscoTipo.setForeground(new java.awt.Color(255, 0, 0));
        asteriscoTipo.setText("jLabel9");

        asteriscoEstado.setBackground(new java.awt.Color(255, 0, 0));
        asteriscoEstado.setForeground(new java.awt.Color(255, 0, 0));
        asteriscoEstado.setText("jLabel0");

        jLabel6.setText("Buscar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblFechaCreacion)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel1))
                                            .addGap(33, 33, 33)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(asteriscoPassword)
                                            .addComponent(asteriscoNombre)
                                            .addComponent(asteriscoTipo))
                                        .addGap(72, 72, 72)
                                        .addComponent(jButton1))
                                    .addComponent(asteriscoEstado)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnAtras)
                                        .addGap(252, 252, 252)
                                        .addComponent(btnLimpiar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnModificar))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrarTodo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblFechaCreacion))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(asteriscoNombre))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(asteriscoPassword))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(asteriscoTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(asteriscoEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(btnModificar)
                    .addComponent(btnLimpiar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try {
            String sql = "INSERT INTO `usuarios` (`id_usuario`, `nombre`, `contraseña`, `tipo`, `estado`, `fecha_creacion_usuario`, `fecha_actualizacion`) VALUES (NULL, ?, MD5(?), ?, ?, SYSDATE(), SYSDATE())";
            PreparedStatement pst = cn.prepareStatement(sql);

            if (txtNombre.getText().isEmpty() || txtPassword.getText().isEmpty() || (comboEstado.getSelectedItem()==comboEstado.getItemAt(0)) || (comboTipo.getSelectedItem()==comboEstado.getItemAt(0))) {
                JOptionPane.showMessageDialog(null, "No se permiten campos vacios","Error",JOptionPane.ERROR_MESSAGE);
            } else {

                pst.setString(1, txtNombre.getText());
                pst.setString(2, txtPassword.getText());
                String value = comboTipo.getSelectedItem().toString();
                pst.setString(3, value);
                String value1 = comboEstado.getSelectedItem().toString();
                pst.setString(4, value1);
                if (txtNombre.getText().length() < 3 || txtPassword.getText().length() < 3) {
                    JOptionPane.showMessageDialog(null, "Los campos tienen que tener mas de 3 caracteres","Error",JOptionPane.ERROR_MESSAGE);
                } else {
                    if (txtNombre.getText().length() > 20 || txtPassword.getText().length() > 20) {
                        JOptionPane.showMessageDialog(null, "Los campos no pueden tener mas de 20 caracteres","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    int n = pst.executeUpdate();
                    if (n > 0) {
                        JOptionPane.showMessageDialog(null, "datos guardados");
                    }
                }
            }
        } catch (/*java.sql.SQLException*/Exception e) {
            JOptionPane.showMessageDialog(rootPane, "INGRESA TODOS LOS VALORES CORRECTAMENTE","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodoActionPerformed
        // TODO add your handling code here:
        String mostrar = "SELECT `id_usuario`, `nombre`, `contraseña`, `tipo`, `estado`, `fecha_creacion_usuario`, `fecha_actualizacion` FROM `usuarios` WHERE 1";
        String[] titulos = {"ID usudario", "Nombre", "Contraseña", "Tipo de usuario", "Estado del usuario", "Fecha de creacion", "Fecha de actualizacion"};
        String[] Registros = new String[7];
        DefaultTableModel model = new DefaultTableModel(null, titulos);

        try {
            Statement st = cn.createStatement();
            java.sql.ResultSet rs = st.executeQuery(mostrar);
            while (rs.next()) {
                Registros[0] = rs.getString("id_usuario");
                Registros[1] = rs.getString("nombre");
                Registros[2] = rs.getString("contraseña");
                Registros[3] = rs.getString("tipo");
                Registros[4] = rs.getString("estado");
                Registros[5] = rs.getString("fecha_creacion_usuario");
                Registros[6] = rs.getString("fecha_actualizacion");
                model.addRow(Registros);
            }
            tblUsuario.setModel(model);
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMostrarTodoActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        this.dispose();
        panelcentral ingresar = new panelcentral();
        ingresar.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "UPDATE `usuarios` SET `nombre` = '" + (txtNombre.getText()) + "', `contraseña` = MD5('" + (txtPassword.getText()) + "'), `tipo` = '" + comboTipo.getSelectedItem().toString() + "', `estado` = '" + comboEstado.getSelectedItem().toString() + "', `fecha_actualizacion` = SYSDATE() WHERE `usuarios`.`id_usuario` = '" + txtID.getText() + "'";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "LOS DATOS HAN SIDO MODIFICADOS");
            //cargar(""); 
        } catch (java.sql.SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "INGRESA TODOS LOS DATOS CORRECTAMENTE","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtID.setText("");
        txtNombre.setText("");
        txtPassword.setText("");
        txtBuscar.setText("");
        comboEstado.setSelectedIndex(0);
        comboTipo.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuarioMouseClicked
        // TODO add your handling code here:
        int seleccionar = tblUsuario.rowAtPoint(evt.getPoint());
        txtID.setText(String.valueOf(tblUsuario.getValueAt(seleccionar, 0)));
        txtNombre.setText(String.valueOf(tblUsuario.getValueAt(seleccionar, 1)));
        txtPassword.setText(String.valueOf(tblUsuario.getValueAt(seleccionar, 2)));
        comboTipo.setSelectedItem(String.valueOf(tblUsuario.getValueAt(seleccionar, 3)));
        comboEstado.setSelectedItem(String.valueOf(tblUsuario.getValueAt(seleccionar, 4)));
    }//GEN-LAST:event_tblUsuarioMouseClicked

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    void cargar() {
        String mostrar = "SELECT `id_usuario`, `nombre`, `contraseña`, `tipo`, `estado`, `fecha_creacion_usuario`, `fecha_actualizacion` FROM `usuarios` WHERE `nombre` LIKE '%" + txtBuscar.getText() + "%'" + "OR `id_usuario` LIKE '%" + txtBuscar.getText() + "%'";
        String[] titulos = {"ID usudario", "Nombre", "contraseña", "tipo de usuario", "estado del usuario", "fecha de creacion", "fecha de actualizacion"};
        String[] Registros = new String[7];
        DefaultTableModel model = new DefaultTableModel(null, titulos);

        try {
            Statement st = cn.createStatement();
            java.sql.ResultSet rs = st.executeQuery(mostrar);
            while (rs.next()) {
                Registros[0] = rs.getString("id_usuario");
                Registros[1] = rs.getString("nombre");
                Registros[2] = rs.getString("contraseña");
                Registros[3] = rs.getString("tipo");
                Registros[4] = rs.getString("estado");
                Registros[5] = rs.getString("fecha_creacion_usuario");
                Registros[6] = rs.getString("fecha_actualizacion");
                model.addRow(Registros);
            }
            tblUsuario.setModel(model);
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
        cargar();
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:
        cargar();
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // TODO add your handling code here:
        // cargar(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:
        asterisco();
    }//GEN-LAST:event_txtNombreKeyReleased

    private void comboTipoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboTipoKeyReleased
        asterisco();        // TODO add your handling code here:
       
    }//GEN-LAST:event_comboTipoKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        asterisco();
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void comboEstadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboEstadoKeyReleased
        // TODO add your handling code here:
        asterisco();
    }//GEN-LAST:event_comboEstadoKeyReleased

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
     
        if (evt.getKeyChar() >= 33 && evt.getKeyChar() <= 64
                || evt.getKeyChar() >= 91 && evt.getKeyChar() <= 96
                || evt.getKeyChar() >= 123 && evt.getKeyChar() <= 255) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo se permiten letras");
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void comboTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboTipoKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_comboTipoKeyPressed

    private void comboTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboTipoKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_comboTipoKeyTyped
    /**
     *
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
            java.util.logging.Logger.getLogger(ingresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingresarUsuario().setVisible(true);
            }
        });
    }

    conexion cc = new conexion();
    Connection cn = cc.conexion();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asteriscoEstado;
    private javax.swing.JLabel asteriscoNombre;
    private javax.swing.JLabel asteriscoPassword;
    private javax.swing.JLabel asteriscoTipo;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrarTodo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFechaCreacion;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
