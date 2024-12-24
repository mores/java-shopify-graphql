package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionDeliveryMethodShipping implements SubscriptionDeliveryMethod {
  
  private SubscriptionMailingAddress address;

  
  private SubscriptionDeliveryMethodShippingOption shippingOption;

  public SubscriptionDeliveryMethodShipping() {
  }

  
  public SubscriptionMailingAddress getAddress() {
    return address;
  }

  public void setAddress(SubscriptionMailingAddress address) {
    this.address = address;
  }

  
  public SubscriptionDeliveryMethodShippingOption getShippingOption() {
    return shippingOption;
  }

  public void setShippingOption(SubscriptionDeliveryMethodShippingOption shippingOption) {
    this.shippingOption = shippingOption;
  }

  @Override
  public String toString() {
    return "SubscriptionDeliveryMethodShipping{address='" + address + "', shippingOption='" + shippingOption + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryMethodShipping that = (SubscriptionDeliveryMethodShipping) o;
    return Objects.equals(address, that.address) &&
        Objects.equals(shippingOption, that.shippingOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, shippingOption);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SubscriptionMailingAddress address;

    
    private SubscriptionDeliveryMethodShippingOption shippingOption;

    public SubscriptionDeliveryMethodShipping build() {
      SubscriptionDeliveryMethodShipping result = new SubscriptionDeliveryMethodShipping();
      result.address = this.address;
      result.shippingOption = this.shippingOption;
      return result;
    }

    
    public Builder address(SubscriptionMailingAddress address) {
      this.address = address;
      return this;
    }

    
    public Builder shippingOption(SubscriptionDeliveryMethodShippingOption shippingOption) {
      this.shippingOption = shippingOption;
      return this;
    }
  }
}
