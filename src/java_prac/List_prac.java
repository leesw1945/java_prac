package java_prac;

import java.util.ArrayList;
import java.util.LinkedList;

public class List_prac {
    public static void main(String[] args) {

        // List 순서가 있는 데이터의 집합 -> Array(최초길이를 알아야 함)
        // 처음에 길이를 몰라도 만들 수 있음
        // 1) Array -> 정적배열
        // 2) List(ArrayList) -> 동적배열(크기가 가변적으로 늘어난다)
        // 생성 시점에 작은 연속된 공간을 요청해서 참조형 변수들을 담아놓는다.
        // 값이 추가될 때 더 큰 공간이 필요하면 더 큰 공간을 받아서 저장하기 때문에 상관없다.

        ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언 + 생성

        intList.add(1);
        intList.add(2);
        intList.add(3);

        System.out.println(intList.get(1));

        // 값 수정
        intList.set(1, 10);
        System.out.println(intList.get(1));

        System.out.println("----------------------");
        // 삭제
        intList.remove(0);
        System.out.println(intList.get(1));

        // 전체 삭제
        intList.clear();
        System.out.println(intList.toString());

        //----------------------------------------------------

        // linked list
        // 메모리에 남는 공간을 요청해서 여기 저기 나누어서 실제 값을 담아둔다.
        // 실제 값이 있는 주소값으로 목록을 구성하고 저장하는 자료구조
        
        // 기본적 기능은 -> ArrayList와 동일
        // LinkedList는 값을 여기 저기 나누어 저장하기 때문에 조회 속도가 느리다
        // 하지만 값을 추가하거나, 삭제할 때는 빠르다.
        // ArrayList는 값 수정 시 한 개씩 모두 확인하기 때문에 상대적으로 느림

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println("--------------------------------");
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));

        System.out.println(linkedList.toString()); // 조회 시 arraylist보다 속도가 느림

        linkedList.add(200);
        System.out.println(linkedList.toString()); // 추가, 삭제 시 더 빠름

        linkedList.add(2, 4);
        System.out.println(linkedList.toString());

        linkedList.set(1, 30);
        System.out.println(linkedList.toString()); // 수정

        linkedList.remove(1);
        System.out.println(linkedList.toString()); // 삭제

        linkedList.clear();
        System.out.println(linkedList.toString()); // 모두 삭제
    }
}
