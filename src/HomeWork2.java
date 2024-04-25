import java.util.*;

public class HomeWork2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> arrList = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Map<Integer, String> map = new HashMap<>();

        String recipe;
        String cookName = "";

        System.out.print("저장할 자료구조명을 입력해주세요: ");
        String collecName = sc.nextLine();
        String collecNameLow = collecName.toLowerCase();

        if (collecNameLow.equals("list")){
            System.out.print("요리 제목을 입력해주세요: ");
            cookName = sc.nextLine();

            System.out.println("요리 레시피를 한 문장씩 입력해주세요 (종료 시 '끝'을 입력해주세요)");

        } else if (collecNameLow.equals("set")) {
            System.out.print("요리 제목을 입력해주세요: ");
            cookName = sc.nextLine();

            System.out.println("요리 레시피를 한 문장씩 입력해주세요 (종료 시 '끝'을 입력해주세요)");
        } else if (collecNameLow.equals("map")) {
            System.out.print("요리 제목을 입력해주세요: ");
            cookName = sc.nextLine();

            System.out.println("요리 레시피를 한 문장씩 입력해주세요 (종료 시 '끝'을 입력해주세요)");
        } else {
            System.out.println("문자를 잘 못 입력하셨습니다. 다시 입력하세요");
            System.exit(0);
        }


        if (collecNameLow.equals("list")) {
            while (true) {
                recipe = sc.nextLine();
                if (recipe.equals("끝")) {
                    break;
                }
                arrList.add(recipe);
            }

            cookName = "[ " + collecName + "으로 저장된 " + cookName + " ]";
            System.out.println(cookName);
            for (int i = 0; i < arrList.size(); i++) {
                int num = i + 1;
                System.out.println(num + ". " + arrList.get(i));
            }

        } else if (collecNameLow.equals("set")) {
            while (true) {
                recipe = sc.nextLine();
                if (recipe.equals("끝")) {
                    break;
                }
                set.add(recipe);
            }
            cookName = "[ " + collecName + "으로 저장된 " + cookName + " ]";
            System.out.println(cookName);

            // set은 index가 없기 때문에 get() 메소드를 제공하지 않는다.
            // 따라서 Iterator를 사용해야한다.
            Iterator iter = set.iterator();
            for (int i = 0; i < set.size(); i++) {
                int num = i + 1;
                System.out.println(num + ". " + iter.next());
            }

        } else if (collecNameLow.equals("map")) {
            int lineNum = 1;
            while (true) {
                recipe = sc.nextLine();
                if (recipe.equals("끝")) {
                    break;
                }
                map.put(lineNum++, recipe);
            }

            cookName = "[ " + collecName + "으로 저장된 " + cookName + " ]";
            System.out.println(cookName);

            for (int i = 0; i < map.size(); i++) {
                int num = i + 1;
                System.out.println(num + ". " + map.get(i + 1));
            }
        }
    }
}

// 코드 회고
// if문을 쓸지 switch를 쓸지 고민하다가 if문이 3개 이하면 switch보다
// 연산에 있어서 좀 더 효율적이다 라는 글을 보고 if문을 사용
// 처음엔 각 컬렉션만 if문을 사용하여 3개면 되겠지 라고 생각했으나
// 소스를 짜다보니 상단에 입력 요청용 sout.print들 또한 if문을 사용하게 되었다
// 원래 입력 요청용 sout.print는 공용으로 사용하니 제일 상단에
// 한번씩만 적어두고 각 컬렉션 마다 가져다 쓰려했으나
// collecNameLow.equals("list")) 이게 인자를 하나씩 밖에 안 받는다..
// 게다가 마지막에 '끝'을 입력하면 종료하기 기능까지 구현해야해서
// 어쩔 수 없이 if문을 사용하였고 그 결과 가독성이 떨어지고 if문도 많아지고
// 연산도 많아지고 복잡해지고 쓸데없이 변수의 스코프가 넓어졌다..
// 소스 짜는데 한 세월 걸린건 덤..
// 결론: 이런건 switch가 정답
