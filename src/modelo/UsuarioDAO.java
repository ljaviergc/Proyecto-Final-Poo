//IMPORTANTE: Esta clase es la que realiza los movimientos en la Base de Datos
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAO implements CRUD{
    
    Connection ucon;
    Conexion ucn = new Conexion();
    PreparedStatement ups;
    ResultSet urs;

    @Override
    public List listar() {
        List<Usuario> listaUser = new ArrayList<>();
        String sql = "select * from usuario";
        try{
            ucon = ucn.Conectar();
            ups = ucon.prepareStatement(sql);
            urs = ups.executeQuery();
            while( urs.next() ){
                Usuario u = new Usuario();
                u.setIdUser( urs.getInt(1) );
                u.setNomUser( urs.getString(3) );
                u.setTelUser( urs.getString(4) );
                u.setEsUser( urs.getString(5) );
                u.setUsuario( urs.getString(6) );
                listaUser.add(u);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al intentar listar!");
        }
        
        return listaUser;    
    }

    @Override
    public int add(Object[] o) {
        int ru = 0;
        String sql = "insert into usuario(Dni,Nombres,Telefono,Estado,User)values(?,?,?,?,?) ";
        try{
            ucon = ucn.Conectar();
            ups = ucon.prepareStatement(sql);
            urs = ups.executeQuery();
            ups.setObject(1, o[0] );
            ups.setObject(2, o[1] );
            ups.setObject(3, o[2] );
            ups.setObject(4, o[3] );
            ups.setObject(5, o[4] );
            ru = ups.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al intentar agregar!");
        }
        
        return ru;
        
    }

    @Override
    public int actualizar(Object[] o) {
        int ru = 0;
        String sql = "update usuario set Dni=?, Nombres=?,Telefono=?,Estado=?,User=? where IdUsuario=?";
        try{
            ucon = ucn.Conectar();
            ups = ucon.prepareStatement(sql);
            ups.setObject(1, o[1] );
            ups.setObject(2, o[2] );
            ups.setObject(3, o[3] );
            ups.setObject(4, o[4] );
            ups.setObject(5, o[5] );
            ups.setObject(6, o[6] );
            ru = ups.executeUpdate();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al intentar actualizar!");
        }
        
        return ru;
    }

    @Override
    public void eliminar(int idUser) {
       String sql = "delete from usuario where IdUsuario=?";
       try{
           ucon = ucn.Conectar();
           ups = ucon.prepareStatement(sql);
           ups.setInt(0, idUser);
           ups.executeUpdate();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error al intentar eliminar!");
       }
    }
    
}