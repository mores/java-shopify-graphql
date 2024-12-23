package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for updating a metaobject definition.
 */
public class MetaobjectDefinitionUpdateInput {
  /**
   * A human-readable name for the definition.
   */
  private String name;

  /**
   * An administrative description of the definition.
   */
  private String description;

  /**
   * A set of operations for modifying field definitions.
   */
  private List<MetaobjectFieldDefinitionOperationInput> fieldDefinitions;

  /**
   * Access configuration for the metaobjects created with this definition.
   */
  private MetaobjectAccessInput access;

  /**
   * The key of a metafield to reference as the display name for objects of this type.
   */
  private String displayNameKey;

  /**
   * Whether the field order should be reset while updating.
   * If `true`, then the order is assigned based on submitted fields followed by alphabetized field omissions.
   * If `false`, then no changes are made to the existing field order and new fields are appended at the end.
   */
  private Boolean resetFieldOrder = false;

  /**
   * The capabilities of the metaobject definition.
   */
  private MetaobjectCapabilityUpdateInput capabilities;

  public MetaobjectDefinitionUpdateInput() {
  }

  /**
   * A human-readable name for the definition.
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
   * A set of operations for modifying field definitions.
   */
  public List<MetaobjectFieldDefinitionOperationInput> getFieldDefinitions() {
    return fieldDefinitions;
  }

  public void setFieldDefinitions(List<MetaobjectFieldDefinitionOperationInput> fieldDefinitions) {
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
   * The key of a metafield to reference as the display name for objects of this type.
   */
  public String getDisplayNameKey() {
    return displayNameKey;
  }

  public void setDisplayNameKey(String displayNameKey) {
    this.displayNameKey = displayNameKey;
  }

  /**
   * Whether the field order should be reset while updating.
   * If `true`, then the order is assigned based on submitted fields followed by alphabetized field omissions.
   * If `false`, then no changes are made to the existing field order and new fields are appended at the end.
   */
  public Boolean getResetFieldOrder() {
    return resetFieldOrder;
  }

  public void setResetFieldOrder(Boolean resetFieldOrder) {
    this.resetFieldOrder = resetFieldOrder;
  }

  /**
   * The capabilities of the metaobject definition.
   */
  public MetaobjectCapabilityUpdateInput getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(MetaobjectCapabilityUpdateInput capabilities) {
    this.capabilities = capabilities;
  }

  @Override
  public String toString() {
    return "MetaobjectDefinitionUpdateInput{name='" + name + "', description='" + description + "', fieldDefinitions='" + fieldDefinitions + "', access='" + access + "', displayNameKey='" + displayNameKey + "', resetFieldOrder='" + resetFieldOrder + "', capabilities='" + capabilities + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectDefinitionUpdateInput that = (MetaobjectDefinitionUpdateInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(description, that.description) &&
        Objects.equals(fieldDefinitions, that.fieldDefinitions) &&
        Objects.equals(access, that.access) &&
        Objects.equals(displayNameKey, that.displayNameKey) &&
        Objects.equals(resetFieldOrder, that.resetFieldOrder) &&
        Objects.equals(capabilities, that.capabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, fieldDefinitions, access, displayNameKey, resetFieldOrder, capabilities);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A human-readable name for the definition.
     */
    private String name;

    /**
     * An administrative description of the definition.
     */
    private String description;

    /**
     * A set of operations for modifying field definitions.
     */
    private List<MetaobjectFieldDefinitionOperationInput> fieldDefinitions;

    /**
     * Access configuration for the metaobjects created with this definition.
     */
    private MetaobjectAccessInput access;

    /**
     * The key of a metafield to reference as the display name for objects of this type.
     */
    private String displayNameKey;

    /**
     * Whether the field order should be reset while updating.
     * If `true`, then the order is assigned based on submitted fields followed by alphabetized field omissions.
     * If `false`, then no changes are made to the existing field order and new fields are appended at the end.
     */
    private Boolean resetFieldOrder = false;

    /**
     * The capabilities of the metaobject definition.
     */
    private MetaobjectCapabilityUpdateInput capabilities;

    public MetaobjectDefinitionUpdateInput build() {
      MetaobjectDefinitionUpdateInput result = new MetaobjectDefinitionUpdateInput();
      result.name = this.name;
      result.description = this.description;
      result.fieldDefinitions = this.fieldDefinitions;
      result.access = this.access;
      result.displayNameKey = this.displayNameKey;
      result.resetFieldOrder = this.resetFieldOrder;
      result.capabilities = this.capabilities;
      return result;
    }

    /**
     * A human-readable name for the definition.
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
     * A set of operations for modifying field definitions.
     */
    public Builder fieldDefinitions(
        List<MetaobjectFieldDefinitionOperationInput> fieldDefinitions) {
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
     * The key of a metafield to reference as the display name for objects of this type.
     */
    public Builder displayNameKey(String displayNameKey) {
      this.displayNameKey = displayNameKey;
      return this;
    }

    /**
     * Whether the field order should be reset while updating.
     * If `true`, then the order is assigned based on submitted fields followed by alphabetized field omissions.
     * If `false`, then no changes are made to the existing field order and new fields are appended at the end.
     */
    public Builder resetFieldOrder(Boolean resetFieldOrder) {
      this.resetFieldOrder = resetFieldOrder;
      return this;
    }

    /**
     * The capabilities of the metaobject definition.
     */
    public Builder capabilities(MetaobjectCapabilityUpdateInput capabilities) {
      this.capabilities = capabilities;
      return this;
    }
  }
}
