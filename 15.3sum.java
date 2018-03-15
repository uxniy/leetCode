class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
	ArrayList<List<Integer>> list = new ArrayList<>();
	for(int i=0;i<nums.length;i++){
	    for(int j=i+1;j<nums.length;j++){
	        for(int k=j+1;k<nums.length;k++){
		    if(nums[i]+nums[j]+nums[k]==0){
                        list.add(new ArrayList(Arrays.asList(nums[i],nums[j],nums[k])));
                    }		    
		}
	    }
	}return list;
    }
}
