package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class UsuarioDAO {
 
    PreparedStatement ps;
    ResultSet rs;

    EntidadUsuario eu = new EntidadUsuario();
    Conexion con = new Conexion();
    Connection acceso;

    public EntidadUsuario ValidarUsuario(String dni, String user){

        EntidadUsuario eu = new EntidadUsuario();
        String sql = "select * from usuario where Dni=? and User=?";
        try {
            acceso = con.Conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, user);
            rs = ps.executeQuery();
            while(rs.next()){
                eu.setId( rs.getInt(1) );
                eu.setDni( rs.getString(2) );
                eu.setNom( rs.getString(3) );
                eu.setTel( rs.getString(4) );
                eu.setEstado( rs.getString(5) );
                eu.setUser( rs.getString(6) );
                
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos");
        }

        return eu;
    }
}