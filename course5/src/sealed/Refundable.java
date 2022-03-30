package sealed;

/**
 * @author cvoinea
 */
public sealed interface Refundable extends Taxable permits VatRefundable{
}
