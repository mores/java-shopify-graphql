package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for creating a metaobject field definition.
 */
public class MetaobjectFieldDefinitionCreateInput {
  /**
   * The key of the new field definition. This can't be changed.
   *   
   * Must be 2-64 characters long and only contain alphanumeric, hyphen, and underscore characters.
   */
  private String key;

  /**
   * The metafield type applied to values of the field.
   */
  private String type;

  /**
   * A human-readable name for the field. This can be changed at any time.
   */
  private String name;

  /**
   * An administrative description of the field.
   */
  private String description;

  /**
   * Whether metaobjects require a saved value for the field.
   */
  private Boolean required = false;

  /**
   * Custom validations that apply to values assigned to the field.
   */
  private List<MetafieldDefinitionValidationInput> validations;

  public MetaobjectFieldDefinitionCreateInput() {
  }

  /**
   * The key of the new field definition. This can't be changed.
   *   
   * Must be 2-64 characters long and only contain alphanumeric, hyphen, and underscore characters.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The metafield type applied to values of the field.
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * A human-readable name for the field. This can be changed at any time.
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
    return "MetaobjectFieldDefinitionCreateInput{key='" + key + "', type='" + type + "', name='" + name + "', description='" + description + "', required='" + required + "', validations='" + validations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectFieldDefinitionCreateInput that = (MetaobjectFieldDefinitionCreateInput) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(type, that.type) &&
        Objects.equals(name, that.name) &&
        Objects.equals(description, that.description) &&
        Objects.equals(required, that.required) &&
        Objects.equals(validations, that.validations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, type, name, description, required, validations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The key of the new field definition. This can't be changed.
     *   
     * Must be 2-64 characters long and only contain alphanumeric, hyphen, and underscore characters.
     */
    private String key;

    /**
     * The metafield type applied to values of the field.
     */
    private String type;

    /**
     * A human-readable name for the field. This can be changed at any time.
     */
    private String name;

    /**
     * An administrative description of the field.
     */
    private String description;

    /**
     * Whether metaobjects require a saved value for the field.
     */
    private Boolean required = false;

    /**
     * Custom validations that apply to values assigned to the field.
     */
    private List<MetafieldDefinitionValidationInput> validations;

    public MetaobjectFieldDefinitionCreateInput build() {
      MetaobjectFieldDefinitionCreateInput result = new MetaobjectFieldDefinitionCreateInput();
      result.key = this.key;
      result.type = this.type;
      result.name = this.name;
      result.description = this.description;
      result.required = this.required;
      result.validations = this.validations;
      return result;
    }

    /**
     * The key of the new field definition. This can't be changed.
     *   
     * Must be 2-64 characters long and only contain alphanumeric, hyphen, and underscore characters.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The metafield type applied to values of the field.
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * A human-readable name for the field. This can be changed at any time.
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
