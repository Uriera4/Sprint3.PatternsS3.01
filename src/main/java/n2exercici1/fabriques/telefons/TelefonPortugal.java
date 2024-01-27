package n2exercici1.fabriques.telefons;

import n2exercici1.DefaultTelefon;
import n2exercici1.interfaces.Telefon;

public class TelefonPortugal extends DefaultTelefon implements Telefon {

    public TelefonPortugal(String numero) {
        super("+351", numero);
    }

    @Override
    public DefaultTelefon getTelefon() {
        return this;
    }
}
