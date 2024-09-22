public class SecondLargestFrequency {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 4, 5, 5};

        // Initialize variables for the largest and second largest elements
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // First pass to find the largest and second largest elements
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        // Count the frequency of the second largest element
        int frequency = 0;
        for (int num : arr) {
            if (num == secondLargest) {
                frequency++;
            }
        }

        System.out.println(frequency); // Output will be 2
    }
}
