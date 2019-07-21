package week5;

public class ClassPalindrome {

	String word = "solos";
	
    public static void main(String [] args){
        Palindrome word = new Palindrome();

        if(word.isPalindrome("solos")){
            System.out.println("This is a palindrome");
        } else {
        	System.out.println("This is not a palindrome");
   }   
   } 

    public boolean ifPalindrome(String checkWord){
        int i = checkWord.length()-1;
        int j = 0;
        i--;
        j++;
        while(i > j) {
        }
            if(checkWord.charAt(i) == checkWord.charAt(j)) {
                return true;
            
        } else {
        return false;
    }
}
 }