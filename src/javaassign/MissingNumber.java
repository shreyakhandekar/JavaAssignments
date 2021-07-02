package javaassign;

import java.util.BitSet;

public class MissingNumber {
    public static void missingno(int[] nums, int count){
        int missno = count - nums.length;
        BitSet bitSet = new BitSet(count);

        for (int num: nums){
            bitSet.set(num-1);
        }
        int missIndex = 0;
        for (int i=1;i<missno;i++){
        missIndex = bitSet.nextClearBit(missIndex);
            System.out.println("Missing number is: "+ ++missIndex);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,7,9,11,1,3,1,4,1,8,20,23,26,28,31,35,38,43,47,49,51,52,57,63,65,67,68,75,77,79,83,88,89,90,92,94,95,97,99,100};
        missingno(nums,100);
}
}
