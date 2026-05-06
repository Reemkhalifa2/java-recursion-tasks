package Array11;

public class Array11 {
    public int array11(int[] nums, int index){

        //Base Case
        if(index == nums.length) return 0;

        //Recursion Case
        return nums[index] == 11 ?
                1 + array11(nums, index + 1)
                :
                array11(nums, index + 1);


    }

}
