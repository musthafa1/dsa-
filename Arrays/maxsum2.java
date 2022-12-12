public class maxsum2 {
    public static void main(String[] args){
        int nums [] ={2,4,6,8,10};
        prefix(nums);
    }
    public static void prefix(int nums[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];
         prefix[0] = nums[0];
         for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
         } 
         for(int i = 0; i<nums.length; i++){
            int start = i;
         for(int j = i; j<nums.length; j++){
            int end = j;
            currsum = start == 0 ? prefix[end]: prefix[end] - prefix[start-1];
            if(maxsum<currsum){
                maxsum = currsum;
            }
        }
    }
    System.out.println("maxsum : "+ maxsum);
        }
}
