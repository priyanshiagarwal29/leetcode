class Solution {
    public static int gcd(int a,int b){
        while(b !=0){
            int temp=a%b;
            a=b;
            b=temp;
          }
          return a;
    }
    public List<Integer> replaceNonCoprimes(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int n:nums){
            while(!list.isEmpty()){
                int last=list.get(list.size()-1);
                int g=gcd(last,n);
                if(g==1) break;
                list.remove(list.size()-1);
                n=(last/g)*n;
            }
            list.add(n);
        }
        return list;
    }
}