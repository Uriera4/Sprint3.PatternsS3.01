package n2exercici1.fabriques.telefons;

import n2exercici1.DefaultTelefon;
import n2exercici1.interfaces.Telefon;

public class TelefonAlemania extends DefaultTelefon implements Telefon {

    public TelefonAlemania(String numero) {
        super("+49", numero);
    }

    @Override
    public DefaultTelefon getTelefon() {
        return this;
    }
}
