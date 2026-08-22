
public class Srtringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer("Hello");
	//	String str1="Hello";
		System.out.print(str.indexOf("H"));
		str.deleteCharAt(4);
		System.out.print(str);
		str.getChars(1, 3, null, 0);
	}

}
