import java.util.*;
public class Main {

	static void distinct(String str) {

	    for (int i = 0; i < str.length(); i++) {

	        int count = 1;

	        for (int j = i + 1; j < str.length(); j++) {

	            if (str.charAt(i) == str.charAt(j)) {
	                count++;
	            }
	        }

	        System.out.println(str.charAt(i) + " = " + count);
	    }
	}

    public static void main(String[] args) {

        String str = "HelloWorld";
       // String str1="silent";

        distinct(str);
    }
}