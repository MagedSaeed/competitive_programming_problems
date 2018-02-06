import java.util.Scanner;

public class P10346 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        while (!line.equals("")) {
            int n = Integer.parseInt(line.split(" ")[0]);
            int k = Integer.parseInt(line.split(" ")[1]);
            int total = n;
            int newCig = n/k;
            while(newCig >= 1) {
                total += newCig;
                newCig /= k;
            }
            System.out.println(total);
            line = sc.nextLine();
        }
    }
}
