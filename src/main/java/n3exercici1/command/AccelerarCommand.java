package n3exercici1.command;

import n3exercici1.receptors.Vehicle;

public class AccelerarCommand implements Command {

    private Vehicle vehicle;
    public AccelerarCommand(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.accelerar();
    }

}
