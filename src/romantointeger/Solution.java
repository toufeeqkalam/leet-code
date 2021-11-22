package romantointeger;

import java.util.HashMap;

public class Solution {

    public static int romanToInt(String s){

        if(s.length() == 0){
            return 0;
        }

        HashMap<Character, Integer> romanToInteger = new HashMap<>();
        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);

        int result = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(romanToInteger.get(s.charAt(i)) < romanToInteger.get(s.charAt(i+1))){
                result = result + romanToInteger.get(s.charAt(i)) * (-1);
            }else {
                result = result + romanToInteger.get(s.charAt(i));
            }
        }

        result = result + romanToInteger.get(s.charAt(s.length() -1));

        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
    }

}
