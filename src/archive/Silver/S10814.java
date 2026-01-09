package archive.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class S10814 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Man[] men = new Man[n];
        for (int i = 0; i < n; i++) {
            String[] in = bf.readLine().split(" ");
            men[i] = new Man(Integer.parseInt(in[0]), in[1]);
        }
        Arrays.sort(men, Comparator.comparingInt(o -> o.age));
        for (int i = 0; i < n; i++) {
            System.out.println(men[i].age + " " + men[i].name);
        }
    }

    public static class Man {
        int age;
        String name;

        public Man(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

}
