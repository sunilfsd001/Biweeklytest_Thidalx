import java.util.*;
class SumOfThree{
    public static void main(String[] args){

//        Solved

        int[] nums={-1,2,1,4};
        int target=1;
        int result=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int sum=nums[i]+nums[i+1]+nums[i+2];
            int curMin=Math.abs(target-sum);
            if(min>curMin){
                min=curMin;
                result=sum;
            }
        }
        System.out.println(result);
    }
}
