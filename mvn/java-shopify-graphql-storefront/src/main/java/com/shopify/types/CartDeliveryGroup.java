package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Information about the options available for one or more line items to be delivered to a specific address.
 */
public class CartDeliveryGroup {
  /**
   * A list of cart lines for the delivery group.
   */
  private BaseCartLineConnection cartLines;

  /**
   * The destination address for the delivery group.
   */
  private MailingAddress deliveryAddress;

  /**
   * The delivery options available for the delivery group.
   */
  private List<CartDeliveryOption> deliveryOptions;

  /**
   * The type of merchandise in the delivery group.
   */
  private CartDeliveryGroupType groupType;

  /**
   * The ID for the delivery group.
   */
  private String id;

  /**
   * The selected delivery option for the delivery group.
   */
  private CartDeliveryOption selectedDeliveryOption;

  public CartDeliveryGroup() {
  }

  /**
   * A list of cart lines for the delivery group.
   */
  public BaseCartLineConnection getCartLines() {
    return cartLines;
  }

  public void setCartLines(BaseCartLineConnection cartLines) {
    this.cartLines = cartLines;
  }

  /**
   * The destination address for the delivery group.
   */
  public MailingAddress getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(MailingAddress deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  /**
   * The delivery options available for the delivery group.
   */
  public List<CartDeliveryOption> getDeliveryOptions() {
    return deliveryOptions;
  }

  public void setDeliveryOptions(List<CartDeliveryOption> deliveryOptions) {
    this.deliveryOptions = deliveryOptions;
  }

  /**
   * The type of merchandise in the delivery group.
   */
  public CartDeliveryGroupType getGroupType() {
    return groupType;
  }

  public void setGroupType(CartDeliveryGroupType groupType) {
    this.groupType = groupType;
  }

  /**
   * The ID for the delivery group.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The selected delivery option for the delivery group.
   */
  public CartDeliveryOption getSelectedDeliveryOption() {
    return selectedDeliveryOption;
  }

  public void setSelectedDeliveryOption(CartDeliveryOption selectedDeliveryOption) {
    this.selectedDeliveryOption = selectedDeliveryOption;
  }

  @Override
  public String toString() {
    return "CartDeliveryGroup{cartLines='" + cartLines + "', deliveryAddress='" + deliveryAddress + "', deliveryOptions='" + deliveryOptions + "', groupType='" + groupType + "', id='" + id + "', selectedDeliveryOption='" + selectedDeliveryOption + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartDeliveryGroup that = (CartDeliveryGroup) o;
    return Objects.equals(cartLines, that.cartLines) &&
        Objects.equals(deliveryAddress, that.deliveryAddress) &&
        Objects.equals(deliveryOptions, that.deliveryOptions) &&
        Objects.equals(groupType, that.groupType) &&
        Objects.equals(id, that.id) &&
        Objects.equals(selectedDeliveryOption, that.selectedDeliveryOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartLines, deliveryAddress, deliveryOptions, groupType, id, selectedDeliveryOption);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of cart lines for the delivery group.
     */
    private BaseCartLineConnection cartLines;

    /**
     * The destination address for the delivery group.
     */
    private MailingAddress deliveryAddress;

    /**
     * The delivery options available for the delivery group.
     */
    private List<CartDeliveryOption> deliveryOptions;

    /**
     * The type of merchandise in the delivery group.
     */
    private CartDeliveryGroupType groupType;

    /**
     * The ID for the delivery group.
     */
    private String id;

    /**
     * The selected delivery option for the delivery group.
     */
    private CartDeliveryOption selectedDeliveryOption;

    public CartDeliveryGroup build() {
      CartDeliveryGroup result = new CartDeliveryGroup();
      result.cartLines = this.cartLines;
      result.deliveryAddress = this.deliveryAddress;
      result.deliveryOptions = this.deliveryOptions;
      result.groupType = this.groupType;
      result.id = this.id;
      result.selectedDeliveryOption = this.selectedDeliveryOption;
      return result;
    }

    /**
     * A list of cart lines for the delivery group.
     */
    public Builder cartLines(BaseCartLineConnection cartLines) {
      this.cartLines = cartLines;
      return this;
    }

    /**
     * The destination address for the delivery group.
     */
    public Builder deliveryAddress(MailingAddress deliveryAddress) {
      this.deliveryAddress = deliveryAddress;
      return this;
    }

    /**
     * The delivery options available for the delivery group.
     */
    public Builder deliveryOptions(List<CartDeliveryOption> deliveryOptions) {
      this.deliveryOptions = deliveryOptions;
      return this;
    }

    /**
     * The type of merchandise in the delivery group.
     */
    public Builder groupType(CartDeliveryGroupType groupType) {
      this.groupType = groupType;
      return this;
    }

    /**
     * The ID for the delivery group.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The selected delivery option for the delivery group.
     */
    public Builder selectedDeliveryOption(CartDeliveryOption selectedDeliveryOption) {
      this.selectedDeliveryOption = selectedDeliveryOption;
      return this;
    }
  }
}
