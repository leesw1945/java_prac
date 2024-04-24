package java_prac;

import java.util.Arrays;

public class Arry_prac {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4};
        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(arr[2]);

        System.out.println("----------------------");

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("----------------------");

        //향상된 for문에 선언된 변수는 인덱스가 아니라 값 자체가 들어간다.
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("----------------------");

        //Arrays 라이브러리를 임포트 시켜 사용 가능

        Arrays.fill(arr, 1);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
