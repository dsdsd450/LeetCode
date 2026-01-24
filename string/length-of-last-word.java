class Solution {
    public int lengthOfLastWord(String s) {
        //1、从字符串末尾开始
        int length=0;
        int i=s.length()-1;

        //2、跳过队尾所有空格
        if(i>=0&&s.charAt(i)==' '){
            i--;
        }

        //3、找到最后一个单词
        if(i>=0&&s.charAt(i) ! ==' '){
            i--;
            length++;
        }
        return length;
        
    }
}