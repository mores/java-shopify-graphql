package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a filter used to view a subset of products in a collection matching a specific variant option.
 */
public class VariantOptionFilter {
  /**
   * The name of the variant option to filter on.
   */
  private String name;

  /**
   * The value of the variant option to filter on.
   */
  private String value;

  public VariantOptionFilter() {
  }

  /**
   * The name of the variant option to filter on.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The value of the variant option to filter on.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "VariantOptionFilter{name='" + name + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VariantOptionFilter that = (VariantOptionFilter) o;
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
     * The name of the variant option to filter on.
     */
    private String name;

    /**
     * The value of the variant option to filter on.
     */
    private String value;

    public VariantOptionFilter build() {
      VariantOptionFilter result = new VariantOptionFilter();
      result.name = this.name;
      result.value = this.value;
      return result;
    }

    /**
     * The name of the variant option to filter on.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The value of the variant option to filter on.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
