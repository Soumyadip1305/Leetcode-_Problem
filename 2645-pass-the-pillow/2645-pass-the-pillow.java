class Solution {
    public int passThePillow(int n, int t) {
        
        n--;
        if(t<n){
            return t+1;
        }
       
     int x=t/n;
     int y=t%n;
      if(x%2==0){
   return  y+1;
      }else return n-y+1;
}
}