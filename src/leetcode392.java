public class leetcode392 {


    public static void main(String[] args) {
        String s = "ade";
        String t = "abcdefg";
        Solution test = new Solution();
        System.out.println(test.isSubsequence(s, t));




    }
}
    class Solution {
        public boolean isSubsequence(String s, String t) {
        int i = 0; int j = 0;
        while (i < s.length() && j < t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i+=1;
            }
            j+=1;
        }
        return (i == s.length());


        }

    }


