package exam7;

public class Solution {
	public TreeNode build(int[] pre,int prelow,int prehigh,int[] mid,int midlow,int midhigh) {
		System.out.println("build");
		TreeNode node;
		
		if(prelow>=prehigh||midlow>=midhigh||prehigh>pre.length-1||midhigh>pre.length-1) return null;
		if(prehigh==prelow){
			node=new TreeNode(pre[prelow]);
			return node;
		}
		try {
			node=new TreeNode(pre[prelow]);
			int L=findx(mid, pre[prelow]);
			node.left=build(pre,prelow+1, L-midlow, mid, midlow, L-1);
			node.right=build(pre,prelow+L-midlow,prehigh,mid,L+1,midhigh );
			//System.out.println(node.toString());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return node;
		
	}
	
	public int findx(int[] arr,int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==x) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] pre={1,2,4,7,3,5,6,8};
		int[] mid={4,7,2,1,5,3,8,6};
		TreeNode root=null;
		root=new Solution().build(pre,0, pre.length-1, mid, 0, mid.length-1);
		System.out.println(root.toString());
	}
}
