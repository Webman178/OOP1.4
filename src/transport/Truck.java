package transport;

public class Truck extends Transport implements Competing{


    public Truck(String brand,
                 String model,
                 double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void start() {
        System.out.println("Грузовик "  + getBrand() + getModel() + " начал движение");
    }

    public void finish() {
        System.out.println("Грузовик "  + getBrand() + getModel() + " закончил движение");
    }

    @Override
    public void getPitStop() {
        System.out.println("Грузовик проходит точку пит-стопа");
    }

    @Override
    public int printBestLapTime() {
        return (int)(Math.random() * 14);
    }

    @Override
    public int printMaximumSpeed() {
        return (int) (Math.random() * 80);
    }
}
