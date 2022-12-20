package transport;

public class Bus extends Transport implements Competing{


    public Bus(String brand,
               String model,
               double engineVolume) {
        super(brand, model, engineVolume);
    }


    public void start() {
        System.out.println("Автобус "  + getBrand() + getModel() + " начал движение");
    }

    public void finish() {
        System.out.println("Автобус "  + getBrand() + getModel() + " закончил движение");
    }

    @Override
    public void getPitStop() {
        System.out.println("Автобус проходит точку пит-стопа");
    }

    @Override
    public int printBestLapTime() {
        return (int)(Math.random() * 10);
    }

    @Override
    public int printMaximumSpeed() {
        return (int) (Math.random() * 100);
    }
}
