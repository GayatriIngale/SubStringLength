package MaxSubString;

import java.util.HashSet;
import java.util.Scanner;

public class MaxLengthSubString {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Input");
		String s = sc.next();
		
		System.out.println("Input : "+ s);
		lengthOfSubString(s);
	}
	public static void lengthOfSubString(String s) {
        HashSet<Character> distinctLetters = new HashSet<>();
        int l = 0;
        int r = 0;
        int max = 0;
        
        while (l <= r && r < s.length()) {
            char current = s.charAt(r);
            if (!distinctLetters.contains(current)) {
                distinctLetters.add(current);
                r++;
            } else {

            	l++;
            }
            
            max = Math.max(max, (r - l));
            
        }
        System.out.println("Output : "+ max);
        
        
    }

}
