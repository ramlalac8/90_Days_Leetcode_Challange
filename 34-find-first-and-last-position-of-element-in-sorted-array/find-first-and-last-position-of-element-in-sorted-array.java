class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = findLowBound(nums , target);
        int high = findHighBound(nums,target);
        return new int[]{low , high};
    }
     private int findLowBound(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;
        int res = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                res=mid;
                high =mid-1;

            }
            else if(target<nums[mid]){
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
       
       
    }
     private int findHighBound(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;
        int res = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                res=mid;
                low = mid+1;

            }
            else if(target<nums[mid]){
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
}
}