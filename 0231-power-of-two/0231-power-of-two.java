class Solution {
    public boolean isPowerOfTwo(int n) {
     long num=2;
     if(n==1) return true;
     if(fun(n,num)==1) return true;
     else return false;
    }
    static int fun(int n,long num){
        if(num==n) return 1;
        if(num>n) return 0;
        return fun(n,num*2);
        
    }
}