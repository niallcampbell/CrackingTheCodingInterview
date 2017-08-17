
/**
 * Cracking the Coding Interview
 * 
 * Chapter 1 - Strings & Arrays
 * 
 * Page 48
 * 
 * Question 2
 * 
 * Write code to reverse a String.
 * 
 */
public class Question2
{
    public static void reverseString(String str)
    {
    
        String revStr = "";
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            revStr = revStr + str.charAt(i);
        }
    
        System.out.print(revStr);
    }
}
