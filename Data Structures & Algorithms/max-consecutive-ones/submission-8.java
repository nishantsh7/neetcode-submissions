class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int x=0;
      int n= nums.length, max=0;
      if(n==1 && nums[0]==1)
      return 1;
      for(int i= 0; i<n;i++)
      {
        if(nums[i]==0)
        continue;
        for(int j=i;j<n;j++)
        {
            if(nums[j]==1)
            x++;
            else
            break;
        }
        if(x>max)
        max=x;
        x=0;
      } 
      return max; 
    }
}