package validparentheses;

import java.util.Stack;

public class Solution {

    public static boolean isValid(String s){
        Stack<Character> parents = new Stack<>();
        for(char c : s.toCharArray())
            if(c == '(' || c == '[' || c == '{'){
                parents.push(c);
            } else if(parents.empty() || Math.abs(c - parents.pop()) > 2){
                return false;
            }
        return parents.empty();
    }

    public static void main(String[] args) {
        System.out.println(isValid( "()[]{}"));
    }



}
