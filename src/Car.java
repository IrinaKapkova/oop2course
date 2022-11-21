public class Car {
    private String  brand;
    private String model;
    private float engineVolume;
    private String color;
    private int year;
    private String country;


    public Car(String brand, String model, float engineVolume, String color, int year, String country) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "белого";
        } else {
            this.color = color;
        }
        if (Double.compare(year, 0) == 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
    }
    @Override
    public String toString() {
        return  "Автомобиль "+ brand + " " + model + ", " + year + " года выпуска, сборка в " + country + ", " + color + " цвета, объем двигателя — " + engineVolume + " л.";
    }
}