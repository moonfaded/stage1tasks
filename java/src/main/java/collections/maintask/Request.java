package collections.maintask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Request {

  private final List<? extends Car> carList;

  public Request(List<? extends Car> carList) {
    this.carList = carList;
  }

  public int getTaxiStationPrice() {
    int taxiStationPrice = 0;
    for (Car car: carList) {
      taxiStationPrice += car.getCoast();
    }
    return taxiStationPrice;
  }

  public Request sortCarsByFuelConsumption() {
    carList.sort((Comparator<Car>) (o1, o2) -> o1.getFuelConsumption() - o2.getFuelConsumption());
    return this;
  }

  public List<Car> getCarsFasterThan200() {
    List<Car> carsFasterThan200List = new ArrayList<>();
    for (Car car : carList) {
      if (car.getMaxSpeed() > 200) {
        carsFasterThan200List.add(car);
      }
    }
    return carsFasterThan200List;
  }

  @Override
  public String toString() {
    return carList.toString();
  }
}
