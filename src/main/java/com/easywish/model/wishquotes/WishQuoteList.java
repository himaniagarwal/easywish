
package com.easywish.model.wishquotes;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class WishQuoteList {

    @Expose
    private String distance;
    @Expose
    private Long logisticsCost;
    @Expose
    private Long mobileRetailer;
    @Expose
    private Long mobileSupplier;
    @Expose
    private Long quoteId;
    @Expose
    private List<Quote> quotes;
    @Expose
    private Long rating;
    @Expose
    private Long wishId;

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public Long getLogisticsCost() {
        return logisticsCost;
    }

    public void setLogisticsCost(Long logisticsCost) {
        this.logisticsCost = logisticsCost;
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

    public Long getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Long quoteId) {
        this.quoteId = quoteId;
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

    public Long getWishId() {
        return wishId;
    }

    public void setWishId(Long wishId) {
        this.wishId = wishId;
    }

}
