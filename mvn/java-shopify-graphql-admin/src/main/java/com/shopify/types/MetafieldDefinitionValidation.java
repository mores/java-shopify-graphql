package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A configured metafield definition validation.
 *
 * For example, for a metafield definition of `number_integer` type, you can set a validation with the name `max`
 * and a value of `15`. This validation will ensure that the value of the metafield is a number less than or equal to 15.
 *
 * Refer to the [list of supported validations](https://shopify.dev/api/admin/graphql/reference/common-objects/metafieldDefinitionTypes#examples-Fetch_all_metafield_definition_types).
 */
public class MetafieldDefinitionValidation {
  /**
   * The validation name.
   */
  private String name;

  /**
   * The name for the metafield type of this validation.
   */
  private String type;

  /**
   * The validation value.
   */
  private String value;

  public MetafieldDefinitionValidation() {
  }

  /**
   * The validation name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The name for the metafield type of this validation.
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The validation value.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionValidation{name='" + name + "', type='" + type + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionValidation that = (MetafieldDefinitionValidation) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(type, that.type) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The validation name.
     */
    private String name;

    /**
     * The name for the metafield type of this validation.
     */
    private String type;

    /**
     * The validation value.
     */
    private String value;

    public MetafieldDefinitionValidation build() {
      MetafieldDefinitionValidation result = new MetafieldDefinitionValidation();
      result.name = this.name;
      result.type = this.type;
      result.value = this.value;
      return result;
    }

    /**
     * The validation name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The name for the metafield type of this validation.
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * The validation value.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
