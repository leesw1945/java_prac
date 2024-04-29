package homework.homework3;

public class Main {
    public static void main(String[] args) {
//        AddOperation addOperation = new AddOperation();

        Calculator cal = new Calculator(new AddOperation()
//                addOperation,
//                new SubstractOperation(),
//                new MultiplyOperation(),
//                new DivideOperation()
        );
        System.out.println(cal.calculate(10, 10));
        cal.setOperation(new MultiplyOperation());
        System.out.println(cal.calculate(10, 10));
    }
}
