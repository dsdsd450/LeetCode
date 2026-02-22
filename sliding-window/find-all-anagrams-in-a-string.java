class Solution {
    public List<Integer> findAnagrams(String s, String p) {
      List<Integer> result=new ArrayList<>();
      if(s.length()<p.length()) return result;

      int[] pCount=new int[26];
      int[] windowCount=new int[26];

      for(int i=0;i<p.length();i++){
        pCount[p.charAt(i)-'a']++;
        windowCount[s.charAt(i)-'a']++;
      }

      if(Arrays.equals(pCount,windowCount)) result.add(0);

      int n=s.length();
      int m=p.length();

      for(int i=m;i<n;i++){
        windowCount[s.charAt(i)-'a']++;
        windowCount[s.charAt(i-m)-'a']--;

        if(Arrays.equals(pCount,windowCount)) result.add(i-m+1);
      }

      return result;
    }
}