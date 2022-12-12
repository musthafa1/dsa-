public class maxsum3 {
    public static void main(String[] args){
        int nums [] = {2,4,6,-3,-6,8,-9,0};
        maxsum(nums);
    }
    public static void maxsum(int nums[]){
        int max = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i = 0; i<nums.length; i++){
            currsum += nums[i];
            if(currsum<0){
                currsum = 0;
            }
            max = Math.max(max, currsum);
        }
        System.out.println("maxsum : " + max);
        
    }
    
}
