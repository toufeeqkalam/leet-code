package longestcommonprefix;

public class Solution {

    public static String longestCommonPrefix(String[] strs){
        for (int n = 0; n < strs[0].length(); n++) {
            char c = strs[0].charAt(n);
            for (int i = 1; i < strs.length; i++) {
                if (n >= strs[i].length() || strs[i].charAt(n) != c) {
                    return strs[0].substring(0, n);
                }
            }
        }
        return strs[0];

    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

}
