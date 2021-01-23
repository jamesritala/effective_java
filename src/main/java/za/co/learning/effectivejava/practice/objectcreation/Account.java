package za.co.learning.effectivejava.practice.objectcreation;

import java.sql.Date;

public class Account {

    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;
    private Date dateOpened;

    public static class Builder{
        private long accountNumber;
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;
        private Date dateOpened;

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

        public Builder dateOpened(Date dateOpened){
            this.dateOpened=dateOpened;
            return this;
        }

        public Account build(){
            return new Account(this);
        }
    }

    private Account(Builder builder){
        accountNumber=this.accountNumber;
        branch=this.branch;
        owner=this.owner;
        balance=this.balance;
        interestRate=this.interestRate;
        dateOpened=this.dateOpened;
    }

}
