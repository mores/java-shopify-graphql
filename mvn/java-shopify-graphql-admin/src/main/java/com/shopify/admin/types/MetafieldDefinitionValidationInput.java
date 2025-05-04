package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The name and value for a metafield definition validation.
 *
 * For example, for a metafield definition of `single_line_text_field` type, you
 * can set a validation with the name `min` and a value of `10`.
 * This validation will ensure that the value of the metafield is at least 10 characters.
 *
 * Refer to the [list of supported validations](https://shopify.dev/api/admin/graphql/reference/common-objects/metafieldDefinitionTypes#examples-Fetch_all_metafield_definition_types).
 */
public class MetafieldDefinitionValidationInput {
  /**
   * The name for the metafield definition validation.
   */
  private String name;

  /**
   * The value for the metafield definition validation.
   */
  private String value;

  public MetafieldDefinitionValidationInput() {
  }

  /**
   * The name for the metafield definition validation.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The value for the metafield definition validation.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionValidationInput{name='" + name + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionValidationInput that = (MetafieldDefinitionValidationInput) o;
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
     * The name for the metafield definition validation.
     */
    private String name;

    /**
     * The value for the metafield definition validation.
     */
    private String value;

    public MetafieldDefinitionValidationInput build() {
      MetafieldDefinitionValidationInput result = new MetafieldDefinitionValidationInput();
      result.name = this.name;
      result.value = this.value;
      return result;
    }

    /**
     * The name for the metafield definition validation.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The value for the metafield definition validation.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
