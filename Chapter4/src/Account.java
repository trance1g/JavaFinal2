import java.util.*;
import java.text.*;

public class Account {
	private double balance;
	private String accountNumber;
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private int zip;
	private String phoneNumber;
	private boolean preferredCustomer;
	private String accountType;
	private String accountNotes;
	
	public double getBalance() {
		
		if(balance <= 0){
			negativeBalanceLetter();
		}
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountNumber() {
		int number1, number2, number3, number4;
		
		Random r = new Random();
		
		
		accountNumber += r.nextInt(1000000000);

		return accountNumber;
	
	}

	public void setAccountNumber() {
		this.accountNumber = accountNumber;
	
	
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isPreferredCustomer() {
		return preferredCustomer;
	}

	public void setPreferredCustomer(boolean preferredCustomer) {
		this.preferredCustomer = preferredCustomer;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
		
		switch(accountType){
		case "check":
			accountType = "checking";
			System.out.println("checking");
			break;
		case "save":
			accountType = "savings";
			System.out.println("savings");
			break;
		case "invest":
			accountType = "investment";
			System.out.println("investment");
			break;
		default: 
			accountType = "standard";
			System.out.println("standard");
			break;
		}
	}

	
	public void setAccountNotes(String accountNotes) {
		
		this.accountNotes = accountNotes;
		
	}
	
	public String getAccountNotes()
	{
		
		return accountNotes;
	}

	
	public void negativeBalanceLetter(){
		
		System.out.println("Negative balance letter has been sent.");
	}

	public Account(String firstName, String lastName, String streetAddress, String city, String state, int zip, String phoneNumber, boolean preferredCustomer, double balance, String accountType){
		setAccountNotes("none");
		this.firstName = firstName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.preferredCustomer = preferredCustomer;
		this.balance = balance;
		this.accountType = accountType;
		
	}
	
	
	

}
