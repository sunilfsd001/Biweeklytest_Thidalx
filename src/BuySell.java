public class BuySell {
    public static void main(String[] args){

//        Solved

        int[] prices={7,10,5,5,3,1};
        int profit=0;
        int minprice=prices[0];
        for(int i=1;i<prices.length;i++){
            if(minprice>prices[i]){
                minprice=prices[i];
            }
            else{
                int curProfit=prices[i]-minprice;
                if(profit<curProfit){
                    profit=curProfit;
                }
            }
        }
        System.out.println(profit);
    }
}
