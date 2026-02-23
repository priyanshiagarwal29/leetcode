class Solution {
public:
    int fact(int n){
        int total=0;
        
        while(n){
            int d=n%10;
            int f=1;
            for(int i=1;i<=d;i++){
                f=f*i;
            }
            total+=f;
            n=n/10;
        }
        return total;
    }
    void fillset(int n,vector<int>& arr){
        while(n){
            int d=n%10;
            arr[d]++;
            n=n/10;
        }
    }
    bool checkset(vector<int>& arr1,vector<int>& arr2){
         for(int i=0;i<=9;i++){
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }
    bool isDigitorialPermutation(int n) {
        int sum=fact(n);
        vector<int> arr1(10,0);
        vector<int> arr2(10,0);
        
        fillset(n,arr1);
        fillset(sum,arr2);
        if(checkset(arr1,arr2)) {
            return true;
        }
        return false;
    }
};