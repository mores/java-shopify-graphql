package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields representing the components of a line item.
 */
public class DraftOrderLineItemComponentInput {
  /**
   * The ID of the product variant corresponding to the component.
   */
  private String variantId;

  /**
   * The quantity of the component.
   */
  private int quantity;

  /**
   * The UUID of the component. Must be unique and consistent across requests.
   * This field is mandatory in order to manipulate drafts with parent line items.
   */
  private String uuid;

  public DraftOrderLineItemComponentInput() {
  }

  /**
   * The ID of the product variant corresponding to the component.
   */
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  /**
   * The quantity of the component.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The UUID of the component. Must be unique and consistent across requests.
   * This field is mandatory in order to manipulate drafts with parent line items.
   */
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  @Override
  public String toString() {
    return "DraftOrderLineItemComponentInput{variantId='" + variantId + "', quantity='" + quantity + "', uuid='" + uuid + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderLineItemComponentInput that = (DraftOrderLineItemComponentInput) o;
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
     * The ID of the product variant corresponding to the component.
     */
    private String variantId;

    /**
     * The quantity of the component.
     */
    private int quantity;

    /**
     * The UUID of the component. Must be unique and consistent across requests.
     * This field is mandatory in order to manipulate drafts with parent line items.
     */
    private String uuid;

    public DraftOrderLineItemComponentInput build() {
      DraftOrderLineItemComponentInput result = new DraftOrderLineItemComponentInput();
      result.variantId = this.variantId;
      result.quantity = this.quantity;
      result.uuid = this.uuid;
      return result;
    }

    /**
     * The ID of the product variant corresponding to the component.
     */
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }

    /**
     * The quantity of the component.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The UUID of the component. Must be unique and consistent across requests.
     * This field is mandatory in order to manipulate drafts with parent line items.
     */
    public Builder uuid(String uuid) {
      this.uuid = uuid;
      return this;
    }
  }
}
