package n2exercici1;

import n2exercici1.fabriques.ContacteAlemania;

import java.util.ArrayList;

public class Agenda {

    private static Agenda instancia;
    private final ArrayList<Contacte> llistaContactes;

    private Agenda (){
        llistaContactes = new ArrayList<>();
    }
    public static Agenda getInstancia (){
        if (instancia==null) instancia = new Agenda();
        return instancia;
    }

    public boolean llistaPlena (){
        return !llistaContactes.isEmpty();
    }
    public void afegirContacte (Contacte contacte){
        llistaContactes.add(contacte);
    }
    public void imprimeixContactes (){
        if (llistaPlena()) {
            llistaContactes.forEach(System.out::println);
        } else {
            System.out.println("La llista està buida");
        }
    }
    public void eliminaContacte (String nom){
        Contacte contacte = trobaContacte(nom);
        if (contacte == null){
            System.out.println("El contacte no està agendat");
        } else {
            llistaContactes.remove(contacte);
        }
    }
    public Contacte trobaContacte (String nom){
        return llistaContactes.stream().filter(contacte -> contacte.getNom().equalsIgnoreCase(nom))
                .findFirst().orElse(null);
    }

}
