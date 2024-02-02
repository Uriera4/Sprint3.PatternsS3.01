package n3exercici1.command;

import n3exercici1.receptors.Vehicle;

public class ArrencarCommand implements Command {

    private Vehicle vehicle;
    public ArrencarCommand (Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.arrencar();
    }

}
