
package atmmachine;

import java.util.Scanner;

class Atm
{
float balance;
int pin = 1243;

public void checkPin()
{
System.out.println("Enter your pin:");
Scanner sc = new Scanner(System.in); 
int enterPin = sc.nextInt();

if(enterPin == pin )
{
menu();
        
}
else
{
System.out.println("you entered wrong pin ! please try again later");
}
}
public void menu()
{
System.out.println("Enter your choce:");
System.out.println("1.Check Account Balance");
System.out.println("2.Withdraw Money");
System.out.println("3.Deposite Money");
System.out.println("4.Exit");

Scanner sc = new Scanner(System.in);
int choice = sc.nextInt();

   if(choice == 1)
   {
   checkBalance();
   }
   else if(choice == 2)
   {
   withdrawMoney();
   }
   else if(choice == 3)
   {
   depositeMoney();
   }
   else if(choice == 4)
   {
  return;
   }
   else
   {
   System.out.println("Please entered the valid choice");
   }

}

public void checkBalance()
{
 System.out.println("Balance:"+balance);
 menu();
}

public void withdrawMoney()
{
 System.out.println("Enter ammout:");
 Scanner sc = new Scanner(System.in);
  float amount = sc.nextFloat();
  
  if(amount > balance)
  {
  System.out.println("Insufficient Balance");
  }
  else
  {
  balance= balance-amount;
  System.out.println("Money Withdraw successfully");
 
  }
   menu();
}

public void depositeMoney()
{
System.out.println("Enter the deposite amount:");
Scanner sc =  new Scanner(System.in);
float amount = sc.nextFloat();
balance = balance + amount;
System.out.println("Money Deposite Successfully");
menu();
}

}

public class ATMMachine {

    public static void main(String[] args) 
    {
    Atm at = new Atm();
    at.checkPin();
    }
    
}
