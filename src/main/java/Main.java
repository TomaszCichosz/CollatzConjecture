import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {  //http://pl.spoj.com/problems/PTCLTZ/
    public static void main(String[] args) throws IOException {
        int s, t;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        t = Integer.parseInt(reader.readLine());
        for (int i = 0; i < t; i++) {
            s = Integer.parseInt(reader.readLine());
            writer.println(collatz(s, 0));
        }
        writer.close();
    }

    private static int collatz(int s, int n) {
        while (!(s == 1)) {
            if (s % 2 == 0) {
                n++;
                return collatz(s / 2, n);
            } else {
                n++;
                return collatz(3 * s + 1, n);
            }
        }
        return n;
    }

}
