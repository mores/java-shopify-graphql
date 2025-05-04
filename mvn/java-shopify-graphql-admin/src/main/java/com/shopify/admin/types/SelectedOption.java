package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Properties used by customers to select a product variant.
 * Products can have multiple options, like different sizes or colors.
 */
public class SelectedOption {
  /**
   * The product option’s name.
   */
  private String name;

  /**
   * The product option’s value object.
   */
  private ProductOptionValue optionValue;

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
   * The product option’s value object.
   */
  public ProductOptionValue getOptionValue() {
    return optionValue;
  }

  public void setOptionValue(ProductOptionValue optionValue) {
    this.optionValue = optionValue;
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
    return "SelectedOption{name='" + name + "', optionValue='" + optionValue + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SelectedOption that = (SelectedOption) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(optionValue, that.optionValue) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, optionValue, value);
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
     * The product option’s value object.
     */
    private ProductOptionValue optionValue;

    /**
     * The product option’s value.
     */
    private String value;

    public SelectedOption build() {
      SelectedOption result = new SelectedOption();
      result.name = this.name;
      result.optionValue = this.optionValue;
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
     * The product option’s value object.
     */
    public Builder optionValue(ProductOptionValue optionValue) {
      this.optionValue = optionValue;
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
