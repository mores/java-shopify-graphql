package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to identify a product for update.
 */
public class ProductUpdateIdentifiers {
  /**
   * ID of product to update.
   */
  private String id;

  /**
   * Handle of product to update.
   */
  private String handle;

  /**
   * Custom ID of product to update.
   */
  private UniqueMetafieldValueInput customId;

  public ProductUpdateIdentifiers() {
  }

  /**
   * ID of product to update.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Handle of product to update.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * Custom ID of product to update.
   */
  public UniqueMetafieldValueInput getCustomId() {
    return customId;
  }

  public void setCustomId(UniqueMetafieldValueInput customId) {
    this.customId = customId;
  }

  @Override
  public String toString() {
    return "ProductUpdateIdentifiers{id='" + id + "', handle='" + handle + "', customId='" + customId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductUpdateIdentifiers that = (ProductUpdateIdentifiers) o;
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
     * ID of product to update.
     */
    private String id;

    /**
     * Handle of product to update.
     */
    private String handle;

    /**
     * Custom ID of product to update.
     */
    private UniqueMetafieldValueInput customId;

    public ProductUpdateIdentifiers build() {
      ProductUpdateIdentifiers result = new ProductUpdateIdentifiers();
      result.id = this.id;
      result.handle = this.handle;
      result.customId = this.customId;
      return result;
    }

    /**
     * ID of product to update.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Handle of product to update.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * Custom ID of product to update.
     */
    public Builder customId(UniqueMetafieldValueInput customId) {
      this.customId = customId;
      return this;
    }
  }
}
