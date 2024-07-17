class majorityElement {
    public static int majorityE(int[] nums) {

        int m=nums[0];
        int c=1;
        for(int i=0;i<nums.length;i++)
        {
            if(m==nums[i])
            {
                c++;
            }
            else
            {
                c--;
            }
            if(c==0)
            {
                m=nums[i];
                c=1;
            }
        }
        return m;
        
    }
    public static void main(String[] args) {
        
        int nums[]={1,2,3,4,1,1};
        int r=majorityE(nums);
        System.out.println(r);

    }
}