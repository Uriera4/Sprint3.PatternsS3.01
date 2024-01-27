package n1exercici1;

import java.util.ArrayList;

public class Undo {

    private static Undo instancia;
    private final ArrayList<String> llistaComandes;

    private Undo (){
        llistaComandes = new ArrayList<>();
    }
    public static Undo getInstancia(){
        if (instancia == null) instancia = new Undo();
        return instancia;
    }

    public void afegirComanda (String comanda){
        llistaComandes.add(comanda);
    }
    public void impreixComandes (){
        llistaComandes.forEach(System.out::println);
        System.out.println();
    }
    public void eliminaComanda (){
        if (!llistaComandes.isEmpty()) llistaComandes.removeLast();
    }

}
