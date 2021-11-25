package implementstrstr;

public class Solution {

    public static int strStr(String haystack, String needle){

        if(needle.equalsIgnoreCase("")){
            return 0;
        }

        for(int i=0; i <= haystack.length() - needle.length(); i++){
            boolean found = haystack.startsWith(needle, i);
            if(found){
                return i;
            }
        }
        return -1;
    }


    //if (needle.equals("")) {
    //            return 0;
    //        }
    //
    //        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
    //            if ((haystack.substring(i, i + needle.length())).equals(needle)) {
    //                return i;
    //            };
    //        }
    //
    //        return -1;
    //    }


    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }
}
