package java_prac;

import java.util.Arrays;

public class DynamicArry_prac {
    public static void main(String[] args) {

        // 가변배열 / 동적배열
        int[][] arr = new int[3][];

        // 배열 원소마다 각기 다른 크기로 지정
        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[1];

        // 중괄호로 초기화 할 때도 가능함
        int[][] arr2 = {
                {10, 20},
                {10, 20, 30, 40},
                {10}
        };

        // 2차원 배열 조회
        for (int i =0; i< arr2.length; i++){
            for(int j =0; j <arr2[i].length; j++){
                System.out.println(arr2[i][j]);
            }
        }

        // 최대값 구하기
        int[] arr3 = {3, 2, 1, 5, 1};

        // 최대값 초기화 세팅
        int max = arr3[0];

        // 최대값 구하기 로직
        //향상된 for문에 선언된 변수는 인덱스가 아니라 값 자체가 들어간다.
        for (int num : arr3) {
            if(num > max){
                max = num;
            }
        }
        System.out.println("최대값은 "+max);

        int min = arr3[0];

        //향상된 for문에 선언된 변수는 인덱스가 아니라 값 자체가 들어간다.
        for (int num : arr3) {
            if (num < min){
                min = num;
            }
        }
        System.out.println("최소값은 "+min);
    }
}
