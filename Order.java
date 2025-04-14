public class Order {
    private int id;
    private OrderStatus status;

    public Order(int id) {
        this.id = id;
        this.status = OrderStatus.PENDING;
    }

    public void UpdadeStatus(OrderStatus newStatus) {
        this.status = newStatus;
    }

    public void printOrderInfo(){
        System.out.println("Pedido #" + id + " esta" + status);
    }


}