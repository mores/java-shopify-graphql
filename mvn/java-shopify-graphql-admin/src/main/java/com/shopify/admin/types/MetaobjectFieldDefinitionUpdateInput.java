package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for updating a metaobject field definition.
 */
public class MetaobjectFieldDefinitionUpdateInput {
  /**
   * The key of the field definition to update.
   */
  private String key;

  /**
   * A human-readable name for the field.
   */
  private String name;

  /**
   * An administrative description of the field.
   */
  private String description;

  /**
   * Whether metaobjects require a saved value for the field.
   */
  private Boolean required;

  /**
   * Custom validations that apply to values assigned to the field.
   */
  private List<MetafieldDefinitionValidationInput> validations;

  public MetaobjectFieldDefinitionUpdateInput() {
  }

  /**
   * The key of the field definition to update.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * A human-readable name for the field.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * An administrative description of the field.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Whether metaobjects require a saved value for the field.
   */
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  /**
   * Custom validations that apply to values assigned to the field.
   */
  public List<MetafieldDefinitionValidationInput> getValidations() {
    return validations;
  }

  public void setValidations(List<MetafieldDefinitionValidationInput> validations) {
    this.validations = validations;
  }

  @Override
  public String toString() {
    return "MetaobjectFieldDefinitionUpdateInput{key='" + key + "', name='" + name + "', description='" + description + "', required='" + required + "', validations='" + validations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectFieldDefinitionUpdateInput that = (MetaobjectFieldDefinitionUpdateInput) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(name, that.name) &&
        Objects.equals(description, that.description) &&
        Objects.equals(required, that.required) &&
        Objects.equals(validations, that.validations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, description, required, validations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The key of the field definition to update.
     */
    private String key;

    /**
     * A human-readable name for the field.
     */
    private String name;

    /**
     * An administrative description of the field.
     */
    private String description;

    /**
     * Whether metaobjects require a saved value for the field.
     */
    private Boolean required;

    /**
     * Custom validations that apply to values assigned to the field.
     */
    private List<MetafieldDefinitionValidationInput> validations;

    public MetaobjectFieldDefinitionUpdateInput build() {
      MetaobjectFieldDefinitionUpdateInput result = new MetaobjectFieldDefinitionUpdateInput();
      result.key = this.key;
      result.name = this.name;
      result.description = this.description;
      result.required = this.required;
      result.validations = this.validations;
      return result;
    }

    /**
     * The key of the field definition to update.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * A human-readable name for the field.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * An administrative description of the field.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Whether metaobjects require a saved value for the field.
     */
    public Builder required(Boolean required) {
      this.required = required;
      return this;
    }

    /**
     * Custom validations that apply to values assigned to the field.
     */
    public Builder validations(List<MetafieldDefinitionValidationInput> validations) {
      this.validations = validations;
      return this;
    }
  }
}
