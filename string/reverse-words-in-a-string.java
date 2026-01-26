class Solution {
    public String reverseWords(String s) {
        //convert String into StringBuilder for easier manipulation
        StringBuilder sb=trimSpaces(s);

        reverse(sb,0,sb.length()-1);

        reverseEachWord(sb);

        return sb.toString();
    }

    public StringBuilder trimSpaces(String s){
        //把左右空格去掉
        int left=0,right=s.length()-1;
        while(left<=right && s.charAt(left) ==' ') left++;
        while(left<=right && s.charAt(right) ==' ') right--;

        //中间空格只剩一格
        StringBuilder sb = new StringBuilder();
        

        while(left<=right){
            char c=s.charAt(left);
            if(c !=' '){
                sb.append(c);
            }else if(sb.charAt(sb.length()-1) !=' '){
                sb.append(c);
            }
            left++;
        }
        return sb;
    }

    //把整个string reverse
    private void reverse(StringBuilder sb, int left, int right){
        while(left<right){
            char tmp=sb.charAt(left);
            sb.setCharAt(left++,sb.charAt(right));
            sb.setCharAt(right--,tmp);
        }
    }

    //把每个单词reverse
    private void reverseEachWord(StringBuilder sb){
        int start=0,end=0;
        int n=sb.length()-1;

        while(start<n){
            while(end<=n && sb.charAt(end) != ' ') end++;

            reverse(sb,start,end-1);

            start=end+1;
            end=start;
        }
    }
}