package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a cart metafield value to set.
 */
public class CartMetafieldsSetInput {
  /**
   * The ID of the cart resource.
   */
  private String ownerId;

  /**
   * The key name of the cart metafield.
   */
  private String key;

  /**
   * The data to store in the cart metafield. The data is always stored as a string, regardless of the metafield's type.
   */
  private String value;

  /**
   * The type of data that the cart metafield stores.
   * The type of data must be a [supported type](https://shopify.dev/apps/metafields/types).
   */
  private String type;

  public CartMetafieldsSetInput() {
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
   * The key name of the cart metafield.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The data to store in the cart metafield. The data is always stored as a string, regardless of the metafield's type.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /**
   * The type of data that the cart metafield stores.
   * The type of data must be a [supported type](https://shopify.dev/apps/metafields/types).
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "CartMetafieldsSetInput{ownerId='" + ownerId + "', key='" + key + "', value='" + value + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartMetafieldsSetInput that = (CartMetafieldsSetInput) o;
    return Objects.equals(ownerId, that.ownerId) &&
        Objects.equals(key, that.key) &&
        Objects.equals(value, that.value) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId, key, value, type);
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
     * The key name of the cart metafield.
     */
    private String key;

    /**
     * The data to store in the cart metafield. The data is always stored as a string, regardless of the metafield's type.
     */
    private String value;

    /**
     * The type of data that the cart metafield stores.
     * The type of data must be a [supported type](https://shopify.dev/apps/metafields/types).
     */
    private String type;

    public CartMetafieldsSetInput build() {
      CartMetafieldsSetInput result = new CartMetafieldsSetInput();
      result.ownerId = this.ownerId;
      result.key = this.key;
      result.value = this.value;
      result.type = this.type;
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
     * The key name of the cart metafield.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The data to store in the cart metafield. The data is always stored as a string, regardless of the metafield's type.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * The type of data that the cart metafield stores.
     * The type of data must be a [supported type](https://shopify.dev/apps/metafields/types).
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }
}
