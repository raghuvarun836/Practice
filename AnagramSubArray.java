public class AnagramSubArray
{
    public static void main(String[] args)
    {
        String s="aabaabaa";
        String an="aaba";
        int i=0,j=0;
        int k=an.length();
        int c=0;
        int[] anagramFrequency = new int[26];
        int[] windowFrequency = new int[26];

        for (char ch : an.toCharArray())
            anagramFrequency[ch - 'a']++;

        while (j < s.length()){
            if (j - i + 1 < k) {
                windowFrequency[s.charAt(j) - 'a']++;
                j++;
            } else if (j - i + 1 == k) {
                windowFrequency[s.charAt(j) - 'a']++;
                if (isAnagram(anagramFrequency, windowFrequency))
                    c++;
                windowFrequency[s.charAt(i) - 'a']--;
                i++;
                j++;
            }
        }
        System.out.println(c);
    }

    private static boolean isAnagram(int[] anagramFrequency, int[] windowFrequency)
    {
        for (int i = 0; i < 26; i++)
            if (anagramFrequency[i] != windowFrequency[i])
                return false;
        return true;
    }
}