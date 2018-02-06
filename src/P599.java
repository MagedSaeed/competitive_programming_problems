import java.util.ArrayList;
import java.util.Scanner;

public class P599 {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int testCases = sc.nextInt();

        while (testCases-- > 0) {
            ArrayList<Character> countList = new ArrayList<>();
            int treeCount = 0;
            int acornCount = 0;
            String line = sc.next();
            while(line.charAt(0) != '*'){
                if(!countList.contains(line.charAt(1)) && !countList.contains(line.charAt(3)))
                    treeCount++;
                countList.add(line.charAt(1));
                countList.add(line.charAt(3));
                line = sc.next();
            }
            String lastLine = sc.next();
            for(int i=0; i<lastLine.length(); i++)
                if(!countList.contains(lastLine.charAt(i)) && lastLine.charAt(i)!=',')
                    acornCount++;
//            System.out.println();
            System.out.println("There are "+treeCount+" tree(s) and "+ acornCount +" acorn(s).");
        }
        System.out.println();
    }
}
