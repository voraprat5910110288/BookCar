import java.util.ArrayList;

class StatusCar{
    private ArrayList<Car>cars;;

    public StatusCar(){
        cars = new ArrayList<Car>();
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void listCar(){
        for(Car car : cars){
            car.print();
        }
    }
    

}
