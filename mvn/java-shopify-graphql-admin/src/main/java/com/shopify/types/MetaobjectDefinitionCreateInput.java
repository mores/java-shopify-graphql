package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for creating a metaobject definition.
 */
public class MetaobjectDefinitionCreateInput {
  /**
   * A human-readable name for the definition. This can be changed at any time.
   */
  private String name;

  /**
   * An administrative description of the definition.
   */
  private String description;

  /**
   * The type of the metaobject definition. This can't be changed.
   *   
   * Must be 3-255 characters long and only contain alphanumeric, hyphen, and underscore characters.
   */
  private String type;

  /**
   * A set of field definitions to create on this metaobject definition.
   */
  private List<MetaobjectFieldDefinitionCreateInput> fieldDefinitions;

  /**
   * Access configuration for the metaobjects created with this definition.
   */
  private MetaobjectAccessInput access;

  /**
   * The key of a field to reference as the display name for metaobjects of this type.
   */
  private String displayNameKey;

  /**
   * The capabilities of the metaobject definition.
   */
  private MetaobjectCapabilityCreateInput capabilities;

  public MetaobjectDefinitionCreateInput() {
  }

  /**
   * A human-readable name for the definition. This can be changed at any time.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * An administrative description of the definition.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The type of the metaobject definition. This can't be changed.
   *   
   * Must be 3-255 characters long and only contain alphanumeric, hyphen, and underscore characters.
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * A set of field definitions to create on this metaobject definition.
   */
  public List<MetaobjectFieldDefinitionCreateInput> getFieldDefinitions() {
    return fieldDefinitions;
  }

  public void setFieldDefinitions(List<MetaobjectFieldDefinitionCreateInput> fieldDefinitions) {
    this.fieldDefinitions = fieldDefinitions;
  }

  /**
   * Access configuration for the metaobjects created with this definition.
   */
  public MetaobjectAccessInput getAccess() {
    return access;
  }

  public void setAccess(MetaobjectAccessInput access) {
    this.access = access;
  }

  /**
   * The key of a field to reference as the display name for metaobjects of this type.
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
  public MetaobjectCapabilityCreateInput getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(MetaobjectCapabilityCreateInput capabilities) {
    this.capabilities = capabilities;
  }

  @Override
  public String toString() {
    return "MetaobjectDefinitionCreateInput{name='" + name + "', description='" + description + "', type='" + type + "', fieldDefinitions='" + fieldDefinitions + "', access='" + access + "', displayNameKey='" + displayNameKey + "', capabilities='" + capabilities + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectDefinitionCreateInput that = (MetaobjectDefinitionCreateInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(description, that.description) &&
        Objects.equals(type, that.type) &&
        Objects.equals(fieldDefinitions, that.fieldDefinitions) &&
        Objects.equals(access, that.access) &&
        Objects.equals(displayNameKey, that.displayNameKey) &&
        Objects.equals(capabilities, that.capabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, type, fieldDefinitions, access, displayNameKey, capabilities);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A human-readable name for the definition. This can be changed at any time.
     */
    private String name;

    /**
     * An administrative description of the definition.
     */
    private String description;

    /**
     * The type of the metaobject definition. This can't be changed.
     *   
     * Must be 3-255 characters long and only contain alphanumeric, hyphen, and underscore characters.
     */
    private String type;

    /**
     * A set of field definitions to create on this metaobject definition.
     */
    private List<MetaobjectFieldDefinitionCreateInput> fieldDefinitions;

    /**
     * Access configuration for the metaobjects created with this definition.
     */
    private MetaobjectAccessInput access;

    /**
     * The key of a field to reference as the display name for metaobjects of this type.
     */
    private String displayNameKey;

    /**
     * The capabilities of the metaobject definition.
     */
    private MetaobjectCapabilityCreateInput capabilities;

    public MetaobjectDefinitionCreateInput build() {
      MetaobjectDefinitionCreateInput result = new MetaobjectDefinitionCreateInput();
      result.name = this.name;
      result.description = this.description;
      result.type = this.type;
      result.fieldDefinitions = this.fieldDefinitions;
      result.access = this.access;
      result.displayNameKey = this.displayNameKey;
      result.capabilities = this.capabilities;
      return result;
    }

    /**
     * A human-readable name for the definition. This can be changed at any time.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * An administrative description of the definition.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The type of the metaobject definition. This can't be changed.
     *   
     * Must be 3-255 characters long and only contain alphanumeric, hyphen, and underscore characters.
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * A set of field definitions to create on this metaobject definition.
     */
    public Builder fieldDefinitions(List<MetaobjectFieldDefinitionCreateInput> fieldDefinitions) {
      this.fieldDefinitions = fieldDefinitions;
      return this;
    }

    /**
     * Access configuration for the metaobjects created with this definition.
     */
    public Builder access(MetaobjectAccessInput access) {
      this.access = access;
      return this;
    }

    /**
     * The key of a field to reference as the display name for metaobjects of this type.
     */
    public Builder displayNameKey(String displayNameKey) {
      this.displayNameKey = displayNameKey;
      return this;
    }

    /**
     * The capabilities of the metaobject definition.
     */
    public Builder capabilities(MetaobjectCapabilityCreateInput capabilities) {
      this.capabilities = capabilities;
      return this;
    }
  }
}
