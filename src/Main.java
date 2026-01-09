import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        char[] p = s.toCharArray();
        for (int i = 0; i < p.length; i++) {
            char c = p[i];
            if (c == '*' || c == '/') {
                s = s.substring(0, i - 1) + "(" + s.substring(i - 1, i + 2) + ")" + s.substring(i + 2);
            }
        }
        System.out.println(s);
//        for (char c : p) {
//            if (c == '(') {
//                s.push(c);
//            } else {
//                if (s.isEmpty()) {
//
//                } else {
//                    s.pop();
//                }
//            }
//        }

    }
}