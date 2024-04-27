package class_prac;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        // 메서드 호출 및 반환값 저장
        double speed = car.gasPedal(100, 'D');
        System.out.println("speed = " + speed);
        System.out.println("gear = " + car.gear);

        boolean lights = car.onOffLight();
        System.out.println("lights = " + lights);

        System.out.println();
        System.out.println("car.gear = " + car.gear);

        System.out.println();
        car.carSpeeds(100, 200, 300);

    }
}
