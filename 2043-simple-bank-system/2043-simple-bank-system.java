class Bank {
     int n;
     long[] balance;
    public Bank(long[] balance) {
        this.balance=balance;
        this.n=balance.length;
    }

    public boolean isValidAccount(int account) {
        return account >= 1 && account <= n;
    }

    public boolean transfer(int account1, int account2, long money) {
        if(!isValidAccount(account1) || !isValidAccount(account2)) return false;
        int i1=account1-1;
        int i2=account2-1;
        if(balance[i1]<money) return false;
        balance[i1]-=money;
        balance[i2]+=money;
        return true;
    }
    
    public boolean deposit(int account, long money) {
         if(!isValidAccount(account)) return false;
         balance[account-1]+=money;
         return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(!isValidAccount(account)) return false;
        if(balance[account-1]<money) return false;
        balance[account-1]-=money;
        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */