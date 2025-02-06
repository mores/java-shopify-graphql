package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A delivery customization.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryCustomization implements MetafieldReferencer, com.shopify.types.HasMetafieldDefinitions, com.shopify.types.HasMetafields, com.shopify.types.Node {
  /**
   * The enabled status of the delivery customization.
   */
  private boolean enabled;

  /**
   * The error history on the most recent version of the delivery customization.
   */
  private FunctionsErrorHistory errorHistory;

  /**
   * The ID of the Shopify Function implementing the delivery customization.
   */
  private String functionId;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * List of metafield definitions.
   */
  private MetafieldDefinitionConnection metafieldDefinitions;

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  private MetafieldConnection metafields;

  /**
   * The Shopify Function implementing the delivery customization.
   */
  private ShopifyFunction shopifyFunction;

  /**
   * The title of the delivery customization.
   */
  private String title;

  public DeliveryCustomization() {
  }

  /**
   * The enabled status of the delivery customization.
   */
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * The error history on the most recent version of the delivery customization.
   */
  public FunctionsErrorHistory getErrorHistory() {
    return errorHistory;
  }

  public void setErrorHistory(FunctionsErrorHistory errorHistory) {
    this.errorHistory = errorHistory;
  }

  /**
   * The ID of the Shopify Function implementing the delivery customization.
   */
  public String getFunctionId() {
    return functionId;
  }

  public void setFunctionId(String functionId) {
    this.functionId = functionId;
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
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * List of metafield definitions.
   */
  public MetafieldDefinitionConnection getMetafieldDefinitions() {
    return metafieldDefinitions;
  }

  public void setMetafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
    this.metafieldDefinitions = metafieldDefinitions;
  }

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  /**
   * The Shopify Function implementing the delivery customization.
   */
  public ShopifyFunction getShopifyFunction() {
    return shopifyFunction;
  }

  public void setShopifyFunction(ShopifyFunction shopifyFunction) {
    this.shopifyFunction = shopifyFunction;
  }

  /**
   * The title of the delivery customization.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "DeliveryCustomization{enabled='" + enabled + "', errorHistory='" + errorHistory + "', functionId='" + functionId + "', id='" + id + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', shopifyFunction='" + shopifyFunction + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCustomization that = (DeliveryCustomization) o;
    return enabled == that.enabled &&
        Objects.equals(errorHistory, that.errorHistory) &&
        Objects.equals(functionId, that.functionId) &&
        Objects.equals(id, that.id) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(shopifyFunction, that.shopifyFunction) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, errorHistory, functionId, id, metafield, metafieldDefinitions, metafields, shopifyFunction, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The enabled status of the delivery customization.
     */
    private boolean enabled;

    /**
     * The error history on the most recent version of the delivery customization.
     */
    private FunctionsErrorHistory errorHistory;

    /**
     * The ID of the Shopify Function implementing the delivery customization.
     */
    private String functionId;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * List of metafield definitions.
     */
    private MetafieldDefinitionConnection metafieldDefinitions;

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    private MetafieldConnection metafields;

    /**
     * The Shopify Function implementing the delivery customization.
     */
    private ShopifyFunction shopifyFunction;

    /**
     * The title of the delivery customization.
     */
    private String title;

    public DeliveryCustomization build() {
      DeliveryCustomization result = new DeliveryCustomization();
      result.enabled = this.enabled;
      result.errorHistory = this.errorHistory;
      result.functionId = this.functionId;
      result.id = this.id;
      result.metafield = this.metafield;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafields = this.metafields;
      result.shopifyFunction = this.shopifyFunction;
      result.title = this.title;
      return result;
    }

    /**
     * The enabled status of the delivery customization.
     */
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * The error history on the most recent version of the delivery customization.
     */
    public Builder errorHistory(FunctionsErrorHistory errorHistory) {
      this.errorHistory = errorHistory;
      return this;
    }

    /**
     * The ID of the Shopify Function implementing the delivery customization.
     */
    public Builder functionId(String functionId) {
      this.functionId = functionId;
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
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * List of metafield definitions.
     */
    public Builder metafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
      this.metafieldDefinitions = metafieldDefinitions;
      return this;
    }

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The Shopify Function implementing the delivery customization.
     */
    public Builder shopifyFunction(ShopifyFunction shopifyFunction) {
      this.shopifyFunction = shopifyFunction;
      return this;
    }

    /**
     * The title of the delivery customization.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
