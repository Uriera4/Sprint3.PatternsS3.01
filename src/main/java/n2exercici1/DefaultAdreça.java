package n2exercici1;

public class DefaultAdreça {

    protected String carrer, ciutat, codiPostal;
    protected final String pais;
    protected int numero;

    public DefaultAdreça(String carrer, int numero, String ciutat, String codiPostal, String pais){
        this.carrer = carrer;
        this.numero = numero;
        this.ciutat = ciutat;
        this.codiPostal = codiPostal;
        this.pais = pais;
    }

    public void setCarrer (String carrer){
        this.carrer = carrer;
    }
    public String getCarrer (){
        return carrer;
    }
    public void setNumero (int numero){
        this.numero = numero;
    }
    public int getNumero (){
        return numero;
    }
    public void setCiutat (String ciutat){
        this.ciutat = ciutat;
    }
    public String getCiutat (){
        return ciutat;
    }
    public void setCodiPostal (String codiPostal){
        this.codiPostal = codiPostal;
    }
    public String getCodiPostal (){
        return codiPostal;
    }
    public String getPais (){
        return pais;
    }

    public String toString (){
        return carrer + " " + numero + ", " + ciutat + ", " + codiPostal + ", " + pais + ".";
    }

}
