package java_prac;

import java.util.HashMap;
import java.util.Map;

public class Map_prac {
    public static void main(String[] args) {

        // Map : key - value pair 중요
        // key라는 값으로 unique하게 보장 되어야함
        // Map -> HashMap, TreeMap 응용 가능

        Map<String, Integer> intMap = new HashMap<>();

        // 키 값은 중복되어선 안 됨
        // 키 값이 중복되면 value값을 덮어쓰기함
        intMap.put("가", 11);
        intMap.put("나", 12);
        intMap.put("다", 13);
        intMap.put("다", 14); // 중복 key
        intMap.put("다", 15); // 중복 key
        intMap.put("다", 16); // 중복 key

        // 키 값 전체 출력
        // intMap.keySet() -> 키 값만 빼서 배열로 만든다
        for (String key : intMap.keySet()) {
            System.out.println(key);
        }

        // intMap.values() -> value 값만 빼서 배열로 만든다
        for (int value : intMap.values()) {
            System.out.println(value);
        }

        // get(key) -> 해당 key값의 value를 가져옴
        System.out.println(intMap.get("다"));
    }
}
