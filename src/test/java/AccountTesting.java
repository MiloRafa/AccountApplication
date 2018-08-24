import com.company.Account;
import com.company.Service;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AccountTesting {

    @Test
    public void test() {

        Service accountDetails = new Service();
        Account Milo = new Account("Milo", "Rafa", 1995);
        Account Seb = new Account("Seb", "Delayney", 2005);
        Account Milo2 = new Account("Milo", "Rafa", 1995);

        accountDetails.addAccountUser(Milo);
        accountDetails.addAccountUser(Seb);
        accountDetails.addAccountUser(Milo2);

        int result = accountDetails.returnNumberOfAccounts("Milo");
        System.out.println(result);
        assertEquals(2, result);


    }



}
