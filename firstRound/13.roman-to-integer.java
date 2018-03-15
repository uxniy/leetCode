class Solution {
	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	public Solution(){
		this.map.put('I',1);
        this.map.put('V',5);
        this.map.put('X',10);
        this.map.put('L',50);
        this.map.put('C',100);
        this.map.put('D',500);
        this.map.put('M',1000);
	}
    /*
    public int romanToInt(String s) {
		return arrayToInt(translate(s),0,s.length()-1);		  

    }

    public int arrayToInt(int[] arr, int start, int end){
    	int splitIndex = getBiggestIndex(arr,start,end);
        if(end < 0 || start > arr.length || start>end){
    		return 0;
    	}
    	return arr[splitIndex] - arrayToInt(arr,start,splitIndex-1) + arrayToInt(arr, splitIndex+1,end);

    }

    public int getBiggestIndex(int[] arr,int start, int end){
    	int max=0; 
    	int index=-1;
    	for(int i= start; i<=end;i++){
    		if(arr[i]>max){
    			max=arr[i];
    			index=i;
    		}
    	}
    	return index;
    }
    
    public int[] translate(String str){
    	int[] arr = new int[str.length()];
    	for(int i= 0;i<str.length();i++){
    		arr[i]=map.get(str.charAt(i));
    	}
    	return arr;
    }*/

    public int romanToInt(String s) {
        if(s == null){
            return 0;
        }
        if(s.length()==1){
            return map.get(s.charAt(0));
        }
        int sum = map.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                sum-=map.get(s.charAt(i));
            }else{
                sum+=map.get(s.charAt(i));
            }

        }
        return sum;
    }

}
