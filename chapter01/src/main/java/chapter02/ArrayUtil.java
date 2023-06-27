package chapter02;

public class ArrayUtil {

	public static double[] intToDouble(int[] a1) {
		// TODO Auto-generated method stub
		
		double[] result = null;
		
		if(a1 == null) {
			return result;
		} 
		
		// if 안에 return이 있으며, 그 다음은 당연히 else인 영역
		
		result = new double[a1.length];
		for(int i = 0; i< a1.length; i++) {
			result[i] = a1[i];
		}
		
		return result;
	}
	
	public static double[] concat(int[] arr1, int[] arr2) {
		double[] resultArray = new double[arr1.length + arr2.length];
		for(int i=0; i<arr1.length;i++) {
			resultArray[i] = arr1[i];
		}
		for(int i=arr1.length; i<resultArray.length; i++) {
			resultArray[i] = arr2[i-arr1.length];
		}
		return resultArray;
		
	}
	
}
