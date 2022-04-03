package questions;

import java.util.Stack;

public class reversestring {
    public static void main(String[] args){
        System.out.println("Dog");
        String r = reverse("dog");
        System.out.println(r);
    }
    public static String reverse(String s){
        Stack<Character> reversed = new Stack<Character>();

        for(int i = s.length() - 1; i >= 0; i--){
            // System.out.println(s.charAt(i));
            reversed.push(s.charAt(i));
        }

        System.out.println(reversed.toString());
        
        return s;
    }
}
