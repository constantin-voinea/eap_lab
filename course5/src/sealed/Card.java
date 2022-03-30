package sealed;

/**
 * @author cvoinea
 */
public sealed class Card extends Payment permits CreditCard, DebitCard{

}
