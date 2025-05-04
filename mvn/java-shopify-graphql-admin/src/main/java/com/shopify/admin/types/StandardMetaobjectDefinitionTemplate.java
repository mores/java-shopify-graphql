package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Standard metaobject definition templates provide preset configurations to create metaobject definitions.
 */
public class StandardMetaobjectDefinitionTemplate {
  /**
   * The administrative description.
   */
  private String description;

  /**
   * The key of a field to reference as the display name for each object.
   */
  private String displayNameKey;

  /**
   * The capabilities of the metaobject definition.
   */
  private List<StandardMetaobjectCapabilityTemplate> enabledCapabilities;

  /**
   * Templates for the associated field definitions.
   */
  private List<StandardMetaobjectDefinitionFieldTemplate> fieldDefinitions;

  /**
   * The human-readable name.
   */
  private String name;

  /**
   * The namespace owned by the definition after the definition has been enabled.
   */
  private String type;

  public StandardMetaobjectDefinitionTemplate() {
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
   * The key of a field to reference as the display name for each object.
   */
  public String getDisplayNameKey() {
    return displayNameKey;
  }

  public void setDisplayNameKey(String displayNameKey) {
    this.displayNameKey = displayNameKey;
  }

  /**
   * The capabilities of the metaobject definition.
   */
  public List<StandardMetaobjectCapabilityTemplate> getEnabledCapabilities() {
    return enabledCapabilities;
  }

  public void setEnabledCapabilities(
      List<StandardMetaobjectCapabilityTemplate> enabledCapabilities) {
    this.enabledCapabilities = enabledCapabilities;
  }

  /**
   * Templates for the associated field definitions.
   */
  public List<StandardMetaobjectDefinitionFieldTemplate> getFieldDefinitions() {
    return fieldDefinitions;
  }

  public void setFieldDefinitions(
      List<StandardMetaobjectDefinitionFieldTemplate> fieldDefinitions) {
    this.fieldDefinitions = fieldDefinitions;
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
   * The namespace owned by the definition after the definition has been enabled.
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "StandardMetaobjectDefinitionTemplate{description='" + description + "', displayNameKey='" + displayNameKey + "', enabledCapabilities='" + enabledCapabilities + "', fieldDefinitions='" + fieldDefinitions + "', name='" + name + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StandardMetaobjectDefinitionTemplate that = (StandardMetaobjectDefinitionTemplate) o;
    return Objects.equals(description, that.description) &&
        Objects.equals(displayNameKey, that.displayNameKey) &&
        Objects.equals(enabledCapabilities, that.enabledCapabilities) &&
        Objects.equals(fieldDefinitions, that.fieldDefinitions) &&
        Objects.equals(name, that.name) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displayNameKey, enabledCapabilities, fieldDefinitions, name, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The administrative description.
     */
    private String description;

    /**
     * The key of a field to reference as the display name for each object.
     */
    private String displayNameKey;

    /**
     * The capabilities of the metaobject definition.
     */
    private List<StandardMetaobjectCapabilityTemplate> enabledCapabilities;

    /**
     * Templates for the associated field definitions.
     */
    private List<StandardMetaobjectDefinitionFieldTemplate> fieldDefinitions;

    /**
     * The human-readable name.
     */
    private String name;

    /**
     * The namespace owned by the definition after the definition has been enabled.
     */
    private String type;

    public StandardMetaobjectDefinitionTemplate build() {
      StandardMetaobjectDefinitionTemplate result = new StandardMetaobjectDefinitionTemplate();
      result.description = this.description;
      result.displayNameKey = this.displayNameKey;
      result.enabledCapabilities = this.enabledCapabilities;
      result.fieldDefinitions = this.fieldDefinitions;
      result.name = this.name;
      result.type = this.type;
      return result;
    }

    /**
     * The administrative description.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The key of a field to reference as the display name for each object.
     */
    public Builder displayNameKey(String displayNameKey) {
      this.displayNameKey = displayNameKey;
      return this;
    }

    /**
     * The capabilities of the metaobject definition.
     */
    public Builder enabledCapabilities(
        List<StandardMetaobjectCapabilityTemplate> enabledCapabilities) {
      this.enabledCapabilities = enabledCapabilities;
      return this;
    }

    /**
     * Templates for the associated field definitions.
     */
    public Builder fieldDefinitions(
        List<StandardMetaobjectDefinitionFieldTemplate> fieldDefinitions) {
      this.fieldDefinitions = fieldDefinitions;
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
     * The namespace owned by the definition after the definition has been enabled.
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }
}
