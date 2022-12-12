public class maxsum1{
    public static void main(String[] args){
        int nums [] = {2,4,6,8,10};
        maxsum(nums);
    }
    public static void maxsum(int nums []){
        int currsum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
          int start = i;
          for(int j = i; j<nums.length; j++){
            int end =j;
            currsum = 0;
            for (int k = start; k<=end; k++){
                currsum += nums[k];
            }
            System.out.println(currsum);
            if(max<currsum){
                max = currsum;
            }
          }

        }
        System.out.println("maxsum : "+ max);
    }
    
}