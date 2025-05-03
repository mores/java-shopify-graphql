package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating the selected delivery options for a delivery group.
 */
public class CartSelectedDeliveryOptionInput {
  /**
   * The ID of the cart delivery group.
   */
  private String deliveryGroupId;

  /**
   * The handle of the selected delivery option.
   */
  private String deliveryOptionHandle;

  public CartSelectedDeliveryOptionInput() {
  }

  /**
   * The ID of the cart delivery group.
   */
  public String getDeliveryGroupId() {
    return deliveryGroupId;
  }

  public void setDeliveryGroupId(String deliveryGroupId) {
    this.deliveryGroupId = deliveryGroupId;
  }

  /**
   * The handle of the selected delivery option.
   */
  public String getDeliveryOptionHandle() {
    return deliveryOptionHandle;
  }

  public void setDeliveryOptionHandle(String deliveryOptionHandle) {
    this.deliveryOptionHandle = deliveryOptionHandle;
  }

  @Override
  public String toString() {
    return "CartSelectedDeliveryOptionInput{deliveryGroupId='" + deliveryGroupId + "', deliveryOptionHandle='" + deliveryOptionHandle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartSelectedDeliveryOptionInput that = (CartSelectedDeliveryOptionInput) o;
    return Objects.equals(deliveryGroupId, that.deliveryGroupId) &&
        Objects.equals(deliveryOptionHandle, that.deliveryOptionHandle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryGroupId, deliveryOptionHandle);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the cart delivery group.
     */
    private String deliveryGroupId;

    /**
     * The handle of the selected delivery option.
     */
    private String deliveryOptionHandle;

    public CartSelectedDeliveryOptionInput build() {
      CartSelectedDeliveryOptionInput result = new CartSelectedDeliveryOptionInput();
      result.deliveryGroupId = this.deliveryGroupId;
      result.deliveryOptionHandle = this.deliveryOptionHandle;
      return result;
    }

    /**
     * The ID of the cart delivery group.
     */
    public Builder deliveryGroupId(String deliveryGroupId) {
      this.deliveryGroupId = deliveryGroupId;
      return this;
    }

    /**
     * The handle of the selected delivery option.
     */
    public Builder deliveryOptionHandle(String deliveryOptionHandle) {
      this.deliveryOptionHandle = deliveryOptionHandle;
      return this;
    }
  }
}
