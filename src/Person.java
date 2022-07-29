public class Person {
    private int carIndex = 0;

    private String name;
    private int age;
    private long personalNumber;
    private char sex;
    private double weight;
    private Car[] cars;
    private Person friend;
    private double money;

    void eat() {
        System.out.println("Eating...");
    }

    void walk() {
        System.out.println(name + "is walking");
    }

    void growUp() {
        this.age++;
    }

    void drinkWater(double liters) {
        if (liters > 1) {
            System.out.println("This is to much water!");
        } else {
            System.out.printf("%s is drinking 2.%f water.", name, liters);
            System.out.println();
        }
    }

    void buyCar(Car car) {
        if (car.getPrice() < this.money) {
            cars[carIndex++] = car;
        }
    }

    void sellCarForScrap() {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                break;
            }
            money += cars[i].getPrice() * 0.2;
            cars[i] = null;
        }
    }
}
