

class moveZeroes {
    public static void moveZeroes(int[] nums) {
        if (nums.length < 2) {
            return;
        }

        int z = 0; // Index to place the non-zero element
        int i;
        // Traverse the array
        for ( i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
            
                nums[z]=nums[i];
                z++;
            }
        }
        while (z<nums.length) {

            nums[z]=0;
            z++;
            
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
