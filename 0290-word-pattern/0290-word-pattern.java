
import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> mapPattern = new HashMap<>();
        HashMap<String, Character> mapWord = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            if (mapPattern.containsKey(ch)) {
                if (!mapPattern.get(ch).equals(word)) {
                    return false;
                }
            } else {
                mapPattern.put(ch, word);
            }

            if (mapWord.containsKey(word)) {
                if (mapWord.get(word) != ch) {
                    return false;
                }
            } else {
                mapWord.put(word, ch);
            }
        }

        return true;
    }
}
