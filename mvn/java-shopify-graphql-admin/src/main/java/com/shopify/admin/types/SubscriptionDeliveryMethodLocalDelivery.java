package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A subscription delivery method for local delivery.
 * The other subscription delivery methods can be found in the `SubscriptionDeliveryMethod` union type.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionDeliveryMethodLocalDelivery implements SubscriptionDeliveryMethod {
  /**
   * The address to deliver to.
   */
  private SubscriptionMailingAddress address;

  /**
   * The details of the local delivery method to use.
   */
  private SubscriptionDeliveryMethodLocalDeliveryOption localDeliveryOption;

  public SubscriptionDeliveryMethodLocalDelivery() {
  }

  /**
   * The address to deliver to.
   */
  public SubscriptionMailingAddress getAddress() {
    return address;
  }

  public void setAddress(SubscriptionMailingAddress address) {
    this.address = address;
  }

  /**
   * The details of the local delivery method to use.
   */
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
    /**
     * The address to deliver to.
     */
    private SubscriptionMailingAddress address;

    /**
     * The details of the local delivery method to use.
     */
    private SubscriptionDeliveryMethodLocalDeliveryOption localDeliveryOption;

    public SubscriptionDeliveryMethodLocalDelivery build() {
      SubscriptionDeliveryMethodLocalDelivery result = new SubscriptionDeliveryMethodLocalDelivery();
      result.address = this.address;
      result.localDeliveryOption = this.localDeliveryOption;
      return result;
    }

    /**
     * The address to deliver to.
     */
    public Builder address(SubscriptionMailingAddress address) {
      this.address = address;
      return this;
    }

    /**
     * The details of the local delivery method to use.
     */
    public Builder localDeliveryOption(
        SubscriptionDeliveryMethodLocalDeliveryOption localDeliveryOption) {
      this.localDeliveryOption = localDeliveryOption;
      return this;
    }
  }
}
