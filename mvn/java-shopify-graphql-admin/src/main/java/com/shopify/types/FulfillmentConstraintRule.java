package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A fulfillment constraint rule.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class FulfillmentConstraintRule implements com.shopify.types.HasMetafields, com.shopify.types.Node {
  /**
   * Delivery method types that the function is associated with.
   */
  private List<DeliveryMethodType> deliveryMethodTypes;

  /**
   * The ID for the fulfillment constraint function.
   */
  private ShopifyFunction function;

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
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  private MetafieldConnection metafields;

  public FulfillmentConstraintRule() {
  }

  /**
   * Delivery method types that the function is associated with.
   */
  public List<DeliveryMethodType> getDeliveryMethodTypes() {
    return deliveryMethodTypes;
  }

  public void setDeliveryMethodTypes(List<DeliveryMethodType> deliveryMethodTypes) {
    this.deliveryMethodTypes = deliveryMethodTypes;
  }

  /**
   * The ID for the fulfillment constraint function.
   */
  public ShopifyFunction getFunction() {
    return function;
  }

  public void setFunction(ShopifyFunction function) {
    this.function = function;
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
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  @Override
  public String toString() {
    return "FulfillmentConstraintRule{deliveryMethodTypes='" + deliveryMethodTypes + "', function='" + function + "', id='" + id + "', metafield='" + metafield + "', metafields='" + metafields + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentConstraintRule that = (FulfillmentConstraintRule) o;
    return Objects.equals(deliveryMethodTypes, that.deliveryMethodTypes) &&
        Objects.equals(function, that.function) &&
        Objects.equals(id, that.id) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryMethodTypes, function, id, metafield, metafields);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Delivery method types that the function is associated with.
     */
    private List<DeliveryMethodType> deliveryMethodTypes;

    /**
     * The ID for the fulfillment constraint function.
     */
    private ShopifyFunction function;

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
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    private MetafieldConnection metafields;

    public FulfillmentConstraintRule build() {
      FulfillmentConstraintRule result = new FulfillmentConstraintRule();
      result.deliveryMethodTypes = this.deliveryMethodTypes;
      result.function = this.function;
      result.id = this.id;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      return result;
    }

    /**
     * Delivery method types that the function is associated with.
     */
    public Builder deliveryMethodTypes(List<DeliveryMethodType> deliveryMethodTypes) {
      this.deliveryMethodTypes = deliveryMethodTypes;
      return this;
    }

    /**
     * The ID for the fulfillment constraint function.
     */
    public Builder function(ShopifyFunction function) {
      this.function = function;
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
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }
  }
}
