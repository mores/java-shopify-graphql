package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a cart metafield value to set.
 */
public class CartInputMetafieldInput {
  /**
   * The key name of the metafield.
   */
  private String key;

  /**
   * The type of data that the cart metafield stores.
   * The type of data must be a [supported type](https://shopify.dev/apps/metafields/types).
   */
  private String type;

  /**
   * The data to store in the cart metafield. The data is always stored as a string, regardless of the metafield's type.
   */
  private String value;

  public CartInputMetafieldInput() {
  }

  /**
   * The key name of the metafield.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
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

  /**
   * The data to store in the cart metafield. The data is always stored as a string, regardless of the metafield's type.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "CartInputMetafieldInput{key='" + key + "', type='" + type + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartInputMetafieldInput that = (CartInputMetafieldInput) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(type, that.type) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, type, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The key name of the metafield.
     */
    private String key;

    /**
     * The type of data that the cart metafield stores.
     * The type of data must be a [supported type](https://shopify.dev/apps/metafields/types).
     */
    private String type;

    /**
     * The data to store in the cart metafield. The data is always stored as a string, regardless of the metafield's type.
     */
    private String value;

    public CartInputMetafieldInput build() {
      CartInputMetafieldInput result = new CartInputMetafieldInput();
      result.key = this.key;
      result.type = this.type;
      result.value = this.value;
      return result;
    }

    /**
     * The key name of the metafield.
     */
    public Builder key(String key) {
      this.key = key;
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

    /**
     * The data to store in the cart metafield. The data is always stored as a string, regardless of the metafield's type.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
