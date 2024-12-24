package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionDeliveryMethodLocalDelivery implements SubscriptionDeliveryMethod {
  
  private SubscriptionMailingAddress address;

  
  private SubscriptionDeliveryMethodLocalDeliveryOption localDeliveryOption;

  public SubscriptionDeliveryMethodLocalDelivery() {
  }

  
  public SubscriptionMailingAddress getAddress() {
    return address;
  }

  public void setAddress(SubscriptionMailingAddress address) {
    this.address = address;
  }

  
  public SubscriptionDeliveryMethodLocalDeliveryOption getLocalDeliveryOption() {
    return localDeliveryOption;
  }

  public void setLocalDeliveryOption(
      SubscriptionDeliveryMethodLocalDeliveryOption localDeliveryOption) {
    this.localDeliveryOption = localDeliveryOption;
  }

  @Override
  public String toString() {
    return "SubscriptionDeliveryMethodLocalDelivery{address='" + address + "', localDeliveryOption='" + localDeliveryOption + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryMethodLocalDelivery that = (SubscriptionDeliveryMethodLocalDelivery) o;
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
    
    private SubscriptionMailingAddress address;

    
    private SubscriptionDeliveryMethodLocalDeliveryOption localDeliveryOption;

    public SubscriptionDeliveryMethodLocalDelivery build() {
      SubscriptionDeliveryMethodLocalDelivery result = new SubscriptionDeliveryMethodLocalDelivery();
      result.address = this.address;
      result.localDeliveryOption = this.localDeliveryOption;
      return result;
    }

    
    public Builder address(SubscriptionMailingAddress address) {
      this.address = address;
      return this;
    }

    
    public Builder localDeliveryOption(
        SubscriptionDeliveryMethodLocalDeliveryOption localDeliveryOption) {
      this.localDeliveryOption = localDeliveryOption;
      return this;
    }
  }
}
