import java.util.HashMap;
class TwoSum{
	public static void main(String... args){
		int arr[]= new int[]{2,7,11,15};
		int target = 9;
		int result[] = twoSum(arr,target);
		System.out.println("("+result[0]+","+result[1]+")");
	}
	private static int[] twoSum(int nums[],int target){
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++){
			map.put(nums[i],i);
		}
		for(int j=0;j<nums.length;j++){
			int b = target - nums[j];
			if(map.containsKey(b) && map.get(b)!=j){
				return new int[]{j,map.get(b)};
			}	
		}
		throw new IllegalArgumentException("No Two Sum solution");
	}
}
