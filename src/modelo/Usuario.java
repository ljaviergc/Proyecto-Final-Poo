//IMPORTANTE: Esta clase es necesaria para manejar la pestaña Principal/Usuario
package modelo;

public class Usuario {
    int idUser;
    String dni;
    String nomUser;
    String telUser;
    String esUser;
    String usuario;
    
    public Usuario(){
    //Esto debe de estar vacio.    
    }

    public Usuario(int idUser, String dni, String nomUser, String telUser, String esUser, String usuario) {
        this.idUser = idUser;
        this.dni = dni;
        this.nomUser = nomUser;
        this.telUser = telUser;
        this.esUser = esUser;
        this.usuario = usuario;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getTelUser() {
        return telUser;
    }

    public void setTelUser(String telUser) {
        this.telUser = telUser;
    }

    public String getEsUser() {
        return esUser;
    }

    public void setEsUser(String esUser) {
        this.esUser = esUser;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    
    

}
