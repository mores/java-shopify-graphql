package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for identifying a product.
 */
public class ProductIdentifierInput {
  /**
   * The ID of the product.
   */
  private String id;

  /**
   * The handle of the product.
   */
  private String handle;

  /**
   * The custom ID of the product.
   */
  private UniqueMetafieldValueInput customId;

  public ProductIdentifierInput() {
  }

  /**
   * The ID of the product.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The handle of the product.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * The custom ID of the product.
   */
  public UniqueMetafieldValueInput getCustomId() {
    return customId;
  }

  public void setCustomId(UniqueMetafieldValueInput customId) {
    this.customId = customId;
  }

  @Override
  public String toString() {
    return "ProductIdentifierInput{id='" + id + "', handle='" + handle + "', customId='" + customId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductIdentifierInput that = (ProductIdentifierInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(customId, that.customId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, handle, customId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the product.
     */
    private String id;

    /**
     * The handle of the product.
     */
    private String handle;

    /**
     * The custom ID of the product.
     */
    private UniqueMetafieldValueInput customId;

    public ProductIdentifierInput build() {
      ProductIdentifierInput result = new ProductIdentifierInput();
      result.id = this.id;
      result.handle = this.handle;
      result.customId = this.customId;
      return result;
    }

    /**
     * The ID of the product.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The handle of the product.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * The custom ID of the product.
     */
    public Builder customId(UniqueMetafieldValueInput customId) {
      this.customId = customId;
      return this;
    }
  }
}
