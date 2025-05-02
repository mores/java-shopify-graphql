package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A selectable delivery address for a cart.
 */
public class CartSelectableAddress {
  /**
   * The delivery address.
   */
  private CartAddress address;

  /**
   * A unique identifier for the address, specific to this cart.
   */
  private String id;

  /**
   * This delivery address will not be associated with the buyer after a successful checkout.
   */
  private boolean oneTimeUse;

  /**
   * Sets exactly one address as pre-selected for the buyer.
   */
  private boolean selected;

  public CartSelectableAddress() {
  }

  /**
   * The delivery address.
   */
  public CartAddress getAddress() {
    return address;
  }

  public void setAddress(CartAddress address) {
    this.address = address;
  }

  /**
   * A unique identifier for the address, specific to this cart.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * This delivery address will not be associated with the buyer after a successful checkout.
   */
  public boolean getOneTimeUse() {
    return oneTimeUse;
  }

  public void setOneTimeUse(boolean oneTimeUse) {
    this.oneTimeUse = oneTimeUse;
  }

  /**
   * Sets exactly one address as pre-selected for the buyer.
   */
  public boolean getSelected() {
    return selected;
  }

  public void setSelected(boolean selected) {
    this.selected = selected;
  }

  @Override
  public String toString() {
    return "CartSelectableAddress{address='" + address + "', id='" + id + "', oneTimeUse='" + oneTimeUse + "', selected='" + selected + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartSelectableAddress that = (CartSelectableAddress) o;
    return Objects.equals(address, that.address) &&
        Objects.equals(id, that.id) &&
        oneTimeUse == that.oneTimeUse &&
        selected == that.selected;
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, id, oneTimeUse, selected);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The delivery address.
     */
    private CartAddress address;

    /**
     * A unique identifier for the address, specific to this cart.
     */
    private String id;

    /**
     * This delivery address will not be associated with the buyer after a successful checkout.
     */
    private boolean oneTimeUse;

    /**
     * Sets exactly one address as pre-selected for the buyer.
     */
    private boolean selected;

    public CartSelectableAddress build() {
      CartSelectableAddress result = new CartSelectableAddress();
      result.address = this.address;
      result.id = this.id;
      result.oneTimeUse = this.oneTimeUse;
      result.selected = this.selected;
      return result;
    }

    /**
     * The delivery address.
     */
    public Builder address(CartAddress address) {
      this.address = address;
      return this;
    }

    /**
     * A unique identifier for the address, specific to this cart.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * This delivery address will not be associated with the buyer after a successful checkout.
     */
    public Builder oneTimeUse(boolean oneTimeUse) {
      this.oneTimeUse = oneTimeUse;
      return this;
    }

    /**
     * Sets exactly one address as pre-selected for the buyer.
     */
    public Builder selected(boolean selected) {
      this.selected = selected;
      return this;
    }
  }
}
