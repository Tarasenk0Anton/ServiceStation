public class ServiceDeport implements ServiceStations {

    private String name;

    public ServiceDeport(String name) {
        this.name = name;
    }

    @Override
    public void repairCar(Car car) {
        if (car.getKm() > 100_000) {
            System.out.println(car.getModel() + " отремонтирована в " +  name);
        } else {
            System.out.println(car.getModel() + " не нуждается в ремонте");
        }

    }

    @Override
    public void repairCar(Car[] car) {
        for (Car cars : car) {
            if (cars.getKm() > 100_000) {
                System.out.println(cars.getModel() + " отремонтирована");
            } else {
                System.out.println(cars.getModel() + " не нуждается в ремонте");
            }

        }
    }

    /*
    @Override
    public void repairCar(Audi car) {
            if (car.getKm() > 100_000) {
                System.out.println(car.getModel() + " отремонтирована");
            } else {
                System.out.println(car.getModel() + " не нуждается в ремонте");
            }
    }
    */
}
