package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A constraint subtype value that the metafield definition applies to.
 */
public class MetafieldDefinitionConstraintValue {
  /**
   * The subtype value of the constraint.
   */
  private String value;

  public MetafieldDefinitionConstraintValue() {
  }

  /**
   * The subtype value of the constraint.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionConstraintValue{value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionConstraintValue that = (MetafieldDefinitionConstraintValue) o;
    return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The subtype value of the constraint.
     */
    private String value;

    public MetafieldDefinitionConstraintValue build() {
      MetafieldDefinitionConstraintValue result = new MetafieldDefinitionConstraintValue();
      result.value = this.value;
      return result;
    }

    /**
     * The subtype value of the constraint.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
