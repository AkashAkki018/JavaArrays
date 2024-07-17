

class moveZeroes {
    public static void moveZeroes(int[] nums) {
        if (nums.length < 2) {
            return;
        }

        int z = 0; // Index to place the non-zero element

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap elements
                int temp = nums[z];
                nums[z] = nums[i];
                nums[i] = temp;
                z++; // Increment the index for non-zero elements
            }
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
