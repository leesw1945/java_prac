package class_prac;

public class Object_explan {
    public static void main(String[] args) {

        // 객체 생성, 인스턴스화
        // new 키워드를 통해서 생성자를 호출한다.
        Car car1 = new Car(); // car1 객체 == 변수
        Car car2 = new Car();
        Car car = new Car();

        // 객체도 참조형 변수와 같이 주소를 저장함
        System.out.println(car1);

        // 클래스명을 변수 타입으로 작성?
        Car[] carArr = new Car[3];

        // 객체명.변수명 작성하여 해당 클래스의 변수(필드) 접근 가능
        // 객체명.메서드 작성하여 해당 클래스의 메서드 접근 가능
        car1.changeGear('P');
        carArr[0] = car1;

        // 배열에 넣을 수 있음
        car2.changeGear('N');
        carArr[1] = car2;

        Car car3 = new Car();
        car3.changeGear('D');
        carArr[2] = car3;

        for (Car car4 : carArr) {
            System.out.println("car.gear = " + car4.gear);
        }


        // 초기값 기본값 확인 : 초기값을 준 것은 그 값이 들어가고
        // 아닌 값은 default value가 들어간다

        System.out.println("car.model = " + car.model);
        System.out.println("car.color = " + car.color);
        System.out.println();

        System.out.println("car.speed = " + car.speed);
        System.out.println("car.gear = " + car.gear);
        System.out.println("car.light = " + car.lights);
        System.out.println();

        System.out.println("car.tire = " + car.tire);
        System.out.println("car.door = " + car.door);
        System.out.println();

        //필드 사용
        car.color = "blue";
        car.speed = 100;
        car.lights = false;

        System.out.println("car.color = " + car.color);
        System.out.println("car.speed = " + car.speed);
        System.out.println("car.lights = " + car.lights);

    }
}
