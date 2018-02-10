package DataStructure;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotation {

    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        
         int[] array = new int[n];
        for(int i=0; i<n;i++) {
            array[(i+n-d)%n] = in.nextInt();
        }
        for(int i=0; i<n;i++) {
            System.out.print(array[i] + " ");
        }  


        in.close();
    }
}