package pkg;

import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class reverseVowel
{
	static String sentence = "united states";
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(sentence);
        char[] letters = sentence.toCharArray();
        int left = 0;
        int right = letters.length - 1;
        char temp;
        boolean left_visit = false;
        boolean right_visit = false;
        for(int i=0; i<letters.length; i++) {
            if(letters[left] == 'a' || 
                    letters[left] == 'e' || 
                    letters[left] == 'i' || 
                    letters[left] == 'o' || 
                    letters[left] == 'u') {
                left_visit = true;
            } else {
                if(left_visit == false) {
                    left++;
                }                    
            }
 
            if(letters[right] == 'a' || 
                    letters[right] == 'e' || 
                    letters[right] == 'i' || 
                    letters[right] == 'o' || 
                    letters[right] == 'u') {
                right_visit = true;
            } else {
                if(right_visit == false) {
                    right--;
                }
            }
 
            if(left_visit == true && right_visit == true && left <= right) {
                temp = letters[right];
                letters[right] = letters[left];
                letters[left] = temp;
                left++;
                right--;
                left_visit = false;
                right_visit = false;
            }
        }
 
        System.out.print(new String(letters));
	}
}
