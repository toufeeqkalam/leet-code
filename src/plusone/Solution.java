package plusone;

import java.util.Arrays;

public class Solution {

    public static int[] plusOne(int[] digits) {
        if(digits[digits.length-1] < 9){
            digits[digits.length-1]+=1;
            return digits;
        }
        int carry = 1;
        int idx = digits.length-1;
        while(idx >= 0){
            int sum = carry + digits[idx];
            digits[idx] = sum % 10;
            carry=sum/10;
            idx--;
        }
        if(carry == 0)
            return digits;
        else{
            int len = digits.length+1;
            int[] res = new int[len];
            res[0] = carry;
            for(int i=1;i<len;i++)
                res[i] = digits[i-1];
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
    }
}
