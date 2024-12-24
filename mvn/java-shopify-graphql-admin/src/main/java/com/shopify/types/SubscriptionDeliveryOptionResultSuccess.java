package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionDeliveryOptionResultSuccess implements SubscriptionDeliveryOptionResult {
  
  private List<SubscriptionDeliveryOption> deliveryOptions;

  public SubscriptionDeliveryOptionResultSuccess() {
  }

  
  public List<SubscriptionDeliveryOption> getDeliveryOptions() {
    return deliveryOptions;
  }

  public void setDeliveryOptions(List<SubscriptionDeliveryOption> deliveryOptions) {
    this.deliveryOptions = deliveryOptions;
  }

  @Override
  public String toString() {
    return "SubscriptionDeliveryOptionResultSuccess{deliveryOptions='" + deliveryOptions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryOptionResultSuccess that = (SubscriptionDeliveryOptionResultSuccess) o;
    return Objects.equals(deliveryOptions, that.deliveryOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryOptions);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<SubscriptionDeliveryOption> deliveryOptions;

    public SubscriptionDeliveryOptionResultSuccess build() {
      SubscriptionDeliveryOptionResultSuccess result = new SubscriptionDeliveryOptionResultSuccess();
      result.deliveryOptions = this.deliveryOptions;
      return result;
    }

    
    public Builder deliveryOptions(List<SubscriptionDeliveryOption> deliveryOptions) {
      this.deliveryOptions = deliveryOptions;
      return this;
    }
  }
}
