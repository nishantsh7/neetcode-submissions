class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int x=0;
        for (int i=0;i<nums.length;i++)
        {
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
    buckets[i] = new ArrayList<>();
}
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int num = entry.getKey();
            int frequency = entry.getValue();

            buckets[frequency].add(num);
        }
        int[] result = new int[k];
        int index = 0;
         for (int i = buckets.length - 1; i >= 0 && index < k; i--) {

            for (int num : buckets[i]) {

                result[index++] = num;

                if (index == k)
                    break;
            }
        }

        return result;
    }
}
