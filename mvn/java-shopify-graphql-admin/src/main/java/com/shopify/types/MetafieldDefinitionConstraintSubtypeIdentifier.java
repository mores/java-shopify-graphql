package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to identify a subtype of a resource for the purposes of metafield definition constraints.
 */
public class MetafieldDefinitionConstraintSubtypeIdentifier {
  /**
   * The category of the resource subtype.
   */
  private String key;

  /**
   * The specific subtype value within the identified subtype category.
   */
  private String value;

  public MetafieldDefinitionConstraintSubtypeIdentifier() {
  }

  /**
   * The category of the resource subtype.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The specific subtype value within the identified subtype category.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionConstraintSubtypeIdentifier{key='" + key + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionConstraintSubtypeIdentifier that = (MetafieldDefinitionConstraintSubtypeIdentifier) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The category of the resource subtype.
     */
    private String key;

    /**
     * The specific subtype value within the identified subtype category.
     */
    private String value;

    public MetafieldDefinitionConstraintSubtypeIdentifier build() {
      MetafieldDefinitionConstraintSubtypeIdentifier result = new MetafieldDefinitionConstraintSubtypeIdentifier();
      result.key = this.key;
      result.value = this.value;
      return result;
    }

    /**
     * The category of the resource subtype.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The specific subtype value within the identified subtype category.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
