/*   Created by IntelliJ IDEA.
 *   Author: Rajesh kumar (B.tech)
 *   Date: {25-09-2021
 *   Time: 10:090
 *   File: LeetCodeQuestion.java
 */

package removeduplicatesfromsortedarray;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for(int i =0; i<nums.length-1; i++){
            if(nums[i]!=nums[i+1]){
                nums[k]=nums[i+1];
                k++;
            }
        }
        return k;


    }
}