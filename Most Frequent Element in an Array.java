import java.util.HashMap;

class Solution {
    public int mostFreqEle(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            int freq = freqMap.get(num);

            if (freq > maxFreq) {
                maxFreq = freq;
                ans = num;
            } else if (freq == maxFreq) {
                // Choose the maximum value among tied frequencies
                ans = Math.max(ans, num);
            }
        }

        return ans;
    }
}
