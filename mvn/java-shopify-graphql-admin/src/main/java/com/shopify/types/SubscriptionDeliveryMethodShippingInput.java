package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Specifies shipping delivery method fields.
 *
 * This input accepts partial input. When a field is not provided,
 * its prior value is left unchanged.
 */
public class SubscriptionDeliveryMethodShippingInput {
  /**
   * The address to ship to.
   */
  private MailingAddressInput address;

  /**
   * The details of the shipping method to use.
   */
  private SubscriptionDeliveryMethodShippingOptionInput shippingOption;

  public SubscriptionDeliveryMethodShippingInput() {
  }

  /**
   * The address to ship to.
   */
  public MailingAddressInput getAddress() {
    return address;
  }

  public void setAddress(MailingAddressInput address) {
    this.address = address;
  }

  /**
   * The details of the shipping method to use.
   */
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
    /**
     * The address to ship to.
     */
    private MailingAddressInput address;

    /**
     * The details of the shipping method to use.
     */
    private SubscriptionDeliveryMethodShippingOptionInput shippingOption;

    public SubscriptionDeliveryMethodShippingInput build() {
      SubscriptionDeliveryMethodShippingInput result = new SubscriptionDeliveryMethodShippingInput();
      result.address = this.address;
      result.shippingOption = this.shippingOption;
      return result;
    }

    /**
     * The address to ship to.
     */
    public Builder address(MailingAddressInput address) {
      this.address = address;
      return this;
    }

    /**
     * The details of the shipping method to use.
     */
    public Builder shippingOption(SubscriptionDeliveryMethodShippingOptionInput shippingOption) {
      this.shippingOption = shippingOption;
      return this;
    }
  }
}
