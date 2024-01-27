package n2exercici1;

import n2exercici1.interfaces.Adreça;
import n2exercici1.interfaces.Telefon;

public class Contacte {

    private String nom;
    private Adreça adreça;
    private Telefon telefon;

    public Contacte(String nom, Adreça adreça, Telefon telefon){
        this.nom = nom;
        this.adreça = adreça;
        this.telefon = telefon;
    }

    public void setNom (String nom){
        this.nom = nom;
    }
    public String getNom (){
        return nom;
    }
    public void setAdreça (Adreça adreça){
        this.adreça = adreça;
    }
    public Adreça getAdreça (){
        return adreça;
    }
    public void setTelefon (Telefon telefon){
        this.telefon = telefon;
    }
    public Telefon getTelefon (){
        return telefon;
    }
    public String toString (){
        return "Nom: " + nom + ", Adreça: " + adreça + ", Telefon: " + telefon + ".";
    }


}
