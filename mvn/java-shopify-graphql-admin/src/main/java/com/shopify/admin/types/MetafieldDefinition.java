package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Metafield definitions enable you to define additional validation constraints for metafields, and enable the
 * merchant to edit metafield values in context.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MetafieldDefinition implements com.shopify.admin.types.Node {
  /**
   * The access settings associated with the metafield definition.
   */
  private MetafieldAccess access;

  /**
   * The capabilities of the metafield definition.
   */
  private MetafieldCapabilities capabilities;

  /**
   * The [constraints](https://shopify.dev/apps/build/custom-data/metafields/conditional-metafield-definitions)
   * that determine what subtypes of resources a metafield definition applies to.
   */
  private MetafieldDefinitionConstraints constraints;

  /**
   * The description of the metafield definition.
   */
  private String description;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The unique identifier for the metafield definition within its namespace.
   */
  private String key;

  /**
   * The metafields that belong to the metafield definition.
   */
  private MetafieldConnection metafields;

  /**
   * The count of the metafields that belong to the metafield definition.
   */
  private int metafieldsCount;

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
   * The position of the metafield definition in the pinned list.
   */
  private Integer pinnedPosition;

  /**
   * The standard metafield definition template associated with the metafield definition.
   */
  private StandardMetafieldDefinitionTemplate standardTemplate;

  /**
   * The type of data that each of the metafields that belong to the metafield definition will store.
   * Refer to the list of [supported types](https://shopify.dev/apps/metafields/types).
   */
  private MetafieldDefinitionType type;

  /**
   * Whether the metafield definition can be used as a collection condition.
   */
  private boolean useAsCollectionCondition;

  /**
   * The validation status for the metafields that belong to the metafield definition.
   */
  private MetafieldDefinitionValidationStatus validationStatus;

  /**
   * A list of [validation options](https://shopify.dev/apps/metafields/definitions/validation) for
   * the metafields that belong to the metafield definition. For example, for a metafield definition with the
   * type `date`, you can set a minimum date validation so that each of the metafields that belong to it can only
   * store dates after the specified minimum.
   */
  private List<MetafieldDefinitionValidation> validations;

  public MetafieldDefinition() {
  }

  /**
   * The access settings associated with the metafield definition.
   */
  public MetafieldAccess getAccess() {
    return access;
  }

  public void setAccess(MetafieldAccess access) {
    this.access = access;
  }

  /**
   * The capabilities of the metafield definition.
   */
  public MetafieldCapabilities getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(MetafieldCapabilities capabilities) {
    this.capabilities = capabilities;
  }

  /**
   * The [constraints](https://shopify.dev/apps/build/custom-data/metafields/conditional-metafield-definitions)
   * that determine what subtypes of resources a metafield definition applies to.
   */
  public MetafieldDefinitionConstraints getConstraints() {
    return constraints;
  }

  public void setConstraints(MetafieldDefinitionConstraints constraints) {
    this.constraints = constraints;
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
   * A globally-unique ID.
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
   * The metafields that belong to the metafield definition.
   */
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  /**
   * The count of the metafields that belong to the metafield definition.
   */
  public int getMetafieldsCount() {
    return metafieldsCount;
  }

  public void setMetafieldsCount(int metafieldsCount) {
    this.metafieldsCount = metafieldsCount;
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
   * The position of the metafield definition in the pinned list.
   */
  public Integer getPinnedPosition() {
    return pinnedPosition;
  }

  public void setPinnedPosition(Integer pinnedPosition) {
    this.pinnedPosition = pinnedPosition;
  }

  /**
   * The standard metafield definition template associated with the metafield definition.
   */
  public StandardMetafieldDefinitionTemplate getStandardTemplate() {
    return standardTemplate;
  }

  public void setStandardTemplate(StandardMetafieldDefinitionTemplate standardTemplate) {
    this.standardTemplate = standardTemplate;
  }

  /**
   * The type of data that each of the metafields that belong to the metafield definition will store.
   * Refer to the list of [supported types](https://shopify.dev/apps/metafields/types).
   */
  public MetafieldDefinitionType getType() {
    return type;
  }

  public void setType(MetafieldDefinitionType type) {
    this.type = type;
  }

  /**
   * Whether the metafield definition can be used as a collection condition.
   */
  public boolean getUseAsCollectionCondition() {
    return useAsCollectionCondition;
  }

  public void setUseAsCollectionCondition(boolean useAsCollectionCondition) {
    this.useAsCollectionCondition = useAsCollectionCondition;
  }

  /**
   * The validation status for the metafields that belong to the metafield definition.
   */
  public MetafieldDefinitionValidationStatus getValidationStatus() {
    return validationStatus;
  }

  public void setValidationStatus(MetafieldDefinitionValidationStatus validationStatus) {
    this.validationStatus = validationStatus;
  }

  /**
   * A list of [validation options](https://shopify.dev/apps/metafields/definitions/validation) for
   * the metafields that belong to the metafield definition. For example, for a metafield definition with the
   * type `date`, you can set a minimum date validation so that each of the metafields that belong to it can only
   * store dates after the specified minimum.
   */
  public List<MetafieldDefinitionValidation> getValidations() {
    return validations;
  }

  public void setValidations(List<MetafieldDefinitionValidation> validations) {
    this.validations = validations;
  }

  @Override
  public String toString() {
    return "MetafieldDefinition{access='" + access + "', capabilities='" + capabilities + "', constraints='" + constraints + "', description='" + description + "', id='" + id + "', key='" + key + "', metafields='" + metafields + "', metafieldsCount='" + metafieldsCount + "', name='" + name + "', namespace='" + namespace + "', ownerType='" + ownerType + "', pinnedPosition='" + pinnedPosition + "', standardTemplate='" + standardTemplate + "', type='" + type + "', useAsCollectionCondition='" + useAsCollectionCondition + "', validationStatus='" + validationStatus + "', validations='" + validations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinition that = (MetafieldDefinition) o;
    return Objects.equals(access, that.access) &&
        Objects.equals(capabilities, that.capabilities) &&
        Objects.equals(constraints, that.constraints) &&
        Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(key, that.key) &&
        Objects.equals(metafields, that.metafields) &&
        metafieldsCount == that.metafieldsCount &&
        Objects.equals(name, that.name) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(ownerType, that.ownerType) &&
        Objects.equals(pinnedPosition, that.pinnedPosition) &&
        Objects.equals(standardTemplate, that.standardTemplate) &&
        Objects.equals(type, that.type) &&
        useAsCollectionCondition == that.useAsCollectionCondition &&
        Objects.equals(validationStatus, that.validationStatus) &&
        Objects.equals(validations, that.validations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, capabilities, constraints, description, id, key, metafields, metafieldsCount, name, namespace, ownerType, pinnedPosition, standardTemplate, type, useAsCollectionCondition, validationStatus, validations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The access settings associated with the metafield definition.
     */
    private MetafieldAccess access;

    /**
     * The capabilities of the metafield definition.
     */
    private MetafieldCapabilities capabilities;

    /**
     * The [constraints](https://shopify.dev/apps/build/custom-data/metafields/conditional-metafield-definitions)
     * that determine what subtypes of resources a metafield definition applies to.
     */
    private MetafieldDefinitionConstraints constraints;

    /**
     * The description of the metafield definition.
     */
    private String description;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The unique identifier for the metafield definition within its namespace.
     */
    private String key;

    /**
     * The metafields that belong to the metafield definition.
     */
    private MetafieldConnection metafields;

    /**
     * The count of the metafields that belong to the metafield definition.
     */
    private int metafieldsCount;

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
     * The position of the metafield definition in the pinned list.
     */
    private Integer pinnedPosition;

    /**
     * The standard metafield definition template associated with the metafield definition.
     */
    private StandardMetafieldDefinitionTemplate standardTemplate;

    /**
     * The type of data that each of the metafields that belong to the metafield definition will store.
     * Refer to the list of [supported types](https://shopify.dev/apps/metafields/types).
     */
    private MetafieldDefinitionType type;

    /**
     * Whether the metafield definition can be used as a collection condition.
     */
    private boolean useAsCollectionCondition;

    /**
     * The validation status for the metafields that belong to the metafield definition.
     */
    private MetafieldDefinitionValidationStatus validationStatus;

    /**
     * A list of [validation options](https://shopify.dev/apps/metafields/definitions/validation) for
     * the metafields that belong to the metafield definition. For example, for a metafield definition with the
     * type `date`, you can set a minimum date validation so that each of the metafields that belong to it can only
     * store dates after the specified minimum.
     */
    private List<MetafieldDefinitionValidation> validations;

    public MetafieldDefinition build() {
      MetafieldDefinition result = new MetafieldDefinition();
      result.access = this.access;
      result.capabilities = this.capabilities;
      result.constraints = this.constraints;
      result.description = this.description;
      result.id = this.id;
      result.key = this.key;
      result.metafields = this.metafields;
      result.metafieldsCount = this.metafieldsCount;
      result.name = this.name;
      result.namespace = this.namespace;
      result.ownerType = this.ownerType;
      result.pinnedPosition = this.pinnedPosition;
      result.standardTemplate = this.standardTemplate;
      result.type = this.type;
      result.useAsCollectionCondition = this.useAsCollectionCondition;
      result.validationStatus = this.validationStatus;
      result.validations = this.validations;
      return result;
    }

    /**
     * The access settings associated with the metafield definition.
     */
    public Builder access(MetafieldAccess access) {
      this.access = access;
      return this;
    }

    /**
     * The capabilities of the metafield definition.
     */
    public Builder capabilities(MetafieldCapabilities capabilities) {
      this.capabilities = capabilities;
      return this;
    }

    /**
     * The [constraints](https://shopify.dev/apps/build/custom-data/metafields/conditional-metafield-definitions)
     * that determine what subtypes of resources a metafield definition applies to.
     */
    public Builder constraints(MetafieldDefinitionConstraints constraints) {
      this.constraints = constraints;
      return this;
    }

    /**
     * The description of the metafield definition.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * A globally-unique ID.
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
     * The metafields that belong to the metafield definition.
     */
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The count of the metafields that belong to the metafield definition.
     */
    public Builder metafieldsCount(int metafieldsCount) {
      this.metafieldsCount = metafieldsCount;
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
     * The position of the metafield definition in the pinned list.
     */
    public Builder pinnedPosition(Integer pinnedPosition) {
      this.pinnedPosition = pinnedPosition;
      return this;
    }

    /**
     * The standard metafield definition template associated with the metafield definition.
     */
    public Builder standardTemplate(StandardMetafieldDefinitionTemplate standardTemplate) {
      this.standardTemplate = standardTemplate;
      return this;
    }

    /**
     * The type of data that each of the metafields that belong to the metafield definition will store.
     * Refer to the list of [supported types](https://shopify.dev/apps/metafields/types).
     */
    public Builder type(MetafieldDefinitionType type) {
      this.type = type;
      return this;
    }

    /**
     * Whether the metafield definition can be used as a collection condition.
     */
    public Builder useAsCollectionCondition(boolean useAsCollectionCondition) {
      this.useAsCollectionCondition = useAsCollectionCondition;
      return this;
    }

    /**
     * The validation status for the metafields that belong to the metafield definition.
     */
    public Builder validationStatus(MetafieldDefinitionValidationStatus validationStatus) {
      this.validationStatus = validationStatus;
      return this;
    }

    /**
     * A list of [validation options](https://shopify.dev/apps/metafields/definitions/validation) for
     * the metafields that belong to the metafield definition. For example, for a metafield definition with the
     * type `date`, you can set a minimum date validation so that each of the metafields that belong to it can only
     * store dates after the specified minimum.
     */
    public Builder validations(List<MetafieldDefinitionValidation> validations) {
      this.validations = validations;
      return this;
    }
  }
}
