package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The calculated line item for a draft order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CalculatedDraftOrderLineItem implements DraftOrderPlatformDiscountAllocationTarget {
  /**
   * The custom applied discount.
   */
  private DraftOrderAppliedDiscount appliedDiscount;

  /**
   * The `discountedTotal` divided by `quantity`,
   * equal to the average value of the line item price per unit after discounts are applied.
   * This value doesn't include discounts applied to the entire draft order.
   */
  private MoneyBag approximateDiscountedUnitPriceSet;

  /**
   * The bundle components of the draft order line item.
   */
  private List<CalculatedDraftOrderLineItem> bundleComponents;

  /**
   * Whether the line item is custom (`true`) or contains a product variant (`false`).
   */
  private boolean custom;

  /**
   * A list of attributes that represent custom features or special requests.
   */
  private List<Attribute> customAttributes;

  /**
   * The list of additional information (metafields) with the associated types.
   */
  private List<TypedAttribute> customAttributesV2;

  /**
   * The total price with discounts applied.
   */
  private MoneyV2 discountedTotal;

  /**
   * The total price with discounts applied.
   */
  private MoneyBag discountedTotalSet;

  /**
   * The unit price with discounts applied.
   */
  private MoneyV2 discountedUnitPrice;

  /**
   * The unit price with discounts applied.
   */
  private MoneyBag discountedUnitPriceSet;

  /**
   * Name of the service provider who fulfilled the order.
   *   
   * Valid values are either **manual** or the name of the provider.
   * For example, **amazon**, **shipwire**.
   *   
   * Deleted fulfillment services will return null.
   */
  private FulfillmentService fulfillmentService;

  /**
   * The image associated with the draft order line item.
   */
  private Image image;

  /**
   * Whether the line item represents the purchase of a gift card.
   */
  private boolean isGiftCard;

  /**
   * The name of the product.
   */
  private String name;

  /**
   * The total price, excluding discounts, equal to the original unit price multiplied by quantity.
   */
  private MoneyV2 originalTotal;

  /**
   * The total price excluding discounts, equal to the original unit price multiplied by quantity.
   */
  private MoneyBag originalTotalSet;

  /**
   * The line item price without any discounts applied.
   */
  private MoneyV2 originalUnitPrice;

  /**
   * The price without any discounts applied.
   */
  private MoneyBag originalUnitPriceSet;

  /**
   * The original custom line item input price.
   */
  private MoneyV2 originalUnitPriceWithCurrency;

  /**
   * The price override for the line item.
   */
  private MoneyV2 priceOverride;

  /**
   * The product for the line item.
   */
  private Product product;

  /**
   * The quantity of items. For a bundle item, this is the quantity of bundles,
   * not the quantity of items contained in the bundles themselves.
   */
  private int quantity;

  /**
   * Whether physical shipping is required for the variant.
   */
  private boolean requiresShipping;

  /**
   * The SKU number of the product variant.
   */
  private String sku;

  /**
   * Whether the variant is taxable.
   */
  private boolean taxable;

  /**
   * The title of the product or variant. This field only applies to custom line items.
   */
  private String title;

  /**
   * The total value of the discount.
   */
  private MoneyV2 totalDiscount;

  /**
   * The total discount amount.
   */
  private MoneyBag totalDiscountSet;

  /**
   * The UUID of the draft order line item. Must be unique and consistent across requests.
   * This field is mandatory in order to manipulate drafts with bundles.
   */
  private String uuid;

  /**
   * The product variant for the line item.
   */
  private ProductVariant variant;

  /**
   * The name of the variant.
   */
  private String variantTitle;

  /**
   * The name of the vendor who created the product variant.
   */
  private String vendor;

  /**
   * The weight unit and value.
   */
  private Weight weight;

  public CalculatedDraftOrderLineItem() {
  }

  /**
   * The custom applied discount.
   */
  public DraftOrderAppliedDiscount getAppliedDiscount() {
    return appliedDiscount;
  }

  public void setAppliedDiscount(DraftOrderAppliedDiscount appliedDiscount) {
    this.appliedDiscount = appliedDiscount;
  }

  /**
   * The `discountedTotal` divided by `quantity`,
   * equal to the average value of the line item price per unit after discounts are applied.
   * This value doesn't include discounts applied to the entire draft order.
   */
  public MoneyBag getApproximateDiscountedUnitPriceSet() {
    return approximateDiscountedUnitPriceSet;
  }

  public void setApproximateDiscountedUnitPriceSet(MoneyBag approximateDiscountedUnitPriceSet) {
    this.approximateDiscountedUnitPriceSet = approximateDiscountedUnitPriceSet;
  }

  /**
   * The bundle components of the draft order line item.
   */
  public List<CalculatedDraftOrderLineItem> getBundleComponents() {
    return bundleComponents;
  }

  public void setBundleComponents(List<CalculatedDraftOrderLineItem> bundleComponents) {
    this.bundleComponents = bundleComponents;
  }

  /**
   * Whether the line item is custom (`true`) or contains a product variant (`false`).
   */
  public boolean getCustom() {
    return custom;
  }

  public void setCustom(boolean custom) {
    this.custom = custom;
  }

  /**
   * A list of attributes that represent custom features or special requests.
   */
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  /**
   * The list of additional information (metafields) with the associated types.
   */
  public List<TypedAttribute> getCustomAttributesV2() {
    return customAttributesV2;
  }

  public void setCustomAttributesV2(List<TypedAttribute> customAttributesV2) {
    this.customAttributesV2 = customAttributesV2;
  }

  /**
   * The total price with discounts applied.
   */
  public MoneyV2 getDiscountedTotal() {
    return discountedTotal;
  }

  public void setDiscountedTotal(MoneyV2 discountedTotal) {
    this.discountedTotal = discountedTotal;
  }

  /**
   * The total price with discounts applied.
   */
  public MoneyBag getDiscountedTotalSet() {
    return discountedTotalSet;
  }

  public void setDiscountedTotalSet(MoneyBag discountedTotalSet) {
    this.discountedTotalSet = discountedTotalSet;
  }

  /**
   * The unit price with discounts applied.
   */
  public MoneyV2 getDiscountedUnitPrice() {
    return discountedUnitPrice;
  }

  public void setDiscountedUnitPrice(MoneyV2 discountedUnitPrice) {
    this.discountedUnitPrice = discountedUnitPrice;
  }

  /**
   * The unit price with discounts applied.
   */
  public MoneyBag getDiscountedUnitPriceSet() {
    return discountedUnitPriceSet;
  }

  public void setDiscountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
    this.discountedUnitPriceSet = discountedUnitPriceSet;
  }

  /**
   * Name of the service provider who fulfilled the order.
   *   
   * Valid values are either **manual** or the name of the provider.
   * For example, **amazon**, **shipwire**.
   *   
   * Deleted fulfillment services will return null.
   */
  public FulfillmentService getFulfillmentService() {
    return fulfillmentService;
  }

  public void setFulfillmentService(FulfillmentService fulfillmentService) {
    this.fulfillmentService = fulfillmentService;
  }

  /**
   * The image associated with the draft order line item.
   */
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  /**
   * Whether the line item represents the purchase of a gift card.
   */
  public boolean getIsGiftCard() {
    return isGiftCard;
  }

  public void setIsGiftCard(boolean isGiftCard) {
    this.isGiftCard = isGiftCard;
  }

  /**
   * The name of the product.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The total price, excluding discounts, equal to the original unit price multiplied by quantity.
   */
  public MoneyV2 getOriginalTotal() {
    return originalTotal;
  }

  public void setOriginalTotal(MoneyV2 originalTotal) {
    this.originalTotal = originalTotal;
  }

  /**
   * The total price excluding discounts, equal to the original unit price multiplied by quantity.
   */
  public MoneyBag getOriginalTotalSet() {
    return originalTotalSet;
  }

  public void setOriginalTotalSet(MoneyBag originalTotalSet) {
    this.originalTotalSet = originalTotalSet;
  }

  /**
   * The line item price without any discounts applied.
   */
  public MoneyV2 getOriginalUnitPrice() {
    return originalUnitPrice;
  }

  public void setOriginalUnitPrice(MoneyV2 originalUnitPrice) {
    this.originalUnitPrice = originalUnitPrice;
  }

  /**
   * The price without any discounts applied.
   */
  public MoneyBag getOriginalUnitPriceSet() {
    return originalUnitPriceSet;
  }

  public void setOriginalUnitPriceSet(MoneyBag originalUnitPriceSet) {
    this.originalUnitPriceSet = originalUnitPriceSet;
  }

  /**
   * The original custom line item input price.
   */
  public MoneyV2 getOriginalUnitPriceWithCurrency() {
    return originalUnitPriceWithCurrency;
  }

  public void setOriginalUnitPriceWithCurrency(MoneyV2 originalUnitPriceWithCurrency) {
    this.originalUnitPriceWithCurrency = originalUnitPriceWithCurrency;
  }

  /**
   * The price override for the line item.
   */
  public MoneyV2 getPriceOverride() {
    return priceOverride;
  }

  public void setPriceOverride(MoneyV2 priceOverride) {
    this.priceOverride = priceOverride;
  }

  /**
   * The product for the line item.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * The quantity of items. For a bundle item, this is the quantity of bundles,
   * not the quantity of items contained in the bundles themselves.
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
   * The SKU number of the product variant.
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
   * The title of the product or variant. This field only applies to custom line items.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The total value of the discount.
   */
  public MoneyV2 getTotalDiscount() {
    return totalDiscount;
  }

  public void setTotalDiscount(MoneyV2 totalDiscount) {
    this.totalDiscount = totalDiscount;
  }

  /**
   * The total discount amount.
   */
  public MoneyBag getTotalDiscountSet() {
    return totalDiscountSet;
  }

  public void setTotalDiscountSet(MoneyBag totalDiscountSet) {
    this.totalDiscountSet = totalDiscountSet;
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
   * The product variant for the line item.
   */
  public ProductVariant getVariant() {
    return variant;
  }

  public void setVariant(ProductVariant variant) {
    this.variant = variant;
  }

  /**
   * The name of the variant.
   */
  public String getVariantTitle() {
    return variantTitle;
  }

  public void setVariantTitle(String variantTitle) {
    this.variantTitle = variantTitle;
  }

  /**
   * The name of the vendor who created the product variant.
   */
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  /**
   * The weight unit and value.
   */
  public Weight getWeight() {
    return weight;
  }

  public void setWeight(Weight weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "CalculatedDraftOrderLineItem{appliedDiscount='" + appliedDiscount + "', approximateDiscountedUnitPriceSet='" + approximateDiscountedUnitPriceSet + "', bundleComponents='" + bundleComponents + "', custom='" + custom + "', customAttributes='" + customAttributes + "', customAttributesV2='" + customAttributesV2 + "', discountedTotal='" + discountedTotal + "', discountedTotalSet='" + discountedTotalSet + "', discountedUnitPrice='" + discountedUnitPrice + "', discountedUnitPriceSet='" + discountedUnitPriceSet + "', fulfillmentService='" + fulfillmentService + "', image='" + image + "', isGiftCard='" + isGiftCard + "', name='" + name + "', originalTotal='" + originalTotal + "', originalTotalSet='" + originalTotalSet + "', originalUnitPrice='" + originalUnitPrice + "', originalUnitPriceSet='" + originalUnitPriceSet + "', originalUnitPriceWithCurrency='" + originalUnitPriceWithCurrency + "', priceOverride='" + priceOverride + "', product='" + product + "', quantity='" + quantity + "', requiresShipping='" + requiresShipping + "', sku='" + sku + "', taxable='" + taxable + "', title='" + title + "', totalDiscount='" + totalDiscount + "', totalDiscountSet='" + totalDiscountSet + "', uuid='" + uuid + "', variant='" + variant + "', variantTitle='" + variantTitle + "', vendor='" + vendor + "', weight='" + weight + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedDraftOrderLineItem that = (CalculatedDraftOrderLineItem) o;
    return Objects.equals(appliedDiscount, that.appliedDiscount) &&
        Objects.equals(approximateDiscountedUnitPriceSet, that.approximateDiscountedUnitPriceSet) &&
        Objects.equals(bundleComponents, that.bundleComponents) &&
        custom == that.custom &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(customAttributesV2, that.customAttributesV2) &&
        Objects.equals(discountedTotal, that.discountedTotal) &&
        Objects.equals(discountedTotalSet, that.discountedTotalSet) &&
        Objects.equals(discountedUnitPrice, that.discountedUnitPrice) &&
        Objects.equals(discountedUnitPriceSet, that.discountedUnitPriceSet) &&
        Objects.equals(fulfillmentService, that.fulfillmentService) &&
        Objects.equals(image, that.image) &&
        isGiftCard == that.isGiftCard &&
        Objects.equals(name, that.name) &&
        Objects.equals(originalTotal, that.originalTotal) &&
        Objects.equals(originalTotalSet, that.originalTotalSet) &&
        Objects.equals(originalUnitPrice, that.originalUnitPrice) &&
        Objects.equals(originalUnitPriceSet, that.originalUnitPriceSet) &&
        Objects.equals(originalUnitPriceWithCurrency, that.originalUnitPriceWithCurrency) &&
        Objects.equals(priceOverride, that.priceOverride) &&
        Objects.equals(product, that.product) &&
        quantity == that.quantity &&
        requiresShipping == that.requiresShipping &&
        Objects.equals(sku, that.sku) &&
        taxable == that.taxable &&
        Objects.equals(title, that.title) &&
        Objects.equals(totalDiscount, that.totalDiscount) &&
        Objects.equals(totalDiscountSet, that.totalDiscountSet) &&
        Objects.equals(uuid, that.uuid) &&
        Objects.equals(variant, that.variant) &&
        Objects.equals(variantTitle, that.variantTitle) &&
        Objects.equals(vendor, that.vendor) &&
        Objects.equals(weight, that.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedDiscount, approximateDiscountedUnitPriceSet, bundleComponents, custom, customAttributes, customAttributesV2, discountedTotal, discountedTotalSet, discountedUnitPrice, discountedUnitPriceSet, fulfillmentService, image, isGiftCard, name, originalTotal, originalTotalSet, originalUnitPrice, originalUnitPriceSet, originalUnitPriceWithCurrency, priceOverride, product, quantity, requiresShipping, sku, taxable, title, totalDiscount, totalDiscountSet, uuid, variant, variantTitle, vendor, weight);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The custom applied discount.
     */
    private DraftOrderAppliedDiscount appliedDiscount;

    /**
     * The `discountedTotal` divided by `quantity`,
     * equal to the average value of the line item price per unit after discounts are applied.
     * This value doesn't include discounts applied to the entire draft order.
     */
    private MoneyBag approximateDiscountedUnitPriceSet;

    /**
     * The bundle components of the draft order line item.
     */
    private List<CalculatedDraftOrderLineItem> bundleComponents;

    /**
     * Whether the line item is custom (`true`) or contains a product variant (`false`).
     */
    private boolean custom;

    /**
     * A list of attributes that represent custom features or special requests.
     */
    private List<Attribute> customAttributes;

    /**
     * The list of additional information (metafields) with the associated types.
     */
    private List<TypedAttribute> customAttributesV2;

    /**
     * The total price with discounts applied.
     */
    private MoneyV2 discountedTotal;

    /**
     * The total price with discounts applied.
     */
    private MoneyBag discountedTotalSet;

    /**
     * The unit price with discounts applied.
     */
    private MoneyV2 discountedUnitPrice;

    /**
     * The unit price with discounts applied.
     */
    private MoneyBag discountedUnitPriceSet;

    /**
     * Name of the service provider who fulfilled the order.
     *   
     * Valid values are either **manual** or the name of the provider.
     * For example, **amazon**, **shipwire**.
     *   
     * Deleted fulfillment services will return null.
     */
    private FulfillmentService fulfillmentService;

    /**
     * The image associated with the draft order line item.
     */
    private Image image;

    /**
     * Whether the line item represents the purchase of a gift card.
     */
    private boolean isGiftCard;

    /**
     * The name of the product.
     */
    private String name;

    /**
     * The total price, excluding discounts, equal to the original unit price multiplied by quantity.
     */
    private MoneyV2 originalTotal;

    /**
     * The total price excluding discounts, equal to the original unit price multiplied by quantity.
     */
    private MoneyBag originalTotalSet;

    /**
     * The line item price without any discounts applied.
     */
    private MoneyV2 originalUnitPrice;

    /**
     * The price without any discounts applied.
     */
    private MoneyBag originalUnitPriceSet;

    /**
     * The original custom line item input price.
     */
    private MoneyV2 originalUnitPriceWithCurrency;

    /**
     * The price override for the line item.
     */
    private MoneyV2 priceOverride;

    /**
     * The product for the line item.
     */
    private Product product;

    /**
     * The quantity of items. For a bundle item, this is the quantity of bundles,
     * not the quantity of items contained in the bundles themselves.
     */
    private int quantity;

    /**
     * Whether physical shipping is required for the variant.
     */
    private boolean requiresShipping;

    /**
     * The SKU number of the product variant.
     */
    private String sku;

    /**
     * Whether the variant is taxable.
     */
    private boolean taxable;

    /**
     * The title of the product or variant. This field only applies to custom line items.
     */
    private String title;

    /**
     * The total value of the discount.
     */
    private MoneyV2 totalDiscount;

    /**
     * The total discount amount.
     */
    private MoneyBag totalDiscountSet;

    /**
     * The UUID of the draft order line item. Must be unique and consistent across requests.
     * This field is mandatory in order to manipulate drafts with bundles.
     */
    private String uuid;

    /**
     * The product variant for the line item.
     */
    private ProductVariant variant;

    /**
     * The name of the variant.
     */
    private String variantTitle;

    /**
     * The name of the vendor who created the product variant.
     */
    private String vendor;

    /**
     * The weight unit and value.
     */
    private Weight weight;

    public CalculatedDraftOrderLineItem build() {
      CalculatedDraftOrderLineItem result = new CalculatedDraftOrderLineItem();
      result.appliedDiscount = this.appliedDiscount;
      result.approximateDiscountedUnitPriceSet = this.approximateDiscountedUnitPriceSet;
      result.bundleComponents = this.bundleComponents;
      result.custom = this.custom;
      result.customAttributes = this.customAttributes;
      result.customAttributesV2 = this.customAttributesV2;
      result.discountedTotal = this.discountedTotal;
      result.discountedTotalSet = this.discountedTotalSet;
      result.discountedUnitPrice = this.discountedUnitPrice;
      result.discountedUnitPriceSet = this.discountedUnitPriceSet;
      result.fulfillmentService = this.fulfillmentService;
      result.image = this.image;
      result.isGiftCard = this.isGiftCard;
      result.name = this.name;
      result.originalTotal = this.originalTotal;
      result.originalTotalSet = this.originalTotalSet;
      result.originalUnitPrice = this.originalUnitPrice;
      result.originalUnitPriceSet = this.originalUnitPriceSet;
      result.originalUnitPriceWithCurrency = this.originalUnitPriceWithCurrency;
      result.priceOverride = this.priceOverride;
      result.product = this.product;
      result.quantity = this.quantity;
      result.requiresShipping = this.requiresShipping;
      result.sku = this.sku;
      result.taxable = this.taxable;
      result.title = this.title;
      result.totalDiscount = this.totalDiscount;
      result.totalDiscountSet = this.totalDiscountSet;
      result.uuid = this.uuid;
      result.variant = this.variant;
      result.variantTitle = this.variantTitle;
      result.vendor = this.vendor;
      result.weight = this.weight;
      return result;
    }

    /**
     * The custom applied discount.
     */
    public Builder appliedDiscount(DraftOrderAppliedDiscount appliedDiscount) {
      this.appliedDiscount = appliedDiscount;
      return this;
    }

    /**
     * The `discountedTotal` divided by `quantity`,
     * equal to the average value of the line item price per unit after discounts are applied.
     * This value doesn't include discounts applied to the entire draft order.
     */
    public Builder approximateDiscountedUnitPriceSet(MoneyBag approximateDiscountedUnitPriceSet) {
      this.approximateDiscountedUnitPriceSet = approximateDiscountedUnitPriceSet;
      return this;
    }

    /**
     * The bundle components of the draft order line item.
     */
    public Builder bundleComponents(List<CalculatedDraftOrderLineItem> bundleComponents) {
      this.bundleComponents = bundleComponents;
      return this;
    }

    /**
     * Whether the line item is custom (`true`) or contains a product variant (`false`).
     */
    public Builder custom(boolean custom) {
      this.custom = custom;
      return this;
    }

    /**
     * A list of attributes that represent custom features or special requests.
     */
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * The list of additional information (metafields) with the associated types.
     */
    public Builder customAttributesV2(List<TypedAttribute> customAttributesV2) {
      this.customAttributesV2 = customAttributesV2;
      return this;
    }

    /**
     * The total price with discounts applied.
     */
    public Builder discountedTotal(MoneyV2 discountedTotal) {
      this.discountedTotal = discountedTotal;
      return this;
    }

    /**
     * The total price with discounts applied.
     */
    public Builder discountedTotalSet(MoneyBag discountedTotalSet) {
      this.discountedTotalSet = discountedTotalSet;
      return this;
    }

    /**
     * The unit price with discounts applied.
     */
    public Builder discountedUnitPrice(MoneyV2 discountedUnitPrice) {
      this.discountedUnitPrice = discountedUnitPrice;
      return this;
    }

    /**
     * The unit price with discounts applied.
     */
    public Builder discountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
      this.discountedUnitPriceSet = discountedUnitPriceSet;
      return this;
    }

    /**
     * Name of the service provider who fulfilled the order.
     *   
     * Valid values are either **manual** or the name of the provider.
     * For example, **amazon**, **shipwire**.
     *   
     * Deleted fulfillment services will return null.
     */
    public Builder fulfillmentService(FulfillmentService fulfillmentService) {
      this.fulfillmentService = fulfillmentService;
      return this;
    }

    /**
     * The image associated with the draft order line item.
     */
    public Builder image(Image image) {
      this.image = image;
      return this;
    }

    /**
     * Whether the line item represents the purchase of a gift card.
     */
    public Builder isGiftCard(boolean isGiftCard) {
      this.isGiftCard = isGiftCard;
      return this;
    }

    /**
     * The name of the product.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The total price, excluding discounts, equal to the original unit price multiplied by quantity.
     */
    public Builder originalTotal(MoneyV2 originalTotal) {
      this.originalTotal = originalTotal;
      return this;
    }

    /**
     * The total price excluding discounts, equal to the original unit price multiplied by quantity.
     */
    public Builder originalTotalSet(MoneyBag originalTotalSet) {
      this.originalTotalSet = originalTotalSet;
      return this;
    }

    /**
     * The line item price without any discounts applied.
     */
    public Builder originalUnitPrice(MoneyV2 originalUnitPrice) {
      this.originalUnitPrice = originalUnitPrice;
      return this;
    }

    /**
     * The price without any discounts applied.
     */
    public Builder originalUnitPriceSet(MoneyBag originalUnitPriceSet) {
      this.originalUnitPriceSet = originalUnitPriceSet;
      return this;
    }

    /**
     * The original custom line item input price.
     */
    public Builder originalUnitPriceWithCurrency(MoneyV2 originalUnitPriceWithCurrency) {
      this.originalUnitPriceWithCurrency = originalUnitPriceWithCurrency;
      return this;
    }

    /**
     * The price override for the line item.
     */
    public Builder priceOverride(MoneyV2 priceOverride) {
      this.priceOverride = priceOverride;
      return this;
    }

    /**
     * The product for the line item.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * The quantity of items. For a bundle item, this is the quantity of bundles,
     * not the quantity of items contained in the bundles themselves.
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
     * The SKU number of the product variant.
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
     * The title of the product or variant. This field only applies to custom line items.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The total value of the discount.
     */
    public Builder totalDiscount(MoneyV2 totalDiscount) {
      this.totalDiscount = totalDiscount;
      return this;
    }

    /**
     * The total discount amount.
     */
    public Builder totalDiscountSet(MoneyBag totalDiscountSet) {
      this.totalDiscountSet = totalDiscountSet;
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
     * The product variant for the line item.
     */
    public Builder variant(ProductVariant variant) {
      this.variant = variant;
      return this;
    }

    /**
     * The name of the variant.
     */
    public Builder variantTitle(String variantTitle) {
      this.variantTitle = variantTitle;
      return this;
    }

    /**
     * The name of the vendor who created the product variant.
     */
    public Builder vendor(String vendor) {
      this.vendor = vendor;
      return this;
    }

    /**
     * The weight unit and value.
     */
    public Builder weight(Weight weight) {
      this.weight = weight;
      return this;
    }
  }
}
