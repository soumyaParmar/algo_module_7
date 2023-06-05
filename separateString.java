/*
Q4 Given a string S which consists of alphabets , numbers and special characters. You need to write a program to split the strings in three different strings S1, S2 and S3 such that the string S1 will contain all the alphabets present in S , the string S2 will contain all the numbers present in S and S3 will contain all special characters present in S.  The strings S1, S2 and S3 should have characters in same order as they appear in input.

Example 1:
Input:
S = **Docoding123456789everyday##
Output:
Docodingeveryday
123456789
**##
*/


import java.util.*;

public class Main {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       String s1 = "";
       String s2 = "";
       String s3 = "";

       for(int i=0;i<str.length();i++){
           if((str.charAt(i)>='A' || str.charAt(i)>='a') && (str.charAt(i)<='Z' || str.charAt(i)<='z')){
               s1+=str.charAt(i);
           }else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
               s2+=str.charAt(i);
           }else s3 += str.charAt(i);
       }
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
    }
}
