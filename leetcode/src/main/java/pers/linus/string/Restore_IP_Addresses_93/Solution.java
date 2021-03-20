package pers.linus.string.Restore_IP_Addresses_93;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
        System.out.println(isValid("156"));
        if (s.length() < 4 || s.length() > 12) {
            return null;
        }
        List<String> resList = new LinkedList<>();
        for (int i = 1; i < 4; i++) {
            if (i > s.length() || !isValid(s.substring(0, i))) {
                break;
            }
            for (int j = 1; j < 4; j++) {
                if (i + j > s.length() || !isValid(s.substring(i, i + j))) {
                    break;
                }
                for (int k = 1; k < 4; k++) {
                    if (i + j + k > s.length() || !isValid(s.substring(i + j, i + j + k))) {
                        break;
                    }
                    int l = s.length() - i - j - k;
                    if (l < 1 || l > 3 || !isValid(s.substring(i + j + k, i + j + k + l))) {
                        continue;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(s.substring(0, i));
                    sb.append('.');
                    sb.append(s.substring(i, i + j));
                    sb.append('.');
                    sb.append(s.substring(i + j, i + j + k));
                    sb.append('.');
                    sb.append(s.substring(i + j + k, i + j + k + l));
                    resList.add(sb.toString());
                }
            }
        }
        return resList;
    }

    private boolean isValid(String s) {
        if (s.length() == 3) {
            if (s.charAt(0) - 48 > 2 || s.charAt(0) - 48 == 0) {
                return false;
            }
            if (s.charAt(0) - 48 == 2) {
                if (s.charAt(1) - 48 > 5) {
                    return false;
                }
                if (s.charAt(1) - 48 == 5) {
                    if (s.charAt(2) - 48 > 5) {
                        return false;
                    }
                }
            }
        }
        else if (s.length() == 2) {
            if (s.charAt(0) - 48 == 0) {
                return false;
            }
        }
        return true;
    }
}
