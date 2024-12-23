package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A checkout server side validation installed on the shop.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Validation implements com.shopify.types.HasMetafieldDefinitions, com.shopify.types.HasMetafields, com.shopify.types.Node {
  /**
   * Whether the validation should block on failures other than expected violations.
   */
  private boolean blockOnFailure;

  /**
   * Whether the validation is enabled on the merchant checkout.
   */
  private boolean enabled;

  /**
   * The error history on the most recent version of the validation function.
   */
  private FunctionsErrorHistory errorHistory;

  /**
   * Global ID for the validation.
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
   * Returns a private metafield by namespace and key that belongs to the resource.
   */
  private PrivateMetafield privateMetafield;

  /**
   * List of private metafields that belong to the resource.
   */
  private PrivateMetafieldConnection privateMetafields;

  /**
   * The Shopify Function implementing the validation.
   */
  private ShopifyFunction shopifyFunction;

  /**
   * The merchant-facing validation name.
   */
  private String title;

  public Validation() {
  }

  /**
   * Whether the validation should block on failures other than expected violations.
   */
  public boolean getBlockOnFailure() {
    return blockOnFailure;
  }

  public void setBlockOnFailure(boolean blockOnFailure) {
    this.blockOnFailure = blockOnFailure;
  }

  /**
   * Whether the validation is enabled on the merchant checkout.
   */
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * The error history on the most recent version of the validation function.
   */
  public FunctionsErrorHistory getErrorHistory() {
    return errorHistory;
  }

  public void setErrorHistory(FunctionsErrorHistory errorHistory) {
    this.errorHistory = errorHistory;
  }

  /**
   * Global ID for the validation.
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
   * Returns a private metafield by namespace and key that belongs to the resource.
   */
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  /**
   * List of private metafields that belong to the resource.
   */
  public PrivateMetafieldConnection getPrivateMetafields() {
    return privateMetafields;
  }

  public void setPrivateMetafields(PrivateMetafieldConnection privateMetafields) {
    this.privateMetafields = privateMetafields;
  }

  /**
   * The Shopify Function implementing the validation.
   */
  public ShopifyFunction getShopifyFunction() {
    return shopifyFunction;
  }

  public void setShopifyFunction(ShopifyFunction shopifyFunction) {
    this.shopifyFunction = shopifyFunction;
  }

  /**
   * The merchant-facing validation name.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "Validation{blockOnFailure='" + blockOnFailure + "', enabled='" + enabled + "', errorHistory='" + errorHistory + "', id='" + id + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', shopifyFunction='" + shopifyFunction + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Validation that = (Validation) o;
    return blockOnFailure == that.blockOnFailure &&
        enabled == that.enabled &&
        Objects.equals(errorHistory, that.errorHistory) &&
        Objects.equals(id, that.id) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
        Objects.equals(shopifyFunction, that.shopifyFunction) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockOnFailure, enabled, errorHistory, id, metafield, metafieldDefinitions, metafields, privateMetafield, privateMetafields, shopifyFunction, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the validation should block on failures other than expected violations.
     */
    private boolean blockOnFailure;

    /**
     * Whether the validation is enabled on the merchant checkout.
     */
    private boolean enabled;

    /**
     * The error history on the most recent version of the validation function.
     */
    private FunctionsErrorHistory errorHistory;

    /**
     * Global ID for the validation.
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
     * Returns a private metafield by namespace and key that belongs to the resource.
     */
    private PrivateMetafield privateMetafield;

    /**
     * List of private metafields that belong to the resource.
     */
    private PrivateMetafieldConnection privateMetafields;

    /**
     * The Shopify Function implementing the validation.
     */
    private ShopifyFunction shopifyFunction;

    /**
     * The merchant-facing validation name.
     */
    private String title;

    public Validation build() {
      Validation result = new Validation();
      result.blockOnFailure = this.blockOnFailure;
      result.enabled = this.enabled;
      result.errorHistory = this.errorHistory;
      result.id = this.id;
      result.metafield = this.metafield;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafields = this.metafields;
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
      result.shopifyFunction = this.shopifyFunction;
      result.title = this.title;
      return result;
    }

    /**
     * Whether the validation should block on failures other than expected violations.
     */
    public Builder blockOnFailure(boolean blockOnFailure) {
      this.blockOnFailure = blockOnFailure;
      return this;
    }

    /**
     * Whether the validation is enabled on the merchant checkout.
     */
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * The error history on the most recent version of the validation function.
     */
    public Builder errorHistory(FunctionsErrorHistory errorHistory) {
      this.errorHistory = errorHistory;
      return this;
    }

    /**
     * Global ID for the validation.
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
     * Returns a private metafield by namespace and key that belongs to the resource.
     */
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    /**
     * List of private metafields that belong to the resource.
     */
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }

    /**
     * The Shopify Function implementing the validation.
     */
    public Builder shopifyFunction(ShopifyFunction shopifyFunction) {
      this.shopifyFunction = shopifyFunction;
      return this;
    }

    /**
     * The merchant-facing validation name.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
