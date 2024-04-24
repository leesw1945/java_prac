package java_prac;

import java.util.Stack;

public class Stack_prac {
    public static void main(String[] args) {

        // Stack
        // 수직으로 값을 쌓아놓고, 넣었다가 뺀다. FILO (Basket)
        // push, peek, pop
        // 최근 저장된 데이터를 나열하고 싶거나, 데이터의 중복 처리를 막고 싶을 때 사용

        Stack<Integer> intStack = new Stack<Integer>();

        // push는 데이터 추가 메소드
        intStack.push(10);
        intStack.push(4);
        intStack.push(2);

        //pop은 최근에 추가된 데이터 삭제
        while (!intStack.isEmpty()){
            System.out.println(intStack.pop());
        }

        // 다시 추가
        intStack.push(10);
        intStack.push(4);
        intStack.push(2);

        // peek는 최근에 추가된 데이터 조회
        System.out.println(intStack.peek());

        // size 스택 크기 확인
        System.out.println(intStack.size());

        // search 인자값으로 받은 데이터의 위치 반환
        // 인덱스를 반환하는 것이 아니라 순번을 반환하는 것이다.
        // 인자값이 스택구조에서 몇번째에 있는지를 반환, 2가 가장 위에 있기 때문에 1을 반환함
        System.out.println(intStack.search(2));
    }
}
