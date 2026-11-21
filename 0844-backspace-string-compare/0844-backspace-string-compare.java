class Solution {
    public boolean backspaceCompare(String s, String t) {

        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '#') {
                if (first.length() > 0) {
                    first.deleteCharAt(first.length() - 1);
                }
            } else {
                first.append(ch);
            }
        }

        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            if (ch == '#') {
                if (second.length() > 0) {
                    second.deleteCharAt(second.length() - 1);
                }
            } else {
                second.append(ch);
            }
        }

        return first.toString().equals(second.toString());
    }
}