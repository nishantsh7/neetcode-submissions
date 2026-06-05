class Solution {
    public int longestConsecutive(int[] nums) {
      HashSet<Integer> set = new HashSet<>();
      int x=0,f=1,max=0;
    for(int i =0;i<nums.length;i++){
      set.add(nums[i]);
    }  
    for(int i =0; i<nums.length;i++){
      if(set.contains(nums[i]-1))
      continue;
      else
      {
        x=nums[i];
      while(set.contains(x+1))
      {
        f++;
        x++;
      }
      if(max<f)
      max=f;
      f=1;
      x=0;
      }
    }
    return max;
    }
}
