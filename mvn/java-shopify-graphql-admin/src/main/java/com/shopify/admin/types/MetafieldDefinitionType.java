package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A metafield definition type provides basic foundation and validation for a metafield.
 */
public class MetafieldDefinitionType {
  /**
   * The category associated with the metafield definition type.
   */
  private String category;

  /**
   * The name of the type for the metafield definition.
   * See the list of [supported types](https://shopify.dev/apps/metafields/types).
   */
  private String name;

  /**
   * The supported validations for a metafield definition type.
   */
  private List<MetafieldDefinitionSupportedValidation> supportedValidations;

  /**
   * Whether metafields without a definition can be migrated to a definition of this type.
   */
  private boolean supportsDefinitionMigrations;

  /**
   * The value type for a metafield created with this definition type.
   */
  private MetafieldValueType valueType;

  public MetafieldDefinitionType() {
  }

  /**
   * The category associated with the metafield definition type.
   */
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * The name of the type for the metafield definition.
   * See the list of [supported types](https://shopify.dev/apps/metafields/types).
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The supported validations for a metafield definition type.
   */
  public List<MetafieldDefinitionSupportedValidation> getSupportedValidations() {
    return supportedValidations;
  }

  public void setSupportedValidations(
      List<MetafieldDefinitionSupportedValidation> supportedValidations) {
    this.supportedValidations = supportedValidations;
  }

  /**
   * Whether metafields without a definition can be migrated to a definition of this type.
   */
  public boolean getSupportsDefinitionMigrations() {
    return supportsDefinitionMigrations;
  }

  public void setSupportsDefinitionMigrations(boolean supportsDefinitionMigrations) {
    this.supportsDefinitionMigrations = supportsDefinitionMigrations;
  }

  /**
   * The value type for a metafield created with this definition type.
   */
  public MetafieldValueType getValueType() {
    return valueType;
  }

  public void setValueType(MetafieldValueType valueType) {
    this.valueType = valueType;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionType{category='" + category + "', name='" + name + "', supportedValidations='" + supportedValidations + "', supportsDefinitionMigrations='" + supportsDefinitionMigrations + "', valueType='" + valueType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionType that = (MetafieldDefinitionType) o;
    return Objects.equals(category, that.category) &&
        Objects.equals(name, that.name) &&
        Objects.equals(supportedValidations, that.supportedValidations) &&
        supportsDefinitionMigrations == that.supportsDefinitionMigrations &&
        Objects.equals(valueType, that.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, name, supportedValidations, supportsDefinitionMigrations, valueType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The category associated with the metafield definition type.
     */
    private String category;

    /**
     * The name of the type for the metafield definition.
     * See the list of [supported types](https://shopify.dev/apps/metafields/types).
     */
    private String name;

    /**
     * The supported validations for a metafield definition type.
     */
    private List<MetafieldDefinitionSupportedValidation> supportedValidations;

    /**
     * Whether metafields without a definition can be migrated to a definition of this type.
     */
    private boolean supportsDefinitionMigrations;

    /**
     * The value type for a metafield created with this definition type.
     */
    private MetafieldValueType valueType;

    public MetafieldDefinitionType build() {
      MetafieldDefinitionType result = new MetafieldDefinitionType();
      result.category = this.category;
      result.name = this.name;
      result.supportedValidations = this.supportedValidations;
      result.supportsDefinitionMigrations = this.supportsDefinitionMigrations;
      result.valueType = this.valueType;
      return result;
    }

    /**
     * The category associated with the metafield definition type.
     */
    public Builder category(String category) {
      this.category = category;
      return this;
    }

    /**
     * The name of the type for the metafield definition.
     * See the list of [supported types](https://shopify.dev/apps/metafields/types).
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The supported validations for a metafield definition type.
     */
    public Builder supportedValidations(
        List<MetafieldDefinitionSupportedValidation> supportedValidations) {
      this.supportedValidations = supportedValidations;
      return this;
    }

    /**
     * Whether metafields without a definition can be migrated to a definition of this type.
     */
    public Builder supportsDefinitionMigrations(boolean supportsDefinitionMigrations) {
      this.supportsDefinitionMigrations = supportsDefinitionMigrations;
      return this;
    }

    /**
     * The value type for a metafield created with this definition type.
     */
    public Builder valueType(MetafieldValueType valueType) {
      this.valueType = valueType;
      return this;
    }
  }
}
