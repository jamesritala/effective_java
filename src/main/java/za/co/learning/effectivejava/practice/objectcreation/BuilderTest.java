package za.co.learning.effectivejava.practice.objectcreation;

import java.sql.Date;
import java.time.LocalDate;

public class BuilderTest {
    public static void main(String []args){
        Account account= new Account.Builder(1234l)
                .withOwner("Johnny R")
                .atBranch("New York Central Lane")
                .openingBalance(200000.54)
                .interest(7.5)
                .dateOpened(Date.valueOf(LocalDate.now()))
                .build();
    }
}
