package lengthoflastword;

public class Solution {

    public static int lengthOfLastWord(String s){
        int result = 0;
        int lastIndex = s.length() - 1;

        while (s.charAt(lastIndex) == ' '){
            lastIndex--;
        }

        while (lastIndex >= 0 && s.charAt(lastIndex) != ' '){
            result++;
            lastIndex--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }


}
