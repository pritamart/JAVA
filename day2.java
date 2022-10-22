 class day2{
 public static void main(String[] args) {
    int[] nums = new int[]{ 1,2,3,4,5,6,7,8,9,1 };
    for (int i = 1; i < nums.length; ++ i) {
        for (int j = 0; j < i; ++ j) {
            if (nums[i] == nums[j]) {
                System.out.println("yes");
                break;
            }
            else{
                System.out.println("no");
            
            }
        }
    }
 }
}
//  class Solution {
//     public boolean containsDuplicate(int nums[]) {
//         for (int i = 1; i < nums.length; ++ i) {
//             for (int j = 0; j < i; ++ j) {
//                 if (nums[i] == nums[j]) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }
// }