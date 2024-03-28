package Bank;

import java.util.*;
public class Bank {

	public Bank() {
		
	}
    public static void debit(User[] user,int id) {
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("--------------------Debit------------------------------------");
    	System.out.println("Enter the Amount :");
    	int amount=sc.nextInt();
    	if(user[id].getBalance()>amount) {
    		int balance=user[id].getBalance()-amount;
        	user[id].setBalance(balance);
        	System.out.println("Successfully Debited....\nNow Your Balance: "+user[id].getBalance()+"\n");
        	System.out.println("---------------------------------------------------------");
    	}
    	else {
    		System.out.println("Sorry not Enough Balance Check your balance\n");
    		System.out.println("---------------------------------------------------------");
    	}
    	
    }
    public static void deposit(User[] user,int id) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("--------------------Deposit----------------------------------");
    	System.out.println("Enter the Amount :");
    	int amount=sc.nextInt();
    	int balance=user[id].getBalance()+amount;
    	user[id].setBalance(balance);
    	System.out.println("Successfully Deposited....\nNow Your Balance: "+user[id].getBalance()+"\n");
    	System.out.println("-------------------------------------------------------------");
    }
    public static void checkbalance(User[] user,int id) {
    	System.out.println("-------------------------------------------------------------");
    	System.out.println("Your Name: "+user[id].getUsername() +"\nYour Current Balance:"+user[id].getBalance());
    	System.out.println("-------------------------------------------------------------");
    }
	
}
