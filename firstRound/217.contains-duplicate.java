class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
       for(int i=0;i<nums.length;i++){
           if(map.get(nums[i])==null){
               map.put(nums[i],1);
           }else if (map.get(nums[i])>0){
	       return true;
           }
       }
       return false;
    }
}
