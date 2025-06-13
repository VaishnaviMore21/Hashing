class Solution {

    int countPairs(int arr[], int target) {
        // Your code here
        int res=0;
        int n=arr.length;
        HashMap<Integer,Integer>freqMap=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int secondVal=target-arr[i];
            res+=freqMap.getOrDefault(secondVal,0);
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1);
        }
        return res;
    }
}
