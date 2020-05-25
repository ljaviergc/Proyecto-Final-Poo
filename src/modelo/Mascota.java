
package modelo;

public class Mascota {
    int id;
    String nom;
    String ed;
    String raz;
    String estado;
    String urlfoto;
    
    public Mascota(){
    
    }

    public Mascota(int id, String nom, String ed, String raz, String estado, String urlfoto) {
        this.id = id;
        this.nom = nom;
        this.ed = ed;
        this.raz = raz;
        this.estado = estado;
        this.urlfoto = urlfoto;
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

    public String getEd() {
        return ed;
    }

    public void setEd(String ed) {
        this.ed = ed;
    }

    public String getRaz() {
        return raz;
    }

    public void setRaz(String raz) {
        this.raz = raz;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUrlfoto() {
        return urlfoto;
    }

    public void setUrlfoto(String urlfoto) {
        this.urlfoto = urlfoto;
    }
    
    
}
