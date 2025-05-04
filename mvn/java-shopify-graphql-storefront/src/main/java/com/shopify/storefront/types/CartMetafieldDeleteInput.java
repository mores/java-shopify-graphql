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
   * The ID of the cart resource.
   */
  private String ownerId;

  /**
   * The key name of the cart metafield. Can either be a composite key (`namespace.key`) or a simple key
   *  that relies on the default app-reserved namespace.
   */
  private String key;

  public CartMetafieldDeleteInput() {
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

  @Override
  public String toString() {
    return "CartMetafieldDeleteInput{ownerId='" + ownerId + "', key='" + key + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartMetafieldDeleteInput that = (CartMetafieldDeleteInput) o;
    return Objects.equals(ownerId, that.ownerId) &&
        Objects.equals(key, that.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId, key);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the cart resource.
     */
    private String ownerId;

    /**
     * The key name of the cart metafield. Can either be a composite key (`namespace.key`) or a simple key
     *  that relies on the default app-reserved namespace.
     */
    private String key;

    public CartMetafieldDeleteInput build() {
      CartMetafieldDeleteInput result = new CartMetafieldDeleteInput();
      result.ownerId = this.ownerId;
      result.key = this.key;
      return result;
    }

    /**
     * The ID of the cart resource.
     */
    public Builder ownerId(String ownerId) {
      this.ownerId = ownerId;
      return this;
    }

    /**
     * The key name of the cart metafield. Can either be a composite key (`namespace.key`) or a simple key
     *  that relies on the default app-reserved namespace.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }
  }
}
