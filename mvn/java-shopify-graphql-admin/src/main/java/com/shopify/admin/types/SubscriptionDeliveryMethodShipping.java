package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a shipping delivery method: a mailing address and a shipping option.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionDeliveryMethodShipping implements SubscriptionDeliveryMethod {
  /**
   * The address to ship to.
   */
  private MailingAddress address;

  /**
   * The details of the shipping method to use.
   */
  private SubscriptionDeliveryMethodShippingOption shippingOption;

  public SubscriptionDeliveryMethodShipping() {
  }

  /**
   * The address to ship to.
   */
  public MailingAddress getAddress() {
    return address;
  }

  public void setAddress(MailingAddress address) {
    this.address = address;
  }

  /**
   * The details of the shipping method to use.
   */
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
    /**
     * The address to ship to.
     */
    private MailingAddress address;

    /**
     * The details of the shipping method to use.
     */
    private SubscriptionDeliveryMethodShippingOption shippingOption;

    public SubscriptionDeliveryMethodShipping build() {
      SubscriptionDeliveryMethodShipping result = new SubscriptionDeliveryMethodShipping();
      result.address = this.address;
      result.shippingOption = this.shippingOption;
      return result;
    }

    /**
     * The address to ship to.
     */
    public Builder address(MailingAddress address) {
      this.address = address;
      return this;
    }

    /**
     * The details of the shipping method to use.
     */
    public Builder shippingOption(SubscriptionDeliveryMethodShippingOption shippingOption) {
      this.shippingOption = shippingOption;
      return this;
    }
  }
}
