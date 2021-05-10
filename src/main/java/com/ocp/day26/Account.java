package com.ocp.day26;

//帳戶資源
public class Account {

    //帳戶餘額
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    //查詢帳戶餘額
    public int getBalance() {
        return balance;
    }
    
    //修改帳戶餘額
    private void setBalance(int amout){
        balance=balance-amout;
    }
    //提款方法,amout 表示提款金額
    //public void withdraw(int amout) {
    //synchronized 資源鎖定誰先來誰先做
    public synchronized void withdraw(int amout) {    
        String tname = Thread.currentThread().getName();
        System.out.printf("%s 準備提款$%d元\n", tname, amout);
        //檢查帳戶餘額
        //1.先取得目前的帳戶餘額
        int currentBalance=getBalance();
        //2.目前帳戶餘額是否足夠提款
        if(currentBalance>=amout){
            //開始提款
            //利用for loop模擬提款所需時間
            for(int i=0;i<Integer.MAX_VALUE;i++);
            //變更帳戶餘額
            //帳戶餘額 = 目前帳戶餘額 - 提款金額
            setBalance(amout);
            //印出交易清單
            System.out.printf("%s 提款 $%d成功 帳戶餘額 $%d\n",tname,amout,getBalance());
        }else{
            //印出失敗清單
            System.out.printf("%s 提款 $%d失敗 帳戶餘額 $%d\n",tname,amout,getBalance());
        }
    }
}
