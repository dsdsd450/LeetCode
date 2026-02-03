class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
       int left=0;
       int maxLen=0;

       for(int right=0;right<s.length();right++){
        char currentChar=s.charAt(right);

        //如果当前字符已存在于map中
        if(map.containsKey(currentChar)){
            //将左指针移动到重复字符上一个出现位置的下一个，但不能向后退
            left=Math.max(left,map.get(currentChar)+1);
        }

        //更新字符的位置
        map.put(currentChar,right);

        //计算当前窗口长度并计算最大值
        maxLen=Math.max(maxLen,right-left+1);
       }
       return maxLen;
    }
}