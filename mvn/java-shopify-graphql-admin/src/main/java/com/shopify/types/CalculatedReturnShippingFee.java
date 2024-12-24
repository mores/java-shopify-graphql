package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CalculatedReturnShippingFee implements com.shopify.types.CalculatedReturnFee {
  
  private MoneyBag amountSet;

  
  private String id;

  public CalculatedReturnShippingFee() {
  }

  
  public MoneyBag getAmountSet() {
    return amountSet;
  }

  public void setAmountSet(MoneyBag amountSet) {
    this.amountSet = amountSet;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "CalculatedReturnShippingFee{amountSet='" + amountSet + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedReturnShippingFee that = (CalculatedReturnShippingFee) o;
    return Objects.equals(amountSet, that.amountSet) &&
        Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountSet, id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyBag amountSet;

    
    private String id;

    public CalculatedReturnShippingFee build() {
      CalculatedReturnShippingFee result = new CalculatedReturnShippingFee();
      result.amountSet = this.amountSet;
      result.id = this.id;
      return result;
    }

    
    public Builder amountSet(MoneyBag amountSet) {
      this.amountSet = amountSet;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
