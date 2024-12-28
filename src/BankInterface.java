public interface BankInterface
{


    int getbalance();
    String depositmoney(int amount);
    String withdraw(int amount,String enteredpassword);
    double calculateofinterest(int time);


}


