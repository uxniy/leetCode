/*
数字判断回文比较难，换成String就简单了
Reserve之后相同的话就是回文数啦。
StringBuilder reserve方法。
求次幂数Math.pow()
*/
class Solution {
    public int largestPalindrome(int n) {
        if(n<=0){
            throw new IllegalArgumentException("input miss");
        }
        if(n==1){
            return 9;
        }
        int max= (int)Math.pow(10,n)-1;
        int min= (int)Math.pow(10,n-1)+1;
	int palindromeMax = 0;
        for(int i = max; i>= min; i--){
	    for(int j = max; j>= i; j--){
	        StringBuilder strb = new StringBuilder();
                strb.append(i*j);
		String str = strb.toString();
                if(strb.reverse().toString().equals(str)){
                    if(i*j>palindromeMax)
                        palindromeMax=i*j;
		}
	    }
	    
	}
	return (palindromeMax%1337);
    }
}
