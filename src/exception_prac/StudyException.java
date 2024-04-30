package exception_prac;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();

        // try catch finally 구문
        // 일단 try하고 예외 발생 시 catch한 뒤
        // 정상적으로 수행되든, 예외가 발생하든 수행되어야하는 로직을 finally에 작성

        try {
            // 일단 실행
            ourClass.thisMethodIsDangerous();
        } catch (OurBadException e) { // 중괄호 안에서 사용할 수 있도록 인스턴스화 e
            System.out.println(e.getMessage());
        } finally {
            // 무조건 여기는 거친다
            System.out.println("우리는 방금 예외를 핸들링 했슴다. 여기를 무조건 거쳐가요.");
        }
    }
}
