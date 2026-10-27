package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for custom subscription lines in the calculate API.
 */
public class SubscriptionContractCalculationCustomLineInput {
  /**
   * The ID of an existing line to update. Omit for new lines. The ID keeps the line's identity
   * but doesn't carry over any stored values, so restate every field of the line.
   */
  private String id;

  /**
   * The title of the custom line item.
   */
  private String title;

  /**
   * The title of the variant.
   */
  private String variantTitle;

  /**
   * The quantity of the custom line item. Must be at least 1.
   */
  private int quantity;

  /**
   * The price of the custom line item. The amount must be greater than or equal to 0.
   */
  private MoneyInput price;

  /**
   * Whether this custom line requires shipping.
   */
  private boolean requiresShipping;

  /**
   * Whether this custom line is taxable.
   */
  private boolean taxable;

  /**
   * The SKU of the custom line item.
   */
  private String sku;

  /**
   * The custom attributes for this subscription line. Defaults to an empty list when omitted,
   * which clears the line's stored attributes.
   */
  private List<AttributeInput> customAttributes = Collections.emptyList();

  /**
   * The weight of the custom line item.
   */
  private WeightInput weight;

  /**
   * The app-managed pricing policy for this line. It's stored as metadata and doesn't affect the
   * calculated price. When omitted, the stored policy is cleared.
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

  public SubscriptionContractCalculationCustomLineInput() {
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
   * The title of the custom line item.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The title of the variant.
   */
  public String getVariantTitle() {
    return variantTitle;
  }

  public void setVariantTitle(String variantTitle) {
    this.variantTitle = variantTitle;
  }

  /**
   * The quantity of the custom line item. Must be at least 1.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The price of the custom line item. The amount must be greater than or equal to 0.
   */
  public MoneyInput getPrice() {
    return price;
  }

  public void setPrice(MoneyInput price) {
    this.price = price;
  }

  /**
   * Whether this custom line requires shipping.
   */
  public boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  /**
   * Whether this custom line is taxable.
   */
  public boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(boolean taxable) {
    this.taxable = taxable;
  }

  /**
   * The SKU of the custom line item.
   */
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
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
   * The weight of the custom line item.
   */
  public WeightInput getWeight() {
    return weight;
  }

  public void setWeight(WeightInput weight) {
    this.weight = weight;
  }

  /**
   * The app-managed pricing policy for this line. It's stored as metadata and doesn't affect the
   * calculated price. When omitted, the stored policy is cleared.
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
    return "SubscriptionContractCalculationCustomLineInput{id='" + id + "', title='" + title + "', variantTitle='" + variantTitle + "', quantity='" + quantity + "', price='" + price + "', requiresShipping='" + requiresShipping + "', taxable='" + taxable + "', sku='" + sku + "', customAttributes='" + customAttributes + "', weight='" + weight + "', appManagedPricingPolicy='" + appManagedPricingPolicy + "', originSellingPlanId='" + originSellingPlanId + "', sellingPlanName='" + sellingPlanName + "', discounts='" + discounts + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationCustomLineInput that = (SubscriptionContractCalculationCustomLineInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(title, that.title) &&
        Objects.equals(variantTitle, that.variantTitle) &&
        quantity == that.quantity &&
        Objects.equals(price, that.price) &&
        requiresShipping == that.requiresShipping &&
        taxable == that.taxable &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(weight, that.weight) &&
        Objects.equals(appManagedPricingPolicy, that.appManagedPricingPolicy) &&
        Objects.equals(originSellingPlanId, that.originSellingPlanId) &&
        Objects.equals(sellingPlanName, that.sellingPlanName) &&
        Objects.equals(discounts, that.discounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, variantTitle, quantity, price, requiresShipping, taxable, sku, customAttributes, weight, appManagedPricingPolicy, originSellingPlanId, sellingPlanName, discounts);
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
     * The title of the custom line item.
     */
    private String title;

    /**
     * The title of the variant.
     */
    private String variantTitle;

    /**
     * The quantity of the custom line item. Must be at least 1.
     */
    private int quantity;

    /**
     * The price of the custom line item. The amount must be greater than or equal to 0.
     */
    private MoneyInput price;

    /**
     * Whether this custom line requires shipping.
     */
    private boolean requiresShipping;

    /**
     * Whether this custom line is taxable.
     */
    private boolean taxable;

    /**
     * The SKU of the custom line item.
     */
    private String sku;

    /**
     * The custom attributes for this subscription line. Defaults to an empty list when omitted,
     * which clears the line's stored attributes.
     */
    private List<AttributeInput> customAttributes = Collections.emptyList();

    /**
     * The weight of the custom line item.
     */
    private WeightInput weight;

    /**
     * The app-managed pricing policy for this line. It's stored as metadata and doesn't affect the
     * calculated price. When omitted, the stored policy is cleared.
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

    public SubscriptionContractCalculationCustomLineInput build() {
      SubscriptionContractCalculationCustomLineInput result = new SubscriptionContractCalculationCustomLineInput();
      result.id = this.id;
      result.title = this.title;
      result.variantTitle = this.variantTitle;
      result.quantity = this.quantity;
      result.price = this.price;
      result.requiresShipping = this.requiresShipping;
      result.taxable = this.taxable;
      result.sku = this.sku;
      result.customAttributes = this.customAttributes;
      result.weight = this.weight;
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
     * The title of the custom line item.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The title of the variant.
     */
    public Builder variantTitle(String variantTitle) {
      this.variantTitle = variantTitle;
      return this;
    }

    /**
     * The quantity of the custom line item. Must be at least 1.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The price of the custom line item. The amount must be greater than or equal to 0.
     */
    public Builder price(MoneyInput price) {
      this.price = price;
      return this;
    }

    /**
     * Whether this custom line requires shipping.
     */
    public Builder requiresShipping(boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    /**
     * Whether this custom line is taxable.
     */
    public Builder taxable(boolean taxable) {
      this.taxable = taxable;
      return this;
    }

    /**
     * The SKU of the custom line item.
     */
    public Builder sku(String sku) {
      this.sku = sku;
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
     * The weight of the custom line item.
     */
    public Builder weight(WeightInput weight) {
      this.weight = weight;
      return this;
    }

    /**
     * The app-managed pricing policy for this line. It's stored as metadata and doesn't affect the
     * calculated price. When omitted, the stored policy is cleared.
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
