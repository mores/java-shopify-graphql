package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionDeliveryMethodPickup implements SubscriptionDeliveryMethod {
  
  private SubscriptionDeliveryMethodPickupOption pickupOption;

  public SubscriptionDeliveryMethodPickup() {
  }

  
  public SubscriptionDeliveryMethodPickupOption getPickupOption() {
    return pickupOption;
  }

  public void setPickupOption(SubscriptionDeliveryMethodPickupOption pickupOption) {
    this.pickupOption = pickupOption;
  }

  @Override
  public String toString() {
    return "SubscriptionDeliveryMethodPickup{pickupOption='" + pickupOption + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryMethodPickup that = (SubscriptionDeliveryMethodPickup) o;
    return Objects.equals(pickupOption, that.pickupOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pickupOption);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SubscriptionDeliveryMethodPickupOption pickupOption;

    public SubscriptionDeliveryMethodPickup build() {
      SubscriptionDeliveryMethodPickup result = new SubscriptionDeliveryMethodPickup();
      result.pickupOption = this.pickupOption;
      return result;
    }

    
    public Builder pickupOption(SubscriptionDeliveryMethodPickupOption pickupOption) {
      this.pickupOption = pickupOption;
      return this;
    }
  }
}
