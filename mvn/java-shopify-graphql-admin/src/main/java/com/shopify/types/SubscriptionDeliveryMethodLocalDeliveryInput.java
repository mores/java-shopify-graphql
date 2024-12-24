package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SubscriptionDeliveryMethodLocalDeliveryInput {
  
  private MailingAddressInput address;

  
  private SubscriptionDeliveryMethodLocalDeliveryOptionInput localDeliveryOption;

  public SubscriptionDeliveryMethodLocalDeliveryInput() {
  }

  
  public MailingAddressInput getAddress() {
    return address;
  }

  public void setAddress(MailingAddressInput address) {
    this.address = address;
  }

  
  public SubscriptionDeliveryMethodLocalDeliveryOptionInput getLocalDeliveryOption() {
    return localDeliveryOption;
  }

  public void setLocalDeliveryOption(
      SubscriptionDeliveryMethodLocalDeliveryOptionInput localDeliveryOption) {
    this.localDeliveryOption = localDeliveryOption;
  }

  @Override
  public String toString() {
    return "SubscriptionDeliveryMethodLocalDeliveryInput{address='" + address + "', localDeliveryOption='" + localDeliveryOption + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryMethodLocalDeliveryInput that = (SubscriptionDeliveryMethodLocalDeliveryInput) o;
    return Objects.equals(address, that.address) &&
        Objects.equals(localDeliveryOption, that.localDeliveryOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, localDeliveryOption);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MailingAddressInput address;

    
    private SubscriptionDeliveryMethodLocalDeliveryOptionInput localDeliveryOption;

    public SubscriptionDeliveryMethodLocalDeliveryInput build() {
      SubscriptionDeliveryMethodLocalDeliveryInput result = new SubscriptionDeliveryMethodLocalDeliveryInput();
      result.address = this.address;
      result.localDeliveryOption = this.localDeliveryOption;
      return result;
    }

    
    public Builder address(MailingAddressInput address) {
      this.address = address;
      return this;
    }

    
    public Builder localDeliveryOption(
        SubscriptionDeliveryMethodLocalDeliveryOptionInput localDeliveryOption) {
      this.localDeliveryOption = localDeliveryOption;
      return this;
    }
  }
}
