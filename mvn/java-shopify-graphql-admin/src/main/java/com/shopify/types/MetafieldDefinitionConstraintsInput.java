package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to create metafield definition constraints. Each constraint applies a metafield
 * definition to a subtype of a resource.
 */
public class MetafieldDefinitionConstraintsInput {
  /**
   * The category of resource subtypes that the definition applies to.
   */
  private String key;

  /**
   * The specific constraint subtype values that the definition applies to.
   */
  private List<String> values;

  public MetafieldDefinitionConstraintsInput() {
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
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionConstraintsInput{key='" + key + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionConstraintsInput that = (MetafieldDefinitionConstraintsInput) o;
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
    private List<String> values;

    public MetafieldDefinitionConstraintsInput build() {
      MetafieldDefinitionConstraintsInput result = new MetafieldDefinitionConstraintsInput();
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
    public Builder values(List<String> values) {
      this.values = values;
      return this;
    }
  }
}
