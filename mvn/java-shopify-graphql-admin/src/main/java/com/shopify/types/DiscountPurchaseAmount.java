package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountPurchaseAmount implements DiscountCustomerBuysValue {
  
  private String amount;

  public DiscountPurchaseAmount() {
  }

  
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "DiscountPurchaseAmount{amount='" + amount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountPurchaseAmount that = (DiscountPurchaseAmount) o;
    return Objects.equals(amount, that.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String amount;

    public DiscountPurchaseAmount build() {
      DiscountPurchaseAmount result = new DiscountPurchaseAmount();
      result.amount = this.amount;
      return result;
    }

    
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }
  }
}
