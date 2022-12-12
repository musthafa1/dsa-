public class buyandsell {
    public static void main(String[] args){
        int nums[] = {7,1,2,8,9,6,4};
        System.out.println(buyAndSell(nums));
    }
    public static int buyAndSell(int nums[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0; i<nums.length; i++){
            if(buyprice<nums[i]){
                int profit = nums[i] - buyprice;
            maxprofit = Math.max(maxprofit, profit);
        }
        else{
            buyprice = nums[i];
        }
    }   
    return maxprofit;
}
}
