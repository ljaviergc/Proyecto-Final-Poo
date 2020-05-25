
package modelo;

public class Cliente {
    int id;
    String nom;
    String dir;
    String tel;
    String estado;
    
    public Cliente(){
        
    }

    public Cliente(int id, String nom, String dir, String tel, String estado) {
        this.id = id;
        this.nom = nom;
        this.dir = dir;
        this.tel = tel;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
