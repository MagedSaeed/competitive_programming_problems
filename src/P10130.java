import java.util.Arrays;
import java.util.Scanner;

class P10130 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            int numberOfObjects = sc.nextInt();
            int [] v = new int[numberOfObjects+1];
            int [] w = new int[numberOfObjects+1];
            v[0] = 0;
            w[0] = 0;
            for(int i=1; i<=numberOfObjects; i++){

                v[i] = sc.nextInt();
                w[i] = sc.nextInt();

            }
//            System.out.println(Arrays.toString(v));
//            System.out.println(Arrays.toString(w));
            int numberOfPeople = sc.nextInt();
            int maxW = 0;
            for(int i=0; i<numberOfPeople; i++)
                maxW+= sc.nextInt();

            System.out.println("max goods: "+knapsack(numberOfObjects, maxW, w, v));
        }
    }

    private static int knapsack(int n, int c, int[] w, int[] v) {
        if(n == 0 || c == 0)
            return 0;
        else if (w[n] > c)
            return knapsack(n-1, c, w, v);
        else{
            int val1 = knapsack(n-1, c, w, v);
            int val2 = v[n] + knapsack(n-1, c-w[n], w, v);
            return Math.max(val1, val2);
        }
    }

}
