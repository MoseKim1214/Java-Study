package chapter02;

import java.util.Arrays;

public class ArrayUtilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a1 = {0,1,2,3,4};
		double[] d1 = ArrayUtil.intToDouble(a1);
		System.out.println(a1);
		System.out.println(Arrays.toString(d1));
		
		
		double[] a3 = ArrayUtil.concat(new int[] {1,2,3,4}, new int[] {5,6,7,8});
		System.out.println(Arrays.toString(a3));
	}

}
