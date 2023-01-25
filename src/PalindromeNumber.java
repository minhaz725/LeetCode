public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String s[] = Integer.toString(x).split("");
        int len = s.length;
        for(int i=0; i< len; i++)
        {
            if(!s[i].equals(s[len - 1 - i])) {
                return false;
            }
        }
        return true;
    }
}
