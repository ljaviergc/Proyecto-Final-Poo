// IMPORTANTE: Esta clase funciona con el Login



package modelo;

public class EntidadUsuario {
    
    int id;
    String dni;
    String nom;
    String tel;
    String estado;
    String user;
    public Object getDni;
    public Object getUser;
   

    public EntidadUsuario(){

    }

    public EntidadUsuario(int id, String dni, String nom, String tel, String estado, String user){

        this.id = id;
        this.dni = dni;
        this.nom = tel;
        this.estado = estado;
        this.user = user;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    
    public String getDni(){
        return dni;
    }
    
    public void setDni(String dni){
        this.dni = dni;
    }
    
    public String getNom(){
        return nom;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public String getTel(){
        return tel;
    }
    
    public void setTel(String tel){
        this.tel = tel;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public String getUser(){
        return user;
    }
    
    public void setUser(String user){
        this.user = user;
    }

}