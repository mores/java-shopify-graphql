package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionDiscountPercentageValue implements SubscriptionDiscountValue {
  
  private int percentage;

  public SubscriptionDiscountPercentageValue() {
  }

  
  public int getPercentage() {
    return percentage;
  }

  public void setPercentage(int percentage) {
    this.percentage = percentage;
  }

  @Override
  public String toString() {
    return "SubscriptionDiscountPercentageValue{percentage='" + percentage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDiscountPercentageValue that = (SubscriptionDiscountPercentageValue) o;
    return percentage == that.percentage;
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentage);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private int percentage;

    public SubscriptionDiscountPercentageValue build() {
      SubscriptionDiscountPercentageValue result = new SubscriptionDiscountPercentageValue();
      result.percentage = this.percentage;
      return result;
    }

    
    public Builder percentage(int percentage) {
      this.percentage = percentage;
      return this;
    }
  }
}
