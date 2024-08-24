class MaxsubArrayOptimal {
    public static int maxSubArray(int[] nums) {
        
        int max=nums[0];
        int allmax=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            max=Math.max(nums[i],nums[i]+max);

            allmax=Math.max(max,allmax);
        }

        return allmax;
    }
    public static void main(String[] args) {
        int arr[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }
}