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
   * Exactly one kind of delivery address.
   */
  private CartAddressInput address;

  /**
   * The id of the selectable address.
   */
  private String id;

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

  public CartSelectableAddressUpdateInput() {
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
   * The id of the selectable address.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
    return "CartSelectableAddressUpdateInput{address='" + address + "', id='" + id + "', oneTimeUse='" + oneTimeUse + "', selected='" + selected + "', validationStrategy='" + validationStrategy + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartSelectableAddressUpdateInput that = (CartSelectableAddressUpdateInput) o;
    return Objects.equals(address, that.address) &&
        Objects.equals(id, that.id) &&
        Objects.equals(oneTimeUse, that.oneTimeUse) &&
        Objects.equals(selected, that.selected) &&
        Objects.equals(validationStrategy, that.validationStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, id, oneTimeUse, selected, validationStrategy);
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
     * The id of the selectable address.
     */
    private String id;

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

    public CartSelectableAddressUpdateInput build() {
      CartSelectableAddressUpdateInput result = new CartSelectableAddressUpdateInput();
      result.address = this.address;
      result.id = this.id;
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
     * The id of the selectable address.
     */
    public Builder id(String id) {
      this.id = id;
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
