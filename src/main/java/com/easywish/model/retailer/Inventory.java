
package com.easywish.model.retailer;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Inventory {

    @Expose
    private String availableQuantity;
    @Expose
    private Boolean isLow;
    @Expose
    private String productName;

    public String getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(String availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public Boolean getIsLow() {
        return isLow;
    }

    public void setIsLow(Boolean isLow) {
        this.isLow = isLow;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

}
