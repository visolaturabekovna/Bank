package OOP;

public class TestBank {
    public static void main(String[] args) {
        Bank c1=new Bank();
        c1.openAccount("aacs12","Aziza Azimova","$");
        c1.showAccount();
        c1.deposit(120);
        c1.showAccount();
        c1.withdraw(20);
        c1.showAccount();

        Bank c2=new Bank();
        c2.openAccount("aacs13","Malika Komilova","$");
        c2.deposit(30);
        c2.withdraw(10);
        c2.showAccount();


        Bank c3=new Bank();
        c3.openAccount("aacs14","Komila Komilova","$");
        c3.deposit(15);
        System.out.println(Bank.getBAnkBalance());
    }
}
