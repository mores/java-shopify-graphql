package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A metaobject-reference metafield definition usable as a collection condition.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CollectionConditionMetaobjectMetafieldDefinition implements com.shopify.admin.types.CollectionConditionMetafieldDefinitionInterface {
  /**
   * The description of the metafield definition.
   */
  private String description;

  /**
   * The ID of the underlying metafield definition.
   */
  private String id;

  /**
   * The unique identifier for the metafield definition within its namespace.
   */
  private String key;

  /**
   * The metaobject definition referenced by this metafield definition.
   */
  private MetaobjectDefinition metaobjectDefinition;

  /**
   * The human-readable name of the metafield definition.
   */
  private String name;

  /**
   * The container for a group of metafields that the metafield definition is associated with.
   */
  private String namespace;

  /**
   * The resource type that the metafield definition is attached to.
   */
  private MetafieldOwnerType ownerType;

  /**
   * The data type of the metafield definition.
   */
  private MetafieldDefinitionType type;

  /**
   * A list of validation options for the metafields that belong to the metafield definition.
   */
  private List<MetafieldDefinitionValidation> validations;

  public CollectionConditionMetaobjectMetafieldDefinition() {
  }

  /**
   * The description of the metafield definition.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The ID of the underlying metafield definition.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The unique identifier for the metafield definition within its namespace.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The metaobject definition referenced by this metafield definition.
   */
  public MetaobjectDefinition getMetaobjectDefinition() {
    return metaobjectDefinition;
  }

  public void setMetaobjectDefinition(MetaobjectDefinition metaobjectDefinition) {
    this.metaobjectDefinition = metaobjectDefinition;
  }

  /**
   * The human-readable name of the metafield definition.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The container for a group of metafields that the metafield definition is associated with.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * The resource type that the metafield definition is attached to.
   */
  public MetafieldOwnerType getOwnerType() {
    return ownerType;
  }

  public void setOwnerType(MetafieldOwnerType ownerType) {
    this.ownerType = ownerType;
  }

  /**
   * The data type of the metafield definition.
   */
  public MetafieldDefinitionType getType() {
    return type;
  }

  public void setType(MetafieldDefinitionType type) {
    this.type = type;
  }

  /**
   * A list of validation options for the metafields that belong to the metafield definition.
   */
  public List<MetafieldDefinitionValidation> getValidations() {
    return validations;
  }

  public void setValidations(List<MetafieldDefinitionValidation> validations) {
    this.validations = validations;
  }

  @Override
  public String toString() {
    return "CollectionConditionMetaobjectMetafieldDefinition{description='" + description + "', id='" + id + "', key='" + key + "', metaobjectDefinition='" + metaobjectDefinition + "', name='" + name + "', namespace='" + namespace + "', ownerType='" + ownerType + "', type='" + type + "', validations='" + validations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionConditionMetaobjectMetafieldDefinition that = (CollectionConditionMetaobjectMetafieldDefinition) o;
    return Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(key, that.key) &&
        Objects.equals(metaobjectDefinition, that.metaobjectDefinition) &&
        Objects.equals(name, that.name) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(ownerType, that.ownerType) &&
        Objects.equals(type, that.type) &&
        Objects.equals(validations, that.validations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, key, metaobjectDefinition, name, namespace, ownerType, type, validations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The description of the metafield definition.
     */
    private String description;

    /**
     * The ID of the underlying metafield definition.
     */
    private String id;

    /**
     * The unique identifier for the metafield definition within its namespace.
     */
    private String key;

    /**
     * The metaobject definition referenced by this metafield definition.
     */
    private MetaobjectDefinition metaobjectDefinition;

    /**
     * The human-readable name of the metafield definition.
     */
    private String name;

    /**
     * The container for a group of metafields that the metafield definition is associated with.
     */
    private String namespace;

    /**
     * The resource type that the metafield definition is attached to.
     */
    private MetafieldOwnerType ownerType;

    /**
     * The data type of the metafield definition.
     */
    private MetafieldDefinitionType type;

    /**
     * A list of validation options for the metafields that belong to the metafield definition.
     */
    private List<MetafieldDefinitionValidation> validations;

    public CollectionConditionMetaobjectMetafieldDefinition build() {
      CollectionConditionMetaobjectMetafieldDefinition result = new CollectionConditionMetaobjectMetafieldDefinition();
      result.description = this.description;
      result.id = this.id;
      result.key = this.key;
      result.metaobjectDefinition = this.metaobjectDefinition;
      result.name = this.name;
      result.namespace = this.namespace;
      result.ownerType = this.ownerType;
      result.type = this.type;
      result.validations = this.validations;
      return result;
    }

    /**
     * The description of the metafield definition.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The ID of the underlying metafield definition.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The unique identifier for the metafield definition within its namespace.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The metaobject definition referenced by this metafield definition.
     */
    public Builder metaobjectDefinition(MetaobjectDefinition metaobjectDefinition) {
      this.metaobjectDefinition = metaobjectDefinition;
      return this;
    }

    /**
     * The human-readable name of the metafield definition.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The container for a group of metafields that the metafield definition is associated with.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    /**
     * The resource type that the metafield definition is attached to.
     */
    public Builder ownerType(MetafieldOwnerType ownerType) {
      this.ownerType = ownerType;
      return this;
    }

    /**
     * The data type of the metafield definition.
     */
    public Builder type(MetafieldDefinitionType type) {
      this.type = type;
      return this;
    }

    /**
     * A list of validation options for the metafields that belong to the metafield definition.
     */
    public Builder validations(List<MetafieldDefinitionValidation> validations) {
      this.validations = validations;
      return this;
    }
  }
}
