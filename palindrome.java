import java.util.*;
public class palindromestrings { 
  static boolean isPalindrome(String str) 
    { 
        int i = 0, j = str.length() - 1; 
        while (i < j)
        { 
            if (str.charAt(i) != str.charAt(j)) 
                return false;
            i++; 
            j--; 
        } 
        return true; 
    } 
    public static void main(String[] args) 
    { 
        int i;
        List<String> listofstrings=new ArrayList<String>();  
        listofstrings.add("apple");
        listofstrings.add("madam");
        listofstrings.add("carat");
        listofstrings.add("dad");
        listofstrings.add("mom");
        for(i=0;i<5;i++)
        { 
        String str=listofstrings.get(i);
        if (isPalindrome(str)) 
            System.out.println(str); 
        } 
} }