package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Defines a field for a MetaobjectDefinition with properties
 * such as the field's data type and validations.
 */
public class MetaobjectFieldDefinition {
  /**
   * Capabilities available for this metaobject field definition.
   */
  private MetaobjectFieldDefinitionCapabilities capabilities;

  /**
   * The administrative description.
   */
  private String description;

  /**
   * A key name used to identify the field within the metaobject composition.
   */
  private String key;

  /**
   * The human-readable name.
   */
  private String name;

  /**
   * Required status of the field within the metaobject composition.
   */
  private boolean required;

  /**
   * The type of data that the field stores.
   */
  private MetafieldDefinitionType type;

  /**
   * A list of [validation options](https://shopify.dev/apps/metafields/definitions/validation) for
   * the field. For example, a field with the type `date` can set a minimum date requirement.
   */
  private List<MetafieldDefinitionValidation> validations;

  public MetaobjectFieldDefinition() {
  }

  /**
   * Capabilities available for this metaobject field definition.
   */
  public MetaobjectFieldDefinitionCapabilities getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(MetaobjectFieldDefinitionCapabilities capabilities) {
    this.capabilities = capabilities;
  }

  /**
   * The administrative description.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * A key name used to identify the field within the metaobject composition.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The human-readable name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Required status of the field within the metaobject composition.
   */
  public boolean getRequired() {
    return required;
  }

  public void setRequired(boolean required) {
    this.required = required;
  }

  /**
   * The type of data that the field stores.
   */
  public MetafieldDefinitionType getType() {
    return type;
  }

  public void setType(MetafieldDefinitionType type) {
    this.type = type;
  }

  /**
   * A list of [validation options](https://shopify.dev/apps/metafields/definitions/validation) for
   * the field. For example, a field with the type `date` can set a minimum date requirement.
   */
  public List<MetafieldDefinitionValidation> getValidations() {
    return validations;
  }

  public void setValidations(List<MetafieldDefinitionValidation> validations) {
    this.validations = validations;
  }

  @Override
  public String toString() {
    return "MetaobjectFieldDefinition{capabilities='" + capabilities + "', description='" + description + "', key='" + key + "', name='" + name + "', required='" + required + "', type='" + type + "', validations='" + validations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectFieldDefinition that = (MetaobjectFieldDefinition) o;
    return Objects.equals(capabilities, that.capabilities) &&
        Objects.equals(description, that.description) &&
        Objects.equals(key, that.key) &&
        Objects.equals(name, that.name) &&
        required == that.required &&
        Objects.equals(type, that.type) &&
        Objects.equals(validations, that.validations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, description, key, name, required, type, validations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Capabilities available for this metaobject field definition.
     */
    private MetaobjectFieldDefinitionCapabilities capabilities;

    /**
     * The administrative description.
     */
    private String description;

    /**
     * A key name used to identify the field within the metaobject composition.
     */
    private String key;

    /**
     * The human-readable name.
     */
    private String name;

    /**
     * Required status of the field within the metaobject composition.
     */
    private boolean required;

    /**
     * The type of data that the field stores.
     */
    private MetafieldDefinitionType type;

    /**
     * A list of [validation options](https://shopify.dev/apps/metafields/definitions/validation) for
     * the field. For example, a field with the type `date` can set a minimum date requirement.
     */
    private List<MetafieldDefinitionValidation> validations;

    public MetaobjectFieldDefinition build() {
      MetaobjectFieldDefinition result = new MetaobjectFieldDefinition();
      result.capabilities = this.capabilities;
      result.description = this.description;
      result.key = this.key;
      result.name = this.name;
      result.required = this.required;
      result.type = this.type;
      result.validations = this.validations;
      return result;
    }

    /**
     * Capabilities available for this metaobject field definition.
     */
    public Builder capabilities(MetaobjectFieldDefinitionCapabilities capabilities) {
      this.capabilities = capabilities;
      return this;
    }

    /**
     * The administrative description.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * A key name used to identify the field within the metaobject composition.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The human-readable name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Required status of the field within the metaobject composition.
     */
    public Builder required(boolean required) {
      this.required = required;
      return this;
    }

    /**
     * The type of data that the field stores.
     */
    public Builder type(MetafieldDefinitionType type) {
      this.type = type;
      return this;
    }

    /**
     * A list of [validation options](https://shopify.dev/apps/metafields/definitions/validation) for
     * the field. For example, a field with the type `date` can set a minimum date requirement.
     */
    public Builder validations(List<MetafieldDefinitionValidation> validations) {
      this.validations = validations;
      return this;
    }
  }
}
