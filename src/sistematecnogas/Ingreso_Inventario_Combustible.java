/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematecnogas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import servicios.conexion;

/**
 *
 * @author Wilfredo Serrano
 */
public class Ingreso_Inventario_Combustible extends javax.swing.JFrame {

    
     conexion cc = new conexion();
        Connection cn = cc.conexion();
        
    
    //valores_conection
    
    private String driver="com.mysql.jc.jdbc.Driver";
    private String cadenaConexion="jdbc:mysql://localhost:3306/gasolinera"+"?useTimezone=true&serverTimezone=UTC";
    private String usuario="root";
    private String contraseña="onepiece";
    public Connection con;
    
    PreparedStatement ps;
    ResultSet rs;
    void cargar(String valor){
    /*String mostrar="SELECT * FROM `categoria` WHERE '%"+valor+"%'";*/
    String mostrar="SELECT `id_inventario`, `recibido`, `recibido_plg3`, `inventario_inicial`, `inventario_inicial_plg3`, `litros_faltantes`, `litros_faltantes_plg3`, `despacho`, `despacho_plg3`, `inventario_final`, `inventario_final_plg3`, `id_usuario`, `id_tipo_combustible` FROM `inventario_combustible` WHERE `id_inventario` ="+valor;
    String []titulos={"Id de proveedor","Nombre de proveedor","telefono","correo","direccion","id categoria","despacho","holA"};
    String []Registros=new String[13];
    DefaultTableModel model = new DefaultTableModel(null,titulos);
  
        try {
              Statement st = cn.createStatement();
              java.sql.ResultSet rs = st.executeQuery(mostrar);
              
              while(rs.next())
              {
                  Registros[0]= rs.getString("id_inventario");
                  Registros[1]= rs.getString("recibido");
                  Registros[2]= rs.getString("recibido_plg3");
                  Registros[3]= rs.getString("inventario_inicial");
                  Registros[4]= rs.getString("inventario_inicial_plg3");
                  Registros[5]= rs.getString("litros_faltantes");
                  Registros[6]= rs.getString("litros_faltantes_plg3");
                  Registros[7]= rs.getString("despacho");
                  Registros[8]= rs.getString("despacho_plg3");
                  Registros[9]= rs.getString("inventario_final");
                  Registros[10]= rs.getString("inventario_final_plg3");
                  Registros[11]= rs.getString("id_usuario");
                  Registros[12]= rs.getString("id_tipo_combustible");
                  
                           
                  model.addRow(Registros);
              }
              tabla_inventario.setModel(model);
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    
  }
    
    public Connection conexion(){
        try {
            con=DriverManager.getConnection(cadenaConexion,usuario,contraseña);
       //     JOptionPane.showMessageDialog(null,"Exito al establecer conexion con la base de datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se pudo establecer conexion con la base de datos"+ e.getMessage());
        }
        return con;
             
    }
    
    public void limpiarcajas1(){
    //limpiar cajas diesel
    caja_recibido_diesel.setText(null);
    caja_invinicial_diesel.setText(null);
    caja_despa_diesel.setText(null);
    caja_invfinal_diesel.setText(null);
    caja_litfaltantes_diesel.setText(null);
    recibido_litro_diesel.setText(null);
    invinicial_litro_diesel.setText(null);
    despachado_litro_diesel.setText(null);
    invfinal_litro_diesel.setText(null);
    litfaltantes_litro_diesel.setText(null);
    caja_plg_recibido.setText(null);
    caja_plg_invinicial.setText(null);
    caja_plg_despachado.setText(null);
    caja_plg_invfinal.setText(null);
    caja_plg_litfaltantes.setText(null);
    
    };
    
    public void limpiarcajas2(){
    //limpiar cajas super
    caja1_super.setText(null);
    caja2_super.setText(null);
    caja3_super.setText(null);
    caja4_super.setText(null);
    caja5_super.setText(null);
    caja1_litro.setText(null);
    caja2_litro.setText(null);
    caja3_litro.setText(null);
    caja4_litro.setText(null);
    caja5_litro.setText(null);
    caja1_plg_super.setText(null);
    caja2_plg_super.setText(null);
    caja3_plg_super.setText(null);
    caja4_plg_super.setText(null);
    caja5_plg_super.setText(null);
    
    };
    
    
    /**
     * Creates new form Ingreso_Inventario_Combustible
     */
    public Ingreso_Inventario_Combustible() {
        initComponents();
        
        setTitle("Inventario de combustible");
        //setIconImage(new ImageIcon(getClass().getResource("/Imagen/logo_tecnogas_transp.png")).getImage());
        fecha_pantalla1.setText(fecha());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField31 = new java.awt.TextField();
        jLabel12 = new javax.swing.JLabel();
        fecha_pantalla = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        caja_recibido_diesel = new java.awt.TextField();
        recibido_litro_diesel = new java.awt.TextField();
        caja_plg_recibido = new java.awt.TextField();
        caja_invinicial_diesel = new java.awt.TextField();
        invinicial_litro_diesel = new java.awt.TextField();
        caja_plg_invinicial = new java.awt.TextField();
        caja_despa_diesel = new java.awt.TextField();
        despachado_litro_diesel = new java.awt.TextField();
        caja_plg_despachado = new java.awt.TextField();
        jLabel8 = new javax.swing.JLabel();
        caja_invfinal_diesel = new java.awt.TextField();
        invfinal_litro_diesel = new java.awt.TextField();
        caja_plg_invfinal = new java.awt.TextField();
        caja_litfaltantes_diesel = new java.awt.TextField();
        jLabel10 = new javax.swing.JLabel();
        litfaltantes_litro_diesel = new java.awt.TextField();
        caja_plg_litfaltantes = new java.awt.TextField();
        jLabel11 = new javax.swing.JLabel();
        modificar_insert = new java.awt.Button();
        ingresar_diesel = new java.awt.Button();
        atras = new java.awt.Button();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        textField32 = new java.awt.TextField();
        textField33 = new java.awt.TextField();
        Conversion_button = new java.awt.Button();
        Conversion_button1 = new java.awt.Button();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        caja2_super = new java.awt.TextField();
        caja2_litro = new java.awt.TextField();
        caja2_plg_super = new java.awt.TextField();
        caja3_super = new java.awt.TextField();
        caja3_litro = new java.awt.TextField();
        caja3_plg_super = new java.awt.TextField();
        caja4_super = new java.awt.TextField();
        caja4_litro = new java.awt.TextField();
        caja4_plg_super = new java.awt.TextField();
        caja5_super = new java.awt.TextField();
        caja5_litro = new java.awt.TextField();
        caja5_plg_super = new java.awt.TextField();
        caja1_super = new java.awt.TextField();
        caja1_litro = new java.awt.TextField();
        caja1_plg_super = new java.awt.TextField();
        ingresar_diesel2 = new java.awt.Button();
        jLabel13 = new javax.swing.JLabel();
        fecha_pantalla1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_inventario = new javax.swing.JTable();
        cargar_tabla = new java.awt.Button();

        textField31.setText("textField31");

        jLabel12.setText("Fecha:");

        fecha_pantalla.setText("dd-MM-YYYY");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titulo1.setForeground(new java.awt.Color(0, 51, 153));
        titulo1.setText("Ingreso de Inventario de Combustible");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Diesel");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Inventario");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Galon");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Litro");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Plg3");

        jLabel6.setText("Inv. Inicial");

        jLabel7.setText("Despachado");

        jLabel9.setText("Recibido     ");

        caja_recibido_diesel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja_recibido_dieselActionPerformed(evt);
            }
        });

        recibido_litro_diesel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recibido_litro_dieselActionPerformed(evt);
            }
        });

        caja_plg_recibido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                caja_plg_recibidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja_plg_recibidoKeyTyped(evt);
            }
        });

        jLabel8.setText("Lts. Faltantes");

        jLabel10.setText("Inv. Final");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Super");

        modificar_insert.setLabel("Modificar");
        modificar_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_insertActionPerformed(evt);
            }
        });

        ingresar_diesel.setLabel("Ingresar");
        ingresar_diesel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar_dieselActionPerformed(evt);
            }
        });

        atras.setLabel("Atras");
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

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Inventario Total:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Plg3 Totales:");

        Conversion_button.setLabel("Conversion");
        Conversion_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Conversion_buttonActionPerformed(evt);
            }
        });

        Conversion_button1.setLabel("Conversion");
        Conversion_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Conversion_button1ActionPerformed(evt);
            }
        });

        jLabel23.setText("Lts. Faltantes");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Inventario");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Galon");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Litro");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Plg3");

        jLabel28.setText("Inv. Inicial");

        jLabel29.setText("Inv. Final");

        jLabel30.setText("Despachado");

        jLabel31.setText("Recibido     ");

        caja2_plg_super.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja2_plg_superActionPerformed(evt);
            }
        });

        caja1_super.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja1_superActionPerformed(evt);
            }
        });

        caja1_litro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja1_litroActionPerformed(evt);
            }
        });

        caja1_plg_super.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                caja1_plg_superKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja1_plg_superKeyTyped(evt);
            }
        });

        ingresar_diesel2.setLabel("Ingresar");
        ingresar_diesel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar_diesel2ActionPerformed(evt);
            }
        });

        jLabel13.setText("Fecha:");

        fecha_pantalla1.setText("dd-MM-YYYY");

        tabla_inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Galones Recibidos", "Recibidos in³", "Inventario Inicial", "Inventario Inicial in³", "Litros Faltantes", "Litros Faltantes in³", "Despachado", "Despachado in³", "Inventario Final", "Inventario Final in³", "ID Usuario", "Tipo Combustible"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false, false, false, false, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_inventarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_inventario);

        cargar_tabla.setLabel("Cargar Tabla");
        cargar_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargar_tablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel2))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(caja_invinicial_diesel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(caja_despa_diesel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(caja_invfinal_diesel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(caja_litfaltantes_diesel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(invinicial_litro_diesel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(despachado_litro_diesel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(invfinal_litro_diesel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(litfaltantes_litro_diesel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(caja_recibido_diesel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addGap(36, 36, 36)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(recibido_litro_diesel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(caja_plg_litfaltantes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(caja_plg_invinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(caja_plg_recibido, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(caja_plg_despachado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(caja_plg_invfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(22, 22, 22)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(ingresar_diesel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Conversion_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cargar_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(modificar_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(433, 433, 433)
                                        .addComponent(jLabel13)
                                        .addGap(7, 7, 7)
                                        .addComponent(fecha_pantalla1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel31)
                                                            .addComponent(jLabel24)
                                                            .addComponent(jLabel23)
                                                            .addComponent(jLabel28)
                                                            .addComponent(jLabel30)
                                                            .addComponent(jLabel29))
                                                        .addGap(46, 46, 46)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(caja1_super, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(jLabel25))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jLabel26)
                                                                    .addComponent(caja1_litro, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                    .addComponent(caja2_super, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addComponent(caja3_super, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addComponent(caja4_super, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addComponent(caja5_super, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                    .addComponent(caja2_litro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addComponent(caja3_litro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addComponent(caja4_litro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addComponent(caja5_litro, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(caja4_plg_super, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(caja2_plg_super, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(caja3_plg_super, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(caja1_plg_super, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel27)
                                                            .addComponent(caja5_plg_super, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(26, 26, 26)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Conversion_button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(ingresar_diesel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel21)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel22)
                                                        .addGap(33, 33, 33)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(textField32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(textField33, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(15, 15, 15))))))
                            .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titulo1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13)
                        .addComponent(fecha_pantalla1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(recibido_litro_diesel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(caja_recibido_diesel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(caja_plg_recibido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Conversion_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(caja_invinicial_diesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(invinicial_litro_diesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ingresar_diesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(caja_plg_despachado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(despachado_litro_diesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(caja_despa_diesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(invfinal_litro_diesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(caja_invfinal_diesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(caja_plg_invfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(caja_plg_invinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(caja_plg_litfaltantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(litfaltantes_litro_diesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(caja_litfaltantes_diesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel31))
                            .addComponent(jLabel25)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(caja1_litro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(caja1_super, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(caja1_plg_super, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Conversion_button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(caja2_super, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28)
                                    .addComponent(caja2_plg_super, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(caja2_litro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel29))
                                    .addComponent(jLabel30)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(caja3_super, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(caja3_litro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(caja3_plg_super, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(caja4_plg_super, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(caja4_litro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(caja4_super, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(caja5_super, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(caja5_litro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(caja5_plg_super, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ingresar_diesel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(modificar_insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargar_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(textField33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String fecha(){
    Date fecha = new Date();
    SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
           return formatofecha.format(fecha);
    }
    
    private void ingresar_dieselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar_dieselActionPerformed
        
        conexion cc = new conexion();
        Connection cn = cc.conexion();
        
        
        
       try{
           cn = conexion();
           String  consulta = "INSERT INTO `inventario_combustible` (`id_inventario`, `recibido`, `recibido_plg3`, `inventario_inicial`, `inventario_inicial_plg3`, `litros_faltantes`, `litros_faltantes_plg3`, `despacho`, `despacho_plg3`, `inventario_final`, `inventario_final_plg3`, `id_usuario`, `id_tipo_combustible`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
           ps = cn.prepareStatement(consulta);
           ps.setString(1, caja_recibido_diesel.getText()); //1-
           ps.setString(2, caja_plg_recibido.getText()); //2-
           ps.setString(3, caja_invinicial_diesel.getText()); //3-
           ps.setString(4, caja_plg_invinicial.getText()); //4-
           
           ps.setString(5, caja_litfaltantes_diesel.getText()); // 5-
           ps.setString(6, caja_plg_litfaltantes.getText()); // 6-
           ps.setString(7, caja_despa_diesel.getText()); // 7-
           ps.setString(8, caja_plg_despachado.getText()); // 8-
           
           ps.setString(9, caja_invfinal_diesel.getText()); // 9-
           ps.setString(10, caja_plg_invfinal.getText()); // 10-
           
           ps.setString(11, "1");
           ps.setString(12, "2"); //tipo_combustible 2: diesel
           ps.setString(13, "3");
           
           int resultado = ps.executeUpdate(); //ejecutamos
           
           if (resultado > 0){
                JOptionPane.showMessageDialog(null, "Registro insertado correctamente.");
                limpiarcajas1();
                
            }else{
                    JOptionPane.showMessageDialog(null, "Error al insertar el registro.");}
                            
            //conection.close();
           
       }catch(Exception ex){
       System.err.println("Error. "+ex);
       
       }
        
    }//GEN-LAST:event_ingresar_dieselActionPerformed

    private void caja_recibido_dieselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja_recibido_dieselActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja_recibido_dieselActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atrasActionPerformed

    private void caja_plg_recibidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_plg_recibidoKeyReleased

        
        
        
        
    }//GEN-LAST:event_caja_plg_recibidoKeyReleased

    private void caja_plg_recibidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_plg_recibidoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_caja_plg_recibidoKeyTyped

    private void Conversion_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Conversion_buttonActionPerformed
       
        
        //convertir plg
        Double a = Double.parseDouble(caja_recibido_diesel.getText());
                
        String convert1= Double.toString(a/61.024);
        
        caja_plg_recibido.setText(convert1);
        
        //2
        
        Double b = Double.parseDouble(caja_invinicial_diesel.getText());
                
        String convert2= Double.toString(b/61.024);
        
        caja_plg_invinicial.setText((convert2));
        
        //3
        
        Double c = Double.parseDouble(caja_despa_diesel.getText());
                
        String convert3= Double.toString(c/61.024);
        
        caja_plg_despachado.setText((convert3));
        
        //4
        
        Double d = Double.parseDouble(caja_invfinal_diesel.getText());
                
        String convert4= Double.toString(d/61.024);
        
        caja_plg_invfinal.setText((convert4));
        
        //5
        
        Double e = Double.parseDouble(caja_litfaltantes_diesel.getText());
                
        String convert5= Double.toString(e/61.024);
        
        caja_plg_litfaltantes.setText((convert5));
        
       
        // convertir litros 3.78541
        
        Double f = Double.parseDouble(caja_litfaltantes_diesel.getText());
                
        String convert6= Double.toString(f/3.78541);
        
        recibido_litro_diesel.setText((convert6));
        
        //2
        Double g = Double.parseDouble(caja_invinicial_diesel.getText());
                
        String convert7= Double.toString(g/3.78541);
        
        invinicial_litro_diesel.setText((convert7));
        
        //3
        Double h = Double.parseDouble(caja_despa_diesel.getText());
                
        String convert8= Double.toString(h/3.78541);
        
        despachado_litro_diesel.setText((convert8));
        
        
        //4
        Double i = Double.parseDouble(caja_invfinal_diesel.getText());
                
        String convert9= Double.toString(i/3.78541);
        
        invfinal_litro_diesel.setText((convert9));
        
        
        //5
        Double j = Double.parseDouble(caja_litfaltantes_diesel.getText());
                
        String convert10= Double.toString(j/3.78541);
        
        litfaltantes_litro_diesel.setText((convert10));
        
        
        
        
        
    }//GEN-LAST:event_Conversion_buttonActionPerformed

    private void recibido_litro_dieselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recibido_litro_dieselActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recibido_litro_dieselActionPerformed

    private void Conversion_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Conversion_button1ActionPerformed
        //convertir plg
        Double a2 = Double.parseDouble(caja1_super.getText());
                
        String converta= Double.toString(a2/61.024);
        
        caja1_plg_super.setText(converta);
        
        //2
        
        Double b2 = Double.parseDouble(caja2_super.getText());
                
        String convertb= Double.toString(b2/61.024);
        
        caja2_plg_super.setText((convertb));
        
        //3
        
        Double c2 = Double.parseDouble(caja3_super.getText());
                
        String convertc= Double.toString(c2/61.024);
        
        caja3_plg_super.setText((convertc));
        
        //4
        
        Double d2 = Double.parseDouble(caja4_super.getText());
                
        String convertd= Double.toString(d2/61.024);
        
        caja4_plg_super.setText((convertd));
        
        //5
        
        Double e2 = Double.parseDouble(caja5_super.getText());
                
        String converte= Double.toString(e2/61.024);
        
        caja5_plg_super.setText((converte));
        
       
        // convertir litros 3.78541
        
        Double f2 = Double.parseDouble(caja1_super.getText());
                
        String convert6= Double.toString(f2/3.78541);
        
        caja1_litro.setText((convert6));
        
        //2
        Double g2 = Double.parseDouble(caja2_super.getText());
                
        String convert7= Double.toString(g2/3.78541);
        
        caja2_litro.setText((convert7));
        
        //3
        Double h2 = Double.parseDouble(caja3_super.getText());
                
        String convert8= Double.toString(h2/3.78541);
        
        caja3_litro.setText((convert8));
        
        
        //4
        Double i2 = Double.parseDouble(caja4_super.getText());
                
        String convert9= Double.toString(i2/3.78541);
        
        caja4_litro.setText((convert9));
        
        
        //5
        Double j2 = Double.parseDouble(caja5_super.getText());
                
        String convert10= Double.toString(j2/3.78541);
        
        caja5_litro.setText((convert10));
        
        
    }//GEN-LAST:event_Conversion_button1ActionPerformed

    private void caja1_superActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja1_superActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja1_superActionPerformed

    private void caja1_litroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja1_litroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja1_litroActionPerformed

    private void caja1_plg_superKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja1_plg_superKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_caja1_plg_superKeyReleased

    private void caja1_plg_superKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja1_plg_superKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_caja1_plg_superKeyTyped

    private void caja2_plg_superActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja2_plg_superActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja2_plg_superActionPerformed

    private void ingresar_diesel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar_diesel2ActionPerformed
       
           Connection conection = null;
        
        
       try{
           conection = conexion();
           ps = conection.prepareStatement("insert into inventario_combustible (recibido, recibido_plg3, inventario_inicial, inventario_inicial_plg3, litros_faltantes, litros_faltantes_plg3, despachado, despachado_plg3, inventario_final, inventario_final_plg3, id_usuario, id_tipo_combustible) values (?,?,?,?,?,?,?,?,?,?,?,?)");
           ps.setString(1, caja1_super.getText()); //1-
           ps.setString(2, caja1_plg_super.getText()); //2-
           ps.setString(3, caja2_super.getText()); //3-
           ps.setString(4, caja2_plg_super.getText()); //4-
           
           ps.setString(5, caja5_super.getText()); // 5-
           ps.setString(6, caja5_plg_super.getText()); // 6-
           ps.setString(7, caja3_super.getText()); // 7-
           ps.setString(8, caja3_plg_super.getText()); // 8-
           
           ps.setString(9, caja4_super.getText()); // 9-
           ps.setString(10, caja4_plg_super.getText()); // 10-
           
           ps.setString(11, "1");
           ps.setString(12, "1"); //tipo_combustible 1: super
           
           int resultado = ps.executeUpdate(); //ejecutamos
           
           if (resultado > 0){
                JOptionPane.showMessageDialog(null, "Registro insertado correctamente.");
                limpiarcajas2();
                
            }else{
                    JOptionPane.showMessageDialog(null, "Error al insertar el registro.");}
                            
            conection.close();
           
       }catch(Exception ex){
       System.err.println("Error. "+ex);
       
       }
        
        
       
        
        
        
    }//GEN-LAST:event_ingresar_diesel2ActionPerformed

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        Control_Combustible_Diario boton_Control_Combustible_Diario = new Control_Combustible_Diario();
        boton_Control_Combustible_Diario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasMouseClicked

    private void cargar_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargar_tablaActionPerformed
     String mostrar="SELECT `id_inventario`, `recibido`, `recibido_plg3`, `inventario_inicial`, `inventario_inicial_plg3`, `litros_faltantes`, `litros_faltantes_plg3`, `despacho`, `despacho_plg3`, `inventario_final`, `inventario_final_plg3`, `id_usuario`, `id_tipo_combustible` FROM `inventario_combustible` WHERE 1";
    String []titulos={"Id inventario","recibido","recibido plg","inventario inicial","inventario inicial plg3","litros faltantes","litros faltantes plg3","despacho","despacho plg","inventario final","inventario final plg3","id_usuario","id_tipo_combustible" };
    String []Registros=new String[14];
    DefaultTableModel model = new DefaultTableModel(null,titulos);
  
        try {
              Statement st = cn.createStatement();
              java.sql.ResultSet rs = st.executeQuery(mostrar);
              while(rs.next())
              {
                  Registros[0]= rs.getString("id_inventario");
                  Registros[1]= rs.getString("recibido");
                  Registros[2]= rs.getString("recibido_plg3");
                  Registros[3]= rs.getString("inventario_inicial");
                  Registros[4]= rs.getString("inventario_inicial_plg3");
                  Registros[5]= rs.getString("litros_faltantes");
                  Registros[6]= rs.getString("litros_faltantes_plg3");
                  Registros[7]= rs.getString("despacho");
                  Registros[8]= rs.getString("despacho_plg3");
                  Registros[9]= rs.getString("inventario_final");
                  Registros[10]= rs.getString("inventario_final_plg3");
                  Registros[11]= rs.getString("id_usuario");
                  Registros[12]= rs.getString("id_tipo_combustible");
                       
                  model.addRow(Registros);
              }
              tabla_inventario.setModel(model);
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
        
    }//GEN-LAST:event_cargar_tablaActionPerformed

    private void modificar_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_insertActionPerformed
        // TODO add your handling code here:
        try {
            //String sql= "`proveedores` SET `id_proveedores`='"+idproveedor.getText()+"',`nombre`='"+descripcion.getText()+"',`telefono`='"+telefono.getText()+"',`direccion_correo`='"+correo.getText()+"',`direccion`='"+direccion.getText()+"',`id_categoria_productos`='"+idcategoria.getSelectedIndex()+"' WHERE `id_proveedores` ='"+idproveedor.getText()+"'";
            //String consulta="UPDATE `proveedores` SET `id_proveedores` = '"+idproveedor.getText()+"', `nombre` = '"+descripcion.getText()+"', `telefono` = '"+telefono.getText()+"', `direccion_correo` = '"+correo.getText()+"', `direccion` = '"+direccion.getText()+"', `id_categoria_productos` = '"+idcategoria.getSelectedIndex()+"' WHERE `proveedores`.`id_proveedores` = "+idproveedor.getText()+"";
            String consulta = "UPDATE `inventario_combustible` SET `recibido`='"+caja_recibido_diesel.getText()+"',`recibido_plg3`='"+recibido_litro_diesel.getText()+"',`inventario_inicial`='"+caja_invinicial_diesel.getText()+"',`inventario_inicial_plg3`='"+invinicial_litro_diesel.getText()+"',`litros_faltantes`='"+caja_litfaltantes_diesel.getText()+"',`litros_faltantes_plg3`='"+caja_plg_litfaltantes.getText()+"',`despacho`='"+caja_despa_diesel.getText()+"',`despacho_plg3`='"+despachado_litro_diesel.getText()+"',`inventario_final`='"+caja_invfinal_diesel.getText()+"',`inventario_final_plg3`='"+caja_plg_invfinal.getText()+"',`id_usuario`='01',`id_tipo_combustible`='01' WHERE `inventario_combustible`.`id_inventario` = 12";
            PreparedStatement pst  = cn.prepareStatement(consulta);
           
            
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "LOS DATOS HAN SIDO MODIFICADOS");
            cargar("");
            
           
        } catch (java.sql.SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        
        } 
    }//GEN-LAST:event_modificar_insertActionPerformed

    private void tabla_inventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_inventarioMouseClicked
        // TODO add your handling code here:
        int seleccionar = tabla_inventario.rowAtPoint(evt.getPoint());
        
        caja_recibido_diesel.setText(String.valueOf(tabla_inventario.getValueAt(seleccionar,1)));
        caja_plg_recibido.setText(String.valueOf(tabla_inventario.getValueAt(seleccionar,2)));
        
        
        caja_invinicial_diesel.setText(String.valueOf(tabla_inventario.getValueAt(seleccionar,3)));
        caja_plg_invinicial.setText(String.valueOf(tabla_inventario.getValueAt(seleccionar,4)));
        caja_litfaltantes_diesel.setText(String.valueOf(tabla_inventario.getValueAt(seleccionar,5)));
        
        caja_plg_litfaltantes.setText(String.valueOf(tabla_inventario.getValueAt(seleccionar,6)));
        caja_despa_diesel.setText(String.valueOf(tabla_inventario.getValueAt(seleccionar,7)));
        caja_plg_despachado.setText(String.valueOf(tabla_inventario.getValueAt(seleccionar,8)));
        
        caja_invfinal_diesel.setText(String.valueOf(tabla_inventario.getValueAt(seleccionar,9)));
        caja_plg_litfaltantes.setText(String.valueOf(tabla_inventario.getValueAt(seleccionar,10)));
        
        
    }//GEN-LAST:event_tabla_inventarioMouseClicked

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
            java.util.logging.Logger.getLogger(Ingreso_Inventario_Combustible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Inventario_Combustible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Inventario_Combustible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Inventario_Combustible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso_Inventario_Combustible().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Conversion_button;
    private java.awt.Button Conversion_button1;
    private java.awt.Button atras;
    private java.awt.TextField caja1_litro;
    private java.awt.TextField caja1_plg_super;
    private java.awt.TextField caja1_super;
    private java.awt.TextField caja2_litro;
    private java.awt.TextField caja2_plg_super;
    private java.awt.TextField caja2_super;
    private java.awt.TextField caja3_litro;
    private java.awt.TextField caja3_plg_super;
    private java.awt.TextField caja3_super;
    private java.awt.TextField caja4_litro;
    private java.awt.TextField caja4_plg_super;
    private java.awt.TextField caja4_super;
    private java.awt.TextField caja5_litro;
    private java.awt.TextField caja5_plg_super;
    private java.awt.TextField caja5_super;
    private java.awt.TextField caja_despa_diesel;
    private java.awt.TextField caja_invfinal_diesel;
    private java.awt.TextField caja_invinicial_diesel;
    private java.awt.TextField caja_litfaltantes_diesel;
    private java.awt.TextField caja_plg_despachado;
    private java.awt.TextField caja_plg_invfinal;
    private java.awt.TextField caja_plg_invinicial;
    private java.awt.TextField caja_plg_litfaltantes;
    private java.awt.TextField caja_plg_recibido;
    private java.awt.TextField caja_recibido_diesel;
    private java.awt.Button cargar_tabla;
    private java.awt.TextField despachado_litro_diesel;
    private javax.swing.JLabel fecha_pantalla;
    private javax.swing.JLabel fecha_pantalla1;
    private java.awt.Button ingresar_diesel;
    private java.awt.Button ingresar_diesel2;
    private java.awt.TextField invfinal_litro_diesel;
    private java.awt.TextField invinicial_litro_diesel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.TextField litfaltantes_litro_diesel;
    private java.awt.Button modificar_insert;
    private java.awt.TextField recibido_litro_diesel;
    private javax.swing.JTable tabla_inventario;
    private java.awt.TextField textField31;
    private java.awt.TextField textField32;
    private java.awt.TextField textField33;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables
}
