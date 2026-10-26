package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for product variant subscription lines in the calculate API.
 */
public class SubscriptionContractCalculationProductVariantLineInput {
  /**
   * The ID of an existing line to update. Omit for new lines. The ID keeps the line's identity
   * but doesn't carry over any stored values, so restate every field of the line.
   */
  private String id;

  /**
   * The ID of the product variant for this line.
   */
  private String productVariantId;

  /**
   * The quantity of the product variant. Must be at least 1.
   */
  private int quantity;

  /**
   * The price per unit for this line, the calculate API equivalent of `currentPrice` on
   * `SubscriptionLineInput`. The amount must be greater than or equal to 0. When omitted, the line
   * is priced at the product variant's current price.
   */
  private MoneyInput priceOverride;

  /**
   * The custom attributes for this subscription line. Defaults to an empty list when omitted,
   * which clears the line's stored attributes.
   */
  private List<AttributeInput> customAttributes = Collections.emptyList();

  /**
   * The app-managed pricing policy for this line, the calculate API equivalent of `pricingPolicy`
   * on `SubscriptionLineInput`. It's stored as metadata and doesn't affect the calculated price.
   * When omitted, the stored policy is cleared.
   */
  private SubscriptionContractCalculationAppManagedPricingPolicyInput appManagedPricingPolicy;

  /**
   * The ID of the selling plan this line was originally created with. It's used to find the
   * associated delivery profile, and isn't applied as a selling plan during calculation.
   */
  private String originSellingPlanId;

  /**
   * The selling plan name for this line, describing the order line items it creates. Defaults
   * to the origin selling plan's current name when not specified. When `originSellingPlanId` is
   * also omitted, the line stores no name and order line items use a name built from the
   * contract's billing and delivery policies.
   */
  private String sellingPlanName;

  /**
   * The line-scoped manual discounts for this line. Each applies only to this
   * line. You must state this list whenever you provide the line; pass an empty
   * list to clear its discounts.
   */
  private List<SubscriptionContractCalculationLineDiscountInput> discounts;

  public SubscriptionContractCalculationProductVariantLineInput() {
  }

  /**
   * The ID of an existing line to update. Omit for new lines. The ID keeps the line's identity
   * but doesn't carry over any stored values, so restate every field of the line.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The ID of the product variant for this line.
   */
  public String getProductVariantId() {
    return productVariantId;
  }

  public void setProductVariantId(String productVariantId) {
    this.productVariantId = productVariantId;
  }

  /**
   * The quantity of the product variant. Must be at least 1.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The price per unit for this line, the calculate API equivalent of `currentPrice` on
   * `SubscriptionLineInput`. The amount must be greater than or equal to 0. When omitted, the line
   * is priced at the product variant's current price.
   */
  public MoneyInput getPriceOverride() {
    return priceOverride;
  }

  public void setPriceOverride(MoneyInput priceOverride) {
    this.priceOverride = priceOverride;
  }

  /**
   * The custom attributes for this subscription line. Defaults to an empty list when omitted,
   * which clears the line's stored attributes.
   */
  public List<AttributeInput> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<AttributeInput> customAttributes) {
    this.customAttributes = customAttributes;
  }

  /**
   * The app-managed pricing policy for this line, the calculate API equivalent of `pricingPolicy`
   * on `SubscriptionLineInput`. It's stored as metadata and doesn't affect the calculated price.
   * When omitted, the stored policy is cleared.
   */
  public SubscriptionContractCalculationAppManagedPricingPolicyInput getAppManagedPricingPolicy() {
    return appManagedPricingPolicy;
  }

  public void setAppManagedPricingPolicy(
      SubscriptionContractCalculationAppManagedPricingPolicyInput appManagedPricingPolicy) {
    this.appManagedPricingPolicy = appManagedPricingPolicy;
  }

  /**
   * The ID of the selling plan this line was originally created with. It's used to find the
   * associated delivery profile, and isn't applied as a selling plan during calculation.
   */
  public String getOriginSellingPlanId() {
    return originSellingPlanId;
  }

  public void setOriginSellingPlanId(String originSellingPlanId) {
    this.originSellingPlanId = originSellingPlanId;
  }

  /**
   * The selling plan name for this line, describing the order line items it creates. Defaults
   * to the origin selling plan's current name when not specified. When `originSellingPlanId` is
   * also omitted, the line stores no name and order line items use a name built from the
   * contract's billing and delivery policies.
   */
  public String getSellingPlanName() {
    return sellingPlanName;
  }

  public void setSellingPlanName(String sellingPlanName) {
    this.sellingPlanName = sellingPlanName;
  }

  /**
   * The line-scoped manual discounts for this line. Each applies only to this
   * line. You must state this list whenever you provide the line; pass an empty
   * list to clear its discounts.
   */
  public List<SubscriptionContractCalculationLineDiscountInput> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<SubscriptionContractCalculationLineDiscountInput> discounts) {
    this.discounts = discounts;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationProductVariantLineInput{id='" + id + "', productVariantId='" + productVariantId + "', quantity='" + quantity + "', priceOverride='" + priceOverride + "', customAttributes='" + customAttributes + "', appManagedPricingPolicy='" + appManagedPricingPolicy + "', originSellingPlanId='" + originSellingPlanId + "', sellingPlanName='" + sellingPlanName + "', discounts='" + discounts + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationProductVariantLineInput that = (SubscriptionContractCalculationProductVariantLineInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(productVariantId, that.productVariantId) &&
        quantity == that.quantity &&
        Objects.equals(priceOverride, that.priceOverride) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(appManagedPricingPolicy, that.appManagedPricingPolicy) &&
        Objects.equals(originSellingPlanId, that.originSellingPlanId) &&
        Objects.equals(sellingPlanName, that.sellingPlanName) &&
        Objects.equals(discounts, that.discounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productVariantId, quantity, priceOverride, customAttributes, appManagedPricingPolicy, originSellingPlanId, sellingPlanName, discounts);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of an existing line to update. Omit for new lines. The ID keeps the line's identity
     * but doesn't carry over any stored values, so restate every field of the line.
     */
    private String id;

    /**
     * The ID of the product variant for this line.
     */
    private String productVariantId;

    /**
     * The quantity of the product variant. Must be at least 1.
     */
    private int quantity;

    /**
     * The price per unit for this line, the calculate API equivalent of `currentPrice` on
     * `SubscriptionLineInput`. The amount must be greater than or equal to 0. When omitted, the line
     * is priced at the product variant's current price.
     */
    private MoneyInput priceOverride;

    /**
     * The custom attributes for this subscription line. Defaults to an empty list when omitted,
     * which clears the line's stored attributes.
     */
    private List<AttributeInput> customAttributes = Collections.emptyList();

    /**
     * The app-managed pricing policy for this line, the calculate API equivalent of `pricingPolicy`
     * on `SubscriptionLineInput`. It's stored as metadata and doesn't affect the calculated price.
     * When omitted, the stored policy is cleared.
     */
    private SubscriptionContractCalculationAppManagedPricingPolicyInput appManagedPricingPolicy;

    /**
     * The ID of the selling plan this line was originally created with. It's used to find the
     * associated delivery profile, and isn't applied as a selling plan during calculation.
     */
    private String originSellingPlanId;

    /**
     * The selling plan name for this line, describing the order line items it creates. Defaults
     * to the origin selling plan's current name when not specified. When `originSellingPlanId` is
     * also omitted, the line stores no name and order line items use a name built from the
     * contract's billing and delivery policies.
     */
    private String sellingPlanName;

    /**
     * The line-scoped manual discounts for this line. Each applies only to this
     * line. You must state this list whenever you provide the line; pass an empty
     * list to clear its discounts.
     */
    private List<SubscriptionContractCalculationLineDiscountInput> discounts;

    public SubscriptionContractCalculationProductVariantLineInput build() {
      SubscriptionContractCalculationProductVariantLineInput result = new SubscriptionContractCalculationProductVariantLineInput();
      result.id = this.id;
      result.productVariantId = this.productVariantId;
      result.quantity = this.quantity;
      result.priceOverride = this.priceOverride;
      result.customAttributes = this.customAttributes;
      result.appManagedPricingPolicy = this.appManagedPricingPolicy;
      result.originSellingPlanId = this.originSellingPlanId;
      result.sellingPlanName = this.sellingPlanName;
      result.discounts = this.discounts;
      return result;
    }

    /**
     * The ID of an existing line to update. Omit for new lines. The ID keeps the line's identity
     * but doesn't carry over any stored values, so restate every field of the line.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The ID of the product variant for this line.
     */
    public Builder productVariantId(String productVariantId) {
      this.productVariantId = productVariantId;
      return this;
    }

    /**
     * The quantity of the product variant. Must be at least 1.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The price per unit for this line, the calculate API equivalent of `currentPrice` on
     * `SubscriptionLineInput`. The amount must be greater than or equal to 0. When omitted, the line
     * is priced at the product variant's current price.
     */
    public Builder priceOverride(MoneyInput priceOverride) {
      this.priceOverride = priceOverride;
      return this;
    }

    /**
     * The custom attributes for this subscription line. Defaults to an empty list when omitted,
     * which clears the line's stored attributes.
     */
    public Builder customAttributes(List<AttributeInput> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * The app-managed pricing policy for this line, the calculate API equivalent of `pricingPolicy`
     * on `SubscriptionLineInput`. It's stored as metadata and doesn't affect the calculated price.
     * When omitted, the stored policy is cleared.
     */
    public Builder appManagedPricingPolicy(
        SubscriptionContractCalculationAppManagedPricingPolicyInput appManagedPricingPolicy) {
      this.appManagedPricingPolicy = appManagedPricingPolicy;
      return this;
    }

    /**
     * The ID of the selling plan this line was originally created with. It's used to find the
     * associated delivery profile, and isn't applied as a selling plan during calculation.
     */
    public Builder originSellingPlanId(String originSellingPlanId) {
      this.originSellingPlanId = originSellingPlanId;
      return this;
    }

    /**
     * The selling plan name for this line, describing the order line items it creates. Defaults
     * to the origin selling plan's current name when not specified. When `originSellingPlanId` is
     * also omitted, the line stores no name and order line items use a name built from the
     * contract's billing and delivery policies.
     */
    public Builder sellingPlanName(String sellingPlanName) {
      this.sellingPlanName = sellingPlanName;
      return this;
    }

    /**
     * The line-scoped manual discounts for this line. Each applies only to this
     * line. You must state this list whenever you provide the line; pass an empty
     * list to clear its discounts.
     */
    public Builder discounts(List<SubscriptionContractCalculationLineDiscountInput> discounts) {
      this.discounts = discounts;
      return this;
    }
  }
}
