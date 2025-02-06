package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to update metafield definition constraints. Each constraint applies a metafield
 * definition to a subtype of a resource.
 */
public class MetafieldDefinitionConstraintsUpdatesInput {
  /**
   * The category of resource subtypes that the definition applies to.
   * If omitted and the definition is already constrained, the existing constraint key will be used.
   * If set to `null`, all constraints will be removed.
   */
  private String key;

  /**
   * The specific constraint subtype values to create or delete.
   */
  private List<MetafieldDefinitionConstraintValueUpdateInput> values;

  public MetafieldDefinitionConstraintsUpdatesInput() {
  }

  /**
   * The category of resource subtypes that the definition applies to.
   * If omitted and the definition is already constrained, the existing constraint key will be used.
   * If set to `null`, all constraints will be removed.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The specific constraint subtype values to create or delete.
   */
  public List<MetafieldDefinitionConstraintValueUpdateInput> getValues() {
    return values;
  }

  public void setValues(List<MetafieldDefinitionConstraintValueUpdateInput> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionConstraintsUpdatesInput{key='" + key + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionConstraintsUpdatesInput that = (MetafieldDefinitionConstraintsUpdatesInput) o;
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
     * If omitted and the definition is already constrained, the existing constraint key will be used.
     * If set to `null`, all constraints will be removed.
     */
    private String key;

    /**
     * The specific constraint subtype values to create or delete.
     */
    private List<MetafieldDefinitionConstraintValueUpdateInput> values;

    public MetafieldDefinitionConstraintsUpdatesInput build() {
      MetafieldDefinitionConstraintsUpdatesInput result = new MetafieldDefinitionConstraintsUpdatesInput();
      result.key = this.key;
      result.values = this.values;
      return result;
    }

    /**
     * The category of resource subtypes that the definition applies to.
     * If omitted and the definition is already constrained, the existing constraint key will be used.
     * If set to `null`, all constraints will be removed.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The specific constraint subtype values to create or delete.
     */
    public Builder values(List<MetafieldDefinitionConstraintValueUpdateInput> values) {
      this.values = values;
      return this;
    }
  }
}
