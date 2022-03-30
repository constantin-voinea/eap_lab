package sealed;

/**
 * @author cvoinea
 *                               payment
 *                            ^        ^
 *                          /           \
 *                        /              \
 *                   card                 cash
 *                   ^  ^
 *                 /     \
 *               /        \
 *        creditCard      debitCard
 *            ^
 *            |
 *            |
 *         amexCard
 *
 */
public abstract sealed class Payment implements Taxable permits Card, Cash {
}
