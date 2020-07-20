package Week_02;

import java.util.Arrays;

/**
 * 有效的字母异位词
 */
public class IsAnagramDemo {
    
    public static void main(String[] args) {
        
        String s = "anagram" ;
        String t = "nagaram" ;
        boolean b = isAnagram(s, t);
        System.out.println(b);
    }

    public static boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        if(sChar.length != tChar.length){
            return false;
        }
        for (int i = 0; i < sChar.length; i++) {
            if(sChar[i] == tChar[i]){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
    
}