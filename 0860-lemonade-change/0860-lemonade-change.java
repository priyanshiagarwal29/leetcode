class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0;
        for(int n:bills){
           if(n==5) five++;
           else if(n==10){
              if(five>0){
                five--;
                ten++;
              }
              else return false;
           }
           else{
            if(ten>0 && five>0){
                five--;
                ten--;
            }
            else if(five>2){
                five-=3;
            }
            else return false;
           }
        }
        return true;
    }
}