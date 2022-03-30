public class Car {
    private String model;
    private int km;

    public Car(String model, int km) {
        this.model = model;
        this.km = km;
    }

    public String getModel() {
        return model;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
