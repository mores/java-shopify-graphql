package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A preset field definition on a standard metaobject definition template.
 */
public class StandardMetaobjectDefinitionFieldTemplate {
  /**
   * The administrative description.
   */
  private String description;

  /**
   * The key owned by the definition after the definition has been enabled.
   */
  private String key;

  /**
   * The human-readable name.
   */
  private String name;

  /**
   * The required status of the field within the object composition.
   */
  private boolean required;

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

  public StandardMetaobjectDefinitionFieldTemplate() {
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
   * The key owned by the definition after the definition has been enabled.
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
   * The required status of the field within the object composition.
   */
  public boolean getRequired() {
    return required;
  }

  public void setRequired(boolean required) {
    this.required = required;
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
    return "StandardMetaobjectDefinitionFieldTemplate{description='" + description + "', key='" + key + "', name='" + name + "', required='" + required + "', type='" + type + "', validations='" + validations + "', visibleToStorefrontApi='" + visibleToStorefrontApi + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StandardMetaobjectDefinitionFieldTemplate that = (StandardMetaobjectDefinitionFieldTemplate) o;
    return Objects.equals(description, that.description) &&
        Objects.equals(key, that.key) &&
        Objects.equals(name, that.name) &&
        required == that.required &&
        Objects.equals(type, that.type) &&
        Objects.equals(validations, that.validations) &&
        visibleToStorefrontApi == that.visibleToStorefrontApi;
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, key, name, required, type, validations, visibleToStorefrontApi);
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
     * The key owned by the definition after the definition has been enabled.
     */
    private String key;

    /**
     * The human-readable name.
     */
    private String name;

    /**
     * The required status of the field within the object composition.
     */
    private boolean required;

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

    public StandardMetaobjectDefinitionFieldTemplate build() {
      StandardMetaobjectDefinitionFieldTemplate result = new StandardMetaobjectDefinitionFieldTemplate();
      result.description = this.description;
      result.key = this.key;
      result.name = this.name;
      result.required = this.required;
      result.type = this.type;
      result.validations = this.validations;
      result.visibleToStorefrontApi = this.visibleToStorefrontApi;
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
     * The key owned by the definition after the definition has been enabled.
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
     * The required status of the field within the object composition.
     */
    public Builder required(boolean required) {
      this.required = required;
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
