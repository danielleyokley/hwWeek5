package week5;

public class QuizQ1 {

    public static void main(String [] args){
        Palindrome pn = new Palindrome();

        if(pn.isPalindrome("ABBA")){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }   
    }

	    public boolean isPalindrome(String ClassPalindrome){
	        int i = ClassPalindrome.length()-1;
	        int p = 0;
	        while(i > p) {
	            if(ClassPalindrome.charAt(i) != ClassPalindrome.charAt(p)) {
	                return false;
	            }
	            i--;
	            p++;
	        }
	        return true;
	    }
	}