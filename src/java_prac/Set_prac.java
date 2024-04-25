package java_prac;

import java.util.HashSet;
import java.util.Set;

public class Set_prac {
    public static void main(String[] args) {

        // Set(집합) : 순서 없고, 중복 없음
        // 순서가 보장되지 않는 대신 중복을 허용하지 않도록 하는 프로그램에서
        // 사용할 수 있는 자료구조
        // Set은 그냥 쓸 수도 있지만 HashSet, TreeSet 등 응용하여 사용 가능
        // Set은 생성자가 없기 때문에 바로 생성할 수 없음
        // 생성자가 존재하는 HashSet을 이용하여 구현 가능

        // set은 index가 없기 때문에 get() 메소드를 제공하지 않는다.
        // 따라서 Iterator를 사용해야한다.

        Set<Integer> intSet = new HashSet<>(); // 선언 및 생성

        intSet.add(1);
        intSet.add(13);
        intSet.add(2);
        intSet.add(4);
        intSet.add(13);
        intSet.add(1);

        // 중복된 값은 1개만 출력됨
        for (Integer i : intSet) {
            System.out.println(i);
        }

        // contains 인자값을 포함하고 있는지 확인 가능 (true/false 반환)
        System.out.println(intSet.contains(5));
        System.out.println(intSet.contains(2));
    }
}
