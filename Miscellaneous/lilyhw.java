//Link : https://www.hackerrank.com/challenges/lilys-homework/problem

import java.io.*;

import java.util.*;

 

public class Solution {

 

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] nums = new int[n];

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<n;i++){

            nums[i] = in.nextInt();

            hm.put(nums[i],i);

        }

        int[] sortedNum = nums.clone();

        Arrays.sort(sortedNum);

        int countAsc = countSwap(nums, sortedNum, hm);

        for(int i=0;i<n/2;i++){

            int tmp = sortedNum[i];

            sortedNum[i] = sortedNum[n-i-1];

            sortedNum[n-i-1] = tmp;

        }

        int countDes = countSwap(nums, sortedNum, hm);

        System.out.println((countAsc<countDes) ? countAsc:countDes);

    }

    static int countSwap(int[] nums, int[] sNums, HashMap<Integer, Integer> hm1){

        HashMap<Integer, Integer> hm = new HashMap<>(hm1);

        int[] oNums = nums.clone();

        int swaps = 0;

        for(int i=0;i<oNums.length;i++){

            if(oNums[i] != sNums[i]){

                swaps++;

                int tmp = hm.get(sNums[i]);

                hm.put(sNums[i], i);

                hm.put(oNums[i], tmp);

                int tmpO = oNums[i];

                oNums[i] = sNums[i];

                oNums[tmp] = tmpO;

            }

        }

        return swaps;

    }

}
