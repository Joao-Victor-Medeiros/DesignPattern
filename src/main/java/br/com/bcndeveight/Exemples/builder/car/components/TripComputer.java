package br.com.bcndeveight.Exemples.builder.car.components;

import br.com.bcndeveight.Exemples.builder.car.Cars;

public class TripComputer {
    private Cars car;

    public void setCar(Cars car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
