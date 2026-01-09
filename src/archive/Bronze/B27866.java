package archive.Bronze;

import java.io.*;

public class B27866 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int i = Integer.parseInt(bf.readLine()) - 1;
        System.out.println(s.toCharArray()[i]);
    }

}