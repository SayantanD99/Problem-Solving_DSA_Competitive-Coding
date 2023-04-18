import java.util.*;

class Test {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);
        
        int testCases = sc.nextInt();
        
        StringBuffer output = new StringBuffer();
        
	    sc.nextLine();
	
        while (testCases-- > 0) {
        
            String[] input = sc.nextLine().trim().split(" ");
            
            int L = Integer.parseInt(input[0]);
            int R = Integer.parseInt(input[1]);

            int count = (R - L) / 2;
            if ((L & 1) == 1 || (R & 1) == 1)
             count++;
         
            output.append((count & 1) == 1 ? "Odd\n" : "Even\n");
        }

        System.out.print(output);
    }
}
