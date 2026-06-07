class Solution {
    public int maxArea(int[] heights) {
        int l=heights.length;
        int left=0;
        int right=l-1;
        int area=1;
        int max=0;
        int breadth=1;
    while(left<right){
    int length= right-left;
    
    if(heights[left]>heights[right])
    breadth=heights[right];
    else
    breadth=heights[left];
    area = length*breadth;
    if(area>max)
    {
    max=area;
    area=1;
    }
    if(heights[left]>heights[right])
    right--;
    else 
    left++;
    }
    return max;
    }
}
