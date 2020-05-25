package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MascotaDAO implements CRUD{
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listar() {
        List<Mascota> lista = new ArrayList<>();
        String sql = "select * from mascota ";
        
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while( rs.next() ){
                Mascota m = new Mascota();
                m.setId( rs.getInt(1) );
                m.setNom( rs.getString(2) );
                m.setEd( rs.getString(3) );
                m.setRaz( rs.getString(4) );
                m.setEstado( rs.getString(5) );
                m.setUrlfoto( rs.getString(6) );
                lista.add(m);
                
            }
            
        }catch (Exception e){
            
        }
        return lista;
    }
    @Override
    public int add(Object[] o) {
       int r = 0;
       String sql = "insert into mascota(Nombre,Edad,Raza,Estado)values(?,?,?,?) ";
       try{
           
           con = cn.Conectar();
           ps = con.prepareStatement(sql);
           ps.setObject(1, o[0]);
           ps.setObject(2,o[1]);
           ps.setObject(3,o[2]);
           ps.setObject(4,o[3]);
           ps.setObject(5,o[4]);
           r = ps.executeUpdate();
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error al intentar agregar!");
       }
       return r;
    }
    
    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update mascota set Nombre=?,Edad=?,Raza=?,Estado=? where IdMascota=?";
        
        try{
           con = cn.Conectar();
           ps = con.prepareStatement(sql);
           ps.setObject(1,o[0]);
           ps.setObject(2,o[1]);
           ps.setObject(3,o[2]);
           ps.setObject(4,o[3]);
           ps.setObject(5,o[4]);
           ps.setObject(6,o[5]);
           r = ps.executeUpdate();
           
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error al intentar actualizar!");
        }
        
        return 0;
    }
    
    @Override
    public void eliminar(int id) {
        String sql = "delete from mascota where IdMascota=?";
        
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
