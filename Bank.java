package OOP;

public class Bank {
    private String accountNumber;
    private boolean isAccount=false;
    private String name;
    private String balanceType;
    private static long balance=0;
    private static long balanceBank=0;
    Bank(){};
    void  openAccount(String accId,String accName,String blnType){
        accountNumber=accId;
        name=accName;
        balanceType=blnType;
        isAccount=true;
    }
    void showAccount(){
        System.out.println(name+"ning akkaunt nomeri: "+accountNumber+", balansi: "+balance+" "+balanceType);
    }
    void deposit(long depSum){
        if(isAccount && depSum>0){
            balance+=depSum;
            balanceBank+=depSum;
        }
        else System.out.println("Hurmatli mijoz oldin account ochishingiz kerak!");

    }
    void withdraw(long drawlSum){
        if(drawlSum<=balance){
            balance-=drawlSum;
            balanceBank-=drawlSum;
        }
        else System.out.println("Hurmatli "+name+ " balansingizda yetarli mablag' mavjud emas");
    }
    private  boolean searchAccount(String accNO){
        return false;
    }
    static long getBAnkBalance(){
        return balanceBank;
    }

}
