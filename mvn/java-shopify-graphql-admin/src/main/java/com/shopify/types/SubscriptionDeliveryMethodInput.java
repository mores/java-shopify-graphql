package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SubscriptionDeliveryMethodInput {
  
  private SubscriptionDeliveryMethodShippingInput shipping;

  
  private SubscriptionDeliveryMethodLocalDeliveryInput localDelivery;

  
  private SubscriptionDeliveryMethodPickupInput pickup;

  public SubscriptionDeliveryMethodInput() {
  }

  
  public SubscriptionDeliveryMethodShippingInput getShipping() {
    return shipping;
  }

  public void setShipping(SubscriptionDeliveryMethodShippingInput shipping) {
    this.shipping = shipping;
  }

  
  public SubscriptionDeliveryMethodLocalDeliveryInput getLocalDelivery() {
    return localDelivery;
  }

  public void setLocalDelivery(SubscriptionDeliveryMethodLocalDeliveryInput localDelivery) {
    this.localDelivery = localDelivery;
  }

  
  public SubscriptionDeliveryMethodPickupInput getPickup() {
    return pickup;
  }

  public void setPickup(SubscriptionDeliveryMethodPickupInput pickup) {
    this.pickup = pickup;
  }

  @Override
  public String toString() {
    return "SubscriptionDeliveryMethodInput{shipping='" + shipping + "', localDelivery='" + localDelivery + "', pickup='" + pickup + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryMethodInput that = (SubscriptionDeliveryMethodInput) o;
    return Objects.equals(shipping, that.shipping) &&
        Objects.equals(localDelivery, that.localDelivery) &&
        Objects.equals(pickup, that.pickup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipping, localDelivery, pickup);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SubscriptionDeliveryMethodShippingInput shipping;

    
    private SubscriptionDeliveryMethodLocalDeliveryInput localDelivery;

    
    private SubscriptionDeliveryMethodPickupInput pickup;

    public SubscriptionDeliveryMethodInput build() {
      SubscriptionDeliveryMethodInput result = new SubscriptionDeliveryMethodInput();
      result.shipping = this.shipping;
      result.localDelivery = this.localDelivery;
      result.pickup = this.pickup;
      return result;
    }

    
    public Builder shipping(SubscriptionDeliveryMethodShippingInput shipping) {
      this.shipping = shipping;
      return this;
    }

    
    public Builder localDelivery(SubscriptionDeliveryMethodLocalDeliveryInput localDelivery) {
      this.localDelivery = localDelivery;
      return this;
    }

    
    public Builder pickup(SubscriptionDeliveryMethodPickupInput pickup) {
      this.pickup = pickup;
      return this;
    }
  }
}
