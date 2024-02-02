package n3exercici1.receptors;

public abstract class Vehicle {

    public void arrencar(){
        System.out.println(getTipusVehicle() + " arrenca.");
    }
    public void accelerar(){
        System.out.println(getTipusVehicle() + " accelera.");
    }
    public void frenar(){
        System.out.println(getTipusVehicle() + " frena.");
    }

    public abstract String getTipusVehicle();

}
