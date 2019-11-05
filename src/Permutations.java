import java.util.*;
public class Permutations {

	public static void main(String[] args) {
		
		int[] a = {1,2,3};

		System.out.println(permute(a));
		
	}

    public static List<List<Integer>> permute(int[] nums) {
        //create List of list to return
    	List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(nums.length == 0) {
        	return ans;
        }
        List<Integer> l = new ArrayList<Integer>();
        l.add(nums[0]);
        ans.add(l);
        
        
        
        return ans;
    }
	

}
