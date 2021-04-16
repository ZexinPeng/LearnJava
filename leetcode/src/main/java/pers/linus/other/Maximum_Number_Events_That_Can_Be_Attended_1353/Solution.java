package pers.linus.other.Maximum_Number_Events_That_Can_Be_Attended_1353;

import java.util.Arrays;

public class Solution {
    public int maxEvents(int[][] events) {
        int res = 0;
        Arrays.sort(events, (a, b)-> {return a[0] - b[0];});
        int currentDay = 1;
        int lastDay = events[0][1];
        boolean[] isVisited = new boolean[events.length];
        while (currentDay <= lastDay) {
            for (int i = 0; i < events.length; i++) {
                if (isVisited[i]) {
                    continue;
                }
                int min = Integer.MAX_VALUE;
                if (currentDay < events[i][0]) {
                    break;
                }
                else {

                }

            }
            currentDay++;
        }
        return res;
    }
}

