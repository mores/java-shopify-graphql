package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the value and value type of the private metafield.
 */
public class PrivateMetafieldValueInput {
  /**
   * The value of a private metafield.
   */
  private String value;

  /**
   * Represents the private metafield value type.
   */
  private PrivateMetafieldValueType valueType;

  public PrivateMetafieldValueInput() {
  }

  /**
   * The value of a private metafield.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Represents the private metafield value type.
   */
  public PrivateMetafieldValueType getValueType() {
    return valueType;
  }

  public void setValueType(PrivateMetafieldValueType valueType) {
    this.valueType = valueType;
  }

  @Override
  public String toString() {
    return "PrivateMetafieldValueInput{value='" + value + "', valueType='" + valueType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivateMetafieldValueInput that = (PrivateMetafieldValueInput) o;
    return Objects.equals(value, that.value) &&
        Objects.equals(valueType, that.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, valueType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The value of a private metafield.
     */
    private String value;

    /**
     * Represents the private metafield value type.
     */
    private PrivateMetafieldValueType valueType;

    public PrivateMetafieldValueInput build() {
      PrivateMetafieldValueInput result = new PrivateMetafieldValueInput();
      result.value = this.value;
      result.valueType = this.valueType;
      return result;
    }

    /**
     * The value of a private metafield.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * Represents the private metafield value type.
     */
    public Builder valueType(PrivateMetafieldValueType valueType) {
      this.valueType = valueType;
      return this;
    }
  }
}
