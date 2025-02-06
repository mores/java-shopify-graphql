package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Standard metafield definition templates provide preset configurations to create metafield definitions.
 * Each template has a specific namespace and key that we've reserved to have specific meanings for common use cases.
 *
 * Refer to the [list of standard metafield definitions](https://shopify.dev/apps/metafields/definitions/standard-definitions).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class StandardMetafieldDefinitionTemplate implements com.shopify.types.Node {
  /**
   * The description of the standard metafield definition.
   */
  private String description;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The key owned by the definition after the definition has been activated.
   */
  private String key;

  /**
   * The human-readable name for the standard metafield definition.
   */
  private String name;

  /**
   * The namespace owned by the definition after the definition has been activated.
   */
  private String namespace;

  /**
   * The list of resource types that the standard metafield definition can be applied to.
   */
  private List<MetafieldOwnerType> ownerTypes;

  /**
   * The associated [metafield definition
   * type](https://shopify.dev/apps/metafields/definitions/types) that the
   * metafield stores.
   */
  private MetafieldDefinitionType type;

  /**
   * The configured validations for the standard metafield definition.
   */
  private List<MetafieldDefinitionValidation> validations;

  /**
   * Whether metafields for the definition are by default visible using the Storefront API.
   */
  private boolean visibleToStorefrontApi;

  public StandardMetafieldDefinitionTemplate() {
  }

  /**
   * The description of the standard metafield definition.
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
   * The key owned by the definition after the definition has been activated.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The human-readable name for the standard metafield definition.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The namespace owned by the definition after the definition has been activated.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * The list of resource types that the standard metafield definition can be applied to.
   */
  public List<MetafieldOwnerType> getOwnerTypes() {
    return ownerTypes;
  }

  public void setOwnerTypes(List<MetafieldOwnerType> ownerTypes) {
    this.ownerTypes = ownerTypes;
  }

  /**
   * The associated [metafield definition
   * type](https://shopify.dev/apps/metafields/definitions/types) that the
   * metafield stores.
   */
  public MetafieldDefinitionType getType() {
    return type;
  }

  public void setType(MetafieldDefinitionType type) {
    this.type = type;
  }

  /**
   * The configured validations for the standard metafield definition.
   */
  public List<MetafieldDefinitionValidation> getValidations() {
    return validations;
  }

  public void setValidations(List<MetafieldDefinitionValidation> validations) {
    this.validations = validations;
  }

  /**
   * Whether metafields for the definition are by default visible using the Storefront API.
   */
  public boolean getVisibleToStorefrontApi() {
    return visibleToStorefrontApi;
  }

  public void setVisibleToStorefrontApi(boolean visibleToStorefrontApi) {
    this.visibleToStorefrontApi = visibleToStorefrontApi;
  }

  @Override
  public String toString() {
    return "StandardMetafieldDefinitionTemplate{description='" + description + "', id='" + id + "', key='" + key + "', name='" + name + "', namespace='" + namespace + "', ownerTypes='" + ownerTypes + "', type='" + type + "', validations='" + validations + "', visibleToStorefrontApi='" + visibleToStorefrontApi + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StandardMetafieldDefinitionTemplate that = (StandardMetafieldDefinitionTemplate) o;
    return Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(key, that.key) &&
        Objects.equals(name, that.name) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(ownerTypes, that.ownerTypes) &&
        Objects.equals(type, that.type) &&
        Objects.equals(validations, that.validations) &&
        visibleToStorefrontApi == that.visibleToStorefrontApi;
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, key, name, namespace, ownerTypes, type, validations, visibleToStorefrontApi);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The description of the standard metafield definition.
     */
    private String description;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The key owned by the definition after the definition has been activated.
     */
    private String key;

    /**
     * The human-readable name for the standard metafield definition.
     */
    private String name;

    /**
     * The namespace owned by the definition after the definition has been activated.
     */
    private String namespace;

    /**
     * The list of resource types that the standard metafield definition can be applied to.
     */
    private List<MetafieldOwnerType> ownerTypes;

    /**
     * The associated [metafield definition
     * type](https://shopify.dev/apps/metafields/definitions/types) that the
     * metafield stores.
     */
    private MetafieldDefinitionType type;

    /**
     * The configured validations for the standard metafield definition.
     */
    private List<MetafieldDefinitionValidation> validations;

    /**
     * Whether metafields for the definition are by default visible using the Storefront API.
     */
    private boolean visibleToStorefrontApi;

    public StandardMetafieldDefinitionTemplate build() {
      StandardMetafieldDefinitionTemplate result = new StandardMetafieldDefinitionTemplate();
      result.description = this.description;
      result.id = this.id;
      result.key = this.key;
      result.name = this.name;
      result.namespace = this.namespace;
      result.ownerTypes = this.ownerTypes;
      result.type = this.type;
      result.validations = this.validations;
      result.visibleToStorefrontApi = this.visibleToStorefrontApi;
      return result;
    }

    /**
     * The description of the standard metafield definition.
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
     * The key owned by the definition after the definition has been activated.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The human-readable name for the standard metafield definition.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The namespace owned by the definition after the definition has been activated.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    /**
     * The list of resource types that the standard metafield definition can be applied to.
     */
    public Builder ownerTypes(List<MetafieldOwnerType> ownerTypes) {
      this.ownerTypes = ownerTypes;
      return this;
    }

    /**
     * The associated [metafield definition
     * type](https://shopify.dev/apps/metafields/definitions/types) that the
     * metafield stores.
     */
    public Builder type(MetafieldDefinitionType type) {
      this.type = type;
      return this;
    }

    /**
     * The configured validations for the standard metafield definition.
     */
    public Builder validations(List<MetafieldDefinitionValidation> validations) {
      this.validations = validations;
      return this;
    }

    /**
     * Whether metafields for the definition are by default visible using the Storefront API.
     */
    public Builder visibleToStorefrontApi(boolean visibleToStorefrontApi) {
      this.visibleToStorefrontApi = visibleToStorefrontApi;
      return this;
    }
  }
}
