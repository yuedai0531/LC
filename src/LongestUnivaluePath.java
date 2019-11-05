
public class LongestUnivaluePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 8; i++) {
			
			if(i == 3)
				continue;
			
			System.out.println(i);
		}
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		val = x;
	}	
}

class Solution1 {
	
	
	
	public static void main(String[] args) {
		
	}
	
	
	
    int ans;
    public int longestUnivaluePath(TreeNode root) {
        ans = 0;
        arrowLength(root);
        return ans;
    }
    
    
    
    public int arrowLength(TreeNode node) {
        if (node == null) return 0;
        int left = arrowLength(node.left);
        int right = arrowLength(node.right);
        int arrowLeft = 0, arrowRight = 0;
        if (node.left != null && node.left.val == node.val) {
            arrowLeft += left + 1;
        }
        if (node.right != null && node.right.val == node.val) {
            arrowRight += right + 1;
        }
        ans = Math.max(ans, arrowLeft + arrowRight);
        return Math.max(arrowLeft, arrowRight);
    }
}