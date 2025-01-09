package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a local delivery method.
 *
 * This input accepts partial input. When a field is not provided,
 * its prior value is left unchanged.
 */
public class SubscriptionDeliveryMethodLocalDeliveryInput {
  /**
   * The address to deliver to.
   */
  private MailingAddressInput address;

  /**
   * The details of the local delivery method to use.
   */
  private SubscriptionDeliveryMethodLocalDeliveryOptionInput localDeliveryOption;

  public SubscriptionDeliveryMethodLocalDeliveryInput() {
  }

  /**
   * The address to deliver to.
   */
  public MailingAddressInput getAddress() {
    return address;
  }

  public void setAddress(MailingAddressInput address) {
    this.address = address;
  }

  /**
   * The details of the local delivery method to use.
   */
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
    /**
     * The address to deliver to.
     */
    private MailingAddressInput address;

    /**
     * The details of the local delivery method to use.
     */
    private SubscriptionDeliveryMethodLocalDeliveryOptionInput localDeliveryOption;

    public SubscriptionDeliveryMethodLocalDeliveryInput build() {
      SubscriptionDeliveryMethodLocalDeliveryInput result = new SubscriptionDeliveryMethodLocalDeliveryInput();
      result.address = this.address;
      result.localDeliveryOption = this.localDeliveryOption;
      return result;
    }

    /**
     * The address to deliver to.
     */
    public Builder address(MailingAddressInput address) {
      this.address = address;
      return this;
    }

    /**
     * The details of the local delivery method to use.
     */
    public Builder localDeliveryOption(
        SubscriptionDeliveryMethodLocalDeliveryOptionInput localDeliveryOption) {
      this.localDeliveryOption = localDeliveryOption;
      return this;
    }
  }
}
