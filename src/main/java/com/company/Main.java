package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Hello World");
        Service accountDetails = new Service();
        Account Milo = new Account("Milo", "Rafa", 1995);
        Account Seb = new Account("Seb", "Delayney", 2005);

        accountDetails.addAccountUser(Milo);
        accountDetails.addAccountUser(Seb);

       System.out.println(accountDetails.getAccount(1).toString());
       System.out.println(accountDetails.getAccount(2).toString());

       System.out.printf("Account User: %s", accountDetails.toJSON());




    }
}
