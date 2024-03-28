package Bank;

import java.util.*;
public class BankApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean ans=true;
		System.out.println("Enter the User Count");
		int users=sc.nextInt();
		User user[]=new User[users];
	    int count=0;
	    while(ans) {
	        System.out.println("1-Add 2-Deposit 3-Debit 4-Display 5-CheckBalance 6-Exit"); 
	        int choice = sc.nextInt();
	        switch(choice) {
	            case 1 -> {
	                if(user.length > 0) {
	                    user[count] = new User();
	                    System.out.println("Enter the UserName");
	                    String username = sc.next();
	                    System.out.println("Enter the Mobile Number");
	                    long mobile = sc.nextLong();
	                    user[count].setMobile(mobile);
	                    user[count].setUsername(username);
	                    System.out.println("Successfully Created User");
	                    System.out.println("-----------------------------------------------------------");
	                    System.out.println("Your UserId: " + user[count].getUserid() + "\nUserName: " + user[count].getUsername() + "\nBalance: " + user[count].getBalance() + "\nMobileNumber: " + user[count].getMobile());
	                    System.out.println("-----------------------------------------------------------");
	                    count++;
	                } else {
	                    System.out.println("Sorry created Users is " + user.length);
	                }
	            }
	            case 2 -> {
	                System.out.println("Enter the UserId");
	                int userid = sc.nextInt();
	                Bank.deposit(user, userid);
	            }
	            case 3 -> {
	                System.out.println("Enter the UserId");
	                int uid = sc.nextInt();
	                Bank.debit(user, uid);
	            }
	            case 4 -> Display(user);
	            case 5 -> {
	                System.out.println("Enter the UserId");
	                int id = sc.nextInt();
	                Bank.checkbalance(user, id);
	            }
	            case 6-> {
	            	ans = false;
	            	System.out.println("Thank you Visit Agian");
	            }
	            default->{
	            	System.out.println("Sorry Wrong Key pressed");
	            	 ans=false;
	            }
	              
	            
	        }
	    }

	}
	public static void Display(User[] arr) {
		System.out.println("-------------------------------------");
		for(User u:arr)
			System.out.println(u);
		System.out.println("-------------------------------------");
	    
	}
}
