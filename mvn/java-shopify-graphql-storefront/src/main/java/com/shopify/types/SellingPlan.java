package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents how products and variants can be sold and purchased.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SellingPlan implements MetafieldParentResource, com.shopify.types.HasMetafields {
  /**
   * The billing policy for the selling plan.
   */
  private SellingPlanBillingPolicy billingPolicy;

  /**
   * The initial payment due for the purchase.
   */
  private SellingPlanCheckoutCharge checkoutCharge;

  /**
   * The delivery policy for the selling plan.
   */
  private SellingPlanDeliveryPolicy deliveryPolicy;

  /**
   * The description of the selling plan.
   */
  private String description;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
   * its `namespace` and `key`, that's associated with a Shopify resource for the
   * purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
   */
  private List<Metafield> metafields;

  /**
   * The name of the selling plan. For example, '6 weeks of prepaid granola, delivered weekly'.
   */
  private String name;

  /**
   * The selling plan options available in the drop-down list in the storefront.
   * For example, 'Delivery every week' or 'Delivery every 2 weeks' specifies the
   * delivery frequency options for the product. Individual selling plans
   * contribute their options to the associated selling plan group. For example, a
   * selling plan group might have an option called `option1: Delivery every`. One
   * selling plan in that group could contribute `option1: 2 weeks` with the
   * pricing for that option, and another selling plan could contribute `option1: 4
   * weeks`, with different pricing.
   */
  private List<SellingPlanOption> options;

  /**
   * The price adjustments that a selling plan makes when a variant is purchased with a selling plan.
   */
  private List<SellingPlanPriceAdjustment> priceAdjustments;

  /**
   * Whether purchasing the selling plan will result in multiple deliveries.
   */
  private boolean recurringDeliveries;

  public SellingPlan() {
  }

  /**
   * The billing policy for the selling plan.
   */
  public SellingPlanBillingPolicy getBillingPolicy() {
    return billingPolicy;
  }

  public void setBillingPolicy(SellingPlanBillingPolicy billingPolicy) {
    this.billingPolicy = billingPolicy;
  }

  /**
   * The initial payment due for the purchase.
   */
  public SellingPlanCheckoutCharge getCheckoutCharge() {
    return checkoutCharge;
  }

  public void setCheckoutCharge(SellingPlanCheckoutCharge checkoutCharge) {
    this.checkoutCharge = checkoutCharge;
  }

  /**
   * The delivery policy for the selling plan.
   */
  public SellingPlanDeliveryPolicy getDeliveryPolicy() {
    return deliveryPolicy;
  }

  public void setDeliveryPolicy(SellingPlanDeliveryPolicy deliveryPolicy) {
    this.deliveryPolicy = deliveryPolicy;
  }

  /**
   * The description of the selling plan.
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
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
   * its `namespace` and `key`, that's associated with a Shopify resource for the
   * purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
   */
  public List<Metafield> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<Metafield> metafields) {
    this.metafields = metafields;
  }

  /**
   * The name of the selling plan. For example, '6 weeks of prepaid granola, delivered weekly'.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The selling plan options available in the drop-down list in the storefront.
   * For example, 'Delivery every week' or 'Delivery every 2 weeks' specifies the
   * delivery frequency options for the product. Individual selling plans
   * contribute their options to the associated selling plan group. For example, a
   * selling plan group might have an option called `option1: Delivery every`. One
   * selling plan in that group could contribute `option1: 2 weeks` with the
   * pricing for that option, and another selling plan could contribute `option1: 4
   * weeks`, with different pricing.
   */
  public List<SellingPlanOption> getOptions() {
    return options;
  }

  public void setOptions(List<SellingPlanOption> options) {
    this.options = options;
  }

  /**
   * The price adjustments that a selling plan makes when a variant is purchased with a selling plan.
   */
  public List<SellingPlanPriceAdjustment> getPriceAdjustments() {
    return priceAdjustments;
  }

  public void setPriceAdjustments(List<SellingPlanPriceAdjustment> priceAdjustments) {
    this.priceAdjustments = priceAdjustments;
  }

  /**
   * Whether purchasing the selling plan will result in multiple deliveries.
   */
  public boolean getRecurringDeliveries() {
    return recurringDeliveries;
  }

  public void setRecurringDeliveries(boolean recurringDeliveries) {
    this.recurringDeliveries = recurringDeliveries;
  }

  @Override
  public String toString() {
    return "SellingPlan{billingPolicy='" + billingPolicy + "', checkoutCharge='" + checkoutCharge + "', deliveryPolicy='" + deliveryPolicy + "', description='" + description + "', id='" + id + "', metafield='" + metafield + "', metafields='" + metafields + "', name='" + name + "', options='" + options + "', priceAdjustments='" + priceAdjustments + "', recurringDeliveries='" + recurringDeliveries + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlan that = (SellingPlan) o;
    return Objects.equals(billingPolicy, that.billingPolicy) &&
        Objects.equals(checkoutCharge, that.checkoutCharge) &&
        Objects.equals(deliveryPolicy, that.deliveryPolicy) &&
        Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(name, that.name) &&
        Objects.equals(options, that.options) &&
        Objects.equals(priceAdjustments, that.priceAdjustments) &&
        recurringDeliveries == that.recurringDeliveries;
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingPolicy, checkoutCharge, deliveryPolicy, description, id, metafield, metafields, name, options, priceAdjustments, recurringDeliveries);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The billing policy for the selling plan.
     */
    private SellingPlanBillingPolicy billingPolicy;

    /**
     * The initial payment due for the purchase.
     */
    private SellingPlanCheckoutCharge checkoutCharge;

    /**
     * The delivery policy for the selling plan.
     */
    private SellingPlanDeliveryPolicy deliveryPolicy;

    /**
     * The description of the selling plan.
     */
    private String description;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
     * its `namespace` and `key`, that's associated with a Shopify resource for the
     * purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
     */
    private List<Metafield> metafields;

    /**
     * The name of the selling plan. For example, '6 weeks of prepaid granola, delivered weekly'.
     */
    private String name;

    /**
     * The selling plan options available in the drop-down list in the storefront.
     * For example, 'Delivery every week' or 'Delivery every 2 weeks' specifies the
     * delivery frequency options for the product. Individual selling plans
     * contribute their options to the associated selling plan group. For example, a
     * selling plan group might have an option called `option1: Delivery every`. One
     * selling plan in that group could contribute `option1: 2 weeks` with the
     * pricing for that option, and another selling plan could contribute `option1: 4
     * weeks`, with different pricing.
     */
    private List<SellingPlanOption> options;

    /**
     * The price adjustments that a selling plan makes when a variant is purchased with a selling plan.
     */
    private List<SellingPlanPriceAdjustment> priceAdjustments;

    /**
     * Whether purchasing the selling plan will result in multiple deliveries.
     */
    private boolean recurringDeliveries;

    public SellingPlan build() {
      SellingPlan result = new SellingPlan();
      result.billingPolicy = this.billingPolicy;
      result.checkoutCharge = this.checkoutCharge;
      result.deliveryPolicy = this.deliveryPolicy;
      result.description = this.description;
      result.id = this.id;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      result.name = this.name;
      result.options = this.options;
      result.priceAdjustments = this.priceAdjustments;
      result.recurringDeliveries = this.recurringDeliveries;
      return result;
    }

    /**
     * The billing policy for the selling plan.
     */
    public Builder billingPolicy(SellingPlanBillingPolicy billingPolicy) {
      this.billingPolicy = billingPolicy;
      return this;
    }

    /**
     * The initial payment due for the purchase.
     */
    public Builder checkoutCharge(SellingPlanCheckoutCharge checkoutCharge) {
      this.checkoutCharge = checkoutCharge;
      return this;
    }

    /**
     * The delivery policy for the selling plan.
     */
    public Builder deliveryPolicy(SellingPlanDeliveryPolicy deliveryPolicy) {
      this.deliveryPolicy = deliveryPolicy;
      return this;
    }

    /**
     * The description of the selling plan.
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
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
     * its `namespace` and `key`, that's associated with a Shopify resource for the
     * purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
     */
    public Builder metafields(List<Metafield> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The name of the selling plan. For example, '6 weeks of prepaid granola, delivered weekly'.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The selling plan options available in the drop-down list in the storefront.
     * For example, 'Delivery every week' or 'Delivery every 2 weeks' specifies the
     * delivery frequency options for the product. Individual selling plans
     * contribute their options to the associated selling plan group. For example, a
     * selling plan group might have an option called `option1: Delivery every`. One
     * selling plan in that group could contribute `option1: 2 weeks` with the
     * pricing for that option, and another selling plan could contribute `option1: 4
     * weeks`, with different pricing.
     */
    public Builder options(List<SellingPlanOption> options) {
      this.options = options;
      return this;
    }

    /**
     * The price adjustments that a selling plan makes when a variant is purchased with a selling plan.
     */
    public Builder priceAdjustments(List<SellingPlanPriceAdjustment> priceAdjustments) {
      this.priceAdjustments = priceAdjustments;
      return this;
    }

    /**
     * Whether purchasing the selling plan will result in multiple deliveries.
     */
    public Builder recurringDeliveries(boolean recurringDeliveries) {
      this.recurringDeliveries = recurringDeliveries;
      return this;
    }
  }
}
