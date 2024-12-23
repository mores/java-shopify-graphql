package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The type and name for the optional validation configuration of a metafield.
 *
 * For example, a supported validation might consist of a `max` name and a `number_integer` type.
 * This validation can then be used to enforce a maximum character length for a `single_line_text_field` metafield.
 */
public class MetafieldDefinitionSupportedValidation {
  /**
   * The name of the metafield definition validation.
   */
  private String name;

  /**
   * The type of input for the validation.
   */
  private String type;

  public MetafieldDefinitionSupportedValidation() {
  }

  /**
   * The name of the metafield definition validation.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The type of input for the validation.
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionSupportedValidation{name='" + name + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionSupportedValidation that = (MetafieldDefinitionSupportedValidation) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the metafield definition validation.
     */
    private String name;

    /**
     * The type of input for the validation.
     */
    private String type;

    public MetafieldDefinitionSupportedValidation build() {
      MetafieldDefinitionSupportedValidation result = new MetafieldDefinitionSupportedValidation();
      result.name = this.name;
      result.type = this.type;
      return result;
    }

    /**
     * The name of the metafield definition validation.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The type of input for the validation.
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }
}
