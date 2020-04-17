/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

/**
 *
 * @author radioshack
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class conexion {
    private String driver="com.mysql.jc.jdbc.Driver";
    private String cadenaConexion="jdbc:mysql://127.0.0.1/tecnogas"+"?useTimezone=true&serverTimezone=UTC";
    private String usuario="root";
    private String contraseña="onepiece";
    public Connection con;
    public Connection conexion(){
        try {
            con=DriverManager.getConnection(cadenaConexion,usuario,contraseña);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se pudo establecer conexion con la base de datos"+ e.getMessage());
        }
        return con;
             
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
