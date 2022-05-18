package enumExample;

/**
 * @author cvoinea
 */
public class Main {

    public static void main(String[] args) {

        Pizza pizza = new Pizza();
        pizza.setPizzaStatus(Pizza.PizzaStatus.ORDERED);

        System.out.println(pizza);
        System.out.println("time to deliver: " + pizza.getTimeOfDeliveryInHours());

        for (Pizza.PizzaStatus status : Pizza.PizzaStatus.values()){
            System.out.println(status.name() + ": " + status.getHoursToDeliver());
        }
    }
}
