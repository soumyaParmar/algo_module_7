/*Q2 Given a list of names, display the longest name.

Example:
Input:
N = 5
names[] = { "God", "Godz", "Godzilla",
  "Coedify", "Jerry" }

Output:
Godzilla */



import java.util.*;

public class Main {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       String arr[] = new String[n];

       for(int i=0;i<n;i++){
           arr[i] = sc.next();
       } 
       int res = 0;
       String ans = "";
       int max = Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
           String s = arr[i];
           int len = s.length();
           if(max<len){
               max = len;
               ans = s;
           }
       }
       System.out.print(ans);
    }
}
