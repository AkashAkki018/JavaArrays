class BuyAndSell {
    public static int maxProfit(int[] prices) {

        int p=0;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            else if(p< prices[i]-min){
                p=prices[i]-min;

            }
        }
        return p;
        
    }

    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int p=maxProfit(arr);
        System.out.println("PROFIT "+p);
    }
}