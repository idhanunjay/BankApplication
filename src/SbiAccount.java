import java.util.UUID;

public class SbiAccount implements BankInterface {
    private String name;
   private String accountNo;
   private String password;
   private int balance;
   private double rateOfInterest;

    public SbiAccount(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.rateOfInterest=6.6;
        this.accountNo= String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public int getbalance() {
        return this.balance=balance;
    }

    @Override
    public String depositmoney(int amount) {
        this.balance+=amount;
        return "paisa hi paisa"+amount;

    }

    @Override
    public String withdraw(int amount,String enteredpassword) {
         if(enteredpassword.equals(this.password)){
             if(balance<amount){
                 return "insufficient balance";
             }
             else{
                 balance-=amount;
                 return "money withdrawn";
             }
         }
         else{
             return "you have entered wrong password";
         }
    }

    @Override
    public double calculateofinterest(int time) {
        return (balance*rateOfInterest*time)/100.0;
    }
}
