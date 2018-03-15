/*
这道题首先想起来的是暴力破解
但是暴力破解是时间复杂度O(n2)
从此想到利用map的get(key)方法来代替轮询查找。
得到先将数字加入HashMap然后再对应每个number进行目标(target-number)的查找。
但是这样的话就进行了两次轮询。
由此想到在将数字放入map之前，就在寄存map中查找一下(target-number) 如果找到了就返回index，如果找不到就将数字放入map。
技术要点
1.map的key和value需要都是Object
2.IllegalArgumentException是RuntimeException不需要声明throws Exception
3.HashMap拥有containsKey方法

class Solution {
    public int[] twoSum(int[] nums, int target) {
       for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[i]+nums[j]==target)
               return new int[]{i,j};
           }
       }
       return new int[]{-1,-1}; 
    }
}
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
