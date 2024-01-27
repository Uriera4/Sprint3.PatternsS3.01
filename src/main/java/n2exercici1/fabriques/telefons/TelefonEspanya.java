package n2exercici1.fabriques.telefons;

import n2exercici1.DefaultTelefon;
import n2exercici1.interfaces.Telefon;

public class TelefonEspanya extends DefaultTelefon implements Telefon {

    public TelefonEspanya(String numero) {
        super("+34", numero);
    }

    @Override
    public DefaultTelefon getTelefon() {
        return this;
    }

}
