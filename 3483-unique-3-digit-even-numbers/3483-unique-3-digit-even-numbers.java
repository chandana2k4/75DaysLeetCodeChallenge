class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
        //int num=0;
        for(int i=0;i<digits.length;i++)
        {
            if(digits[i]==0)
            {
                continue;
            }
            for(int j=0;j<digits.length;j++)
            {
                for(int k=0;k<digits.length;k++)
                {
                    if(digits[k] %2 == 0  && i!=j && j!=k && i!=k)
                    {
                        String s="";
                        s=digits[i]+""+digits[j]+""+digits[k];
                        int num = Integer.parseInt(s);
                        System.out.print(num+" ");
                        set.add(num);
                    }
                }
            }
        }
        return set.size();
    }
}