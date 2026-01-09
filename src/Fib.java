import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fib {

    static int[] n = new int[666];

    //기본dp
    static int fib(int i) {
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            if (n[i] == 0) {
                n[i] = fib(i - 1) + fib(i - 2);
            }
            return n[i];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n[0] = 0;
        n[1] = 1;
        System.out.println(fib(Integer.parseInt(bf.readLine())));
    }

}