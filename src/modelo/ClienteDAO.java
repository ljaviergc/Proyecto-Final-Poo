
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDAO implements CRUD{
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "select * from cliente ";
        
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while( rs.next() ){
                Cliente c = new Cliente();
                c.setId( rs.getInt(1) );
                c.setNom( rs.getString(2) );
                c.setDir( rs.getString(3) );
                c.setTel( rs.getString(4) );
                c.setEstado( rs.getString(5) );
                lista.add(c);
                
            }
            
        }catch (Exception e){
            
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
       int r = 0;
       String sql = "insert into cliente(Nombres,Direccion,Telefono,Estado)values(?,?,?,?) ";
       try{
           
           con = cn.Conectar();
           ps = con.prepareStatement(sql);
           ps.setObject(1, o[0]);
           ps.setObject(2,o[1]);
           ps.setObject(3,o[2]);
           ps.setObject(4,o[3]);
           r = ps.executeUpdate();
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error al intentar agregar!");
       }
       return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update cliente set Nombres=?,Direccion=?,Telefono=?,Estado=? where IdCliente=?";
        
        try{
           con = cn.Conectar();
           ps = con.prepareStatement(sql);
           ps.setObject(1,o[0]);
           ps.setObject(2,o[1]);
           ps.setObject(3,o[2]);
           ps.setObject(4,o[3]);
           ps.setObject(5,o[4]);
           r = ps.executeUpdate();
           
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error al intentar actualizar!");
        }
        
        return 0;
    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from cliente where IdCliente=?";
        
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al intentar eliminar!");
        }
       
    }
    
}
