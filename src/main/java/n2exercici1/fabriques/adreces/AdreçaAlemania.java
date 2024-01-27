package n2exercici1.fabriques.adreces;

import n2exercici1.DefaultAdreça;
import n2exercici1.interfaces.Adreça;

public class AdreçaAlemania extends DefaultAdreça implements Adreça {


    public AdreçaAlemania(String carrer, int numero, String ciutat, String codiPostal, String pais) {
        super(carrer, numero, ciutat, codiPostal, pais);
    }

    @Override
    public DefaultAdreça getAdreça() {
        return this;
    }
}
