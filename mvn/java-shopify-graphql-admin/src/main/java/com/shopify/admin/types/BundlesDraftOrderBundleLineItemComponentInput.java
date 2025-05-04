package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields representing the components of a bundle line item.
 */
public class BundlesDraftOrderBundleLineItemComponentInput {
  /**
   * The ID of the product variant corresponding to the bundle component.
   */
  private String variantId;

  /**
   * The quantity of the bundle component.
   */
  private int quantity;

  /**
   * The UUID of the bundle component. Must be unique and consistent across requests.
   * This field is mandatory in order to manipulate drafts with bundles.
   */
  private String uuid;

  public BundlesDraftOrderBundleLineItemComponentInput() {
  }

  /**
   * The ID of the product variant corresponding to the bundle component.
   */
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  /**
   * The quantity of the bundle component.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The UUID of the bundle component. Must be unique and consistent across requests.
   * This field is mandatory in order to manipulate drafts with bundles.
   */
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  @Override
  public String toString() {
    return "BundlesDraftOrderBundleLineItemComponentInput{variantId='" + variantId + "', quantity='" + quantity + "', uuid='" + uuid + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BundlesDraftOrderBundleLineItemComponentInput that = (BundlesDraftOrderBundleLineItemComponentInput) o;
    return Objects.equals(variantId, that.variantId) &&
        quantity == that.quantity &&
        Objects.equals(uuid, that.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variantId, quantity, uuid);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the product variant corresponding to the bundle component.
     */
    private String variantId;

    /**
     * The quantity of the bundle component.
     */
    private int quantity;

    /**
     * The UUID of the bundle component. Must be unique and consistent across requests.
     * This field is mandatory in order to manipulate drafts with bundles.
     */
    private String uuid;

    public BundlesDraftOrderBundleLineItemComponentInput build() {
      BundlesDraftOrderBundleLineItemComponentInput result = new BundlesDraftOrderBundleLineItemComponentInput();
      result.variantId = this.variantId;
      result.quantity = this.quantity;
      result.uuid = this.uuid;
      return result;
    }

    /**
     * The ID of the product variant corresponding to the bundle component.
     */
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }

    /**
     * The quantity of the bundle component.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The UUID of the bundle component. Must be unique and consistent across requests.
     * This field is mandatory in order to manipulate drafts with bundles.
     */
    public Builder uuid(String uuid) {
      this.uuid = uuid;
      return this;
    }
  }
}
