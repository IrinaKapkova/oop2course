public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(1988, "Максим", "Минск", "бренд-менеджером");
        System.out.println(maxim);
        Human anya = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        System.out.println(anya);
        Human katya = new Human(1992, "Калининград", "Минск", "продакт-менеджер");
        System.out.println(katya);
        Human artem = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
        System.out.println(artem);
        System.out.println("Задача 3");
        Car ladaGranta = new Car("Lada", "Granta", 1.7f, "желтого", 2015, "России");
        System.out.println(ladaGranta);
        Car audiA8 = new Car ("Audi", "A8", 3.0f, "черного", 2020, "Германии");
        System.out.println(audiA8);
        Car bmvZ8 = new Car("BMW", "Z8", 3.0f, "черного", 2021, "Германии");
        System.out.println(bmvZ8);
        Car kiaSportage4 = new Car("Kia", "Sportage 4-го поколения", 2.4f, "красного", 2018, "Южной Корее");
        System.out.println(kiaSportage4);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6f, "оранжевого", 2016, "Южной Корее");
        System.out.println(hyundaiAvante);
    }
}