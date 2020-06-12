package pers.linus.dfs.decode_string_394;

public class Solution {
    private String result;

    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        dfs(1, 0, s, sb);
        return result;
    }

    private int dfs(int time, int startIndex, String str, StringBuilder sb) {
        StringBuilder sbCurrent = new StringBuilder();
        StringBuilder sbNext = null;
        int endIndex = 0;
        for (int j = startIndex; j < str.length(); j++) {
            if (str.charAt(j) >= 48 && str.charAt(j) <= 57) {
                int numberLength = 0;
                while (str.charAt(j) >= 48 && str.charAt(j) <= 57) {
                    j++;
                    numberLength++;
                }
                sbNext = new StringBuilder();
                int subStringTime = Integer.valueOf(str.substring(j - numberLength, j));
                j = dfs(subStringTime, j + 1, str, sbNext);
                sbCurrent.append(sbNext);
            }
            else if (str.charAt(j) == ']') {
                endIndex = j;
                break;
            }
            else {
                sbCurrent.append(str.charAt(j));
            }
        }
        String subString = sbCurrent.toString();
        for (int i = 0; i < time; i++) {
            sb.append(subString);
        }
        result = sb.toString();
        return endIndex;
    }
}
