package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CalculatedShippingLine {
  
  private String id;

  
  private MoneyBag price;

  
  private CalculatedShippingLineStagedStatus stagedStatus;

  
  private String title;

  public CalculatedShippingLine() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public MoneyBag getPrice() {
    return price;
  }

  public void setPrice(MoneyBag price) {
    this.price = price;
  }

  
  public CalculatedShippingLineStagedStatus getStagedStatus() {
    return stagedStatus;
  }

  public void setStagedStatus(CalculatedShippingLineStagedStatus stagedStatus) {
    this.stagedStatus = stagedStatus;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "CalculatedShippingLine{id='" + id + "', price='" + price + "', stagedStatus='" + stagedStatus + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedShippingLine that = (CalculatedShippingLine) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(price, that.price) &&
        Objects.equals(stagedStatus, that.stagedStatus) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, price, stagedStatus, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private MoneyBag price;

    
    private CalculatedShippingLineStagedStatus stagedStatus;

    
    private String title;

    public CalculatedShippingLine build() {
      CalculatedShippingLine result = new CalculatedShippingLine();
      result.id = this.id;
      result.price = this.price;
      result.stagedStatus = this.stagedStatus;
      result.title = this.title;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder price(MoneyBag price) {
      this.price = price;
      return this;
    }

    
    public Builder stagedStatus(CalculatedShippingLineStagedStatus stagedStatus) {
      this.stagedStatus = stagedStatus;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
