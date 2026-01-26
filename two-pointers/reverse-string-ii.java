class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb= new StringBuilder(s);
        int n=sb.length();

        int q = n / (2*k);
        int remainder = n % (2*k);

        for(int i=0;i<=q-1;i++){
            reverse(sb,0+k*i,k*(i+1)-1);
        }

        if(remainder < k && remainder>0) reverse(sb,2*k*q,n-1);
        else if(remainder>=k && remainder< 2*k) reverse(sb,2*k*q,2*k*q+k-1);

        return sb.toString();
    }

    private void reverse(StringBuilder sb,int left,int right){
        while(left<=right){
            char tmp=sb.charAt(left);
            sb.setCharAt(left++,sb.charAt(right));
            sb.setCharAt(right--,tmp);
        }
    }
}