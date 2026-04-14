package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A name/value pair representing a product option selection on a variant. The [`ProductVariant`](https://shopify.dev/docs/api/storefront/current/objects/ProductVariant) object's [`selectedOptions`](https://shopify.dev/docs/api/storefront/current/objects/ProductVariant#field-ProductVariant.fields.selectedOptions)
 * field returns this to indicate which options define that variant, such as "Size:
 * Large" or "Color: Red".
 */
public class SelectedOption {
  /**
   * The product option’s name.
   */
  private String name;

  /**
   * The product option’s value.
   */
  private String value;

  public SelectedOption() {
  }

  /**
   * The product option’s name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The product option’s value.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "SelectedOption{name='" + name + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SelectedOption that = (SelectedOption) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The product option’s name.
     */
    private String name;

    /**
     * The product option’s value.
     */
    private String value;

    public SelectedOption build() {
      SelectedOption result = new SelectedOption();
      result.name = this.name;
      result.value = this.value;
      return result;
    }

    /**
     * The product option’s name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The product option’s value.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
