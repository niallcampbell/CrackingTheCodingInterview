
/**
 * Cracking the Coding Interview
 * 
 * Chapter 1 - Strings & Arrays
 * 
 * Page 48
 * 
 * Question 1
 * 
 * Implement an algorithm to determine if a string has all unique characters.
 * 
 */
public class Question1
{
    public static void main()
    {
        String str = "hello";
        
        boolean check = checkIfUnique(str);
        
        System.out.print(check);
    }
    
    public static boolean checkIfUnique(String word)
    {
        boolean isUnique = false;
        
        int length = word.length();
        
        char letter;
        
        for(int i = 0; i < length; i++)
        {
            letter = word.charAt(i);
            
            for(int j = i + 1; j < length; j++)
            {
                if(letter == word.charAt(j))
                {
                    return false;
                }
            }
        }
        
        //Otherwise the string has all unique characters
        isUnique = true;
        
        return isUnique;
    }
}
