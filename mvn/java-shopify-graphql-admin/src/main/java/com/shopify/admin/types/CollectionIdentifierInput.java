package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for identifying a collection.
 */
public class CollectionIdentifierInput {
  /**
   * The ID of the collection.
   */
  private String id;

  /**
   * The [custom ID](https://shopify.dev/docs/apps/build/custom-data/metafields/working-with-custom-ids) of the collection.
   */
  private UniqueMetafieldValueInput customId;

  /**
   * The handle of the collection.
   */
  private String handle;

  public CollectionIdentifierInput() {
  }

  /**
   * The ID of the collection.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The [custom ID](https://shopify.dev/docs/apps/build/custom-data/metafields/working-with-custom-ids) of the collection.
   */
  public UniqueMetafieldValueInput getCustomId() {
    return customId;
  }

  public void setCustomId(UniqueMetafieldValueInput customId) {
    this.customId = customId;
  }

  /**
   * The handle of the collection.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  @Override
  public String toString() {
    return "CollectionIdentifierInput{id='" + id + "', customId='" + customId + "', handle='" + handle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionIdentifierInput that = (CollectionIdentifierInput) o;
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
     * The ID of the collection.
     */
    private String id;

    /**
     * The [custom ID](https://shopify.dev/docs/apps/build/custom-data/metafields/working-with-custom-ids) of the collection.
     */
    private UniqueMetafieldValueInput customId;

    /**
     * The handle of the collection.
     */
    private String handle;

    public CollectionIdentifierInput build() {
      CollectionIdentifierInput result = new CollectionIdentifierInput();
      result.id = this.id;
      result.customId = this.customId;
      result.handle = this.handle;
      return result;
    }

    /**
     * The ID of the collection.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The [custom ID](https://shopify.dev/docs/apps/build/custom-data/metafields/working-with-custom-ids) of the collection.
     */
    public Builder customId(UniqueMetafieldValueInput customId) {
      this.customId = customId;
      return this;
    }

    /**
     * The handle of the collection.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }
  }
}
