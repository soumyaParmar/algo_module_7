
//Q1 Given a stream of incoming numbers, find the average or mean of the stream at every point.

import java.util.*;

public class Main {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       double ans[] = new double[n];

       for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
       } 
       int sum = 0;
       int count = 0;
       for(int i=0;i<n;i++){
           sum += arr[i];
           count++;
           ans[i] = sum/count;
       }
       for(double i : ans){
           System.out.print(i + " ");
       }
    }
}
