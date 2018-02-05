import java.util.Scanner;

public class P1225 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int testcases = sc.nextInt();
        while(testcases-->0){
            int n = sc.nextInt();
            int [] arr = new int [10];
            for(int j = 1; j<n+1; j++){
                int num = j;

                while(num>9){
                    arr[num%10]++;
                    num/=10;
                }
                arr[num]++;

            }
            for(int i = 0;i<arr.length;i++){
                if(i!=9)
                    System.out.print(arr[i]+" ");
                else
                    System.out.print(arr[i]+"");
            }

            System.out.println();
        }



    }
}