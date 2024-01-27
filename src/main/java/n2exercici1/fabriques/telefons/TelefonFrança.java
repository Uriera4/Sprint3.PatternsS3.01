package n2exercici1.fabriques.telefons;

import n2exercici1.DefaultTelefon;
import n2exercici1.interfaces.Telefon;

public class TelefonFrança extends DefaultTelefon implements Telefon {

    public TelefonFrança(String numero) {
        super("+33", numero);
    }

    @Override
    public DefaultTelefon getTelefon() {
        return this;
    }
}
