/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematecnogas;

/**
 *
 * @author Wilfredo Serrano
 */
public class Ingreso_Inventario_Combustible extends javax.swing.JFrame {

    /**
     * Creates new form Ingreso
     */
    public Ingreso_Inventario_Combustible() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        Label_Titulo2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Campo_Diesel_InvInicial = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        Campo_Diesel_Despachado = new javax.swing.JTextField();
        Campo_Diesel_InvFinal = new javax.swing.JTextField();
        Campo_Diesel_LitrosFaltantes = new javax.swing.JTextField();
        Label_Subtitulo6 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        Label_Subtitulo4 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Campo_Diesel_Recibido = new javax.swing.JTextField();
        Campo_Diesel_Pulgadas_Recibido = new javax.swing.JTextField();
        Campo_Diesel_Pulgadas_InvInicial = new javax.swing.JTextField();
        Campo_Diesel_Pulgadas_Despachado = new javax.swing.JTextField();
        Campo_Diesel_Pulgadas_InvFinal = new javax.swing.JTextField();
        Campo_Diesel_Pulgadas_LitrosFaltantes = new javax.swing.JTextField();
        Label_Subtitulo7 = new javax.swing.JLabel();
        Label_Subtitulo8 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Campo_Super_InvInicial = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        Campo_Super_Despachado = new javax.swing.JTextField();
        Campo_Super_InvFinal = new javax.swing.JTextField();
        Campo_Super_LitrosFaltantes = new javax.swing.JTextField();
        Campo_Super_Pulgadas_Recibido = new javax.swing.JTextField();
        Label_Subtitulo9 = new javax.swing.JLabel();
        Campo_Super_Pulgadas_InvInicial = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        Campo_Super_Pulgadas_Despachado = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        Campo_Super_Pulgadas_InvFinal = new javax.swing.JTextField();
        Label_Subtitulo5 = new javax.swing.JLabel();
        Campo_Super_Pulgadas_LitrosFaltantes = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        Label_Subtitulo10 = new javax.swing.JLabel();
        Campo_Super_Recibido = new javax.swing.JTextField();
        Label_Subtitulo11 = new javax.swing.JLabel();
        Label_Subtitulo12 = new javax.swing.JLabel();
        Campo_InventarioTotal = new javax.swing.JTextField();
        Label_Subtitulo13 = new javax.swing.JLabel();
        Campo_PulgadasTotal = new javax.swing.JTextField();
        Boton_IngresarPrecioCombustible1 = new javax.swing.JButton();
        Boton_ModificarPrecioCombustible1 = new javax.swing.JButton();
        Boton_EliminarPrecioCombustible1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label_Titulo2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Label_Titulo2.setText("Ingreso de Inventario de Combustible:");

        jLabel22.setText("Inventario Final");

        jLabel23.setText("Litros Faltantes");

        Label_Subtitulo6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_Subtitulo6.setText("Inventario");

        jLabel25.setText("Recibido");

        jLabel26.setText("Inventario Inicial");

        Label_Subtitulo4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_Subtitulo4.setText("Diesel");

        jLabel28.setText("Despachado");

        Label_Subtitulo7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_Subtitulo7.setText("Galones");

        Label_Subtitulo8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_Subtitulo8.setText("Pulgadas");

        jLabel29.setText("Inventario Final");

        jLabel30.setText("Litros Faltantes");

        Label_Subtitulo9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_Subtitulo9.setText("Inventario");

        jLabel32.setText("Recibido");

        jLabel33.setText("Inventario Inicial");

        Label_Subtitulo5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_Subtitulo5.setText("Super");

        jLabel35.setText("Despachado");

        Label_Subtitulo10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_Subtitulo10.setText("Galones");

        Label_Subtitulo11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_Subtitulo11.setText("Pulgadas");

        Label_Subtitulo12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_Subtitulo12.setText("Inventario Total:");

        Label_Subtitulo13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_Subtitulo13.setText("Pulgadas Total:");

        Campo_PulgadasTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_PulgadasTotalActionPerformed(evt);
            }
        });

        Boton_IngresarPrecioCombustible1.setText("Ingresar");

        Boton_ModificarPrecioCombustible1.setText("Modificar");

        Boton_EliminarPrecioCombustible1.setText("Eliminar");

        jButton1.setText("Módulo de Series");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Atrás");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Campo_Diesel_LitrosFaltantes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Campo_Diesel_InvInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_Subtitulo7)
                                    .addComponent(Campo_Diesel_Recibido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Campo_Diesel_Pulgadas_Recibido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Campo_Diesel_Pulgadas_InvInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Campo_Diesel_Pulgadas_LitrosFaltantes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Subtitulo8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Campo_Diesel_Despachado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Campo_Diesel_Pulgadas_Despachado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Campo_Diesel_InvFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Campo_Diesel_Pulgadas_InvFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(Label_Titulo2)
                    .addComponent(Label_Subtitulo6)
                    .addComponent(Label_Subtitulo4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_Subtitulo5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Boton_IngresarPrecioCombustible1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton_ModificarPrecioCombustible1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton_EliminarPrecioCombustible1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Campo_Super_InvInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(Label_Subtitulo9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_Subtitulo10)
                                    .addComponent(Campo_Super_Recibido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Subtitulo11)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Campo_Super_Pulgadas_InvInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Campo_Super_Pulgadas_Recibido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Label_Subtitulo13)
                                        .addGap(18, 18, 18)
                                        .addComponent(Campo_PulgadasTotal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Label_Subtitulo12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Campo_InventarioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Campo_Super_LitrosFaltantes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Campo_Super_Pulgadas_LitrosFaltantes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Campo_Super_Despachado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Campo_Super_InvFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Campo_Super_Pulgadas_Despachado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Campo_Super_Pulgadas_InvFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_Titulo2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(Label_Subtitulo5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Label_Subtitulo10, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Label_Subtitulo11, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Label_Subtitulo9)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(Label_Subtitulo4)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Label_Subtitulo7)
                                            .addComponent(Label_Subtitulo8)
                                            .addComponent(Label_Subtitulo6)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Boton_IngresarPrecioCombustible1)
                                .addGap(18, 18, 18)
                                .addComponent(Boton_ModificarPrecioCombustible1)
                                .addGap(18, 18, 18)
                                .addComponent(Boton_EliminarPrecioCombustible1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel25)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Campo_Diesel_Recibido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Campo_Diesel_Pulgadas_Recibido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel32)
                                        .addComponent(Campo_Super_Recibido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Campo_Super_Pulgadas_Recibido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel26)
                                    .addComponent(Campo_Diesel_InvInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Campo_Diesel_Pulgadas_InvInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33)
                                    .addComponent(Campo_Super_InvInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Campo_Super_Pulgadas_InvInicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Subtitulo12)
                            .addComponent(Campo_InventarioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Subtitulo13)
                            .addComponent(Campo_PulgadasTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(Campo_Diesel_Despachado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_Diesel_Pulgadas_Despachado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(Campo_Super_Despachado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_Super_Pulgadas_Despachado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(Campo_Diesel_InvFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Campo_Diesel_Pulgadas_InvFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Campo_Super_InvFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(Campo_Super_Pulgadas_InvFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(Campo_Diesel_LitrosFaltantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Campo_Diesel_Pulgadas_LitrosFaltantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(Campo_Super_LitrosFaltantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Campo_Super_Pulgadas_LitrosFaltantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Campo_PulgadasTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_PulgadasTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_PulgadasTotalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
Control_Combustible_Diario botonatras = new Control_Combustible_Diario ();
botonatras.setVisible(true); 
this.dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso_Inventario_Combustible().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_EliminarPrecioCombustible1;
    private javax.swing.JButton Boton_IngresarPrecioCombustible1;
    private javax.swing.JButton Boton_ModificarPrecioCombustible1;
    private javax.swing.JTextField Campo_Diesel_Despachado;
    private javax.swing.JTextField Campo_Diesel_InvFinal;
    private javax.swing.JTextField Campo_Diesel_InvInicial;
    private javax.swing.JTextField Campo_Diesel_LitrosFaltantes;
    private javax.swing.JTextField Campo_Diesel_Pulgadas_Despachado;
    private javax.swing.JTextField Campo_Diesel_Pulgadas_InvFinal;
    private javax.swing.JTextField Campo_Diesel_Pulgadas_InvInicial;
    private javax.swing.JTextField Campo_Diesel_Pulgadas_LitrosFaltantes;
    private javax.swing.JTextField Campo_Diesel_Pulgadas_Recibido;
    private javax.swing.JTextField Campo_Diesel_Recibido;
    private javax.swing.JTextField Campo_InventarioTotal;
    private javax.swing.JTextField Campo_PulgadasTotal;
    private javax.swing.JTextField Campo_Super_Despachado;
    private javax.swing.JTextField Campo_Super_InvFinal;
    private javax.swing.JTextField Campo_Super_InvInicial;
    private javax.swing.JTextField Campo_Super_LitrosFaltantes;
    private javax.swing.JTextField Campo_Super_Pulgadas_Despachado;
    private javax.swing.JTextField Campo_Super_Pulgadas_InvFinal;
    private javax.swing.JTextField Campo_Super_Pulgadas_InvInicial;
    private javax.swing.JTextField Campo_Super_Pulgadas_LitrosFaltantes;
    private javax.swing.JTextField Campo_Super_Pulgadas_Recibido;
    private javax.swing.JTextField Campo_Super_Recibido;
    private javax.swing.JLabel Label_Subtitulo10;
    private javax.swing.JLabel Label_Subtitulo11;
    private javax.swing.JLabel Label_Subtitulo12;
    private javax.swing.JLabel Label_Subtitulo13;
    private javax.swing.JLabel Label_Subtitulo4;
    private javax.swing.JLabel Label_Subtitulo5;
    private javax.swing.JLabel Label_Subtitulo6;
    private javax.swing.JLabel Label_Subtitulo7;
    private javax.swing.JLabel Label_Subtitulo8;
    private javax.swing.JLabel Label_Subtitulo9;
    private javax.swing.JLabel Label_Titulo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}