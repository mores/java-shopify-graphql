package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class OrderCreateTaxLineInput {
  
  private Boolean channelLiable = false;

  
  private MoneyBagInput priceSet;

  
  private String rate;

  
  private String title;

  public OrderCreateTaxLineInput() {
  }

  
  public Boolean getChannelLiable() {
    return channelLiable;
  }

  public void setChannelLiable(Boolean channelLiable) {
    this.channelLiable = channelLiable;
  }

  
  public MoneyBagInput getPriceSet() {
    return priceSet;
  }

  public void setPriceSet(MoneyBagInput priceSet) {
    this.priceSet = priceSet;
  }

  
  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "OrderCreateTaxLineInput{channelLiable='" + channelLiable + "', priceSet='" + priceSet + "', rate='" + rate + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateTaxLineInput that = (OrderCreateTaxLineInput) o;
    return Objects.equals(channelLiable, that.channelLiable) &&
        Objects.equals(priceSet, that.priceSet) &&
        Objects.equals(rate, that.rate) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelLiable, priceSet, rate, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Boolean channelLiable = false;

    
    private MoneyBagInput priceSet;

    
    private String rate;

    
    private String title;

    public OrderCreateTaxLineInput build() {
      OrderCreateTaxLineInput result = new OrderCreateTaxLineInput();
      result.channelLiable = this.channelLiable;
      result.priceSet = this.priceSet;
      result.rate = this.rate;
      result.title = this.title;
      return result;
    }

    
    public Builder channelLiable(Boolean channelLiable) {
      this.channelLiable = channelLiable;
      return this;
    }

    
    public Builder priceSet(MoneyBagInput priceSet) {
      this.priceSet = priceSet;
      return this;
    }

    
    public Builder rate(String rate) {
      this.rate = rate;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
