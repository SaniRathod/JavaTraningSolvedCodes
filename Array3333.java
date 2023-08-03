import java.util.HashMap;

public class Array3333{

    public static int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store the complement and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        // If no solution found, return an empty array
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two elements found that sum up to the target.");
        }
    }
}

/*class Array3333
{
	public static void main(String args[])
	{
		int a[]={1,1,2,2,3,3,4,5,5,6,6};
		int res=0;
		for(int i=1;i<12;i++)
		{
			res = res ^ a[i];
		}
		System.out.println(res);
	}
}*/

/*class Array3333
{
	public static void main(String args[])
	{
		int a[]={1,1,2,2,3,3,4,5,5,6,6};
		int res=0;
		for(int i=1;i<5;i++)
		{
			res = res + a[i];
		}
		System.out.println(res);
	}
}*/