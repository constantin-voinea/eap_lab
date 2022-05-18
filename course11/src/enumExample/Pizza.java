package enumExample;

/**
 * @author cvoinea
 */
public class Pizza {

    private PizzaStatus pizzaStatus;

    public boolean isDeliverable(){
        return this.pizzaStatus == PizzaStatus.READY;
    }

    public int getTimeOfDeliveryInHours(){
//        switch (pizzaStatus){
//            case ORDERED: return 2;
//            case READY: return 1;
//            case DELIVERED: return 0;
//        }
//        return 0;
        return pizzaStatus.getHoursToDeliver();
    }



    public enum PizzaStatus{
        ORDERED(2){
            @Override
            public void abstractMethod() {
                System.out.println("ordered");
            }
        }, READY(1){
            @Override
            public void abstractMethod() {
                System.out.println("ready");
            }
        }, DELIVERED(0){
            @Override
            public void abstractMethod() {
                System.out.println("delivered");
            }
        };

        private final int hoursToDeliver;

        PizzaStatus (int hoursToDeliver){
            this.hoursToDeliver = hoursToDeliver;
        }

        public int getHoursToDeliver() {
            return hoursToDeliver;
        }

        public abstract void abstractMethod();
    }

    public PizzaStatus getPizzaStatus() {
        return pizzaStatus;
    }

    public void setPizzaStatus(PizzaStatus pizzaStatus) {
        this.pizzaStatus = pizzaStatus;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaStatus=" + pizzaStatus +
                '}';
    }
}
