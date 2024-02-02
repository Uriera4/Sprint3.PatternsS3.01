package n3exercici1.clientInvoker;

import n3exercici1.command.AccelerarCommand;
import n3exercici1.command.ArrencarCommand;
import n3exercici1.command.Command;
import n3exercici1.command.FrenarCommand;

public class Invoker {

    private Command arrencarCommand;
    private Command accelerarCommand;
    private Command frenarCommand;

    public void setArrencarCommand(ArrencarCommand command){
        this.arrencarCommand = command;
    }
    public void setAccelerarCommand(AccelerarCommand command){
        this.accelerarCommand = command;
    }
    public void setFrenarCommand(FrenarCommand command){
        this.frenarCommand = command;
    }

    public void arrencar (){
        if (arrencarCommand != null) arrencarCommand.execute();
    }
    public void accelerar (){
        if (accelerarCommand != null) accelerarCommand.execute();
    }
    public void frenar (){
        if (frenarCommand != null) frenarCommand.execute();
    }

}
