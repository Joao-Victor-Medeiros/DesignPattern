package br.com.bcndeveight.Exemples.builder.car;

import br.com.bcndeveight.Exemples.builder.Builder;
import br.com.bcndeveight.Exemples.builder.car.components.CarType;
import br.com.bcndeveight.Exemples.builder.car.components.Engine;
import br.com.bcndeveight.Exemples.builder.car.components.GPSNavigator;
import br.com.bcndeveight.Exemples.builder.car.components.Transmission;

public class CarBuilder implements Builder{

    @Override
    public void setCarType(CarType type) {

    }

    @Override
    public void setSeats(int seats) {

    }

    @Override
    public void setEngine(Engine engine) {

    }

    @Override
    public void setTransmission(Engine transmission) {

    }

    @Override
    public void setTripComputer(Transmission tripComputer) {

    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {

    }
}
