class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> dup = new HashMap<>();
        for( int num : nums){
            dup.put(num,dup.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : dup.entrySet()) {
    if(entry.getValue()>1)
    {
        return true;
    }
}
return false;
    }
}