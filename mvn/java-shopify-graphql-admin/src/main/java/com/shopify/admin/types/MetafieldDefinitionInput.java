package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to create a metafield definition.
 */
public class MetafieldDefinitionInput {
  /**
   * The container for a group of metafields that the metafield definition will be associated with. If omitted, the
   * app-reserved namespace will be used.
   *   
   * Must be 3-255 characters long and only contain alphanumeric, hyphen, and underscore characters.
   */
  private String namespace;

  /**
   * The unique identifier for the metafield definition within its namespace.
   *   
   * Must be 2-64 characters long and only contain alphanumeric, hyphen, and underscore characters.
   */
  private String key;

  /**
   * The human-readable name for the metafield definition.
   */
  private String name;

  /**
   * The description for the metafield definition.
   */
  private String description;

  /**
   * The resource type that the metafield definition is attached to.
   */
  private MetafieldOwnerType ownerType;

  /**
   * The type of data that each of the metafields that belong to the metafield definition will store.
   * Refer to the list of [supported types](https://shopify.dev/apps/metafields/types).
   */
  private String type;

  /**
   * A list of [validation options](https://shopify.dev/apps/metafields/definitions/validation) for
   * the metafields that belong to the metafield definition. For example, for a metafield definition with the
   * type `date`, you can set a minimum date validation so that each of the metafields that belong to it can only
   * store dates after the specified minimum.
   */
  private List<MetafieldDefinitionValidationInput> validations;

  /**
   * Whether to [pin](https://help.shopify.com/manual/custom-data/metafields/pinning-metafield-definitions)
   * the metafield definition.
   */
  private Boolean pin = false;

  /**
   * The access settings that apply to each of the metafields that belong to the metafield definition.
   */
  private MetafieldAccessInput access;

  /**
   * The [constraints](https://shopify.dev/apps/build/custom-data/metafields/conditional-metafield-definitions)
   * that determine what resources a metafield definition applies to.
   */
  private MetafieldDefinitionConstraintsInput constraints;

  /**
   * The capabilities of the metafield definition.
   */
  private MetafieldCapabilityCreateInput capabilities;

  public MetafieldDefinitionInput() {
  }

  /**
   * The container for a group of metafields that the metafield definition will be associated with. If omitted, the
   * app-reserved namespace will be used.
   *   
   * Must be 3-255 characters long and only contain alphanumeric, hyphen, and underscore characters.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * The unique identifier for the metafield definition within its namespace.
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
   * The human-readable name for the metafield definition.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The description for the metafield definition.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
   * The type of data that each of the metafields that belong to the metafield definition will store.
   * Refer to the list of [supported types](https://shopify.dev/apps/metafields/types).
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * A list of [validation options](https://shopify.dev/apps/metafields/definitions/validation) for
   * the metafields that belong to the metafield definition. For example, for a metafield definition with the
   * type `date`, you can set a minimum date validation so that each of the metafields that belong to it can only
   * store dates after the specified minimum.
   */
  public List<MetafieldDefinitionValidationInput> getValidations() {
    return validations;
  }

  public void setValidations(List<MetafieldDefinitionValidationInput> validations) {
    this.validations = validations;
  }

  /**
   * Whether to [pin](https://help.shopify.com/manual/custom-data/metafields/pinning-metafield-definitions)
   * the metafield definition.
   */
  public Boolean getPin() {
    return pin;
  }

  public void setPin(Boolean pin) {
    this.pin = pin;
  }

  /**
   * The access settings that apply to each of the metafields that belong to the metafield definition.
   */
  public MetafieldAccessInput getAccess() {
    return access;
  }

  public void setAccess(MetafieldAccessInput access) {
    this.access = access;
  }

  /**
   * The [constraints](https://shopify.dev/apps/build/custom-data/metafields/conditional-metafield-definitions)
   * that determine what resources a metafield definition applies to.
   */
  public MetafieldDefinitionConstraintsInput getConstraints() {
    return constraints;
  }

  public void setConstraints(MetafieldDefinitionConstraintsInput constraints) {
    this.constraints = constraints;
  }

  /**
   * The capabilities of the metafield definition.
   */
  public MetafieldCapabilityCreateInput getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(MetafieldCapabilityCreateInput capabilities) {
    this.capabilities = capabilities;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionInput{namespace='" + namespace + "', key='" + key + "', name='" + name + "', description='" + description + "', ownerType='" + ownerType + "', type='" + type + "', validations='" + validations + "', pin='" + pin + "', access='" + access + "', constraints='" + constraints + "', capabilities='" + capabilities + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionInput that = (MetafieldDefinitionInput) o;
    return Objects.equals(namespace, that.namespace) &&
        Objects.equals(key, that.key) &&
        Objects.equals(name, that.name) &&
        Objects.equals(description, that.description) &&
        Objects.equals(ownerType, that.ownerType) &&
        Objects.equals(type, that.type) &&
        Objects.equals(validations, that.validations) &&
        Objects.equals(pin, that.pin) &&
        Objects.equals(access, that.access) &&
        Objects.equals(constraints, that.constraints) &&
        Objects.equals(capabilities, that.capabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, key, name, description, ownerType, type, validations, pin, access, constraints, capabilities);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The container for a group of metafields that the metafield definition will be associated with. If omitted, the
     * app-reserved namespace will be used.
     *   
     * Must be 3-255 characters long and only contain alphanumeric, hyphen, and underscore characters.
     */
    private String namespace;

    /**
     * The unique identifier for the metafield definition within its namespace.
     *   
     * Must be 2-64 characters long and only contain alphanumeric, hyphen, and underscore characters.
     */
    private String key;

    /**
     * The human-readable name for the metafield definition.
     */
    private String name;

    /**
     * The description for the metafield definition.
     */
    private String description;

    /**
     * The resource type that the metafield definition is attached to.
     */
    private MetafieldOwnerType ownerType;

    /**
     * The type of data that each of the metafields that belong to the metafield definition will store.
     * Refer to the list of [supported types](https://shopify.dev/apps/metafields/types).
     */
    private String type;

    /**
     * A list of [validation options](https://shopify.dev/apps/metafields/definitions/validation) for
     * the metafields that belong to the metafield definition. For example, for a metafield definition with the
     * type `date`, you can set a minimum date validation so that each of the metafields that belong to it can only
     * store dates after the specified minimum.
     */
    private List<MetafieldDefinitionValidationInput> validations;

    /**
     * Whether to [pin](https://help.shopify.com/manual/custom-data/metafields/pinning-metafield-definitions)
     * the metafield definition.
     */
    private Boolean pin = false;

    /**
     * The access settings that apply to each of the metafields that belong to the metafield definition.
     */
    private MetafieldAccessInput access;

    /**
     * The [constraints](https://shopify.dev/apps/build/custom-data/metafields/conditional-metafield-definitions)
     * that determine what resources a metafield definition applies to.
     */
    private MetafieldDefinitionConstraintsInput constraints;

    /**
     * The capabilities of the metafield definition.
     */
    private MetafieldCapabilityCreateInput capabilities;

    public MetafieldDefinitionInput build() {
      MetafieldDefinitionInput result = new MetafieldDefinitionInput();
      result.namespace = this.namespace;
      result.key = this.key;
      result.name = this.name;
      result.description = this.description;
      result.ownerType = this.ownerType;
      result.type = this.type;
      result.validations = this.validations;
      result.pin = this.pin;
      result.access = this.access;
      result.constraints = this.constraints;
      result.capabilities = this.capabilities;
      return result;
    }

    /**
     * The container for a group of metafields that the metafield definition will be associated with. If omitted, the
     * app-reserved namespace will be used.
     *   
     * Must be 3-255 characters long and only contain alphanumeric, hyphen, and underscore characters.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    /**
     * The unique identifier for the metafield definition within its namespace.
     *   
     * Must be 2-64 characters long and only contain alphanumeric, hyphen, and underscore characters.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The human-readable name for the metafield definition.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The description for the metafield definition.
     */
    public Builder description(String description) {
      this.description = description;
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
     * The type of data that each of the metafields that belong to the metafield definition will store.
     * Refer to the list of [supported types](https://shopify.dev/apps/metafields/types).
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * A list of [validation options](https://shopify.dev/apps/metafields/definitions/validation) for
     * the metafields that belong to the metafield definition. For example, for a metafield definition with the
     * type `date`, you can set a minimum date validation so that each of the metafields that belong to it can only
     * store dates after the specified minimum.
     */
    public Builder validations(List<MetafieldDefinitionValidationInput> validations) {
      this.validations = validations;
      return this;
    }

    /**
     * Whether to [pin](https://help.shopify.com/manual/custom-data/metafields/pinning-metafield-definitions)
     * the metafield definition.
     */
    public Builder pin(Boolean pin) {
      this.pin = pin;
      return this;
    }

    /**
     * The access settings that apply to each of the metafields that belong to the metafield definition.
     */
    public Builder access(MetafieldAccessInput access) {
      this.access = access;
      return this;
    }

    /**
     * The [constraints](https://shopify.dev/apps/build/custom-data/metafields/conditional-metafield-definitions)
     * that determine what resources a metafield definition applies to.
     */
    public Builder constraints(MetafieldDefinitionConstraintsInput constraints) {
      this.constraints = constraints;
      return this;
    }

    /**
     * The capabilities of the metafield definition.
     */
    public Builder capabilities(MetafieldCapabilityCreateInput capabilities) {
      this.capabilities = capabilities;
      return this;
    }
  }
}
