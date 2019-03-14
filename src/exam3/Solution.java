package exam3;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
	//找出数组中重复的数字
	
	
	
	//空间复杂度为n 时间复杂度为n/2（
	public static void findtwos(int []arr) {
		if(arr==null) return;
		int[] goal=new int[arr.length];
		for (int i : arr) {
			if(goal[i]!=0){
				System.out.println(i);
			}else {
				goal[i]=1;
			}
		}
	}
	public static void findtwos2(int arr[]) {
		int x=arr[0];
		for (int i = 1; i < arr.length; i++) {
			x=x^arr[i];
			System.out.println(x);
		}
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		int []arr={2,3,5,4,3,2,6,7};
		HashMap<String, String> hashMap=new HashMap<>();
		String put = hashMap.put("hello", "world");
		put = hashMap.put("hello", "world");
		System.out.println(put);
		//Solution.findtwos(arr);
	}
}
