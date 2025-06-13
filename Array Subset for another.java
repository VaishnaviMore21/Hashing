


class Solution {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count frequency of each element in array a
        for (int ele : a) {
            freqMap.put(ele, freqMap.getOrDefault(ele, 0) + 1);
        }

        // Check if every element in b exists in a with enough frequency
        for (int ele : b) {
            if (freqMap.containsKey(ele) && freqMap.get(ele) > 0) {
                freqMap.put(ele, freqMap.get(ele) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
