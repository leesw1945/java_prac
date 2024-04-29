package homework;// 문자 -> 숫자

import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("내가 좋아하는 요리 제목을 먼저 입력합니다: ");
        String cookName = sc.nextLine();
        System.out.print("별점을 1~5사이 실수로 입력해주세요: ");
        double cookStar = sc.nextDouble();
        double cookStarPer = cookStar * 20;
        String integerDelete = sc.nextLine();  //라인피드 삭제
        System.out.println("요리 레시피 10문장을 입력해주세요");
        String cookRecipe1 = sc.nextLine();
        String cookRecipe2 = sc.nextLine();
        String cookRecipe3 = sc.nextLine();
        String cookRecipe4 = sc.nextLine();
        String cookRecipe5 = sc.nextLine();
        String cookRecipe6 = sc.nextLine();
        String cookRecipe7 = sc.nextLine();
        String cookRecipe8 = sc.nextLine();
        String cookRecipe9 = sc.nextLine();
        String cookRecipe10 = sc.nextLine();

        System.out.println("["+cookName+"]");
        System.out.println("별점 : "+(int)cookStar+" ("+cookStarPer+")");
        System.out.println("1. "+cookRecipe1);
        System.out.println("2. "+cookRecipe2);
        System.out.println("3. "+cookRecipe3);
        System.out.println("4. "+cookRecipe4);
        System.out.println("5. "+cookRecipe5);
        System.out.println("6. "+cookRecipe6);
        System.out.println("7. "+cookRecipe7);
        System.out.println("8. "+cookRecipe8);
        System.out.println("9. "+cookRecipe9);
        System.out.println("10. "+cookRecipe10);
    }

}