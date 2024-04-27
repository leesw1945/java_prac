package class_prac;

public class Car {

    // 만들려고 하는 설계도를 선언합니다. (클래스 선언)
    // 객체가 가지고 있어야할 속성(필드)를 정의합니다.
    // 객체를 생성하는 방식을 정의합니다.(생성자)
    // 객체가 가지고 있어야할 행위(메서드)를 정의합니다.

    // 필드 영역
    // 고유 데이터 영역
    String company;
    String model = "GV80";
    String color;
    double price;

    //--------------------
    // 상태 데이터 영역
    double speed;
    char gear;
    boolean lights = true;

    //--------------------
    // 객체 데이터 영역 (객체에서 하위 객체를 가질 수 있다)
    // Car 클래스가 인스턴스 될 때 Tire클래스도 인스턴스화 되어서 변수에 할당
    Tire tire = new Tire();
    Door door;
    Handle handle;

    // 생성자 영역
    // 생성자 Class명과 동일해야함
    // 처음 객체가 생성될 때 (instance화) 어떤 로직을 수행해야 하며,
    // 어떤 값이 필수로 들어와야 하는지 정의

    public Car() {
        // 기본생성자 : 어떠한 로직도 없는 형태 / 생략 가능
        System.out.println("생성자 호출, 객체 생성");
    }

    // 메서드 영역
    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double brakePedal() {
        speed = 0;
        return speed;
    }

    char changeGear(char type) {
        gear = type;
        return gear;
    }

    boolean onOffLight() {
        lights = !lights;
        return lights;
    }

    void horn() {
        System.out.println("빵빵!");
    }

    // 자동차의 속도 메서드 / 가변길이 메서드
    void carSpeeds(double... speeds) {
        for (double v : speeds) {
            System.out.println("v = " + v);
        }
    }

}
