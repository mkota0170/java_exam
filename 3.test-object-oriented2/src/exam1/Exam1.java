package exam1;

public class Exam1 {
    public static void main(String[] args) {

        // ↓使いまわしver
        Car car = new SuperCar();
        car.setName("フェラーリ");
        car.putOnGas();
        car.run();

        car = new EcoCar();
        car.setName("プリウス");
        car.putOnGas();
        car.run();

        // ↓いつものやりかた
        // SuperCar scar = new SuperCar();
        // scar.setName("フェラーリ");
        // scar.putOnGas();
        // scar.run();

        // EcoCar ecar = new EcoCar();
        // ecar.setName("プリウス");
        // ecar.putOnGas();
        // ecar.run();
    }
}
