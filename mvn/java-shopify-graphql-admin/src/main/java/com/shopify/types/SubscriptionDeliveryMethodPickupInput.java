package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SubscriptionDeliveryMethodPickupInput {
  
  private SubscriptionDeliveryMethodPickupOptionInput pickupOption;

  public SubscriptionDeliveryMethodPickupInput() {
  }

  
  public SubscriptionDeliveryMethodPickupOptionInput getPickupOption() {
    return pickupOption;
  }

  public void setPickupOption(SubscriptionDeliveryMethodPickupOptionInput pickupOption) {
    this.pickupOption = pickupOption;
  }

  @Override
  public String toString() {
    return "SubscriptionDeliveryMethodPickupInput{pickupOption='" + pickupOption + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryMethodPickupInput that = (SubscriptionDeliveryMethodPickupInput) o;
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
    
    private SubscriptionDeliveryMethodPickupOptionInput pickupOption;

    public SubscriptionDeliveryMethodPickupInput build() {
      SubscriptionDeliveryMethodPickupInput result = new SubscriptionDeliveryMethodPickupInput();
      result.pickupOption = this.pickupOption;
      return result;
    }

    
    public Builder pickupOption(SubscriptionDeliveryMethodPickupOptionInput pickupOption) {
      this.pickupOption = pickupOption;
      return this;
    }
  }
}
