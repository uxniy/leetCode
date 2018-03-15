class Solution {
    public int getLogestPalidromeRadiusWithCenter(String s,int i,int j){
        int p1;
        int p2;
        int radius=0;
        if(i==j){
            p1=i-1;
            p2=j+1;
        }else if(j==i+1){
            p1=i;
            p2=j;
            radius=-1;
        }else{
            throw new IllegalArgumentException("miss input");
        }
        while(p1>=0&&p2<s.length()){
            if(s.charAt(p1--)==s.charAt(p2++)){
                radius=radius+1;
            }else{
                break;
            }
        }
        return radius;

    }
    public  String longestPalindrome(String s) {
        int max=0;
        String result="";
        for(int i=0;i<s.length();i++){
            int r1=getLogestPalidromeRadiusWithCenter(s,i,i);
            int tmp1=2*r1+1;
            if(max<tmp1){
                max=tmp1;
                result=s.substring(i-r1,i+r1+1);
            }
            int r2 = getLogestPalidromeRadiusWithCenter(s,i,i+1);
            int tmp2=2*r2+2;
            if(max<tmp2){
                max=tmp2;
                result=s.substring(i-r2,i+r2+2);
            }

        }

        return result;
    }
}
