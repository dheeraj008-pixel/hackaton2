
import java.util.Scanner;
public class BankAccount {
    static double bankbalance = 50000;
    void deposite(double deposite ){
        bankbalance+= deposite;
        System.out.println("Bank Balance = "+bankbalance);
    }
    void withdraw(double withdraw){
        bankbalance-=withdraw;
        System.out.println("Bank balance = "+bankbalance);
    }
    double checkBalance(){
        return bankbalance;
        
    }
    void displayAccount(){
        System.out.println("Account holder : Dheeraj");
        System.out.println("Account number : HB08206");
        System.out.println(" current bank balance = "+bankbalance);
    }
    public static void main(String[] args) {
        Scanner lava=new Scanner(System.in);
       BankAccount s=new BankAccount();
       s.displayAccount();
        System.out.println("for  deposite(press 1) , for withdraw(press 2) ");
        int process=lava.nextInt();
        switch(process){
            case 1 :
                System.out.println("Enter deposite money");
                double deposite=lava.nextDouble();
                s.deposite(deposite);
                break;
                case 2 :
                    System.out.println("Enter withdraw money ");
                    double withdraw = lava.nextDouble();
                    s.withdraw(withdraw);
                    break;
        }
        
    }
}
