package n2exercici1;

import n1exercici1.ExcepcioOpcioNoValida;
import n1exercici1.NomesSioNoException;
import n2exercici1.fabriques.FabricaContactes;
import n2exercici1.interfaces.FabricaAbstracta;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void accionaPrograma(){

        titolPrograma();
        Agenda agenda = Agenda.getInstancia();
        int opcioMenu;
        do {
            opcioMenu = demanaOpcioMenu();
            switch (opcioMenu) {
                case 1 -> seleccionaOpcio(agenda, "introduir");
                case 2 -> agenda.imprimeixContactes();
                case 3 -> seleccionaOpcio(agenda, "eliminar");
                case 0 -> opcioSortir();
            }
        } while (opcioMenu!=0);

    }

    private static void seleccionaOpcio(Agenda agenda, String accio){
        boolean continuar;
        do {
            switch (accio.toLowerCase()){
                case "introduir" -> opcioAfegirContacte(agenda);
                case "eliminar" -> opcioElminaContacte(agenda);
            }
            continuar = introduirAltreContacte(accio);
        } while (continuar);
    }

    //OPCIÓ (1) INTRODUIR CONTACTE
    private static void opcioAfegirContacte(Agenda agenda){
        String nom = demanaString("Introdueixi el nom del contacte a afegir: ");
        String telefon = retornaNumeroTelefon("Introdueixi el número de telèfon: ");
        String carrer = demanaString("Introdueixi el nom del carrer: ");
        int numero = demanaInt("Introdueixi el número del portal: ");
        String ciutat = demanaString("Introdueixi el nom de la ciutat: ");
        String codiPostal = demanaString("Introdueixi el codiPostal: ");
        FabricaAbstracta fabrica = FabricaContactes.getFabricaContactes(retornaPais("Introdueixi el número associat al país de residencia: "));
        agenda.afegirContacte(new Contacte(nom, fabrica.creaAdreça(carrer, numero, ciutat, codiPostal), fabrica.creaTelefon(telefon)));
    }
    private static String retornaPais(String missatge){
        String pais = null;
        int numero;
        do {
            numero = demanaInt(menuPais() + "\n" + missatge);
            try {
                validaOpcioPais(numero);
                switch (numero){
                    case 1 -> pais = "ESPANYA";
                    case 2 -> pais = "PORTUGAL";
                    case 3 -> pais = "FRANÇA";
                    case 4 -> pais = "ALEMANIA";
                    case 0 -> pais = "GENERIC";
                }
            } catch (ExcepcioOpcioNoValida e){
                System.out.println(e.getMessage());
            }
        } while (numero<0 || numero>4);
        return pais;
    }
    private static String retornaNumeroTelefon(String missatge){
        String telefon;
        boolean correcte;
        do {
            telefon = demanaString(missatge);
            correcte = validaTelefon(telefon);
        } while (!correcte);
        return telefon;
    }

    //OPCIÓ (3) ELIMINA CONTACTE
    private static void opcioElminaContacte(Agenda agenda){
        if (agenda.llistaPlena()) agenda.eliminaContacte(demanaString("Introdueixi el nom del contacte a eliminar: "));
        else System.out.println("La llista està buida");
    }

    //OPCIÓ (0) SORTIR DE L'APLICACIÓ
    private static void opcioSortir() {
        System.out.println("\nAplicació finalitzada. Adéu.");
    }

    //CONDICIÓ PER CONTINUAR INTRODUINT CONTACTE
    private static boolean introduirAltreContacte(String accio) {
        boolean siOno = true;
        boolean correcte = false;
        do {
            try {
                siOno = comprovaSioNo(demanaString("\nVol " + accio + " un altre contacte? (SI/NO) "));
                correcte = true;
            } catch (NomesSioNoException e) {
                System.out.println(e.getMessage());
            }
        } while (!correcte);
        return siOno;
    }
    private static boolean comprovaSioNo (String opcio) throws NomesSioNoException {
        return switch (opcio.toUpperCase()) {
            case "SI" -> true;
            case "NO" -> false;
            default -> throw new NomesSioNoException("Error de format. Ha d'introduir SI o NO");
        };
    }

    //DEMANEM A L'USUARI OPCIÓ DEL MENÚ I VALIDACIÓNS
    private static int demanaOpcioMenu()  {
        int opcioMenu = demanaInt(menu()+"\nIntrodueix una opció del menú: ");
        try{
            validaOpcioMenu(opcioMenu);
        } catch (ExcepcioOpcioNoValida e){
            System.out.println(e.getMessage());
        }
        return opcioMenu;
    }
    private static void validaOpcio(int opcio, int min, int max) throws ExcepcioOpcioNoValida {
        if (opcio<min || opcio>max){
            throw new ExcepcioOpcioNoValida("Aquesta opció no existeix");
        }
    }
    private static void validaOpcioMenu (int opcio) throws ExcepcioOpcioNoValida {
        validaOpcio(opcio, 0, 3);
    }
    private static void validaOpcioPais (int opcio) throws ExcepcioOpcioNoValida {
        validaOpcio(opcio, 0, 4);
    }
    private static boolean validaTelefon (String telefon){
        boolean correcte = true;
        if (telefon.length()!=9){
            System.out.println("El telèfon no és correcte. No té 9 xifres");
            correcte = false;
        } else if (!telefon.matches("[0-9]*")){
            System.out.println("El telèfon no és correcte. Han de ser números");
            correcte = false;
        }
        return correcte;
    }

    //MISSATGES DE L'APLICACIÓ
    private static void titolPrograma (){
        System.out.println("AGENDA INTERNACIONAL DE CONTACTES");
    }
    private static String menu() {
        return """

                 MENÚ DE L'APLICACIÓ:
                (1). Introdueix un nou contacte
                (2). Llista contactes actuals
                (3). Elimina un contacte
                (0). Sortir""";
    }
    private static String menuPais() {
        return """

                 MENÚ DE L'APLICACIÓ:
                (1). Espanya
                (2). Portugal
                (3). França
                (4). Alemania
                (0). Altres""";
    }

    //MÉTODES INTRODUCCIÓ DADES USUARI
    private static int demanaInt(String mensaje) {
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
    private static String demanaString (String missatge) {
        Scanner input = new Scanner (System.in);
        System.out.print(missatge);
        return input.nextLine();
    }
}
