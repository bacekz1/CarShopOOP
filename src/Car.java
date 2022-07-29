public class Car {
    private String model;
    private int maxSpeed;
    private int currentGear;
    private String color;
    private double price;
    private boolean isSport;
    private String modelParam;
    private int gears;
    private int currentSpeed;
    private Person owner;

    public double getPrice() {
        return price;
    }

    boolean isMoreExpensive(Car car) {
        return car.price > this.price;
    }

    double calculateCarPriceForScrap(double metalPrice) {
        double coef = 0.2;
        if (this.color.equalsIgnoreCase("white") || this.color.equalsIgnoreCase("black")) {
            coef += 0.05;
        }
        if (isSport) {
            coef += 0.005;
        }
        return metalPrice * coef;
    }

    void changeGear(int nextGear) {
        if (nextGear >= -1 || nextGear <= gears) {
            this.currentGear = nextGear;
        } else {
            System.out.println("Invalid value for changeGear");

        }
    }

    void accelerate() {
        currentSpeed += 5;
    }

    void changeGearUp() {
        if (currentSpeed < gears) {
            currentGear++;
        }
    }

    void changeGearDown() {
        if (currentGear < -1) {
            currentGear--;
        }
    }

    void changeColor(String newColor) {
        this.color = newColor;
    }

    void changeOwner(Person newOwner) {
        this.owner = newOwner;
    }

    void changeSpeed(int speed) {
        if (speed >= -1 || speed <= maxSpeed) {
            this.currentSpeed = speed;
        } else {
            System.out.println("Invalid value changeSpeed");
        }
    }

    void print() {
        System.out.printf("Model:%s\nPrice:.2%f\nColor:%s\nSport:%b\nGears:%d\nMax speed:%d"
                , model, price, color, isSport, gears, maxSpeed);
        System.out.println();
    }
}
