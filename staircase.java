# Link : https://www.hackerrank.com/challenges/staircase/problem

import java.util.Scanner;
public class staircase {
    public static void main(String[] args){
        int input1;
        Scanner user_input=new Scanner(System.in);
        input1=user_input.nextInt();
        for(int i=1;i<=input1;i++){
            for(int j=0;j<input1;j++){
                if(i+j>=input1){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }System.out.println("");
        }
    }
}
