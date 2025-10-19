import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];

        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();

        // Step 2: Take the first interval as the current one
        int[] current = intervals[0];

        // Step 3: Iterate and merge if overlapping
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= current[1]) {
                // Overlapping → merge
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                // No overlap → push current and move to next
                res.add(current);
                current = intervals[i];
            }
        }

        // Add the last merged interval
        res.add(current);

        // Step 4: Convert List<int[]> to int[][]
        return res.toArray(new int[res.size()][]);
    }
}
