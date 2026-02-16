public class Palindrome {
    public static void main(String[] args){
        String string="race";
        System.out.print(checkPalindrome(string));
    }
    static String checkPalindrome(String s){
        int left=0;
        int right=s.length();
        if(isPalindrome(s,left,right)){

        }
    }
    static boolean isPalindrome(String s,int left,int right){
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
    }
}
