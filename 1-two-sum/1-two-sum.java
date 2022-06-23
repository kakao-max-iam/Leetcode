import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i])!=null){
                return new int[]{i, map.get(nums[i])};
            }else{
                map.put(target-nums[i], i);
            }
        }
        return new int[]{0,0};
    }
}