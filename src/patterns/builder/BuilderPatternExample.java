/**
 * 
 */
package patterns.builder;

/**
 * @author Jorge
 *
 */
public class BuilderPatternExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountBuilder builder = new BankAccountBuilder(12345l);

        BankAccount bankAccount = builder.withBalance(1000.20)
                .withOwner("Oaken")
                .withRate(10.15)
                .withType(BankAccountType.PLATINUM)
                .build();

        System.out.println(bankAccount);
        bankAccount.toString();

	}

}
