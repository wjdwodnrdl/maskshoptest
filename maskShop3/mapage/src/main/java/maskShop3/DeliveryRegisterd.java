package maskShop3;

public class DeliveryRegisterd extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String status;
    private String invQty;
    private Long productId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getProductId() {
        return productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getInvQty() {
        return invQty;
    }
    public void setInvQty(String invQty) {
        this.invQty = invQty;
    }

}