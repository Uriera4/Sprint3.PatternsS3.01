package n2exercici1.fabriques;

import n2exercici1.interfaces.FabricaAbstracta;

public class FabricaContactes {

    public static FabricaAbstracta getFabricaContactes (String pais){
        FabricaAbstracta fabrica = null;
        switch(pais.toUpperCase()){
            case "ESPANYA" -> fabrica = new ContacteEspanya();
            case "PORTUGAL" -> fabrica = new ContactePortugal();
            case "FRANÇA" -> fabrica = new ContacteFrança();
            case "ALEMANIA" -> fabrica = new ContacteAlemania();
            case "GENERIC" -> fabrica = new ContacteGeneric();
        }
        return fabrica;
    }

}
