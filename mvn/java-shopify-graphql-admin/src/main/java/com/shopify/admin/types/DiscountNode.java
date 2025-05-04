package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The `DiscountNode` object enables you to manage
 * [discounts](https://help.shopify.com/manual/discounts), which are applied at
 * checkout or on a cart.
 *
 *
 * Discounts are a way for merchants to promote sales and special offers, or as
 * customer loyalty rewards. Discounts can apply to [orders, products, or
 * shipping](https://shopify.dev/docs/apps/build/discounts#discount-classes), and
 * can be either automatic or code-based. For example, you can offer customers a
 * buy X get Y discount that's automatically applied when purchases meet specific
 * criteria. Or, you can offer discounts where customers have to enter a code to
 * redeem an amount off discount on products, variants, or collections in a store.
 *
 * Learn more about working with [Shopify's discount model](https://shopify.dev/docs/apps/build/discounts),
 * including related mutations, limitations, and considerations.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountNode implements MetafieldReferencer, com.shopify.admin.types.HasEvents, com.shopify.admin.types.HasMetafieldDefinitions, com.shopify.admin.types.HasMetafields, com.shopify.admin.types.Node {
  /**
   * A discount that's applied at checkout or on cart.
   *   
   *   
   * Discounts can be [automatic or code-based](https://shopify.dev/docs/apps/build/discounts#discount-methods).
   */
  private Discount discount;

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

  public DiscountNode() {
  }

  /**
   * A discount that's applied at checkout or on cart.
   *   
   *   
   * Discounts can be [automatic or code-based](https://shopify.dev/docs/apps/build/discounts#discount-methods).
   */
  public Discount getDiscount() {
    return discount;
  }

  public void setDiscount(Discount discount) {
    this.discount = discount;
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

  @Override
  public String toString() {
    return "DiscountNode{discount='" + discount + "', events='" + events + "', id='" + id + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountNode that = (DiscountNode) o;
    return Objects.equals(discount, that.discount) &&
        Objects.equals(events, that.events) &&
        Objects.equals(id, that.id) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafields, that.metafields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discount, events, id, metafield, metafieldDefinitions, metafields);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A discount that's applied at checkout or on cart.
     *   
     *   
     * Discounts can be [automatic or code-based](https://shopify.dev/docs/apps/build/discounts#discount-methods).
     */
    private Discount discount;

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

    public DiscountNode build() {
      DiscountNode result = new DiscountNode();
      result.discount = this.discount;
      result.events = this.events;
      result.id = this.id;
      result.metafield = this.metafield;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafields = this.metafields;
      return result;
    }

    /**
     * A discount that's applied at checkout or on cart.
     *   
     *   
     * Discounts can be [automatic or code-based](https://shopify.dev/docs/apps/build/discounts#discount-methods).
     */
    public Builder discount(Discount discount) {
      this.discount = discount;
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
  }
}
