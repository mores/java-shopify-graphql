package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to delete a cart metafield.
 */
public class CartMetafieldDeleteInput {
  /**
   * The key name of the cart metafield. Can either be a composite key (`namespace.key`) or a simple key
   *  that relies on the default app-reserved namespace.
   */
  private String key;

  /**
   * The ID of the cart resource.
   */
  private String ownerId;

  public CartMetafieldDeleteInput() {
  }

  /**
   * The key name of the cart metafield. Can either be a composite key (`namespace.key`) or a simple key
   *  that relies on the default app-reserved namespace.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The ID of the cart resource.
   */
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  @Override
  public String toString() {
    return "CartMetafieldDeleteInput{key='" + key + "', ownerId='" + ownerId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartMetafieldDeleteInput that = (CartMetafieldDeleteInput) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(ownerId, that.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, ownerId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The key name of the cart metafield. Can either be a composite key (`namespace.key`) or a simple key
     *  that relies on the default app-reserved namespace.
     */
    private String key;

    /**
     * The ID of the cart resource.
     */
    private String ownerId;

    public CartMetafieldDeleteInput build() {
      CartMetafieldDeleteInput result = new CartMetafieldDeleteInput();
      result.key = this.key;
      result.ownerId = this.ownerId;
      return result;
    }

    /**
     * The key name of the cart metafield. Can either be a composite key (`namespace.key`) or a simple key
     *  that relies on the default app-reserved namespace.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The ID of the cart resource.
     */
    public Builder ownerId(String ownerId) {
      this.ownerId = ownerId;
      return this;
    }
  }
}
