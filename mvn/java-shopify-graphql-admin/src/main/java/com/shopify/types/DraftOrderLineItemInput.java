package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a line item included in a draft order.
 */
public class DraftOrderLineItemInput {
  /**
   * The custom discount to be applied.
   */
  private DraftOrderAppliedDiscountInput appliedDiscount;

  /**
   * A generic custom attribute using a key value pair.
   */
  private List<AttributeInput> customAttributes;

  /**
   * The price in presentment currency, without any discounts applied, for a custom line item.
   * If this value is provided, `original_unit_price` will be ignored. This field is ignored when `variantId` is provided.
   * Note: All presentment currencies for a single draft should be the same and match the
   * presentment currency of the draft order.
   */
  private MoneyInput originalUnitPriceWithCurrency;

  /**
   * The line item quantity.
   */
  private int quantity;

  /**
   * Whether physical shipping is required for a custom line item. This field is ignored when `variantId` is provided.
   */
  private Boolean requiresShipping;

  /**
   * The SKU number for custom line items only. This field is ignored when `variantId` is provided.
   */
  private String sku;

  /**
   * Whether the custom line item is taxable. This field is ignored when `variantId` is provided.
   */
  private Boolean taxable;

  /**
   * Title of the line item. This field is ignored when `variantId` is provided.
   */
  private String title;

  /**
   * The ID of the product variant corresponding to the line item.
   * Must be null for custom line items, otherwise required.
   */
  private String variantId;

  /**
   * The weight unit and value inputs for custom line items only.
   * This field is ignored when `variantId` is provided.
   */
  private WeightInput weight;

  /**
   * The UUID of the draft order line item. Must be unique and consistent across requests.
   * This field is mandatory in order to manipulate drafts with bundles.
   */
  private String uuid;

  /**
   * The bundle components when the line item is a bundle.
   */
  private List<BundlesDraftOrderBundleLineItemComponentInput> bundleComponents;

  /**
   * If the line item doesn't already have a price override input, setting `generatePriceOverride` to `true` will
   * create a price override from the current price.
   */
  private Boolean generatePriceOverride;

  /**
   * The price override for the line item. Should be set in presentment currency.
   *   
   * This price will be used in place of the product variant's catalog price in this draft order.
   *   
   * If the override's presentment currency doesn't match the draft order's presentment currency, it will be
   * converted over to match the draft order's presentment currency. This will occur if the input is defined in a
   * differing currency, or if some other event causes the draft order's currency to change.
   *   
   * Price overrides can't be applied to bundle components. If this line item becomes part of a bundle the price
   * override will be removed. In the case of a cart transform, this may mean that a price override is applied to
   * this line item earlier in its lifecycle, and is removed later when the transform occurs.
   */
  private MoneyInput priceOverride;

  public DraftOrderLineItemInput() {
  }

  /**
   * The custom discount to be applied.
   */
  public DraftOrderAppliedDiscountInput getAppliedDiscount() {
    return appliedDiscount;
  }

  public void setAppliedDiscount(DraftOrderAppliedDiscountInput appliedDiscount) {
    this.appliedDiscount = appliedDiscount;
  }

  /**
   * A generic custom attribute using a key value pair.
   */
  public List<AttributeInput> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<AttributeInput> customAttributes) {
    this.customAttributes = customAttributes;
  }

  /**
   * The price in presentment currency, without any discounts applied, for a custom line item.
   * If this value is provided, `original_unit_price` will be ignored. This field is ignored when `variantId` is provided.
   * Note: All presentment currencies for a single draft should be the same and match the
   * presentment currency of the draft order.
   */
  public MoneyInput getOriginalUnitPriceWithCurrency() {
    return originalUnitPriceWithCurrency;
  }

  public void setOriginalUnitPriceWithCurrency(MoneyInput originalUnitPriceWithCurrency) {
    this.originalUnitPriceWithCurrency = originalUnitPriceWithCurrency;
  }

  /**
   * The line item quantity.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * Whether physical shipping is required for a custom line item. This field is ignored when `variantId` is provided.
   */
  public Boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(Boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  /**
   * The SKU number for custom line items only. This field is ignored when `variantId` is provided.
   */
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * Whether the custom line item is taxable. This field is ignored when `variantId` is provided.
   */
  public Boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(Boolean taxable) {
    this.taxable = taxable;
  }

  /**
   * Title of the line item. This field is ignored when `variantId` is provided.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The ID of the product variant corresponding to the line item.
   * Must be null for custom line items, otherwise required.
   */
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  /**
   * The weight unit and value inputs for custom line items only.
   * This field is ignored when `variantId` is provided.
   */
  public WeightInput getWeight() {
    return weight;
  }

  public void setWeight(WeightInput weight) {
    this.weight = weight;
  }

  /**
   * The UUID of the draft order line item. Must be unique and consistent across requests.
   * This field is mandatory in order to manipulate drafts with bundles.
   */
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * The bundle components when the line item is a bundle.
   */
  public List<BundlesDraftOrderBundleLineItemComponentInput> getBundleComponents() {
    return bundleComponents;
  }

  public void setBundleComponents(
      List<BundlesDraftOrderBundleLineItemComponentInput> bundleComponents) {
    this.bundleComponents = bundleComponents;
  }

  /**
   * If the line item doesn't already have a price override input, setting `generatePriceOverride` to `true` will
   * create a price override from the current price.
   */
  public Boolean getGeneratePriceOverride() {
    return generatePriceOverride;
  }

  public void setGeneratePriceOverride(Boolean generatePriceOverride) {
    this.generatePriceOverride = generatePriceOverride;
  }

  /**
   * The price override for the line item. Should be set in presentment currency.
   *   
   * This price will be used in place of the product variant's catalog price in this draft order.
   *   
   * If the override's presentment currency doesn't match the draft order's presentment currency, it will be
   * converted over to match the draft order's presentment currency. This will occur if the input is defined in a
   * differing currency, or if some other event causes the draft order's currency to change.
   *   
   * Price overrides can't be applied to bundle components. If this line item becomes part of a bundle the price
   * override will be removed. In the case of a cart transform, this may mean that a price override is applied to
   * this line item earlier in its lifecycle, and is removed later when the transform occurs.
   */
  public MoneyInput getPriceOverride() {
    return priceOverride;
  }

  public void setPriceOverride(MoneyInput priceOverride) {
    this.priceOverride = priceOverride;
  }

  @Override
  public String toString() {
    return "DraftOrderLineItemInput{appliedDiscount='" + appliedDiscount + "', customAttributes='" + customAttributes + "', originalUnitPriceWithCurrency='" + originalUnitPriceWithCurrency + "', quantity='" + quantity + "', requiresShipping='" + requiresShipping + "', sku='" + sku + "', taxable='" + taxable + "', title='" + title + "', variantId='" + variantId + "', weight='" + weight + "', uuid='" + uuid + "', bundleComponents='" + bundleComponents + "', generatePriceOverride='" + generatePriceOverride + "', priceOverride='" + priceOverride + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderLineItemInput that = (DraftOrderLineItemInput) o;
    return Objects.equals(appliedDiscount, that.appliedDiscount) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(originalUnitPriceWithCurrency, that.originalUnitPriceWithCurrency) &&
        quantity == that.quantity &&
        Objects.equals(requiresShipping, that.requiresShipping) &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(taxable, that.taxable) &&
        Objects.equals(title, that.title) &&
        Objects.equals(variantId, that.variantId) &&
        Objects.equals(weight, that.weight) &&
        Objects.equals(uuid, that.uuid) &&
        Objects.equals(bundleComponents, that.bundleComponents) &&
        Objects.equals(generatePriceOverride, that.generatePriceOverride) &&
        Objects.equals(priceOverride, that.priceOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedDiscount, customAttributes, originalUnitPriceWithCurrency, quantity, requiresShipping, sku, taxable, title, variantId, weight, uuid, bundleComponents, generatePriceOverride, priceOverride);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The custom discount to be applied.
     */
    private DraftOrderAppliedDiscountInput appliedDiscount;

    /**
     * A generic custom attribute using a key value pair.
     */
    private List<AttributeInput> customAttributes;

    /**
     * The price in presentment currency, without any discounts applied, for a custom line item.
     * If this value is provided, `original_unit_price` will be ignored. This field is ignored when `variantId` is provided.
     * Note: All presentment currencies for a single draft should be the same and match the
     * presentment currency of the draft order.
     */
    private MoneyInput originalUnitPriceWithCurrency;

    /**
     * The line item quantity.
     */
    private int quantity;

    /**
     * Whether physical shipping is required for a custom line item. This field is ignored when `variantId` is provided.
     */
    private Boolean requiresShipping;

    /**
     * The SKU number for custom line items only. This field is ignored when `variantId` is provided.
     */
    private String sku;

    /**
     * Whether the custom line item is taxable. This field is ignored when `variantId` is provided.
     */
    private Boolean taxable;

    /**
     * Title of the line item. This field is ignored when `variantId` is provided.
     */
    private String title;

    /**
     * The ID of the product variant corresponding to the line item.
     * Must be null for custom line items, otherwise required.
     */
    private String variantId;

    /**
     * The weight unit and value inputs for custom line items only.
     * This field is ignored when `variantId` is provided.
     */
    private WeightInput weight;

    /**
     * The UUID of the draft order line item. Must be unique and consistent across requests.
     * This field is mandatory in order to manipulate drafts with bundles.
     */
    private String uuid;

    /**
     * The bundle components when the line item is a bundle.
     */
    private List<BundlesDraftOrderBundleLineItemComponentInput> bundleComponents;

    /**
     * If the line item doesn't already have a price override input, setting `generatePriceOverride` to `true` will
     * create a price override from the current price.
     */
    private Boolean generatePriceOverride;

    /**
     * The price override for the line item. Should be set in presentment currency.
     *   
     * This price will be used in place of the product variant's catalog price in this draft order.
     *   
     * If the override's presentment currency doesn't match the draft order's presentment currency, it will be
     * converted over to match the draft order's presentment currency. This will occur if the input is defined in a
     * differing currency, or if some other event causes the draft order's currency to change.
     *   
     * Price overrides can't be applied to bundle components. If this line item becomes part of a bundle the price
     * override will be removed. In the case of a cart transform, this may mean that a price override is applied to
     * this line item earlier in its lifecycle, and is removed later when the transform occurs.
     */
    private MoneyInput priceOverride;

    public DraftOrderLineItemInput build() {
      DraftOrderLineItemInput result = new DraftOrderLineItemInput();
      result.appliedDiscount = this.appliedDiscount;
      result.customAttributes = this.customAttributes;
      result.originalUnitPriceWithCurrency = this.originalUnitPriceWithCurrency;
      result.quantity = this.quantity;
      result.requiresShipping = this.requiresShipping;
      result.sku = this.sku;
      result.taxable = this.taxable;
      result.title = this.title;
      result.variantId = this.variantId;
      result.weight = this.weight;
      result.uuid = this.uuid;
      result.bundleComponents = this.bundleComponents;
      result.generatePriceOverride = this.generatePriceOverride;
      result.priceOverride = this.priceOverride;
      return result;
    }

    /**
     * The custom discount to be applied.
     */
    public Builder appliedDiscount(DraftOrderAppliedDiscountInput appliedDiscount) {
      this.appliedDiscount = appliedDiscount;
      return this;
    }

    /**
     * A generic custom attribute using a key value pair.
     */
    public Builder customAttributes(List<AttributeInput> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * The price in presentment currency, without any discounts applied, for a custom line item.
     * If this value is provided, `original_unit_price` will be ignored. This field is ignored when `variantId` is provided.
     * Note: All presentment currencies for a single draft should be the same and match the
     * presentment currency of the draft order.
     */
    public Builder originalUnitPriceWithCurrency(MoneyInput originalUnitPriceWithCurrency) {
      this.originalUnitPriceWithCurrency = originalUnitPriceWithCurrency;
      return this;
    }

    /**
     * The line item quantity.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * Whether physical shipping is required for a custom line item. This field is ignored when `variantId` is provided.
     */
    public Builder requiresShipping(Boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    /**
     * The SKU number for custom line items only. This field is ignored when `variantId` is provided.
     */
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    /**
     * Whether the custom line item is taxable. This field is ignored when `variantId` is provided.
     */
    public Builder taxable(Boolean taxable) {
      this.taxable = taxable;
      return this;
    }

    /**
     * Title of the line item. This field is ignored when `variantId` is provided.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The ID of the product variant corresponding to the line item.
     * Must be null for custom line items, otherwise required.
     */
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }

    /**
     * The weight unit and value inputs for custom line items only.
     * This field is ignored when `variantId` is provided.
     */
    public Builder weight(WeightInput weight) {
      this.weight = weight;
      return this;
    }

    /**
     * The UUID of the draft order line item. Must be unique and consistent across requests.
     * This field is mandatory in order to manipulate drafts with bundles.
     */
    public Builder uuid(String uuid) {
      this.uuid = uuid;
      return this;
    }

    /**
     * The bundle components when the line item is a bundle.
     */
    public Builder bundleComponents(
        List<BundlesDraftOrderBundleLineItemComponentInput> bundleComponents) {
      this.bundleComponents = bundleComponents;
      return this;
    }

    /**
     * If the line item doesn't already have a price override input, setting `generatePriceOverride` to `true` will
     * create a price override from the current price.
     */
    public Builder generatePriceOverride(Boolean generatePriceOverride) {
      this.generatePriceOverride = generatePriceOverride;
      return this;
    }

    /**
     * The price override for the line item. Should be set in presentment currency.
     *   
     * This price will be used in place of the product variant's catalog price in this draft order.
     *   
     * If the override's presentment currency doesn't match the draft order's presentment currency, it will be
     * converted over to match the draft order's presentment currency. This will occur if the input is defined in a
     * differing currency, or if some other event causes the draft order's currency to change.
     *   
     * Price overrides can't be applied to bundle components. If this line item becomes part of a bundle the price
     * override will be removed. In the case of a cart transform, this may mean that a price override is applied to
     * this line item earlier in its lifecycle, and is removed later when the transform occurs.
     */
    public Builder priceOverride(MoneyInput priceOverride) {
      this.priceOverride = priceOverride;
      return this;
    }
  }
}
