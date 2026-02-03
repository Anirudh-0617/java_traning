class Balance {
    int balance = 15000;
    public int getBalance(){
        return this.balance;
    }
}

interface Transaction{
    Balance b=new Balance();
    void process(int amount);
}
class withdraw implements Transaction{
    public void process(int amount){
        Transaction.b.balance-=amount;
        if(amount<=Transaction.b.getBalance())
        System.out.println("After withdraw: "+Transaction.b.balance);
        else
        System.out.println("Insufficient Balance");
    }

}
class deposit implements Transaction{
    public void process(int amount){
        Transaction.b.balance+=amount;
    }
}
public class Main3 {
    public static void main(String[] args){
        System.out.println("Initial Balance: "+Transaction.b.getBalance());
        new deposit().process(3000);
        System.out.println("After deposit: "+Transaction.b.getBalance());
        new withdraw().process(5000);
        
    }
}