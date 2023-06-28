package prob04;

public class StringUtil {

	public static String concatenate(String[] strArr) {
		
		String resultStr = "";
		
		for (int i =0; i < strArr.length; i++) {
			resultStr = resultStr.concat(strArr[i]);
		}
		return resultStr;
	}
}
