package homework.homework3;

public class Calculator {

    private AbstractOperation operation;
//    private final AddOperation addOperation;
//    private final SubstractOperation substractOperation;
//    private final MultiplyOperation multiplyOperation;
//    private final DivideOperation divideOperation;


    public Calculator(AbstractOperation operation){
        this.operation = operation;
    }
//    public Calculator (AddOperation addOperation, SubstractOperation substractOperation,
//                       MultiplyOperation multiplyOperation, DivideOperation divideOperation){
//        this.addOperation = addOperation;
//        this.substractOperation = substractOperation;
//        this.multiplyOperation = multiplyOperation;
//        this.divideOperation = divideOperation;
//
//    }

    public void setOperation(AbstractOperation operation){
        this.operation = operation;
    }

    public double calculate(int firstNumber, int secondNumber){

        double answer = 0;

        answer = operation.operate(firstNumber, secondNumber);

//        switch (operator){
//            case "add":
//                operation = addOperation.addOperate(firstNumber, secondNumber);
//                break;
//            case "substract":
//                operation = substractOperation.subOperate(firstNumber, secondNumber);
//                break;
//            case  "multiply":
//                operation = multiplyOperation.mulOperate(firstNumber, secondNumber);
//                break;
//            case "divide":
//                operation = divideOperation.divOperate(firstNumber, secondNumber);
//                break;
//            case "remainder":
//                operation = firstNumber % secondNumber;
//                break;
//            default:
//                System.out.println("잘 못 입력했습니다. 다시 입력하세요.");
//        }
        return answer;

    }
}
