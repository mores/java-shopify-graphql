package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to identify a resource.
 */
public class ProductSetIdentifiers {
  /**
   * ID of product to update.
   */
  private String id;

  /**
   * Handle of product to upsert.
   */
  private String handle;

  /**
   * Custom ID of product to upsert.
   */
  private UniqueMetafieldValueInput customId;

  public ProductSetIdentifiers() {
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
   * Handle of product to upsert.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * Custom ID of product to upsert.
   */
  public UniqueMetafieldValueInput getCustomId() {
    return customId;
  }

  public void setCustomId(UniqueMetafieldValueInput customId) {
    this.customId = customId;
  }

  @Override
  public String toString() {
    return "ProductSetIdentifiers{id='" + id + "', handle='" + handle + "', customId='" + customId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductSetIdentifiers that = (ProductSetIdentifiers) o;
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
     * Handle of product to upsert.
     */
    private String handle;

    /**
     * Custom ID of product to upsert.
     */
    private UniqueMetafieldValueInput customId;

    public ProductSetIdentifiers build() {
      ProductSetIdentifiers result = new ProductSetIdentifiers();
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
     * Handle of product to upsert.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * Custom ID of product to upsert.
     */
    public Builder customId(UniqueMetafieldValueInput customId) {
      this.customId = customId;
      return this;
    }
  }
}
