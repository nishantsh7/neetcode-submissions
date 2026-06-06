class Solution {
    public int[] twoSum(int[] numbers, int target) {
     int m= numbers.length/2;
     int a[] = new int[2];
     for(int i =0; i<numbers.length;i++)
    {
     int diff= target- numbers[i];
     if(diff==numbers[m] && i!=m){
     a[0]=i+1;
     a[1]=m+1;
     return a;}
     else if(diff<numbers[m])
     for(int j=i+1;j<m;j++)
     {
       if(numbers[j]==diff && i!=j)
       {
        a[0]=i+1;
        a[1]=j+1;
        return a;
       }
       else
       continue;
     }
     else{
        for(int j=m+1;j<numbers.length;j++)
     {
       if(numbers[j]==diff && i!=j)
       {
        a[0]=i+1;
        a[1]=j+1;
        return a;
       }
       else
       continue;
     }
     }
     }
     return a;
    }
}
