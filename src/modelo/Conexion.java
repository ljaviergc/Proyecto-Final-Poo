
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    Connection con;
    String url = "jdbc:mysql://localhost:3306/bd_adopciones";
    String user = "root";
    String pass = "12345";

    public Connection Conectar(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            //JOptionPane.showMessageDialog(null, "Conexion Exitosa!");
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion!");
        }

        return con;  
    }
}
