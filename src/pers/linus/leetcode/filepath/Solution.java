package pers.linus.leetcode.filepath;

import java.util.*;

public class Solution {
    public String simplifyPath(String path) {
        StringBuilder ans = new StringBuilder();
        List<String> list = new LinkedList<>();

        int first = 0, last = 0;

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) != '/') {
                first = i;
                while (i < path.length() && path.charAt(i) != '/') {
                    i++;
                }
                last = i;
                list.add(path.substring(first, last));
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(".") == 0) {
                list.remove(i--);
            }
            else if (list.get(i).compareTo("..") == 0) {
                if (i == 0) {
                    list.remove(i--);
                    continue;
                }
                list.remove(i--);
                list.remove(i--);
            }
        }

        if (list.size() == 0) {
            return "/";
        }

        for (int i = 0; i < list.size(); i++) {
            ans.append('/');
            ans.append(list.get(i));
        }

        return ans.toString();
    }
}
