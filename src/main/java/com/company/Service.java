package com.company;

import org.json.JSONObject;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.Map;

public class Service {


    private int counter;
    //private Map<Integer, Account> AppAccount;
    private Map<Integer,Account> appAccount = new HashMap<Integer, Account>();

    public Service(){
        appAccount = new HashMap<>();
        counter = 1;
    }

    public void addAccountUser (Account User){
        appAccount.put(counter, User);
        counter ++;

    }

    public Account getAccount(int UserID){

        return appAccount.get(UserID);
    }

    public JSONObject toJSON () {

        return new JSONObject(appAccount);

    }

    public int returnNumberOfAccounts(String firstName) {

        int count = 0;
        for (int i = 1; i <= appAccount.size(); i++) {
            if (appAccount.get(i).getFirstName().equals(firstName)){
                count++;
            }
        }

        return count;






    }
}
