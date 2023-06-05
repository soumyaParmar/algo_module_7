/*  
Q3 Given a string S as input. Delete the characters at odd indices of the string.

Example 1:
Input: S = "Geeks"
Output: "Ges" 
Explanation: Deleted "e" at index 1
and "k" at index 3.
Example 2:
Input: S = "GeeksforGeeks"
Output: "GesoGes"
Explanation: Deleted e, k, f, r, e
k at index 1, 3, 5, 7, 9, 11.

*/

import java.util.*;

public class Main {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       String s = "";
       for(int i=0;i<str.length();i++){
           if(i%2==0){
               s+=str.charAt(i);
           }
       }
       System.out.print(s);
    }
}
