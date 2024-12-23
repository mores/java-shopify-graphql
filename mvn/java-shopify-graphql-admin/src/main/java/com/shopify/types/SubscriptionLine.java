package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents a Subscription Line.
 */
public class SubscriptionLine {
  /**
   * The price per unit for the subscription line in the contract's currency.
   */
  private MoneyV2 currentPrice;

  /**
   * List of custom attributes associated to the line item.
   */
  private List<Attribute> customAttributes;

  /**
   * Discount allocations.
   */
  private List<SubscriptionDiscountAllocation> discountAllocations;

  /**
   * The unique ID.
   */
  private String id;

  /**
   * Total line price including all discounts.
   */
  private MoneyV2 lineDiscountedPrice;

  /**
   * Describe the price changes of the line over time.
   */
  private SubscriptionPricingPolicy pricingPolicy;

  /**
   * The product ID associated with the subscription line.
   */
  private String productId;

  /**
   * The quantity of the unit selected for the subscription line.
   */
  private int quantity;

  /**
   * Whether physical shipping is required for the variant.
   */
  private boolean requiresShipping;

  /**
   * The selling plan ID associated to the line.
   *   
   * Indicates which selling plan was used to create this
   * contract line initially. The selling plan ID is also used to
   * find the associated delivery profile.
   *   
   * The subscription contract, subscription line, or selling plan might have
   * changed. As a result, the selling plan's attributes might not
   * match the information on the contract.
   */
  private String sellingPlanId;

  /**
   * The selling plan name associated to the line. This name describes
   * the order line items created from this subscription line
   * for both merchants and customers.
   *   
   * The value can be different from the selling plan's name, because both
   * the selling plan's name and the subscription line's selling_plan_name
   * attribute can be updated independently.
   */
  private String sellingPlanName;

  /**
   * Variant SKU number of the item associated with the subscription line.
   */
  private String sku;

  /**
   * Whether the variant is taxable.
   */
  private boolean taxable;

  /**
   * Product title of the item associated with the subscription line.
   */
  private String title;

  /**
   * The product variant ID associated with the subscription line.
   */
  private String variantId;

  /**
   * The image associated with the line item's variant or product.
   */
  private Image variantImage;

  /**
   * Product variant title of the item associated with the subscription line.
   */
  private String variantTitle;

  public SubscriptionLine() {
  }

  /**
   * The price per unit for the subscription line in the contract's currency.
   */
  public MoneyV2 getCurrentPrice() {
    return currentPrice;
  }

  public void setCurrentPrice(MoneyV2 currentPrice) {
    this.currentPrice = currentPrice;
  }

  /**
   * List of custom attributes associated to the line item.
   */
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  /**
   * Discount allocations.
   */
  public List<SubscriptionDiscountAllocation> getDiscountAllocations() {
    return discountAllocations;
  }

  public void setDiscountAllocations(List<SubscriptionDiscountAllocation> discountAllocations) {
    this.discountAllocations = discountAllocations;
  }

  /**
   * The unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Total line price including all discounts.
   */
  public MoneyV2 getLineDiscountedPrice() {
    return lineDiscountedPrice;
  }

  public void setLineDiscountedPrice(MoneyV2 lineDiscountedPrice) {
    this.lineDiscountedPrice = lineDiscountedPrice;
  }

  /**
   * Describe the price changes of the line over time.
   */
  public SubscriptionPricingPolicy getPricingPolicy() {
    return pricingPolicy;
  }

  public void setPricingPolicy(SubscriptionPricingPolicy pricingPolicy) {
    this.pricingPolicy = pricingPolicy;
  }

  /**
   * The product ID associated with the subscription line.
   */
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   * The quantity of the unit selected for the subscription line.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * Whether physical shipping is required for the variant.
   */
  public boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  /**
   * The selling plan ID associated to the line.
   *   
   * Indicates which selling plan was used to create this
   * contract line initially. The selling plan ID is also used to
   * find the associated delivery profile.
   *   
   * The subscription contract, subscription line, or selling plan might have
   * changed. As a result, the selling plan's attributes might not
   * match the information on the contract.
   */
  public String getSellingPlanId() {
    return sellingPlanId;
  }

  public void setSellingPlanId(String sellingPlanId) {
    this.sellingPlanId = sellingPlanId;
  }

  /**
   * The selling plan name associated to the line. This name describes
   * the order line items created from this subscription line
   * for both merchants and customers.
   *   
   * The value can be different from the selling plan's name, because both
   * the selling plan's name and the subscription line's selling_plan_name
   * attribute can be updated independently.
   */
  public String getSellingPlanName() {
    return sellingPlanName;
  }

  public void setSellingPlanName(String sellingPlanName) {
    this.sellingPlanName = sellingPlanName;
  }

  /**
   * Variant SKU number of the item associated with the subscription line.
   */
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * Whether the variant is taxable.
   */
  public boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(boolean taxable) {
    this.taxable = taxable;
  }

  /**
   * Product title of the item associated with the subscription line.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The product variant ID associated with the subscription line.
   */
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  /**
   * The image associated with the line item's variant or product.
   */
  public Image getVariantImage() {
    return variantImage;
  }

  public void setVariantImage(Image variantImage) {
    this.variantImage = variantImage;
  }

  /**
   * Product variant title of the item associated with the subscription line.
   */
  public String getVariantTitle() {
    return variantTitle;
  }

  public void setVariantTitle(String variantTitle) {
    this.variantTitle = variantTitle;
  }

  @Override
  public String toString() {
    return "SubscriptionLine{currentPrice='" + currentPrice + "', customAttributes='" + customAttributes + "', discountAllocations='" + discountAllocations + "', id='" + id + "', lineDiscountedPrice='" + lineDiscountedPrice + "', pricingPolicy='" + pricingPolicy + "', productId='" + productId + "', quantity='" + quantity + "', requiresShipping='" + requiresShipping + "', sellingPlanId='" + sellingPlanId + "', sellingPlanName='" + sellingPlanName + "', sku='" + sku + "', taxable='" + taxable + "', title='" + title + "', variantId='" + variantId + "', variantImage='" + variantImage + "', variantTitle='" + variantTitle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionLine that = (SubscriptionLine) o;
    return Objects.equals(currentPrice, that.currentPrice) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(discountAllocations, that.discountAllocations) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lineDiscountedPrice, that.lineDiscountedPrice) &&
        Objects.equals(pricingPolicy, that.pricingPolicy) &&
        Objects.equals(productId, that.productId) &&
        quantity == that.quantity &&
        requiresShipping == that.requiresShipping &&
        Objects.equals(sellingPlanId, that.sellingPlanId) &&
        Objects.equals(sellingPlanName, that.sellingPlanName) &&
        Objects.equals(sku, that.sku) &&
        taxable == that.taxable &&
        Objects.equals(title, that.title) &&
        Objects.equals(variantId, that.variantId) &&
        Objects.equals(variantImage, that.variantImage) &&
        Objects.equals(variantTitle, that.variantTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPrice, customAttributes, discountAllocations, id, lineDiscountedPrice, pricingPolicy, productId, quantity, requiresShipping, sellingPlanId, sellingPlanName, sku, taxable, title, variantId, variantImage, variantTitle);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The price per unit for the subscription line in the contract's currency.
     */
    private MoneyV2 currentPrice;

    /**
     * List of custom attributes associated to the line item.
     */
    private List<Attribute> customAttributes;

    /**
     * Discount allocations.
     */
    private List<SubscriptionDiscountAllocation> discountAllocations;

    /**
     * The unique ID.
     */
    private String id;

    /**
     * Total line price including all discounts.
     */
    private MoneyV2 lineDiscountedPrice;

    /**
     * Describe the price changes of the line over time.
     */
    private SubscriptionPricingPolicy pricingPolicy;

    /**
     * The product ID associated with the subscription line.
     */
    private String productId;

    /**
     * The quantity of the unit selected for the subscription line.
     */
    private int quantity;

    /**
     * Whether physical shipping is required for the variant.
     */
    private boolean requiresShipping;

    /**
     * The selling plan ID associated to the line.
     *   
     * Indicates which selling plan was used to create this
     * contract line initially. The selling plan ID is also used to
     * find the associated delivery profile.
     *   
     * The subscription contract, subscription line, or selling plan might have
     * changed. As a result, the selling plan's attributes might not
     * match the information on the contract.
     */
    private String sellingPlanId;

    /**
     * The selling plan name associated to the line. This name describes
     * the order line items created from this subscription line
     * for both merchants and customers.
     *   
     * The value can be different from the selling plan's name, because both
     * the selling plan's name and the subscription line's selling_plan_name
     * attribute can be updated independently.
     */
    private String sellingPlanName;

    /**
     * Variant SKU number of the item associated with the subscription line.
     */
    private String sku;

    /**
     * Whether the variant is taxable.
     */
    private boolean taxable;

    /**
     * Product title of the item associated with the subscription line.
     */
    private String title;

    /**
     * The product variant ID associated with the subscription line.
     */
    private String variantId;

    /**
     * The image associated with the line item's variant or product.
     */
    private Image variantImage;

    /**
     * Product variant title of the item associated with the subscription line.
     */
    private String variantTitle;

    public SubscriptionLine build() {
      SubscriptionLine result = new SubscriptionLine();
      result.currentPrice = this.currentPrice;
      result.customAttributes = this.customAttributes;
      result.discountAllocations = this.discountAllocations;
      result.id = this.id;
      result.lineDiscountedPrice = this.lineDiscountedPrice;
      result.pricingPolicy = this.pricingPolicy;
      result.productId = this.productId;
      result.quantity = this.quantity;
      result.requiresShipping = this.requiresShipping;
      result.sellingPlanId = this.sellingPlanId;
      result.sellingPlanName = this.sellingPlanName;
      result.sku = this.sku;
      result.taxable = this.taxable;
      result.title = this.title;
      result.variantId = this.variantId;
      result.variantImage = this.variantImage;
      result.variantTitle = this.variantTitle;
      return result;
    }

    /**
     * The price per unit for the subscription line in the contract's currency.
     */
    public Builder currentPrice(MoneyV2 currentPrice) {
      this.currentPrice = currentPrice;
      return this;
    }

    /**
     * List of custom attributes associated to the line item.
     */
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * Discount allocations.
     */
    public Builder discountAllocations(List<SubscriptionDiscountAllocation> discountAllocations) {
      this.discountAllocations = discountAllocations;
      return this;
    }

    /**
     * The unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Total line price including all discounts.
     */
    public Builder lineDiscountedPrice(MoneyV2 lineDiscountedPrice) {
      this.lineDiscountedPrice = lineDiscountedPrice;
      return this;
    }

    /**
     * Describe the price changes of the line over time.
     */
    public Builder pricingPolicy(SubscriptionPricingPolicy pricingPolicy) {
      this.pricingPolicy = pricingPolicy;
      return this;
    }

    /**
     * The product ID associated with the subscription line.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    /**
     * The quantity of the unit selected for the subscription line.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * Whether physical shipping is required for the variant.
     */
    public Builder requiresShipping(boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    /**
     * The selling plan ID associated to the line.
     *   
     * Indicates which selling plan was used to create this
     * contract line initially. The selling plan ID is also used to
     * find the associated delivery profile.
     *   
     * The subscription contract, subscription line, or selling plan might have
     * changed. As a result, the selling plan's attributes might not
     * match the information on the contract.
     */
    public Builder sellingPlanId(String sellingPlanId) {
      this.sellingPlanId = sellingPlanId;
      return this;
    }

    /**
     * The selling plan name associated to the line. This name describes
     * the order line items created from this subscription line
     * for both merchants and customers.
     *   
     * The value can be different from the selling plan's name, because both
     * the selling plan's name and the subscription line's selling_plan_name
     * attribute can be updated independently.
     */
    public Builder sellingPlanName(String sellingPlanName) {
      this.sellingPlanName = sellingPlanName;
      return this;
    }

    /**
     * Variant SKU number of the item associated with the subscription line.
     */
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    /**
     * Whether the variant is taxable.
     */
    public Builder taxable(boolean taxable) {
      this.taxable = taxable;
      return this;
    }

    /**
     * Product title of the item associated with the subscription line.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The product variant ID associated with the subscription line.
     */
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }

    /**
     * The image associated with the line item's variant or product.
     */
    public Builder variantImage(Image variantImage) {
      this.variantImage = variantImage;
      return this;
    }

    /**
     * Product variant title of the item associated with the subscription line.
     */
    public Builder variantTitle(String variantTitle) {
      this.variantTitle = variantTitle;
      return this;
    }
  }
}
