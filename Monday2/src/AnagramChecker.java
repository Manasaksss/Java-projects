import java.util.Arrays;

public class AnagramChecker {

	 public static boolean areAnagrams(String s1, String s2) {
	        s1 = s1.replaceAll("\\s", "").toLowerCase();
	        s2 = s2.replaceAll("\\s", "").toLowerCase();
	        if (s1.length() != s2.length()) {
	            return false;
	        }
	        char[] charArray1 = s1.toCharArray();
	        char[] charArray2 = s2.toCharArray();

	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);
	        return Arrays.equals(charArray1, charArray2);
	    }
	}


