public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    private final int lifeSpan;


    public Flower(String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerColor = (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) ? flowerColor : "белый";
        this.country = (country != null && !country.isEmpty() && !country.isBlank()) ? country : "Россия";
        this.cost = (cost <= 0) ? 1 : cost;
        this.lifeSpan = (lifeSpan <= 0) ? 3 : lifeSpan;
    }
    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null && flowerColor.trim().length() != 0 && !flowerColor.isBlank() && !flowerColor.isEmpty()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null && country.trim().length() != 0 && !country.isBlank() && !country.isEmpty()) {
            this.country = country;
        } else {
            this.country = "Россия";

        }
    }
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = (cost <= 0) ? 1 : cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    @Override
    public String toString() {
        return String.format("Цветок: %s, страна-производитель %s, цена за единицу: %.2f рублей, расчитано на %d дня/дней стояния.", flowerColor,
                country, cost, lifeSpan);
    }


}
