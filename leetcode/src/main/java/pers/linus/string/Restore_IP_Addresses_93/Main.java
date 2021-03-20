package pers.linus.string.Restore_IP_Addresses_93;

import pers.linus.CommonTool;

public class Main {
    public static void main(String[] args) {
        //"172162541"
        //"25525511135"
        // "3923156"
        String str = "3923156";
        CommonTool.printStringList(new Solution().restoreIpAddresses(str));
    }
}
