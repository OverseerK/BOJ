import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class G14464 {

    static int[] hens;
    static int[][] cows;

    static boolean canHelp(int cow, int hen) {
        return (cows[cow][0] <= hens[hen] && hens[hen] <= cows[cow][1]);
    }

    public static int bs(int n) {
        int low = 0;
        int high = hens.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (cows[n][0] <= hens[mid] && hens[mid] <= cows[n][1]) {
                return mid;
            } else if (cows[n][1] < hens[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] in = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int c = in[0];
        int n = in[1];
        hens = new int[c];
        cows = new int[n][2];
        for (int i = 0; i < c; i++) {
            hens[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(hens);
        for (int i = 0; i < n; i++) {
            int[] inp = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            cows[i][0] = inp[0];
            cows[i][1] = inp[1];
        }
        Arrays.sort(cows, Comparator.comparingInt((int[] o) -> o[1]));
        int opt = 0;
        ArrayList<Integer> helped = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int midhen = bs(i);
            int lo = midhen;
            int hi = midhen;
            if (midhen != -1) {
                while (lo > 0 && canHelp(i, lo - 1)) {
                    lo--;
                }
                while (hi < hens.length - 1 && canHelp(i, hi + 1)) {
                    hi++;
                }
                for (int j = lo; j <= hi; j++) {
                    if (!helped.contains(j)) {
                        opt++;
                        helped.add(j);
                        break;
                    }
                }
            }
        }
        System.out.println(opt);
    }

}
