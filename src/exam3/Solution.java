package exam3;

import java.util.Arrays;

public class Solution {
	//�ҳ��������ظ�������
	
	
	//�ռ临�Ӷ�Ϊn ʱ�临�Ӷ�Ϊn/2��
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
	
	public static void main(String[] args) {
		int []arr={2,3,5,4,3,2,6,7};
		Solution.findtwos(arr);
	}
}
