package com.shopify.admin.types;

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
   * The [custom ID](https://shopify.dev/docs/apps/build/custom-data/metafields/working-with-custom-ids) of the product.
   */
  private UniqueMetafieldValueInput customId;

  /**
   * The handle of the product.
   */
  private String handle;

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
   * The [custom ID](https://shopify.dev/docs/apps/build/custom-data/metafields/working-with-custom-ids) of the product.
   */
  public UniqueMetafieldValueInput getCustomId() {
    return customId;
  }

  public void setCustomId(UniqueMetafieldValueInput customId) {
    this.customId = customId;
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

  @Override
  public String toString() {
    return "ProductIdentifierInput{id='" + id + "', customId='" + customId + "', handle='" + handle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductIdentifierInput that = (ProductIdentifierInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(customId, that.customId) &&
        Objects.equals(handle, that.handle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customId, handle);
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
     * The [custom ID](https://shopify.dev/docs/apps/build/custom-data/metafields/working-with-custom-ids) of the product.
     */
    private UniqueMetafieldValueInput customId;

    /**
     * The handle of the product.
     */
    private String handle;

    public ProductIdentifierInput build() {
      ProductIdentifierInput result = new ProductIdentifierInput();
      result.id = this.id;
      result.customId = this.customId;
      result.handle = this.handle;
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
     * The [custom ID](https://shopify.dev/docs/apps/build/custom-data/metafields/working-with-custom-ids) of the product.
     */
    public Builder customId(UniqueMetafieldValueInput customId) {
      this.customId = customId;
      return this;
    }

    /**
     * The handle of the product.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }
  }
}
