package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AppSubscriptionDiscountAmount implements AppSubscriptionDiscountValue {
  
  private MoneyV2 amount;

  public AppSubscriptionDiscountAmount() {
  }

  
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "AppSubscriptionDiscountAmount{amount='" + amount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppSubscriptionDiscountAmount that = (AppSubscriptionDiscountAmount) o;
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
    
    private MoneyV2 amount;

    public AppSubscriptionDiscountAmount build() {
      AppSubscriptionDiscountAmount result = new AppSubscriptionDiscountAmount();
      result.amount = this.amount;
      return result;
    }

    
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }
  }
}
