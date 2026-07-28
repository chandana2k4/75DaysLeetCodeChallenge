class Solution {
    public String smallestPalindrome(String s) {
        
        int[] count = new int[26];

        for(char ch: s.toCharArray()) {
            count[ch- 'a']++;

        }

        StringBuilder firstHalf = new StringBuilder();
        char middle= '\0';

        for(char c='a';c<='z';c++) {
            int idx=c-'a';
            for(int i=0;i<count[idx] /2;i++) {
                firstHalf.append(c);
            }

            if(count[idx]%2==1) {
                middle=c;
            }
        }

        StringBuilder ans = new StringBuilder();

        ans.append(firstHalf);

        if(middle!='\0')
        ans.append(middle);

        ans.append(new StringBuilder(firstHalf).reverse());

        return ans.toString();
    }
}