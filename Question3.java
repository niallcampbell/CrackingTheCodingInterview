
/**
 * Cracking the Coding Interview
 * 
 * Chapter 1 - Strings & Arrays
 * 
 * Page 48
 * 
 * Question 3
 * 
 * Design an algorithm and write code to remove the duplicate characters in a string.
 * 
 */
public class Question3
{
    public static void removeDuplicates(String str)
    {
        int len = str.length();
        
        if(str == null)
        {
            //String is empty
        }
        else if(len == 1)
        {
            System.out.print(str); //Only one letter so no duplicates
        }
        else
        {
            String str2 = ""; //Stores the string without duplicates
            
            char letter;
            
            int len2 =  0; //Length of new String
            
            boolean check = false; //false if the letter isn't a duplicate, true if it is
            
            //Loop through the input String and add each character to the new String only if that character isn't already in the new String.
            for(int i = 0; i < len; i++)
            {
                letter = str.charAt(i);
                
                check = false;
                
                if(i == 0)
                {
                    //Add the first letter to the new String as it can't be a duplicate yet. 
                    str2 = str2 + letter;
                    len2 = 1;
                }
                else
                {
                    for(int j = 0; j < len2; j++) //Loop through new string and check if the letter already appears in it
                    {
                        if(letter == str2.charAt(j))
                        {
                            check = true; //It is a duplicate
                        }
                    }
                    
                    //If the letter ins't a duplicate add it to the new String
                    if(check == false)
                    {
                        str2 = str2 + letter;
                        len2++;
                    }
                    
                }
                
            }
            
            System.out.print(str2);
            
        }
    }
}
