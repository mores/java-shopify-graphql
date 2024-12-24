package com.shopify.types;

import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class TaxLine {
  
  private Boolean channelLiable;

  
  private String price;

  
  private MoneyBag priceSet;

  
  private Double rate;

  
  private Double ratePercentage;

  
  private String source;

  
  private String title;

  public TaxLine() {
  }

  
  public Boolean getChannelLiable() {
    return channelLiable;
  }

  public void setChannelLiable(Boolean channelLiable) {
    this.channelLiable = channelLiable;
  }

  
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  
  public MoneyBag getPriceSet() {
    return priceSet;
  }

  public void setPriceSet(MoneyBag priceSet) {
    this.priceSet = priceSet;
  }

  
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }

  
  public Double getRatePercentage() {
    return ratePercentage;
  }

  public void setRatePercentage(Double ratePercentage) {
    this.ratePercentage = ratePercentage;
  }

  
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "TaxLine{channelLiable='" + channelLiable + "', price='" + price + "', priceSet='" + priceSet + "', rate='" + rate + "', ratePercentage='" + ratePercentage + "', source='" + source + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaxLine that = (TaxLine) o;
    return Objects.equals(channelLiable, that.channelLiable) &&
        Objects.equals(price, that.price) &&
        Objects.equals(priceSet, that.priceSet) &&
        Objects.equals(rate, that.rate) &&
        Objects.equals(ratePercentage, that.ratePercentage) &&
        Objects.equals(source, that.source) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelLiable, price, priceSet, rate, ratePercentage, source, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Boolean channelLiable;

    
    private String price;

    
    private MoneyBag priceSet;

    
    private Double rate;

    
    private Double ratePercentage;

    
    private String source;

    
    private String title;

    public TaxLine build() {
      TaxLine result = new TaxLine();
      result.channelLiable = this.channelLiable;
      result.price = this.price;
      result.priceSet = this.priceSet;
      result.rate = this.rate;
      result.ratePercentage = this.ratePercentage;
      result.source = this.source;
      result.title = this.title;
      return result;
    }

    
    public Builder channelLiable(Boolean channelLiable) {
      this.channelLiable = channelLiable;
      return this;
    }

    
    public Builder price(String price) {
      this.price = price;
      return this;
    }

    
    public Builder priceSet(MoneyBag priceSet) {
      this.priceSet = priceSet;
      return this;
    }

    
    public Builder rate(Double rate) {
      this.rate = rate;
      return this;
    }

    
    public Builder ratePercentage(Double ratePercentage) {
      this.ratePercentage = ratePercentage;
      return this;
    }

    
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
