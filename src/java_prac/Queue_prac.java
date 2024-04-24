package java_prac;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_prac {
    public static void main(String[] args) {

        // Queue : FIFO 구조
        // 그래프의 넓이 우선 탐색(BFS)에서 사용
        // 컴퓨터 버퍼에서 주로 사용, 마구 입력 되었으나 처리하지 못할 때
        // 버퍼 (Queue)를 만들어 대기 시킴

        // 자바에서 큐는 LinkedList를 활용하여 생성해야한다.
        // 그렇기에 Queue와 LinkedList가 모두 import되어 있어야 사용 가능

        // add, peek, poll
        // 큐는 생성자가 없는 인터페이스

        Queue<Integer> intQueue = new LinkedList<>();

        // add 메소드를 사용하여 값을 추가 / offer도 사용 가능 (실패 시 false)
        // 큐에 공간이 없어서 삽입에 실패하면 IllegalStateException 발생
        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        // poll 메소드를 사용하여 값을 제거 / remove 메소드도 가능
        // clear() 큐 비우기
        // poll은 큐가 비어있을 때 null값을 반환함
        while (!intQueue.isEmpty()){
            System.out.println(intQueue.poll());
        }
        System.out.println(intQueue.size());

        // 추가
        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        // peek 맨 앞에 값 조회
        System.out.println(intQueue.peek());
        // size 큐 크기 조회
        System.out.println(intQueue.size());

    }
}
