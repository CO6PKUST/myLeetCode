public class leetcode35 {
    public static void main(String[] args) {
        int nums[] = {0, 3, 6, 7, 8, 10};
        int target = 10;
        int end = nums.length-1;
        int mid = nums.length/2;
        int result = -1;

        if (nums[mid] <= target){
            for (int i = end; i >= mid; i--){
                if (nums[i] == target){
                    result = i;
                }

            }
        }
        else {
            for (int i = 0; i <= mid; i++){
                if (nums[i] == target){
                    result = i;
                }
            }

        }
        if (result == -1){
            System.out.println("элемент не найден");
        }
        else System.out.println(result);
    }
}
