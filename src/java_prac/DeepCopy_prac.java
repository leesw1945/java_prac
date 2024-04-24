package java_prac;

import java.util.Arrays;

public class DeepCopy_prac {
    public static void main(String[] args) {

        //얕은 복사 예시
        int[] a = {1, 2, 3, 4};

        //이렇게 복사하면 b는 a와 같은 힙영역 메모리 주소를 바라보게 된다.
        int[] b = a;

        //b에서 배열의 값을 바꾸면
        b[0] = 3;

        //a에도 영향을 미치게 된다. 매우 안 좋다.
        System.out.println("a = " + a[0]);

        //깊은 복사 예시
        int[] c = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        c[3] = 6;

        System.out.println("a = " + a[3]);
        System.out.println("c = " + c[3]);
        System.out.println("a.length = " + a.length);

        //깊은 복사 메서드
        int[] d = a.clone();

        //단 clone() 메서드는 2차원 이상 배열에서는 얕은 복사로 동작함
        for (int i = 0; i < d.length; i++) {
            System.out.println("d = " + d[i]);
        }

        //2차원 배열 clone 테스트
        int[][] e = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] f = e.clone();

        f[0][0] = 3;
        //진짜 얕은 복사로 복사된다
        System.out.println("e = " + e[0][0]);
        System.out.println("f = " + f[0][0]);

        //2차원 배열 깊은 복사 테스트
        //e.length 두개를 아래 처럼 사용하면 안 될 듯 하다. 나는 3x3 이라서 된 듯
        int[][] g = new int[e.length][e.length];

        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e.length; j++) {
                g[i][j] = e[i][j];
            }
        }

        g[2][2] = 10;

        //오 잘 된당
        for(int i = 0; i < e.length; i++) {
            System.out.print(Arrays.toString(e[i]) + " ");
        }
        System.out.println();

        for(int i = 0; i < g.length; i++) {
            System.out.print(Arrays.toString(g[i]) + " ");
        }
        System.out.println();

        //2차원 배열 깊은 복사 clone 메서드 활용

        int[][] h = new int[e.length][e.length];

        //이것도 되네
        for (int i = 0; i < e.length; i++){
            h[i] = e[i].clone();
        }

        h[1][0] = 10;

        System.out.print("e = ");
        for (int i = 0; i < e.length; i++){
            System.out.print(Arrays.toString(e[i]) + " ");
        }
        System.out.println();

        System.out.print("h = ");
        for (int i = 0; i < h.length; i++){
            System.out.print(Arrays.toString(h[i]) + " ");
        }
        System.out.println();

        //혼자 겁나게 만들었는데 젤 좋은 방법이 있다..
        int[] k = Arrays.copyOf(a, a.length); //배열과 legnth값도 같이 넣는다.

        k[3] = 10;
        System.out.print("a = " + Arrays.toString(a));
        System.out.println();
        System.out.print("k = " + Arrays.toString(k));
        System.out.println();

        //2차원 배열에서는 Arrays.copyOf()도 얕은 복사가 된다..;
        //int[][] f = e.clone(); 근본적인 해결방법이 아니라해서 Arrays.copy를 쓴건데
        int[][] l = Arrays.copyOf(e, e.length);

        l[2][0] = 1;

        System.out.print("e = ");
        for (int i = 0; i < e.length; i++){
            System.out.print(Arrays.toString(e[i]) + " ");
        }
        System.out.println();

        System.out.print("l = ");
        for (int i = 0; i < l.length; i++){
            System.out.print(Arrays.toString(l[i]) + " ");
        }

        //2차원 배열 깊은 복사는 82번 라인
        //for (int i = 0; i < e.length; i++){
        //            h[i] = e[i].clone();
        //        }
        //이게 좋겠다.
    }
}
