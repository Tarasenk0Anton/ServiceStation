public class Main {
    public static void main(String[] args) {

        ServiceDeport serviceDeport1 = new ServiceDeport("Гараж №1");

        Car car1 = new Audi("A6", 80000);
        Car car2 = new BMW("X5", 120000);

        repairCar(serviceDeport1, car1, car2);
    }

    public static void repairCar(ServiceDeport serviceDeport, Car... cars) {

        for (Car car : cars) {
            serviceDeport.repairCar(car);
        }
    }
}
