
package com.easywish.model.order;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class OrderList {

    @Expose
    private String deliveryDate;
    @Expose
    private Boolean isActive;
    @Expose
    private List<Item> items;
    @Expose
    private Long mobileRetailer;
    @Expose
    private Long mobileSupplier;
    @Expose
    private Long orderId;
    @Expose
    private List<OrderList> orderList;
    @Expose
    private Long wishId;

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Long getMobileRetailer() {
        return mobileRetailer;
    }

    public void setMobileRetailer(Long mobileRetailer) {
        this.mobileRetailer = mobileRetailer;
    }

    public Long getMobileSupplier() {
        return mobileSupplier;
    }

    public void setMobileSupplier(Long mobileSupplier) {
        this.mobileSupplier = mobileSupplier;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public List<OrderList> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderList> orderList) {
        this.orderList = orderList;
    }

    public Long getWishId() {
        return wishId;
    }

    public void setWishId(Long wishId) {
        this.wishId = wishId;
    }

}
