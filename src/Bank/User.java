package Bank;

public class User {
	static int id=0;
	int userid;
	String Username;
	int Balance;
    long Mobile;
    
    User(){
    	userid=id;
    	id++;
    	Balance=1000;
    }

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

	public long getMobile() {
		return Mobile;
	}

	public void setMobile(long mobile) {
		Mobile = mobile;
	}

	public int getUserid() {
		return userid;
	}


	@Override
	public String toString() {
		return "userid="+userid +",Username="+Username+",Balance="+Balance +", Mobile="+ Mobile;
	}
    
	
	

}
