
package com.easywish.model.wishquotes;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Quote {

    @Expose
    private String pricePerQty;
    @Expose
    private String productName;
    @Expose
    private String qty;
    @Expose
    private String unit;

    public String getPricePerQty() {
        return pricePerQty;
    }

    public void setPricePerQty(String pricePerQty) {
        this.pricePerQty = pricePerQty;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}
