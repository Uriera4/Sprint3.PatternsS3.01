package n3exercici1.command;

import n3exercici1.receptors.Vehicle;

public class FrenarCommand implements Command {

    private Vehicle vehicle;
    public FrenarCommand(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.frenar();
    }

}
