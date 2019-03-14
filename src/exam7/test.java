package exam7;

public class test {
	public static void make(TreeNode node) {
		node.val=2;
	}
	public static void main(String[] args) {
		TreeNode root =new TreeNode(1);
		make(root);
		System.out.println(root.toString());
	}
}
