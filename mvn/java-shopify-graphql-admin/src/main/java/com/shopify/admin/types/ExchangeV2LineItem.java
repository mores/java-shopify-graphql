package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Contains information about an item in the exchange.
 */
public class ExchangeV2LineItem {
  /**
   * A list of attributes that represent custom features or special requests.
   */
  private List<Attribute> customAttributes;

  /**
   * The total line price, in shop and presentment currencies, after discounts are applied.
   */
  private MoneyBag discountedTotalSet;

  /**
   * The price, in shop and presentment currencies,
   * of a single variant unit after line item discounts are applied.
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
   * Indiciates if this line item is a gift card.
   */
  private boolean giftCard;

  /**
   * The gift cards associated with the line item.
   */
  private List<GiftCard> giftCards;

  /**
   * Whether the line item represents the purchase of a gift card.
   */
  private boolean isGiftCard;

  /**
   * The line item associated with this object.
   */
  private LineItem lineItem;

  /**
   * The name of the product.
   */
  private String name;

  /**
   * The total price, in shop and presentment currencies, before discounts are applied.
   */
  private MoneyBag originalTotalSet;

  /**
   * The price, in shop and presentment currencies,
   * of a single variant unit before line item discounts are applied.
   */
  private MoneyBag originalUnitPriceSet;

  /**
   * The number of products that were purchased.
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
   * The TaxLine object connected to this line item.
   */
  private List<TaxLine> taxLines;

  /**
   * Whether the variant is taxable.
   */
  private boolean taxable;

  /**
   * The title of the product or variant. This field only applies to custom line items.
   */
  private String title;

  /**
   * The product variant of the line item.
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

  public ExchangeV2LineItem() {
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
   * The total line price, in shop and presentment currencies, after discounts are applied.
   */
  public MoneyBag getDiscountedTotalSet() {
    return discountedTotalSet;
  }

  public void setDiscountedTotalSet(MoneyBag discountedTotalSet) {
    this.discountedTotalSet = discountedTotalSet;
  }

  /**
   * The price, in shop and presentment currencies,
   * of a single variant unit after line item discounts are applied.
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
   * Indiciates if this line item is a gift card.
   */
  public boolean getGiftCard() {
    return giftCard;
  }

  public void setGiftCard(boolean giftCard) {
    this.giftCard = giftCard;
  }

  /**
   * The gift cards associated with the line item.
   */
  public List<GiftCard> getGiftCards() {
    return giftCards;
  }

  public void setGiftCards(List<GiftCard> giftCards) {
    this.giftCards = giftCards;
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
   * The line item associated with this object.
   */
  public LineItem getLineItem() {
    return lineItem;
  }

  public void setLineItem(LineItem lineItem) {
    this.lineItem = lineItem;
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
   * The total price, in shop and presentment currencies, before discounts are applied.
   */
  public MoneyBag getOriginalTotalSet() {
    return originalTotalSet;
  }

  public void setOriginalTotalSet(MoneyBag originalTotalSet) {
    this.originalTotalSet = originalTotalSet;
  }

  /**
   * The price, in shop and presentment currencies,
   * of a single variant unit before line item discounts are applied.
   */
  public MoneyBag getOriginalUnitPriceSet() {
    return originalUnitPriceSet;
  }

  public void setOriginalUnitPriceSet(MoneyBag originalUnitPriceSet) {
    this.originalUnitPriceSet = originalUnitPriceSet;
  }

  /**
   * The number of products that were purchased.
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
   * The TaxLine object connected to this line item.
   */
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
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
   * The product variant of the line item.
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

  @Override
  public String toString() {
    return "ExchangeV2LineItem{customAttributes='" + customAttributes + "', discountedTotalSet='" + discountedTotalSet + "', discountedUnitPriceSet='" + discountedUnitPriceSet + "', fulfillmentService='" + fulfillmentService + "', giftCard='" + giftCard + "', giftCards='" + giftCards + "', isGiftCard='" + isGiftCard + "', lineItem='" + lineItem + "', name='" + name + "', originalTotalSet='" + originalTotalSet + "', originalUnitPriceSet='" + originalUnitPriceSet + "', quantity='" + quantity + "', requiresShipping='" + requiresShipping + "', sku='" + sku + "', taxLines='" + taxLines + "', taxable='" + taxable + "', title='" + title + "', variant='" + variant + "', variantTitle='" + variantTitle + "', vendor='" + vendor + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeV2LineItem that = (ExchangeV2LineItem) o;
    return Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(discountedTotalSet, that.discountedTotalSet) &&
        Objects.equals(discountedUnitPriceSet, that.discountedUnitPriceSet) &&
        Objects.equals(fulfillmentService, that.fulfillmentService) &&
        giftCard == that.giftCard &&
        Objects.equals(giftCards, that.giftCards) &&
        isGiftCard == that.isGiftCard &&
        Objects.equals(lineItem, that.lineItem) &&
        Objects.equals(name, that.name) &&
        Objects.equals(originalTotalSet, that.originalTotalSet) &&
        Objects.equals(originalUnitPriceSet, that.originalUnitPriceSet) &&
        quantity == that.quantity &&
        requiresShipping == that.requiresShipping &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(taxLines, that.taxLines) &&
        taxable == that.taxable &&
        Objects.equals(title, that.title) &&
        Objects.equals(variant, that.variant) &&
        Objects.equals(variantTitle, that.variantTitle) &&
        Objects.equals(vendor, that.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customAttributes, discountedTotalSet, discountedUnitPriceSet, fulfillmentService, giftCard, giftCards, isGiftCard, lineItem, name, originalTotalSet, originalUnitPriceSet, quantity, requiresShipping, sku, taxLines, taxable, title, variant, variantTitle, vendor);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of attributes that represent custom features or special requests.
     */
    private List<Attribute> customAttributes;

    /**
     * The total line price, in shop and presentment currencies, after discounts are applied.
     */
    private MoneyBag discountedTotalSet;

    /**
     * The price, in shop and presentment currencies,
     * of a single variant unit after line item discounts are applied.
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
     * Indiciates if this line item is a gift card.
     */
    private boolean giftCard;

    /**
     * The gift cards associated with the line item.
     */
    private List<GiftCard> giftCards;

    /**
     * Whether the line item represents the purchase of a gift card.
     */
    private boolean isGiftCard;

    /**
     * The line item associated with this object.
     */
    private LineItem lineItem;

    /**
     * The name of the product.
     */
    private String name;

    /**
     * The total price, in shop and presentment currencies, before discounts are applied.
     */
    private MoneyBag originalTotalSet;

    /**
     * The price, in shop and presentment currencies,
     * of a single variant unit before line item discounts are applied.
     */
    private MoneyBag originalUnitPriceSet;

    /**
     * The number of products that were purchased.
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
     * The TaxLine object connected to this line item.
     */
    private List<TaxLine> taxLines;

    /**
     * Whether the variant is taxable.
     */
    private boolean taxable;

    /**
     * The title of the product or variant. This field only applies to custom line items.
     */
    private String title;

    /**
     * The product variant of the line item.
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

    public ExchangeV2LineItem build() {
      ExchangeV2LineItem result = new ExchangeV2LineItem();
      result.customAttributes = this.customAttributes;
      result.discountedTotalSet = this.discountedTotalSet;
      result.discountedUnitPriceSet = this.discountedUnitPriceSet;
      result.fulfillmentService = this.fulfillmentService;
      result.giftCard = this.giftCard;
      result.giftCards = this.giftCards;
      result.isGiftCard = this.isGiftCard;
      result.lineItem = this.lineItem;
      result.name = this.name;
      result.originalTotalSet = this.originalTotalSet;
      result.originalUnitPriceSet = this.originalUnitPriceSet;
      result.quantity = this.quantity;
      result.requiresShipping = this.requiresShipping;
      result.sku = this.sku;
      result.taxLines = this.taxLines;
      result.taxable = this.taxable;
      result.title = this.title;
      result.variant = this.variant;
      result.variantTitle = this.variantTitle;
      result.vendor = this.vendor;
      return result;
    }

    /**
     * A list of attributes that represent custom features or special requests.
     */
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * The total line price, in shop and presentment currencies, after discounts are applied.
     */
    public Builder discountedTotalSet(MoneyBag discountedTotalSet) {
      this.discountedTotalSet = discountedTotalSet;
      return this;
    }

    /**
     * The price, in shop and presentment currencies,
     * of a single variant unit after line item discounts are applied.
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
     * Indiciates if this line item is a gift card.
     */
    public Builder giftCard(boolean giftCard) {
      this.giftCard = giftCard;
      return this;
    }

    /**
     * The gift cards associated with the line item.
     */
    public Builder giftCards(List<GiftCard> giftCards) {
      this.giftCards = giftCards;
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
     * The line item associated with this object.
     */
    public Builder lineItem(LineItem lineItem) {
      this.lineItem = lineItem;
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
     * The total price, in shop and presentment currencies, before discounts are applied.
     */
    public Builder originalTotalSet(MoneyBag originalTotalSet) {
      this.originalTotalSet = originalTotalSet;
      return this;
    }

    /**
     * The price, in shop and presentment currencies,
     * of a single variant unit before line item discounts are applied.
     */
    public Builder originalUnitPriceSet(MoneyBag originalUnitPriceSet) {
      this.originalUnitPriceSet = originalUnitPriceSet;
      return this;
    }

    /**
     * The number of products that were purchased.
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
     * The TaxLine object connected to this line item.
     */
    public Builder taxLines(List<TaxLine> taxLines) {
      this.taxLines = taxLines;
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
     * The product variant of the line item.
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
  }
}
