

public class OrderSystem {
    public static void main(String[] args) {
        Order order1 = new Order(1);
        Order order2 = new Order(2);
        Order order3 = new Order(3);
        Order order4 = new Order(4);
        Order order5 = new Order(5);

        System.out.println("Status inicial do pedido: ");
        order1.printOrderInfo();
        order2.printOrderInfo();
        order3.printOrderInfo();
        order4.printOrderInfo();
        order5.printOrderInfo();

        System.out.println("Status atualizado do pedido: ");
        order1.UpdadeStatus(OrderStatus.COMFIRMED);
        order2.UpdadeStatus(OrderStatus.SHIPPED);
        order3.UpdadeStatus(OrderStatus.CANCELLED);
        order4.UpdadeStatus(OrderStatus.DELIVERED);
        order5.UpdadeStatus(OrderStatus.SHIPPED);

        order1.printOrderInfo();
        order2.printOrderInfo();
        order3.printOrderInfo();
        order4.printOrderInfo();
        order5.printOrderInfo();

        System.out.println("/nStatus Disponiveis no Sistema: ");
        for(OrderStatus status : OrderStatus.values()) {
            System.out.println(status);
        }
    }
}
