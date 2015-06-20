package sujoy;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.junit.Assert;

/**
 * Created by sujoydey on 19/06/15.
 */
public class MyStepdefs {
    @Given("^I want to send a Credit transaction worth £(\\d+)$")
    public void I_want_to_send_a_Credit_transaction_worth_£(int arg1) throws Throwable {
        Money mon = new Money();

        int transaction = arg1;

        Assert.assertEquals(arg1, mon.getTotal());


        // Express the Regexp above with the code you wish you had
        // throw new PendingException();
    }

    @When("^I have to pay my friend £(\\d+)$")
    public void I_have_to_pay_my_friend_£(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        Money money = new Money();
        int total = arg1;

        Assert.assertEquals(arg1, money.getSending());
        //throw new PendingException();
    }

    @Then("^he will receive the amount £(\\d+).$")
    public void he_will_receive_the_amount_£_(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        Money money = new Money();


        int transaction = arg1;

        Assert.assertEquals(transaction, money.sending());
        // throw new PendingException();
    }

    @And("^I have now only got £(\\d+) left in my bank account$")
    public void I_have_now_only_got_£_left_in_my_bank_account(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        Money mon = new Money();

        int transaction = arg1;


        Assert.assertEquals(transaction, mon.getRecieving());

        //throw new PendingException();
    }

    @And("^so I have to make another payment to get £(\\d+) back into my account$")
    public void so_I_have_to_make_another_payment_to_get_£_back_into_my_account(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        Money on = new Money();

        int transaction = arg1;

        Assert.assertEquals(transaction,on.getBalance());

       // throw new PendingException();
    }
}
