package builder;

/**
 * @author cvoinea
 */
public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount.BankAccountBuilder()
                .withName("bill")
                .withAccountNo("12345")
                .withEmail("@@")
                .acceptNewsletter(true)
                .build();

        System.out.println(bankAccount);
    }
}
