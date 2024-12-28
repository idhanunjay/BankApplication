import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);
         String name=sc.next();
         String password=sc.next();
         int balance=sc.nextInt();
         SbiAccount dhanunjaya=new SbiAccount(name,password,balance);
         System.out.println("my current balance is "+dhanunjaya.getBalance());
         System.out.println(dhanunjaya.getAccountNo());
         System.out.println("enter amount to be withdrawn and your password");
         int amount=sc.nextInt();
         String enterpassword=sc.next();

         System.out.println(dhanunjaya.withdraw(amount,enterpassword));

         System.out.println("checking rate of intererst for remaining balnce");
        System.out.println("my current balance is "+dhanunjaya.getBalance());
         System.out.println(dhanunjaya.calculateofinterest(2));
         System.out.println(dhanunjaya.depositmoney(600));
        System.out.println("my current balance is "+dhanunjaya.getBalance());

    }
}