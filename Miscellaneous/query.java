/**
Task :

Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. 
You will then be given an unknown number of names to query your phone book for. 
For each name queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; 
if an entry for name is not found, print Not found instead.

Note: Your phone book should be a Dictionary/Map/HashMap data structure.

#Day 8

Link : https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem

*/

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
       Map<String,Long> phonebook = new java.util.HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++)
        {
            String name = in.next();// to get names i.e keys
            long phone = in.nextLong();// to get numbers i.e values
            phonebook.put(name, phone);
            //System.out.println(phonebook);
        }
        while(in.hasNext())
        {
            String name = in.next();  // to enter key to fetch a specific value
            if(phonebook.containsKey(name)== true)
            {
                System.out.println(name  + "=" +phonebook.get(name));
               
            }else 
            {
                 System.out.println("Not found");                
            }
            
        }
        in.close();
    }
}
