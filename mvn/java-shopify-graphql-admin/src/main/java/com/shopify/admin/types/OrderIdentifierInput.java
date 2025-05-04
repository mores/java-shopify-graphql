package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for identifying a order.
 */
public class OrderIdentifierInput {
  /**
   * The ID of the order.
   */
  private String id;

  /**
   * The [custom ID](https://shopify.dev/docs/apps/build/custom-data/metafields/working-with-custom-ids) of the order.
   */
  private UniqueMetafieldValueInput customId;

  public OrderIdentifierInput() {
  }

  /**
   * The ID of the order.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The [custom ID](https://shopify.dev/docs/apps/build/custom-data/metafields/working-with-custom-ids) of the order.
   */
  public UniqueMetafieldValueInput getCustomId() {
    return customId;
  }

  public void setCustomId(UniqueMetafieldValueInput customId) {
    this.customId = customId;
  }

  @Override
  public String toString() {
    return "OrderIdentifierInput{id='" + id + "', customId='" + customId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderIdentifierInput that = (OrderIdentifierInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(customId, that.customId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the order.
     */
    private String id;

    /**
     * The [custom ID](https://shopify.dev/docs/apps/build/custom-data/metafields/working-with-custom-ids) of the order.
     */
    private UniqueMetafieldValueInput customId;

    public OrderIdentifierInput build() {
      OrderIdentifierInput result = new OrderIdentifierInput();
      result.id = this.id;
      result.customId = this.customId;
      return result;
    }

    /**
     * The ID of the order.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The [custom ID](https://shopify.dev/docs/apps/build/custom-data/metafields/working-with-custom-ids) of the order.
     */
    public Builder customId(UniqueMetafieldValueInput customId) {
      this.customId = customId;
      return this;
    }
  }
}
