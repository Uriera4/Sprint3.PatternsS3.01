package n1exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        accionaPrograma();
    }

    static void accionaPrograma(){
        titolPrograma();
        Undo undo = Undo.getInstancia();
        int opcioMenu;
        do {
            opcioMenu = demanaOpcioMenu();
            switch (opcioMenu) {
                case 1 -> opcioAfegirComanda(undo);
                case 2 -> undo.impreixComandes();
                case 3 -> undo.eliminaComanda();
                case 0 -> opcioSortir();
            }
        } while (opcioMenu!=0);
    }

    //OPCIÓ (1) INTRODUIR COMANDA
    static void opcioAfegirComanda(Undo undo){
        boolean continuar;
        do {
            undo.afegirComanda(demanaString("Introdueixi la seva comanda: "));
            continuar = introduirAltreComanda();
        } while (continuar);
    }

    //OPCIÓ (0) SORTIR DE L'APLICACIÓ
    static void opcioSortir() {
        System.out.println("\n Aplicació finalitzada. Adéu.");
    }

    //CONDICIÓ PER CONTINUAR INTRODUINT COMANDES
    static boolean introduirAltreComanda() {
        boolean siOno = true;
        boolean correcte = false;
        do {
            try {
                siOno = comprovaSioNo(demanaString("\nVol introduir una altra comanda? (SI/NO) "));
                correcte = true;
            } catch (NomesSioNoException e) {
                System.out.println(e.getMessage());
            }
        } while (!correcte);
        return siOno;
    }
    static boolean comprovaSioNo (String opcio) throws NomesSioNoException {
        return switch (opcio.toUpperCase()) {
            case "SI" -> true;
            case "NO" -> false;
            default -> throw new NomesSioNoException("Error de format. Ha d'introduir SI o NO");
        };
    }

    //DEMANEM A L'USUARI OPCIÓ DEL MENÚ I VALIDACIÓ DE L'OPCIÓ
    static int demanaOpcioMenu()  {
        System.out.println(menu());
        int opcioMenu = demanaInt("Introdueix una opció del menú: ");
        try{
            validaOpcio(opcioMenu);
        } catch (ExcepcioOpcioNoValida e){
            System.out.println(e.getMessage());
        }
        return opcioMenu;
    }
    static void validaOpcio (int opcioMenu) throws ExcepcioOpcioNoValida {
        if (opcioMenu<0 || opcioMenu>3){
            throw new ExcepcioOpcioNoValida("Aquesta opció no existeix");
        }
    }

    //MISSATGES DE L'APLICACIÓ
    static void titolPrograma (){
        System.out.println("Historial de comandes");
    }
    static String menu() {
        return """

                 MENÚ DE L'APLICACIÓ:
                (1). Introduir comanda
                (2). Llistar comandes actuals
                (3). Eliminar última comanda
                (0). Sortir""";
    }

    //MÉTODES INTRODUCCIÓ DADES USUARI
    static int demanaInt(String mensaje) {
        Scanner input = new Scanner (System.in);
        int numero = 0;
        boolean correcto = false;
        do {
            System.out.print(mensaje);
            try {
                numero = input.nextInt();
                correcto = true;
            } catch (InputMismatchException ex) {
                System.out.println("Error de format. Introdueixi un número sencer.");
            }
            input.nextLine();
        } while (!correcto);
        return numero;
    }
    static String demanaString (String missatge) {
        Scanner input = new Scanner (System.in);
        System.out.print(missatge);
        return input.nextLine();
    }

}