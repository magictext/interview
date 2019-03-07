package exam4;

public class Solution {
	public void findintwoMatrix(int[][] arr,int n) {
		if(arr==null||arr.length==0||arr[0].length==0) return;
		int x=arr.length-1;
		int y=arr[0].length-1;
		getlow(arr,0, x, 0, y, n);
	}
	public void getlow(int[][] arr,int xlow,int xhigh,int ylow,int yhigh,int n) {
		if(n<arr[xlow][ylow]||n>arr[xhigh][yhigh]) {
			System.out.println("Ã»ÓÐËÑË÷µ½");
			return;
		}
		if (xlow==xhigh&&ylow==yhigh) {
			System.out.println(xlow+"\t"+ylow);
			return;
		}
		if(n>arr[xlow][yhigh]){
			getlow(arr, xlow+1, xhigh, ylow, yhigh, n);
			return;
		}else if(n<arr[xlow][yhigh]){
			getlow(arr, xlow, xhigh, ylow, yhigh-1, n);
			return;
		
//		}else {
//			System.out.println(xlow+"\t"+xhigh);
//			return;
		}
		if(n<arr[xhigh][ylow]){
			getlow(arr, xlow, xhigh-1, ylow, yhigh, n);
			return;
		}else if(n>arr[xhigh][ylow]){
			getlow(arr, xlow, xhigh, ylow+1, yhigh, n);
			return;
//		}else {
//			System.out.println(xhigh+"\t"+ylow);
//			return;
		}
	}
	public static void main(String[] args) {
		int arr[][]={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		new Solution().findintwoMatrix(arr,15);
	}
}
