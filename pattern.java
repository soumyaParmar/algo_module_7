/*
Q5 Given a string of a constant length, print a triangle out of it. The triangle should start with the given string and keeps shrinking downwards by removing one character from the begining of the string. The spaces on the left side of the triangle should be replaced with dot character.
 
Example 1:
Input:
S = @io30 
Output:
 @io30
.io30
..o30
...30
....0

*/


public class Main {
    public static void main(String args[]) {
        String s = "@io30";

        System.out.println(s);
        for(int i=0;i<s.length();i++){
             String str = "";
            for(int j=i;j>=0;j--){
                str += ".";
            }
            
            for(int j=i+1;j<s.length();j++){
                str += s.charAt(j);
            }
            System.out.println(str); 
        }
        
    }
}
