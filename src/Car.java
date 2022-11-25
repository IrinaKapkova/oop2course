public class Car {
    private final String  brand;
    private final String model;
    private final float engineVolume;
    private final String color;
    private final int year;
    private final String country;


    public Car(String brand, String model, float engineVolume, String color, int year, String country) {
        this.brand = validateCarParametrs(brand);
        this.model = validateCarParametrs(model);
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
       this.country = validateCarParametrs(country);
    }
    @Override
    public String toString() {
        return  "Автомобиль "+ brand + " " + model + ", " + year + " года выпуска, сборка в " + country + ", " + color + " цвета, объем двигателя — " + engineVolume + " л.";
    }
    public static String validateCarParametrs (String value){
    return value==null? "default":value;
}
}