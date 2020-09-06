package Week_09;

public class firstUniqChar {
    
    public int firstUniqChar(String s) {
        int index = -1;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int beginIndex = s.indexOf(ch);
            if (beginIndex != -1 && beginIndex == s.lastIndexOf(ch)) {
                index = (index == -1 || index > beginIndex) ? beginIndex : index;
            }
        }
        return index;
    }
    
}