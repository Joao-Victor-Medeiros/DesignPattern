package br.com.bcndeveight.Exemples.builder;

import br.com.bcndeveight.Exemples.builder.car.components.CarType;
import br.com.bcndeveight.Exemples.builder.car.components.Engine;
import br.com.bcndeveight.Exemples.builder.car.components.GPSNavigator;
import br.com.bcndeveight.Exemples.builder.car.components.Transmission;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Engine transmission);
    void setTripComputer(Transmission tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
