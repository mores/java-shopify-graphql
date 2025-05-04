package com.shopify.storefront.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to update a line item on a cart.
 */
public class CartSelectableAddressUpdateInput {
  /**
   * The id of the selectable address.
   */
  private String id;

  /**
   * Exactly one kind of delivery address.
   */
  private CartAddressInput address;

  /**
   * Sets exactly one address as pre-selected for the buyer.
   */
  private Boolean selected;

  /**
   * When true, this delivery address will not be associated with the buyer after a successful checkout.
   */
  private Boolean oneTimeUse;

  /**
   * Defines what kind of address validation is requested.
   */
  private DeliveryAddressValidationStrategy validationStrategy = DeliveryAddressValidationStrategy.COUNTRY_CODE_ONLY;

  public CartSelectableAddressUpdateInput() {
  }

  /**
   * The id of the selectable address.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
   * Sets exactly one address as pre-selected for the buyer.
   */
  public Boolean getSelected() {
    return selected;
  }

  public void setSelected(Boolean selected) {
    this.selected = selected;
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
    return "CartSelectableAddressUpdateInput{id='" + id + "', address='" + address + "', selected='" + selected + "', oneTimeUse='" + oneTimeUse + "', validationStrategy='" + validationStrategy + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartSelectableAddressUpdateInput that = (CartSelectableAddressUpdateInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(address, that.address) &&
        Objects.equals(selected, that.selected) &&
        Objects.equals(oneTimeUse, that.oneTimeUse) &&
        Objects.equals(validationStrategy, that.validationStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, address, selected, oneTimeUse, validationStrategy);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The id of the selectable address.
     */
    private String id;

    /**
     * Exactly one kind of delivery address.
     */
    private CartAddressInput address;

    /**
     * Sets exactly one address as pre-selected for the buyer.
     */
    private Boolean selected;

    /**
     * When true, this delivery address will not be associated with the buyer after a successful checkout.
     */
    private Boolean oneTimeUse;

    /**
     * Defines what kind of address validation is requested.
     */
    private DeliveryAddressValidationStrategy validationStrategy = DeliveryAddressValidationStrategy.COUNTRY_CODE_ONLY;

    public CartSelectableAddressUpdateInput build() {
      CartSelectableAddressUpdateInput result = new CartSelectableAddressUpdateInput();
      result.id = this.id;
      result.address = this.address;
      result.selected = this.selected;
      result.oneTimeUse = this.oneTimeUse;
      result.validationStrategy = this.validationStrategy;
      return result;
    }

    /**
     * The id of the selectable address.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Exactly one kind of delivery address.
     */
    public Builder address(CartAddressInput address) {
      this.address = address;
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
     * When true, this delivery address will not be associated with the buyer after a successful checkout.
     */
    public Builder oneTimeUse(Boolean oneTimeUse) {
      this.oneTimeUse = oneTimeUse;
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
