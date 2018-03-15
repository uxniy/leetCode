//Sliding window
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int i=0;
        int j=i+1;
        int n= s.length();
        while(i<n&&j<=n&&i<j){
            if(!hasDuplicate(s,i,j)){
                if(max<(j-i)) max=j-i;
                j++;
            }else{
                i++;
            }
        }
        return max;
    }
    public boolean hasDuplicate(String s,int i,int j){
        HashSet set = new HashSet<Integer>();
        for(int k=i;k<j;k++){
            char ch = s.charAt(k);
            if(!set.contains(ch)){
                set.add(ch);
            }else{
                return true;
            }
        }return false;
    }
}
