import java.util.Arrays;

public class leetcode128

{
    public static void main(String[] args) {

        int nums[] = {51, 1, 2, 3, 4, 5, 7, 9, 45, 46, 47, 48, 49, 50};
        Arrays.sort(nums);
        int A = 0;
        for (int n = 0; n<nums.length-1; n++) {
            int i = n, count = 1;
            while(nums[i]+1==nums[i+1]){
                count ++;
                if(A < count)
                    A=count;
                i++;
                if(i == nums.length-1)
                    break;
            }

        }
        System.out.println(A);
        
    }
    
    
}
