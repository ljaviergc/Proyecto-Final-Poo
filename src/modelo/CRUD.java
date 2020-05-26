//IMPORTANTE: Esta clase funciona con las clases DAO
package modelo;

import java.util.List;


public interface CRUD {
    
    public List listar();
    public int add(Object[] o);
    public int actualizar(Object[] o);
    public void eliminar(int id);
    
}

