package za.co.learning.effectivejava.practice.objectcreation;

public class Account {

    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

    public static class Builder{
        private long accountNumber;
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        public Builder(long accountNumber){
            this.accountNumber=accountNumber;
        }

        public Builder withOwner(String owner){
            this.owner=owner;
            return this;
        }
        public Builder atBranch(String branch){
            this.branch=branch;
            return this;
        }

        public Builder openingBalance(double balance){
            this.balance=balance;
            return this;
        }

        public Builder interest(double interestRate){
            this.interestRate=interestRate;
            return this;
        }

        public Account build(){
            Account account=new Account();
            account.accountNumber=this.accountNumber;
            account.branch=this.branch;
            account.owner=this.owner;
            account.balance=this.balance;
            account.interestRate=this.interestRate;
            return account;
        }
    }
    
    private Account(){
    }

}
