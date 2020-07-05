
package com.easywish.model.retailer;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class RetailerList {

    @Expose
    private String address;
    @Expose
    private List<Inventory> inventory;
    @Expose
    private String lati;
    @Expose
    private String longi;
    @Expose
    private Long mobile;
    @Expose
    private String name;
    @Expose
    private List<RetailerList> retailerList;
    @Expose
    private List<WishList> wishList;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Inventory> getInventory() {
        return inventory;
    }

    public void setInventory(List<Inventory> inventory) {
        this.inventory = inventory;
    }

    public String getLati() {
        return lati;
    }

    public void setLati(String lati) {
        this.lati = lati;
    }

    public String getLongi() {
        return longi;
    }

    public void setLongi(String longi) {
        this.longi = longi;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RetailerList> getRetailerList() {
        return retailerList;
    }

    public void setRetailerList(List<RetailerList> retailerList) {
        this.retailerList = retailerList;
    }

    public List<WishList> getWishList() {
        return wishList;
    }

    public void setWishList(List<WishList> wishList) {
        this.wishList = wishList;
    }

}
