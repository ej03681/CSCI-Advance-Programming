/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EddyJ
 */
public class Account11_3 {
    public static void main(String[] args){
        Account account = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);
        
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Account ID: "+ account.getId());
        System.out.println("Balance is $"+ account.getBalance());
        System.out.println("Monthly interest is $"+ account.getMonthlyInterest());
        System.out.println("This account was created "+ account.getDateCreated());
    }
}
class CheckingAccount extends Account {
    
}
class Account{
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private java.util.Date dateCreated;
public Account (){
dateCreated = new java.util.Date();
}
public Account(int id, double balance){
dateCreated = new java.util.Date();
this.id = id;
this.balance = balance;
}
public int getId(){ 
return id;
}
public void setId(){
    this.id = id;
}
public double getBalance(){
    return balance;
}
public void setBalance(){
    this.balance = balance;
}
public static double setAnnualInterestRate(double newannualInterestRate){
    annualInterestRate = newannualInterestRate;
    return annualInterestRate;
}
public double monthlyInterest(){
    return (annualInterestRate / 100.0) / 12.0;
}
public double getMonthlyInterest(){
    return balance * monthlyInterest();
}
public double withdraw(double newWithdraw){
    balance = balance - newWithdraw;
    return balance;
}
public double deposit(double newDeposit){
    balance = balance + newDeposit;
    return balance;
}
public java.util.Date getDateCreated(){
    return dateCreated;
 }
}