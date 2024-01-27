package n2exercici1;

public class DefaultTelefon {

    private final String PREFIX;
    private String numero;

    public DefaultTelefon(String prefix, String numero){
        this.PREFIX = prefix;
        this.numero = numero;
    }

    public String getPrefix (){
        return PREFIX;
    }
    public void setNumero (String numero){
        this.numero = numero;
    }
    public String getNumero (){
        return numero;
    }
    public String toString (){
        return PREFIX + " " + numero;
    }

}
