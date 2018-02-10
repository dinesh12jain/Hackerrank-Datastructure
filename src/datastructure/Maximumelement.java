package DataStructure;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Maximumelement {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> maxStack = new Stack<Integer>();
        
        while (n > 0) {
            int choice = sc.nextInt();
            if (choice == 1) {
                Integer val = sc.nextInt();
                if (val >= getStackMax(maxStack))
	                maxStack.push(val);
                stack.push(val);
            } else if (choice == 2) {
                Integer value = stack.pop();
                if (value == getStackMax(maxStack))
                	maxStack.pop();
            } else if (choice == 3) {
                if (!maxStack.isEmpty()) {
	                System.out.println(getStackMax(maxStack));
                }
            }
            n--;
        }
	    sc.close();
    }
	
    private static Integer getStackMax(Stack<Integer> s) {
        if (s.isEmpty()) 
            return Integer.MIN_VALUE;
        return s.peek();
    }

    
}