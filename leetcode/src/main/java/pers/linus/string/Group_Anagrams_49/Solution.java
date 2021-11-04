package pers.linus.string.Group_Anagrams_49;

import java.util.*;

public class Solution {
    LinkedList<List<String>> resList = new LinkedList<>();
    HashMap<String, List<String>> map = new HashMap<>();

    public List<List<String>> groupAnagrams(String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String sortStr = new String(charArr);
            if (map.get(sortStr) == null) {
                List<String> list = new LinkedList<>();
                list.add(strs[i]);
                map.put(sortStr, list);
            } else {
                map.get(sortStr).add(strs[i]);
            }
        }
        for (String key: map.keySet()) {
            resList.add(map.get(key));
        }
        return resList;
    }
}
