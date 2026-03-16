import java.util.*;

class KthLargest{
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(3,2,1,5,6,4);
        int k=2;
        while(k > 1){
            int maxIdx=0;
            int max=Math.MIN_VALUE;
            for(int i=1;i<nums.size();i++){
                if(max<nums.get(i)){
                    max=nums.get(i);
                    maxIdx=i;
                }
            }
            nums.set(maxIdx,Math.MIN_VALUE);
            k--;
        }
        int max=Math.MIN_VALUE;
        for(int n:nums){
            max=Math.max(max,n);
        }
        System.out.println(max);


//        Collections.sort(nums);
//        System.out.println(nums.get(nums.size()-k));
    }
}
