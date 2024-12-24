package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SubscriptionDeliveryMethodShippingInput {
  
  private MailingAddressInput address;

  
  private SubscriptionDeliveryMethodShippingOptionInput shippingOption;

  public SubscriptionDeliveryMethodShippingInput() {
  }

  
  public MailingAddressInput getAddress() {
    return address;
  }

  public void setAddress(MailingAddressInput address) {
    this.address = address;
  }

  
  public SubscriptionDeliveryMethodShippingOptionInput getShippingOption() {
    return shippingOption;
  }

  public void setShippingOption(SubscriptionDeliveryMethodShippingOptionInput shippingOption) {
    this.shippingOption = shippingOption;
  }

  @Override
  public String toString() {
    return "SubscriptionDeliveryMethodShippingInput{address='" + address + "', shippingOption='" + shippingOption + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryMethodShippingInput that = (SubscriptionDeliveryMethodShippingInput) o;
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
    
    private MailingAddressInput address;

    
    private SubscriptionDeliveryMethodShippingOptionInput shippingOption;

    public SubscriptionDeliveryMethodShippingInput build() {
      SubscriptionDeliveryMethodShippingInput result = new SubscriptionDeliveryMethodShippingInput();
      result.address = this.address;
      result.shippingOption = this.shippingOption;
      return result;
    }

    
    public Builder address(MailingAddressInput address) {
      this.address = address;
      return this;
    }

    
    public Builder shippingOption(SubscriptionDeliveryMethodShippingOptionInput shippingOption) {
      this.shippingOption = shippingOption;
      return this;
    }
  }
}
