package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for product variant bundle parent subscription lines in the calculate API.
 */
public class SubscriptionContractCalculationProductVariantParentLineInput {
  /**
   * The ID of an existing line to update. Omit for new lines. The ID keeps the line's identity
   * but doesn't carry over any stored values, so restate every field of the line.
   */
  private String id;

  /**
   * The ID of the product variant for this bundle parent line.
   */
  private String productVariantId;

  /**
   * The quantity of the bundle parent line. Must be at least 1.
   */
  private int quantity;

  /**
   * The custom attributes for this subscription line. Defaults to an empty list when omitted,
   * which clears the line's stored attributes.
   */
  private List<AttributeInput> customAttributes = Collections.emptyList();

  /**
   * The components for this parent line.
   */
  private List<SubscriptionContractCalculationComponentLineInput> components;

  public SubscriptionContractCalculationProductVariantParentLineInput() {
  }

  /**
   * The ID of an existing line to update. Omit for new lines. The ID keeps the line's identity
   * but doesn't carry over any stored values, so restate every field of the line.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The ID of the product variant for this bundle parent line.
   */
  public String getProductVariantId() {
    return productVariantId;
  }

  public void setProductVariantId(String productVariantId) {
    this.productVariantId = productVariantId;
  }

  /**
   * The quantity of the bundle parent line. Must be at least 1.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The custom attributes for this subscription line. Defaults to an empty list when omitted,
   * which clears the line's stored attributes.
   */
  public List<AttributeInput> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<AttributeInput> customAttributes) {
    this.customAttributes = customAttributes;
  }

  /**
   * The components for this parent line.
   */
  public List<SubscriptionContractCalculationComponentLineInput> getComponents() {
    return components;
  }

  public void setComponents(List<SubscriptionContractCalculationComponentLineInput> components) {
    this.components = components;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationProductVariantParentLineInput{id='" + id + "', productVariantId='" + productVariantId + "', quantity='" + quantity + "', customAttributes='" + customAttributes + "', components='" + components + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationProductVariantParentLineInput that = (SubscriptionContractCalculationProductVariantParentLineInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(productVariantId, that.productVariantId) &&
        quantity == that.quantity &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(components, that.components);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productVariantId, quantity, customAttributes, components);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of an existing line to update. Omit for new lines. The ID keeps the line's identity
     * but doesn't carry over any stored values, so restate every field of the line.
     */
    private String id;

    /**
     * The ID of the product variant for this bundle parent line.
     */
    private String productVariantId;

    /**
     * The quantity of the bundle parent line. Must be at least 1.
     */
    private int quantity;

    /**
     * The custom attributes for this subscription line. Defaults to an empty list when omitted,
     * which clears the line's stored attributes.
     */
    private List<AttributeInput> customAttributes = Collections.emptyList();

    /**
     * The components for this parent line.
     */
    private List<SubscriptionContractCalculationComponentLineInput> components;

    public SubscriptionContractCalculationProductVariantParentLineInput build() {
      SubscriptionContractCalculationProductVariantParentLineInput result = new SubscriptionContractCalculationProductVariantParentLineInput();
      result.id = this.id;
      result.productVariantId = this.productVariantId;
      result.quantity = this.quantity;
      result.customAttributes = this.customAttributes;
      result.components = this.components;
      return result;
    }

    /**
     * The ID of an existing line to update. Omit for new lines. The ID keeps the line's identity
     * but doesn't carry over any stored values, so restate every field of the line.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The ID of the product variant for this bundle parent line.
     */
    public Builder productVariantId(String productVariantId) {
      this.productVariantId = productVariantId;
      return this;
    }

    /**
     * The quantity of the bundle parent line. Must be at least 1.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The custom attributes for this subscription line. Defaults to an empty list when omitted,
     * which clears the line's stored attributes.
     */
    public Builder customAttributes(List<AttributeInput> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * The components for this parent line.
     */
    public Builder components(List<SubscriptionContractCalculationComponentLineInput> components) {
      this.components = components;
      return this;
    }
  }
}
