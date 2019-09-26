package classes;
public class StringUtils {
	
	public static boolean included(String word, String searched) {
		word = word.toLowerCase().trim();
		searched = searched.toLowerCase().trim();
		
		if (word.contains(searched)) return true;
		return false;
	}
}
