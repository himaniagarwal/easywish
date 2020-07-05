
package com.easywish.model.wishquotes;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class QuoteList {

    @Expose
    private List<WishQuoteList> wishQuoteList;

    public List<WishQuoteList> getWishQuoteList() {
        return wishQuoteList;
    }

    public void setWishQuoteList(List<WishQuoteList> wishQuoteList) {
        this.wishQuoteList = wishQuoteList;
    }

}
