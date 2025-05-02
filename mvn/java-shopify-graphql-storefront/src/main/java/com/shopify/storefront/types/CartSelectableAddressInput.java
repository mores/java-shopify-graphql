package com.shopify.storefront.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a selectable delivery address in a cart.
 */
public class CartSelectableAddressInput {
  /**
   * Exactly one kind of delivery address.
   */
  private CartAddressInput address;

  /**
   * When true, this delivery address will not be associated with the buyer after a successful checkout.
   */
  private Boolean oneTimeUse;

  /**
   * Sets exactly one address as pre-selected for the buyer.
   */
  private Boolean selected;

  /**
   * Defines what kind of address validation is requested.
   */
  private DeliveryAddressValidationStrategy validationStrategy = DeliveryAddressValidationStrategy.COUNTRY_CODE_ONLY;

  public CartSelectableAddressInput() {
  }

  /**
   * Exactly one kind of delivery address.
   */
  public CartAddressInput getAddress() {
    return address;
  }

  public void setAddress(CartAddressInput address) {
    this.address = address;
  }

  /**
   * When true, this delivery address will not be associated with the buyer after a successful checkout.
   */
  public Boolean getOneTimeUse() {
    return oneTimeUse;
  }

  public void setOneTimeUse(Boolean oneTimeUse) {
    this.oneTimeUse = oneTimeUse;
  }

  /**
   * Sets exactly one address as pre-selected for the buyer.
   */
  public Boolean getSelected() {
    return selected;
  }

  public void setSelected(Boolean selected) {
    this.selected = selected;
  }

  /**
   * Defines what kind of address validation is requested.
   */
  public DeliveryAddressValidationStrategy getValidationStrategy() {
    return validationStrategy;
  }

  public void setValidationStrategy(DeliveryAddressValidationStrategy validationStrategy) {
    this.validationStrategy = validationStrategy;
  }

  @Override
  public String toString() {
    return "CartSelectableAddressInput{address='" + address + "', oneTimeUse='" + oneTimeUse + "', selected='" + selected + "', validationStrategy='" + validationStrategy + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartSelectableAddressInput that = (CartSelectableAddressInput) o;
    return Objects.equals(address, that.address) &&
        Objects.equals(oneTimeUse, that.oneTimeUse) &&
        Objects.equals(selected, that.selected) &&
        Objects.equals(validationStrategy, that.validationStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, oneTimeUse, selected, validationStrategy);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Exactly one kind of delivery address.
     */
    private CartAddressInput address;

    /**
     * When true, this delivery address will not be associated with the buyer after a successful checkout.
     */
    private Boolean oneTimeUse;

    /**
     * Sets exactly one address as pre-selected for the buyer.
     */
    private Boolean selected;

    /**
     * Defines what kind of address validation is requested.
     */
    private DeliveryAddressValidationStrategy validationStrategy = DeliveryAddressValidationStrategy.COUNTRY_CODE_ONLY;

    public CartSelectableAddressInput build() {
      CartSelectableAddressInput result = new CartSelectableAddressInput();
      result.address = this.address;
      result.oneTimeUse = this.oneTimeUse;
      result.selected = this.selected;
      result.validationStrategy = this.validationStrategy;
      return result;
    }

    /**
     * Exactly one kind of delivery address.
     */
    public Builder address(CartAddressInput address) {
      this.address = address;
      return this;
    }

    /**
     * When true, this delivery address will not be associated with the buyer after a successful checkout.
     */
    public Builder oneTimeUse(Boolean oneTimeUse) {
      this.oneTimeUse = oneTimeUse;
      return this;
    }

    /**
     * Sets exactly one address as pre-selected for the buyer.
     */
    public Builder selected(Boolean selected) {
      this.selected = selected;
      return this;
    }

    /**
     * Defines what kind of address validation is requested.
     */
    public Builder validationStrategy(DeliveryAddressValidationStrategy validationStrategy) {
      this.validationStrategy = validationStrategy;
      return this;
    }
  }
}
