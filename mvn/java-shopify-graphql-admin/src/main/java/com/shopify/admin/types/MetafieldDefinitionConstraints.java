package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The [constraints](https://shopify.dev/apps/build/custom-data/metafields/conditional-metafield-definitions)
 * that determine what subtypes of resources a metafield definition applies to.
 */
public class MetafieldDefinitionConstraints {
  /**
   * The category of resource subtypes that the definition applies to.
   */
  private String key;

  /**
   * The specific constraint subtype values that the definition applies to.
   */
  private MetafieldDefinitionConstraintValueConnection values;

  public MetafieldDefinitionConstraints() {
  }

  /**
   * The category of resource subtypes that the definition applies to.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The specific constraint subtype values that the definition applies to.
   */
  public MetafieldDefinitionConstraintValueConnection getValues() {
    return values;
  }

  public void setValues(MetafieldDefinitionConstraintValueConnection values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionConstraints{key='" + key + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionConstraints that = (MetafieldDefinitionConstraints) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, values);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The category of resource subtypes that the definition applies to.
     */
    private String key;

    /**
     * The specific constraint subtype values that the definition applies to.
     */
    private MetafieldDefinitionConstraintValueConnection values;

    public MetafieldDefinitionConstraints build() {
      MetafieldDefinitionConstraints result = new MetafieldDefinitionConstraints();
      result.key = this.key;
      result.values = this.values;
      return result;
    }

    /**
     * The category of resource subtypes that the definition applies to.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The specific constraint subtype values that the definition applies to.
     */
    public Builder values(MetafieldDefinitionConstraintValueConnection values) {
      this.values = values;
      return this;
    }
  }
}
