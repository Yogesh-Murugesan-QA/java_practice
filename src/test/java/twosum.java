public class twosum {
    public static int [] twoSum(int [] nums, int target){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if (nums[i]+ nums[j]== target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[]args){
        int[]nums= {2,7,11,15,0,0,-1};
        int target =15;
        int [] result = twoSum (nums,target);
        System.out.println("indices:[" + result[0] +" " + result[1] + "]");
    }
}