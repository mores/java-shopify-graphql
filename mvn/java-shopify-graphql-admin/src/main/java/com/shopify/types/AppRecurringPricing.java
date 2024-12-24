package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AppRecurringPricing implements AppPricingDetails {
  
  private AppSubscriptionDiscount discount;

  
  private AppPricingInterval interval;

  
  private MoneyV2 price;

  public AppRecurringPricing() {
  }

  
  public AppSubscriptionDiscount getDiscount() {
    return discount;
  }

  public void setDiscount(AppSubscriptionDiscount discount) {
    this.discount = discount;
  }

  
  public AppPricingInterval getInterval() {
    return interval;
  }

  public void setInterval(AppPricingInterval interval) {
    this.interval = interval;
  }

  
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "AppRecurringPricing{discount='" + discount + "', interval='" + interval + "', price='" + price + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppRecurringPricing that = (AppRecurringPricing) o;
    return Objects.equals(discount, that.discount) &&
        Objects.equals(interval, that.interval) &&
        Objects.equals(price, that.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discount, interval, price);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private AppSubscriptionDiscount discount;

    
    private AppPricingInterval interval;

    
    private MoneyV2 price;

    public AppRecurringPricing build() {
      AppRecurringPricing result = new AppRecurringPricing();
      result.discount = this.discount;
      result.interval = this.interval;
      result.price = this.price;
      return result;
    }

    
    public Builder discount(AppSubscriptionDiscount discount) {
      this.discount = discount;
      return this;
    }

    
    public Builder interval(AppPricingInterval interval) {
      this.interval = interval;
      return this;
    }

    
    public Builder price(MoneyV2 price) {
      this.price = price;
      return this;
    }
  }
}
