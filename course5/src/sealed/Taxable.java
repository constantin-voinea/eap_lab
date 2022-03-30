package sealed;

/**
 * @author cvoinea
 */
public sealed interface Taxable permits Refundable, Payment{

}
