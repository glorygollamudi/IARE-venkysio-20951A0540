/* recursion in java*/
import java.util.Scanner;
public class ReverseWordsInParagraph {
   
    public static void main(String[] args) {
        Scanner myobj=new Scanner(System.in);
        System.out.println("enter a paragraph:");
       
        String paragraph = myobj.nextLine();
        String reversedParagraph = reverseWords(paragraph);
        System.out.println(reversedParagraph);
    }

    public static String reverseWords(String sentence) {
        if (sentence.isEmpty()) {
            return sentence;
        }
        else {
            
            int spaceIndex = sentence.indexOf(' ');
           
            if (spaceIndex == -1) {
                
                return reverseString(sentence);
            }
            else {
                
                return reverseString(sentence.substring(0, spaceIndex)) + " "
                     + reverseWords(sentence.substring(spaceIndex + 1));
            }
        }
    }
   
    public static String reverseString(String s) {
        if (s.length() == 1) {
            return s;
        }
        else {
            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }
}
