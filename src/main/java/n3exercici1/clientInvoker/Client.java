package n3exercici1.clientInvoker;

import n3exercici1.command.AccelerarCommand;
import n3exercici1.command.ArrencarCommand;
import n3exercici1.command.FrenarCommand;
import n3exercici1.receptors.*;

public class Client {

    private Cotxe cotxe;
    private Bicicleta bicicleta;
    private Avio avio;
    private Vaixell vaixell;
    private Invoker invoker;

    public Client (){
        this.cotxe = new Cotxe();
        this.bicicleta = new Bicicleta();
        this.avio = new Avio();
        this.vaixell = new Vaixell();
        this.invoker = new Invoker();
    }

    public void iniciarCommandsCotxe (){
        this.invoker.setArrencarCommand(new ArrencarCommand(this.cotxe));
        this.invoker.setAccelerarCommand(new AccelerarCommand(this.cotxe));
        this.invoker.setFrenarCommand(new FrenarCommand(this.cotxe));
    }
    public void iniciarCommandsBicicleta (){
        this.invoker.setArrencarCommand(new ArrencarCommand(this.bicicleta));
        this.invoker.setAccelerarCommand(new AccelerarCommand(this.bicicleta));
        this.invoker.setFrenarCommand(new FrenarCommand(this.bicicleta));
    }
    public void iniciarCommandsAvio (){
        this.invoker.setArrencarCommand(new ArrencarCommand(this.avio));
        this.invoker.setAccelerarCommand(new AccelerarCommand(this.avio));
        this.invoker.setFrenarCommand(new FrenarCommand(this.avio));
    }
    public void iniciarCommandsVaixell (){
        this.invoker.setArrencarCommand(new ArrencarCommand(this.vaixell));
        this.invoker.setAccelerarCommand(new AccelerarCommand(this.vaixell));
        this.invoker.setFrenarCommand(new FrenarCommand(this.vaixell));
    }
    public void executaAccions(){
        this.invoker.arrencar();
        this.invoker.accelerar();
        this.invoker.frenar();
    }

}
