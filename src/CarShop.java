public class CarShop {
    private int carIndex;
    private Car[] cars;
    private int capacity;



    boolean addCar(Car car) {
        if (carIndex > cars.length) {
            System.out.println("Fix add Car...");
            return false;
        }
        cars[carIndex++] = car;
        capacity++;
        return true;
    }

    Car getNextCar() {
        System.out.println("Fix getNextCar");
        return null;
    }

    void sellNextCar(Person person) {
        System.out.println("Fix sellNextCar");
    }

    boolean removeCar(Car car) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equals(car)) {
                cars[i] = null;
                return true;
            }
        }
        return false;
    }

    void showAllCarsInTheShop() {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                cars[i].print();
            }
        }
    }
}
