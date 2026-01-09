package archive.Silver.DP;

public class S1463X {
    //        int n = scan.nextInt();
//        int c = 0;
//        ConcurrentHashMap<Integer, Integer> num = new ConcurrentHashMap<>();
//        num.put(n, c);
//        while (!num.containsKey(1)) {
//            for (int x : num.keySet()) {
////                if (num.get(x) == c) {
//                System.out.println(x);
//                if (x % 3 == 0 && !num.containsKey(x / 3)) {
//                    System.out.println(x / 3);
//                    num.put(x / 3, c + 1);
//                }
//                if (x % 2 == 0 && !num.containsKey(x / 2)) {
//                    System.out.println(x / 2);
//                    num.put(x / 2, c + 1);
//                }
//                if (!num.containsKey(x - 1)) {
//                    System.out.println(x - 1);
//                    num.put(x - 1, c + 1);
//                }
//                num.remove(x);
//                c++;
//                System.out.println(num);
////                }
//            }
//        }
//        System.out.println(num);
//        System.out.println(num.get(1));

//    import java.util.*;
//    public class Main {
//        static Scanner scan = new Scanner(System.in);
//        public static void main(String[] args) {
//            String s = scan.nextLine();
//            char[] charList = s.toCharArray();
//            HashMap<Character, Integer> counts = new HashMap<>();
//            for (char uc : charList) {
//                char c = Character.isUpperCase(uc) ? uc : Character.toUpperCase(uc);
//                if (counts.containsKey(c)) {
//                    counts.replace(c, counts.get(c) + 1);
//                } else {
//                    counts.put(c, 1);
//                }
//            }
//            int count = 0;
//            char result = 0;
//            for (char c : counts.keySet()) {
//                if (counts.get(c) > count) {
//                    result = c;
//                    count = counts.get(c);
//                } else if (counts.get(c) == count) {
//                    result = '?';
//                    break;
//                }
//            }
//            System.out.print(result);
//        }
//    }
}
