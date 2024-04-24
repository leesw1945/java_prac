package java_prac;

import java.util.Arrays;

public class MultiArry_prac {
    public static void main(String[] args){

        // 다차원 배열 / 보통 2차원 배열까지만 사용

//        int[][] array = {
//                {1, 2, 3},
//                {4, 5, 6}
//        };

        int[][] array = new int[2][3]; // 최초 선언

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 0;  // i, j 는 위 노란색 네모박스 안에있는 숫자를 의미하며 인덱스 라고 부릅니다.
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
