import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        char[] a = pattern.toCharArray();
        String[] b = s.split(" ");
        if(a.length != b.length)
        {
            return false;
        }

        HashMap<Character,String> charToWord = new HashMap<>();
        HashMap<String,Character> wordToChar = new HashMap<>();

        for(int i=0;i<pattern.length();i++)
        {
            char c = pattern.charAt(i);
            String word = b[i];

            if(charToWord.containsKey(c))
            {
                if (!charToWord.get(c).equals(word)) {
                    return false;
                }
            }else
            {
                if (wordToChar.containsKey(word)) {
                    return false;
                }
            }

            charToWord.put(c,word);
            wordToChar.put(word,c);
            
        }


    return true;

    }
}