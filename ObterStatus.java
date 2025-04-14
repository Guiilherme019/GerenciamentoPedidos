public enum OrderStatus {
    PENDING("Pendente"),
    COMFIRMED("Confirmado"),
    SHIPPED("Enviado"),
    DELIVERED("Entregue"),
    CANCELLED("Cancelado");
    private String description;
    OrderStatus(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public String toString() {
        return description;
    }
}