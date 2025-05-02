package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for delivery address preferences.
 */
public class DeliveryAddressInput {
  /**
   * The ID of a customer address that is associated with the buyer that is interacting with the cart.
   */
  private String customerAddressId;

  /**
   * A delivery address preference of a buyer that is interacting with the cart.
   */
  private MailingAddressInput deliveryAddress;

  /**
   * Defines what kind of address validation is requested.
   */
  private DeliveryAddressValidationStrategy deliveryAddressValidationStrategy = DeliveryAddressValidationStrategy.COUNTRY_CODE_ONLY;

  /**
   * Whether the given delivery address is considered to be a one-time use address. One-time use addresses do not
   * get persisted to the buyer's personal addresses when checking out.
   */
  private Boolean oneTimeUse = false;

  public DeliveryAddressInput() {
  }

  /**
   * The ID of a customer address that is associated with the buyer that is interacting with the cart.
   */
  public String getCustomerAddressId() {
    return customerAddressId;
  }

  public void setCustomerAddressId(String customerAddressId) {
    this.customerAddressId = customerAddressId;
  }

  /**
   * A delivery address preference of a buyer that is interacting with the cart.
   */
  public MailingAddressInput getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(MailingAddressInput deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  /**
   * Defines what kind of address validation is requested.
   */
  public DeliveryAddressValidationStrategy getDeliveryAddressValidationStrategy() {
    return deliveryAddressValidationStrategy;
  }

  public void setDeliveryAddressValidationStrategy(
      DeliveryAddressValidationStrategy deliveryAddressValidationStrategy) {
    this.deliveryAddressValidationStrategy = deliveryAddressValidationStrategy;
  }

  /**
   * Whether the given delivery address is considered to be a one-time use address. One-time use addresses do not
   * get persisted to the buyer's personal addresses when checking out.
   */
  public Boolean getOneTimeUse() {
    return oneTimeUse;
  }

  public void setOneTimeUse(Boolean oneTimeUse) {
    this.oneTimeUse = oneTimeUse;
  }

  @Override
  public String toString() {
    return "DeliveryAddressInput{customerAddressId='" + customerAddressId + "', deliveryAddress='" + deliveryAddress + "', deliveryAddressValidationStrategy='" + deliveryAddressValidationStrategy + "', oneTimeUse='" + oneTimeUse + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryAddressInput that = (DeliveryAddressInput) o;
    return Objects.equals(customerAddressId, that.customerAddressId) &&
        Objects.equals(deliveryAddress, that.deliveryAddress) &&
        Objects.equals(deliveryAddressValidationStrategy, that.deliveryAddressValidationStrategy) &&
        Objects.equals(oneTimeUse, that.oneTimeUse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerAddressId, deliveryAddress, deliveryAddressValidationStrategy, oneTimeUse);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of a customer address that is associated with the buyer that is interacting with the cart.
     */
    private String customerAddressId;

    /**
     * A delivery address preference of a buyer that is interacting with the cart.
     */
    private MailingAddressInput deliveryAddress;

    /**
     * Defines what kind of address validation is requested.
     */
    private DeliveryAddressValidationStrategy deliveryAddressValidationStrategy = DeliveryAddressValidationStrategy.COUNTRY_CODE_ONLY;

    /**
     * Whether the given delivery address is considered to be a one-time use address. One-time use addresses do not
     * get persisted to the buyer's personal addresses when checking out.
     */
    private Boolean oneTimeUse = false;

    public DeliveryAddressInput build() {
      DeliveryAddressInput result = new DeliveryAddressInput();
      result.customerAddressId = this.customerAddressId;
      result.deliveryAddress = this.deliveryAddress;
      result.deliveryAddressValidationStrategy = this.deliveryAddressValidationStrategy;
      result.oneTimeUse = this.oneTimeUse;
      return result;
    }

    /**
     * The ID of a customer address that is associated with the buyer that is interacting with the cart.
     */
    public Builder customerAddressId(String customerAddressId) {
      this.customerAddressId = customerAddressId;
      return this;
    }

    /**
     * A delivery address preference of a buyer that is interacting with the cart.
     */
    public Builder deliveryAddress(MailingAddressInput deliveryAddress) {
      this.deliveryAddress = deliveryAddress;
      return this;
    }

    /**
     * Defines what kind of address validation is requested.
     */
    public Builder deliveryAddressValidationStrategy(
        DeliveryAddressValidationStrategy deliveryAddressValidationStrategy) {
      this.deliveryAddressValidationStrategy = deliveryAddressValidationStrategy;
      return this;
    }

    /**
     * Whether the given delivery address is considered to be a one-time use address. One-time use addresses do not
     * get persisted to the buyer's personal addresses when checking out.
     */
    public Builder oneTimeUse(Boolean oneTimeUse) {
      this.oneTimeUse = oneTimeUse;
      return this;
    }
  }
}
