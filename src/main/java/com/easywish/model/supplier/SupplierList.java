
package com.easywish.model.supplier;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class SupplierList {

    @Expose
    private String address;
    @Expose
    private String lati;
    @Expose
    private String longi;
    @Expose
    private Long mobile;
    @Expose
    private String name;
    @Expose
    private List<Quote> quotes;
    @Expose
    private Long rating;
    @Expose
    private List<SupplierList> supplierList;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public List<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }

    public List<SupplierList> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(List<SupplierList> supplierList) {
        this.supplierList = supplierList;
    }

}
