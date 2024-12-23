package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The `DiscountAutomaticNode` object enables you to manage [automatic discounts](https://help.shopify.com/manual/discounts/discount-types#automatic-discounts)
 * that are applied when an order meets specific criteria. You can create amount
 * off, free shipping, or buy X get Y automatic discounts. For example, you can
 * offer customers a free shipping discount that applies when conditions are met.
 * Or you can offer customers a buy X get Y discount that's automatically applied
 * when customers spend a specified amount of money, or a specified quantity of products.
 *
 * Learn more about working with [Shopify's discount model](https://shopify.dev/docs/apps/build/discounts),
 * including related queries, mutations, limitations, and considerations.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountAutomaticNode implements MetafieldReferencer, com.shopify.types.HasEvents, com.shopify.types.HasMetafieldDefinitions, com.shopify.types.HasMetafields, com.shopify.types.Node {
  /**
   * A discount that's applied automatically when an order meets specific criteria.
   * Learn more about [automatic discounts](https://help.shopify.com/manual/discounts/discount-types#automatic-discounts).
   */
  private DiscountAutomatic automaticDiscount;

  /**
   * The paginated list of events associated with the host subject.
   */
  private EventConnection events;

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
   * Returns a private metafield by namespace and key that belongs to the resource.
   */
  private PrivateMetafield privateMetafield;

  /**
   * List of private metafields that belong to the resource.
   */
  private PrivateMetafieldConnection privateMetafields;

  public DiscountAutomaticNode() {
  }

  /**
   * A discount that's applied automatically when an order meets specific criteria.
   * Learn more about [automatic discounts](https://help.shopify.com/manual/discounts/discount-types#automatic-discounts).
   */
  public DiscountAutomatic getAutomaticDiscount() {
    return automaticDiscount;
  }

  public void setAutomaticDiscount(DiscountAutomatic automaticDiscount) {
    this.automaticDiscount = automaticDiscount;
  }

  /**
   * The paginated list of events associated with the host subject.
   */
  public EventConnection getEvents() {
    return events;
  }

  public void setEvents(EventConnection events) {
    this.events = events;
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

  @Override
  public String toString() {
    return "DiscountAutomaticNode{automaticDiscount='" + automaticDiscount + "', events='" + events + "', id='" + id + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAutomaticNode that = (DiscountAutomaticNode) o;
    return Objects.equals(automaticDiscount, that.automaticDiscount) &&
        Objects.equals(events, that.events) &&
        Objects.equals(id, that.id) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automaticDiscount, events, id, metafield, metafieldDefinitions, metafields, privateMetafield, privateMetafields);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A discount that's applied automatically when an order meets specific criteria.
     * Learn more about [automatic discounts](https://help.shopify.com/manual/discounts/discount-types#automatic-discounts).
     */
    private DiscountAutomatic automaticDiscount;

    /**
     * The paginated list of events associated with the host subject.
     */
    private EventConnection events;

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
     * Returns a private metafield by namespace and key that belongs to the resource.
     */
    private PrivateMetafield privateMetafield;

    /**
     * List of private metafields that belong to the resource.
     */
    private PrivateMetafieldConnection privateMetafields;

    public DiscountAutomaticNode build() {
      DiscountAutomaticNode result = new DiscountAutomaticNode();
      result.automaticDiscount = this.automaticDiscount;
      result.events = this.events;
      result.id = this.id;
      result.metafield = this.metafield;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafields = this.metafields;
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
      return result;
    }

    /**
     * A discount that's applied automatically when an order meets specific criteria.
     * Learn more about [automatic discounts](https://help.shopify.com/manual/discounts/discount-types#automatic-discounts).
     */
    public Builder automaticDiscount(DiscountAutomatic automaticDiscount) {
      this.automaticDiscount = automaticDiscount;
      return this;
    }

    /**
     * The paginated list of events associated with the host subject.
     */
    public Builder events(EventConnection events) {
      this.events = events;
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
  }
}
