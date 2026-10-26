package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to fetch the available delivery options for an address.
 *
 * Use this to discover the delivery options available for the contract
 * without setting or changing the contract's committed delivery method.
 */
public class SubscriptionContractCalculationFetchDeliveryOptionsInput {
  /**
   * The address to fetch available delivery options for.
   */
  private MailingAddressInput address;

  /**
   * Whether to run delivery customization functions while discovering options.
   * When `false`, delivery customization functions are bypassed and raw delivery
   * options are returned. Defaults to `true`.
   */
  private Boolean withDeliveryCustomizations = true;

  public SubscriptionContractCalculationFetchDeliveryOptionsInput() {
  }

  /**
   * The address to fetch available delivery options for.
   */
  public MailingAddressInput getAddress() {
    return address;
  }

  public void setAddress(MailingAddressInput address) {
    this.address = address;
  }

  /**
   * Whether to run delivery customization functions while discovering options.
   * When `false`, delivery customization functions are bypassed and raw delivery
   * options are returned. Defaults to `true`.
   */
  public Boolean getWithDeliveryCustomizations() {
    return withDeliveryCustomizations;
  }

  public void setWithDeliveryCustomizations(Boolean withDeliveryCustomizations) {
    this.withDeliveryCustomizations = withDeliveryCustomizations;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationFetchDeliveryOptionsInput{address='" + address + "', withDeliveryCustomizations='" + withDeliveryCustomizations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationFetchDeliveryOptionsInput that = (SubscriptionContractCalculationFetchDeliveryOptionsInput) o;
    return Objects.equals(address, that.address) &&
        Objects.equals(withDeliveryCustomizations, that.withDeliveryCustomizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, withDeliveryCustomizations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The address to fetch available delivery options for.
     */
    private MailingAddressInput address;

    /**
     * Whether to run delivery customization functions while discovering options.
     * When `false`, delivery customization functions are bypassed and raw delivery
     * options are returned. Defaults to `true`.
     */
    private Boolean withDeliveryCustomizations = true;

    public SubscriptionContractCalculationFetchDeliveryOptionsInput build() {
      SubscriptionContractCalculationFetchDeliveryOptionsInput result = new SubscriptionContractCalculationFetchDeliveryOptionsInput();
      result.address = this.address;
      result.withDeliveryCustomizations = this.withDeliveryCustomizations;
      return result;
    }

    /**
     * The address to fetch available delivery options for.
     */
    public Builder address(MailingAddressInput address) {
      this.address = address;
      return this;
    }

    /**
     * Whether to run delivery customization functions while discovering options.
     * When `false`, delivery customization functions are bypassed and raw delivery
     * options are returned. Defaults to `true`.
     */
    public Builder withDeliveryCustomizations(Boolean withDeliveryCustomizations) {
      this.withDeliveryCustomizations = withDeliveryCustomizations;
      return this;
    }
  }
}
