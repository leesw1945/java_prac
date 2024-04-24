import java.util.*;

public class HomeWork2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, String> stringMap = new HashMap<>();

        System.out.print("저장할 자료구조명을 입력하세요: ");
        String collecName = sc.nextLine();
        System.out.print("요리 제목을 입력하세요: ");
        String cookName = sc.nextLine();
        System.out.println("레시피를 입력하세요. (입력을 마치면 '끝'을 입력하세요)");
        String recipe = sc.nextLine();
        String recipe1 = sc.nextLine();
        String recipe2 = sc.nextLine();
        String recipe3 = sc.nextLine();
        String recipe4 = sc.nextLine();
        String recipe5 = sc.nextLine();
        String recipe6 = sc.nextLine();
        String recipe7 = sc.nextLine();
        String recipe8 = sc.nextLine();
        String recipe9 = sc.nextLine();
        String end = sc.nextLine();


        System.out.println("["+collecName+" 으로 저장된"+cookName+"]");
        stringMap.put("1.", recipe);
        stringMap.put("2.", recipe1);
        stringMap.put("3.", recipe2);
        stringMap.put("4.", recipe3);
        stringMap.put("5.", recipe4);
        stringMap.put("6.", recipe5);
        stringMap.put("7.", recipe6);
        stringMap.put("8.", recipe7);
        stringMap.put("9.", recipe8);
        stringMap.put("10.", recipe9);

        List<String> keyset = new ArrayList<>(stringMap.keySet());
        Collections.sort(keyset);

        for (String key : keyset){
            System.out.print(""+key);
            System.out.println(" "+ stringMap.get(key));
        }

    }
}
