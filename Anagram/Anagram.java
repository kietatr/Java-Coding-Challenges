import java.util.*;

class Anagram {
    // Create a frequency array for 26 lowercase characters a -> z
    // Time: O(n)
    static boolean areAnagrams(String s1, String s2)
    {
        if (s1.length() != s2.length()) return false;
        
        // Create an array that holds the frequency for a -> z (26 lowercase alphabet characters)
        int[] freq = new int[26];
        
        for (int i = 0; i < s1.length(); i++)
        {
            freq[s1.toCharArray()[i] - 'a']++;
            freq[s2.toCharArray()[i] - 'a']--;
        }

        for (int count : freq)
        {
            if (count != 0) 
                return false;
        }

        return true;
    }
    
    // Sort the arrays, then compare them
    // Time: O(nlog(n))
    static boolean areAnagrams2(String s1, String s2)
    {
        if (s1.length() != s2.length()) return false;

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        for (int i = 0; i < a1.length; i++)
            if (a1[i] != a2[i])
                return false;

        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(areAnagrams2("rat", "tar"));
    }
}