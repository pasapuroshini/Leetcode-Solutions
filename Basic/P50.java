class Solution {
    public double myPow(double x, int n) {
      double pow=1.0;
      if(n<0)
      {
        x=1/x;
        n=-n;
      }
      while(n!=0)
      {
        if( (n&1)!=0)// checking n is odd
        pow*=x;

        x*=x;
        n>>>=1;// n=n/2
      }
      return pow;
    }
}
