class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> dup = new HashMap<>();
        for( int num : nums){
            dup.put(num,dup.getOrDefault(num,0)+1);
            if(dup.get(num)>1)
            return true;
        }
return false;
    }
}