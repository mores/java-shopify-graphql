package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A single line item in an abandoned checkout.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AbandonedCheckoutLineItem implements com.shopify.types.Node {
  /**
   * A list of extra information that has been added to the line item.
   */
  private List<Attribute> customAttributes;

  /**
   * Discount allocations that have been applied on the line item.
   */
  private DiscountAllocationConnection discountAllocations;

  /**
   * Final total price for the entire quantity of this line item, including discounts.
   */
  private MoneyBag discountedTotalPriceSet;

  /**
   * The total price for the entire quantity of this line item, after all discounts
   * are applied, at both the line item and code-based line item level.
   */
  private MoneyBag discountedTotalPriceWithCodeDiscount;

  /**
   * The price of a single variant unit after discounts are applied at the line item level, in shop and presentment currencies.
   */
  private MoneyBag discountedUnitPriceSet;

  /**
   * The price of a single variant unit after all discounts are applied, at both the line item and code-based line item level.
   */
  private MoneyBag discountedUnitPriceWithCodeDiscount;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The image associated with the line item's variant or product.
   * NULL if the line item has no product, or if neither the variant nor the product have an image.
   */
  private Image image;

  /**
   * Original total price for the entire quantity of this line item, before discounts.
   */
  private MoneyBag originalTotalPriceSet;

  /**
   * Original price for a single unit of this line item, before discounts.
   */
  private MoneyBag originalUnitPriceSet;

  /**
   * Product for this line item.
   * NULL for custom line items and products that were deleted after checkout began.
   */
  private Product product;

  /**
   * The quantity of the line item.
   */
  private int quantity;

  /**
   * SKU for the inventory item associated with the variant, if any.
   */
  private String sku;

  /**
   * Title of the line item. Defaults to the product's title.
   */
  private String title;

  /**
   * Product variant for this line item.
   * NULL for custom line items and variants that were deleted after checkout began.
   */
  private ProductVariant variant;

  /**
   * Title of the variant for this line item.
   * NULL for custom line items and products that don't have distinct variants.
   */
  private String variantTitle;

  public AbandonedCheckoutLineItem() {
  }

  /**
   * A list of extra information that has been added to the line item.
   */
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  /**
   * Discount allocations that have been applied on the line item.
   */
  public DiscountAllocationConnection getDiscountAllocations() {
    return discountAllocations;
  }

  public void setDiscountAllocations(DiscountAllocationConnection discountAllocations) {
    this.discountAllocations = discountAllocations;
  }

  /**
   * Final total price for the entire quantity of this line item, including discounts.
   */
  public MoneyBag getDiscountedTotalPriceSet() {
    return discountedTotalPriceSet;
  }

  public void setDiscountedTotalPriceSet(MoneyBag discountedTotalPriceSet) {
    this.discountedTotalPriceSet = discountedTotalPriceSet;
  }

  /**
   * The total price for the entire quantity of this line item, after all discounts
   * are applied, at both the line item and code-based line item level.
   */
  public MoneyBag getDiscountedTotalPriceWithCodeDiscount() {
    return discountedTotalPriceWithCodeDiscount;
  }

  public void setDiscountedTotalPriceWithCodeDiscount(
      MoneyBag discountedTotalPriceWithCodeDiscount) {
    this.discountedTotalPriceWithCodeDiscount = discountedTotalPriceWithCodeDiscount;
  }

  /**
   * The price of a single variant unit after discounts are applied at the line item level, in shop and presentment currencies.
   */
  public MoneyBag getDiscountedUnitPriceSet() {
    return discountedUnitPriceSet;
  }

  public void setDiscountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
    this.discountedUnitPriceSet = discountedUnitPriceSet;
  }

  /**
   * The price of a single variant unit after all discounts are applied, at both the line item and code-based line item level.
   */
  public MoneyBag getDiscountedUnitPriceWithCodeDiscount() {
    return discountedUnitPriceWithCodeDiscount;
  }

  public void setDiscountedUnitPriceWithCodeDiscount(MoneyBag discountedUnitPriceWithCodeDiscount) {
    this.discountedUnitPriceWithCodeDiscount = discountedUnitPriceWithCodeDiscount;
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
   * The image associated with the line item's variant or product.
   * NULL if the line item has no product, or if neither the variant nor the product have an image.
   */
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  /**
   * Original total price for the entire quantity of this line item, before discounts.
   */
  public MoneyBag getOriginalTotalPriceSet() {
    return originalTotalPriceSet;
  }

  public void setOriginalTotalPriceSet(MoneyBag originalTotalPriceSet) {
    this.originalTotalPriceSet = originalTotalPriceSet;
  }

  /**
   * Original price for a single unit of this line item, before discounts.
   */
  public MoneyBag getOriginalUnitPriceSet() {
    return originalUnitPriceSet;
  }

  public void setOriginalUnitPriceSet(MoneyBag originalUnitPriceSet) {
    this.originalUnitPriceSet = originalUnitPriceSet;
  }

  /**
   * Product for this line item.
   * NULL for custom line items and products that were deleted after checkout began.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * The quantity of the line item.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * SKU for the inventory item associated with the variant, if any.
   */
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * Title of the line item. Defaults to the product's title.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Product variant for this line item.
   * NULL for custom line items and variants that were deleted after checkout began.
   */
  public ProductVariant getVariant() {
    return variant;
  }

  public void setVariant(ProductVariant variant) {
    this.variant = variant;
  }

  /**
   * Title of the variant for this line item.
   * NULL for custom line items and products that don't have distinct variants.
   */
  public String getVariantTitle() {
    return variantTitle;
  }

  public void setVariantTitle(String variantTitle) {
    this.variantTitle = variantTitle;
  }

  @Override
  public String toString() {
    return "AbandonedCheckoutLineItem{customAttributes='" + customAttributes + "', discountAllocations='" + discountAllocations + "', discountedTotalPriceSet='" + discountedTotalPriceSet + "', discountedTotalPriceWithCodeDiscount='" + discountedTotalPriceWithCodeDiscount + "', discountedUnitPriceSet='" + discountedUnitPriceSet + "', discountedUnitPriceWithCodeDiscount='" + discountedUnitPriceWithCodeDiscount + "', id='" + id + "', image='" + image + "', originalTotalPriceSet='" + originalTotalPriceSet + "', originalUnitPriceSet='" + originalUnitPriceSet + "', product='" + product + "', quantity='" + quantity + "', sku='" + sku + "', title='" + title + "', variant='" + variant + "', variantTitle='" + variantTitle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AbandonedCheckoutLineItem that = (AbandonedCheckoutLineItem) o;
    return Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(discountAllocations, that.discountAllocations) &&
        Objects.equals(discountedTotalPriceSet, that.discountedTotalPriceSet) &&
        Objects.equals(discountedTotalPriceWithCodeDiscount, that.discountedTotalPriceWithCodeDiscount) &&
        Objects.equals(discountedUnitPriceSet, that.discountedUnitPriceSet) &&
        Objects.equals(discountedUnitPriceWithCodeDiscount, that.discountedUnitPriceWithCodeDiscount) &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        Objects.equals(originalTotalPriceSet, that.originalTotalPriceSet) &&
        Objects.equals(originalUnitPriceSet, that.originalUnitPriceSet) &&
        Objects.equals(product, that.product) &&
        quantity == that.quantity &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(title, that.title) &&
        Objects.equals(variant, that.variant) &&
        Objects.equals(variantTitle, that.variantTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customAttributes, discountAllocations, discountedTotalPriceSet, discountedTotalPriceWithCodeDiscount, discountedUnitPriceSet, discountedUnitPriceWithCodeDiscount, id, image, originalTotalPriceSet, originalUnitPriceSet, product, quantity, sku, title, variant, variantTitle);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of extra information that has been added to the line item.
     */
    private List<Attribute> customAttributes;

    /**
     * Discount allocations that have been applied on the line item.
     */
    private DiscountAllocationConnection discountAllocations;

    /**
     * Final total price for the entire quantity of this line item, including discounts.
     */
    private MoneyBag discountedTotalPriceSet;

    /**
     * The total price for the entire quantity of this line item, after all discounts
     * are applied, at both the line item and code-based line item level.
     */
    private MoneyBag discountedTotalPriceWithCodeDiscount;

    /**
     * The price of a single variant unit after discounts are applied at the line item level, in shop and presentment currencies.
     */
    private MoneyBag discountedUnitPriceSet;

    /**
     * The price of a single variant unit after all discounts are applied, at both the line item and code-based line item level.
     */
    private MoneyBag discountedUnitPriceWithCodeDiscount;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The image associated with the line item's variant or product.
     * NULL if the line item has no product, or if neither the variant nor the product have an image.
     */
    private Image image;

    /**
     * Original total price for the entire quantity of this line item, before discounts.
     */
    private MoneyBag originalTotalPriceSet;

    /**
     * Original price for a single unit of this line item, before discounts.
     */
    private MoneyBag originalUnitPriceSet;

    /**
     * Product for this line item.
     * NULL for custom line items and products that were deleted after checkout began.
     */
    private Product product;

    /**
     * The quantity of the line item.
     */
    private int quantity;

    /**
     * SKU for the inventory item associated with the variant, if any.
     */
    private String sku;

    /**
     * Title of the line item. Defaults to the product's title.
     */
    private String title;

    /**
     * Product variant for this line item.
     * NULL for custom line items and variants that were deleted after checkout began.
     */
    private ProductVariant variant;

    /**
     * Title of the variant for this line item.
     * NULL for custom line items and products that don't have distinct variants.
     */
    private String variantTitle;

    public AbandonedCheckoutLineItem build() {
      AbandonedCheckoutLineItem result = new AbandonedCheckoutLineItem();
      result.customAttributes = this.customAttributes;
      result.discountAllocations = this.discountAllocations;
      result.discountedTotalPriceSet = this.discountedTotalPriceSet;
      result.discountedTotalPriceWithCodeDiscount = this.discountedTotalPriceWithCodeDiscount;
      result.discountedUnitPriceSet = this.discountedUnitPriceSet;
      result.discountedUnitPriceWithCodeDiscount = this.discountedUnitPriceWithCodeDiscount;
      result.id = this.id;
      result.image = this.image;
      result.originalTotalPriceSet = this.originalTotalPriceSet;
      result.originalUnitPriceSet = this.originalUnitPriceSet;
      result.product = this.product;
      result.quantity = this.quantity;
      result.sku = this.sku;
      result.title = this.title;
      result.variant = this.variant;
      result.variantTitle = this.variantTitle;
      return result;
    }

    /**
     * A list of extra information that has been added to the line item.
     */
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * Discount allocations that have been applied on the line item.
     */
    public Builder discountAllocations(DiscountAllocationConnection discountAllocations) {
      this.discountAllocations = discountAllocations;
      return this;
    }

    /**
     * Final total price for the entire quantity of this line item, including discounts.
     */
    public Builder discountedTotalPriceSet(MoneyBag discountedTotalPriceSet) {
      this.discountedTotalPriceSet = discountedTotalPriceSet;
      return this;
    }

    /**
     * The total price for the entire quantity of this line item, after all discounts
     * are applied, at both the line item and code-based line item level.
     */
    public Builder discountedTotalPriceWithCodeDiscount(
        MoneyBag discountedTotalPriceWithCodeDiscount) {
      this.discountedTotalPriceWithCodeDiscount = discountedTotalPriceWithCodeDiscount;
      return this;
    }

    /**
     * The price of a single variant unit after discounts are applied at the line item level, in shop and presentment currencies.
     */
    public Builder discountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
      this.discountedUnitPriceSet = discountedUnitPriceSet;
      return this;
    }

    /**
     * The price of a single variant unit after all discounts are applied, at both the line item and code-based line item level.
     */
    public Builder discountedUnitPriceWithCodeDiscount(
        MoneyBag discountedUnitPriceWithCodeDiscount) {
      this.discountedUnitPriceWithCodeDiscount = discountedUnitPriceWithCodeDiscount;
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
     * The image associated with the line item's variant or product.
     * NULL if the line item has no product, or if neither the variant nor the product have an image.
     */
    public Builder image(Image image) {
      this.image = image;
      return this;
    }

    /**
     * Original total price for the entire quantity of this line item, before discounts.
     */
    public Builder originalTotalPriceSet(MoneyBag originalTotalPriceSet) {
      this.originalTotalPriceSet = originalTotalPriceSet;
      return this;
    }

    /**
     * Original price for a single unit of this line item, before discounts.
     */
    public Builder originalUnitPriceSet(MoneyBag originalUnitPriceSet) {
      this.originalUnitPriceSet = originalUnitPriceSet;
      return this;
    }

    /**
     * Product for this line item.
     * NULL for custom line items and products that were deleted after checkout began.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * The quantity of the line item.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * SKU for the inventory item associated with the variant, if any.
     */
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    /**
     * Title of the line item. Defaults to the product's title.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * Product variant for this line item.
     * NULL for custom line items and variants that were deleted after checkout began.
     */
    public Builder variant(ProductVariant variant) {
      this.variant = variant;
      return this;
    }

    /**
     * Title of the variant for this line item.
     * NULL for custom line items and products that don't have distinct variants.
     */
    public Builder variantTitle(String variantTitle) {
      this.variantTitle = variantTitle;
      return this;
    }
  }
}
