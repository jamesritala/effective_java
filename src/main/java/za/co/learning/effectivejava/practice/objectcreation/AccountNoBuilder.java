package za.co.learning.effectivejava.practice.objectcreation;

public class AccountNoBuilder {
    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

    public AccountNoBuilder(long accountNumber,String owner,String branch,double balance,double interestRate){
    this.accountNumber=accountNumber;
    this.owner=owner;
    this.branch=branch;
    this.balance=balance;
    this.interestRate=interestRate;

    }
}
