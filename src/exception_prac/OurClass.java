package exception_prac;

public class OurClass {
    private final boolean just = true;

    // throws (예외를 던지다 / 발생시키다) - 플래그를 단다
    // 메서드 이름 뒤에 붙어 이 메서드가 어떠한 예외사항을 던질 수 있는지
    // 알려주는 예약어
    public void thisMethodIsDangerous() throws OurBadException {

        if (just){
            // 메서드 안에서 실제로 예외 객체를 던질 때 사용하는 예약어
            // 실제로 던지는 예외 객체 하나와 같이 써야함
            // 일반 메서드의 return 키워드처럼 throw 아래의 구문들은
            // 실행되지 않고 throw문과 함께 메서드가 종료됨
            throw new OurBadException();
        }
    }
}
