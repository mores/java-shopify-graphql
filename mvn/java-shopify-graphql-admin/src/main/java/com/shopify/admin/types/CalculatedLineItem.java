package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A line item involved in order editing that may be newly added or have new changes applied.
 */
public class CalculatedLineItem {
  /**
   * The discounts that have been allocated onto the line item by discount applications.
   */
  private List<CalculatedDiscountAllocation> calculatedDiscountAllocations;

  /**
   * A list of attributes that represent custom features or special requests.
   */
  private List<Attribute> customAttributes;

  /**
   * The discounts that have been allocated onto the line item by discount applications.
   */
  private List<DiscountAllocation> discountAllocations;

  /**
   * The price of a single quantity of the line item with line item discounts
   * applied, in shop and presentment currencies. Discounts applied to the entire
   * order aren't included in this price.
   */
  private MoneyBag discountedUnitPriceSet;

  /**
   * The total number of items that can be edited.
   */
  private int editableQuantity;

  /**
   * The editable quantity prior to any changes made in the current edit.
   */
  private int editableQuantityBeforeChanges;

  /**
   * The total price of editable lines in shop and presentment currencies.
   */
  private MoneyBag editableSubtotalSet;

  /**
   * Whether the calculated line item has a staged discount.
   */
  private boolean hasStagedLineItemDiscount;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The image object associated to the line item's variant.
   */
  private Image image;

  /**
   * The variant unit price in shop and presentment currencies, without any discounts applied.
   */
  private MoneyBag originalUnitPriceSet;

  /**
   * The total number of items.
   */
  private int quantity;

  /**
   * Whether the line item can be restocked or not.
   */
  private boolean restockable;

  /**
   * Whether the changes on the line item will result in a restock.
   */
  private boolean restocking;

  /**
   * The variant SKU number.
   */
  private String sku;

  /**
   * A list of changes that affect this line item.
   */
  private List<OrderStagedChange> stagedChanges;

  /**
   * The title of the product.
   */
  private String title;

  /**
   * The total price of uneditable lines in shop and presentment currencies.
   */
  private MoneyBag uneditableSubtotalSet;

  /**
   * The product variant associated with this line item. The value is null for custom line items and items where
   * the variant has been deleted.
   */
  private ProductVariant variant;

  /**
   * The title of the variant.
   */
  private String variantTitle;

  public CalculatedLineItem() {
  }

  /**
   * The discounts that have been allocated onto the line item by discount applications.
   */
  public List<CalculatedDiscountAllocation> getCalculatedDiscountAllocations() {
    return calculatedDiscountAllocations;
  }

  public void setCalculatedDiscountAllocations(
      List<CalculatedDiscountAllocation> calculatedDiscountAllocations) {
    this.calculatedDiscountAllocations = calculatedDiscountAllocations;
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
   * The discounts that have been allocated onto the line item by discount applications.
   */
  public List<DiscountAllocation> getDiscountAllocations() {
    return discountAllocations;
  }

  public void setDiscountAllocations(List<DiscountAllocation> discountAllocations) {
    this.discountAllocations = discountAllocations;
  }

  /**
   * The price of a single quantity of the line item with line item discounts
   * applied, in shop and presentment currencies. Discounts applied to the entire
   * order aren't included in this price.
   */
  public MoneyBag getDiscountedUnitPriceSet() {
    return discountedUnitPriceSet;
  }

  public void setDiscountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
    this.discountedUnitPriceSet = discountedUnitPriceSet;
  }

  /**
   * The total number of items that can be edited.
   */
  public int getEditableQuantity() {
    return editableQuantity;
  }

  public void setEditableQuantity(int editableQuantity) {
    this.editableQuantity = editableQuantity;
  }

  /**
   * The editable quantity prior to any changes made in the current edit.
   */
  public int getEditableQuantityBeforeChanges() {
    return editableQuantityBeforeChanges;
  }

  public void setEditableQuantityBeforeChanges(int editableQuantityBeforeChanges) {
    this.editableQuantityBeforeChanges = editableQuantityBeforeChanges;
  }

  /**
   * The total price of editable lines in shop and presentment currencies.
   */
  public MoneyBag getEditableSubtotalSet() {
    return editableSubtotalSet;
  }

  public void setEditableSubtotalSet(MoneyBag editableSubtotalSet) {
    this.editableSubtotalSet = editableSubtotalSet;
  }

  /**
   * Whether the calculated line item has a staged discount.
   */
  public boolean getHasStagedLineItemDiscount() {
    return hasStagedLineItemDiscount;
  }

  public void setHasStagedLineItemDiscount(boolean hasStagedLineItemDiscount) {
    this.hasStagedLineItemDiscount = hasStagedLineItemDiscount;
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
   * The image object associated to the line item's variant.
   */
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  /**
   * The variant unit price in shop and presentment currencies, without any discounts applied.
   */
  public MoneyBag getOriginalUnitPriceSet() {
    return originalUnitPriceSet;
  }

  public void setOriginalUnitPriceSet(MoneyBag originalUnitPriceSet) {
    this.originalUnitPriceSet = originalUnitPriceSet;
  }

  /**
   * The total number of items.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * Whether the line item can be restocked or not.
   */
  public boolean getRestockable() {
    return restockable;
  }

  public void setRestockable(boolean restockable) {
    this.restockable = restockable;
  }

  /**
   * Whether the changes on the line item will result in a restock.
   */
  public boolean getRestocking() {
    return restocking;
  }

  public void setRestocking(boolean restocking) {
    this.restocking = restocking;
  }

  /**
   * The variant SKU number.
   */
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * A list of changes that affect this line item.
   */
  public List<OrderStagedChange> getStagedChanges() {
    return stagedChanges;
  }

  public void setStagedChanges(List<OrderStagedChange> stagedChanges) {
    this.stagedChanges = stagedChanges;
  }

  /**
   * The title of the product.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The total price of uneditable lines in shop and presentment currencies.
   */
  public MoneyBag getUneditableSubtotalSet() {
    return uneditableSubtotalSet;
  }

  public void setUneditableSubtotalSet(MoneyBag uneditableSubtotalSet) {
    this.uneditableSubtotalSet = uneditableSubtotalSet;
  }

  /**
   * The product variant associated with this line item. The value is null for custom line items and items where
   * the variant has been deleted.
   */
  public ProductVariant getVariant() {
    return variant;
  }

  public void setVariant(ProductVariant variant) {
    this.variant = variant;
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

  @Override
  public String toString() {
    return "CalculatedLineItem{calculatedDiscountAllocations='" + calculatedDiscountAllocations + "', customAttributes='" + customAttributes + "', discountAllocations='" + discountAllocations + "', discountedUnitPriceSet='" + discountedUnitPriceSet + "', editableQuantity='" + editableQuantity + "', editableQuantityBeforeChanges='" + editableQuantityBeforeChanges + "', editableSubtotalSet='" + editableSubtotalSet + "', hasStagedLineItemDiscount='" + hasStagedLineItemDiscount + "', id='" + id + "', image='" + image + "', originalUnitPriceSet='" + originalUnitPriceSet + "', quantity='" + quantity + "', restockable='" + restockable + "', restocking='" + restocking + "', sku='" + sku + "', stagedChanges='" + stagedChanges + "', title='" + title + "', uneditableSubtotalSet='" + uneditableSubtotalSet + "', variant='" + variant + "', variantTitle='" + variantTitle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedLineItem that = (CalculatedLineItem) o;
    return Objects.equals(calculatedDiscountAllocations, that.calculatedDiscountAllocations) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(discountAllocations, that.discountAllocations) &&
        Objects.equals(discountedUnitPriceSet, that.discountedUnitPriceSet) &&
        editableQuantity == that.editableQuantity &&
        editableQuantityBeforeChanges == that.editableQuantityBeforeChanges &&
        Objects.equals(editableSubtotalSet, that.editableSubtotalSet) &&
        hasStagedLineItemDiscount == that.hasStagedLineItemDiscount &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        Objects.equals(originalUnitPriceSet, that.originalUnitPriceSet) &&
        quantity == that.quantity &&
        restockable == that.restockable &&
        restocking == that.restocking &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(stagedChanges, that.stagedChanges) &&
        Objects.equals(title, that.title) &&
        Objects.equals(uneditableSubtotalSet, that.uneditableSubtotalSet) &&
        Objects.equals(variant, that.variant) &&
        Objects.equals(variantTitle, that.variantTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculatedDiscountAllocations, customAttributes, discountAllocations, discountedUnitPriceSet, editableQuantity, editableQuantityBeforeChanges, editableSubtotalSet, hasStagedLineItemDiscount, id, image, originalUnitPriceSet, quantity, restockable, restocking, sku, stagedChanges, title, uneditableSubtotalSet, variant, variantTitle);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The discounts that have been allocated onto the line item by discount applications.
     */
    private List<CalculatedDiscountAllocation> calculatedDiscountAllocations;

    /**
     * A list of attributes that represent custom features or special requests.
     */
    private List<Attribute> customAttributes;

    /**
     * The discounts that have been allocated onto the line item by discount applications.
     */
    private List<DiscountAllocation> discountAllocations;

    /**
     * The price of a single quantity of the line item with line item discounts
     * applied, in shop and presentment currencies. Discounts applied to the entire
     * order aren't included in this price.
     */
    private MoneyBag discountedUnitPriceSet;

    /**
     * The total number of items that can be edited.
     */
    private int editableQuantity;

    /**
     * The editable quantity prior to any changes made in the current edit.
     */
    private int editableQuantityBeforeChanges;

    /**
     * The total price of editable lines in shop and presentment currencies.
     */
    private MoneyBag editableSubtotalSet;

    /**
     * Whether the calculated line item has a staged discount.
     */
    private boolean hasStagedLineItemDiscount;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The image object associated to the line item's variant.
     */
    private Image image;

    /**
     * The variant unit price in shop and presentment currencies, without any discounts applied.
     */
    private MoneyBag originalUnitPriceSet;

    /**
     * The total number of items.
     */
    private int quantity;

    /**
     * Whether the line item can be restocked or not.
     */
    private boolean restockable;

    /**
     * Whether the changes on the line item will result in a restock.
     */
    private boolean restocking;

    /**
     * The variant SKU number.
     */
    private String sku;

    /**
     * A list of changes that affect this line item.
     */
    private List<OrderStagedChange> stagedChanges;

    /**
     * The title of the product.
     */
    private String title;

    /**
     * The total price of uneditable lines in shop and presentment currencies.
     */
    private MoneyBag uneditableSubtotalSet;

    /**
     * The product variant associated with this line item. The value is null for custom line items and items where
     * the variant has been deleted.
     */
    private ProductVariant variant;

    /**
     * The title of the variant.
     */
    private String variantTitle;

    public CalculatedLineItem build() {
      CalculatedLineItem result = new CalculatedLineItem();
      result.calculatedDiscountAllocations = this.calculatedDiscountAllocations;
      result.customAttributes = this.customAttributes;
      result.discountAllocations = this.discountAllocations;
      result.discountedUnitPriceSet = this.discountedUnitPriceSet;
      result.editableQuantity = this.editableQuantity;
      result.editableQuantityBeforeChanges = this.editableQuantityBeforeChanges;
      result.editableSubtotalSet = this.editableSubtotalSet;
      result.hasStagedLineItemDiscount = this.hasStagedLineItemDiscount;
      result.id = this.id;
      result.image = this.image;
      result.originalUnitPriceSet = this.originalUnitPriceSet;
      result.quantity = this.quantity;
      result.restockable = this.restockable;
      result.restocking = this.restocking;
      result.sku = this.sku;
      result.stagedChanges = this.stagedChanges;
      result.title = this.title;
      result.uneditableSubtotalSet = this.uneditableSubtotalSet;
      result.variant = this.variant;
      result.variantTitle = this.variantTitle;
      return result;
    }

    /**
     * The discounts that have been allocated onto the line item by discount applications.
     */
    public Builder calculatedDiscountAllocations(
        List<CalculatedDiscountAllocation> calculatedDiscountAllocations) {
      this.calculatedDiscountAllocations = calculatedDiscountAllocations;
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
     * The discounts that have been allocated onto the line item by discount applications.
     */
    public Builder discountAllocations(List<DiscountAllocation> discountAllocations) {
      this.discountAllocations = discountAllocations;
      return this;
    }

    /**
     * The price of a single quantity of the line item with line item discounts
     * applied, in shop and presentment currencies. Discounts applied to the entire
     * order aren't included in this price.
     */
    public Builder discountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
      this.discountedUnitPriceSet = discountedUnitPriceSet;
      return this;
    }

    /**
     * The total number of items that can be edited.
     */
    public Builder editableQuantity(int editableQuantity) {
      this.editableQuantity = editableQuantity;
      return this;
    }

    /**
     * The editable quantity prior to any changes made in the current edit.
     */
    public Builder editableQuantityBeforeChanges(int editableQuantityBeforeChanges) {
      this.editableQuantityBeforeChanges = editableQuantityBeforeChanges;
      return this;
    }

    /**
     * The total price of editable lines in shop and presentment currencies.
     */
    public Builder editableSubtotalSet(MoneyBag editableSubtotalSet) {
      this.editableSubtotalSet = editableSubtotalSet;
      return this;
    }

    /**
     * Whether the calculated line item has a staged discount.
     */
    public Builder hasStagedLineItemDiscount(boolean hasStagedLineItemDiscount) {
      this.hasStagedLineItemDiscount = hasStagedLineItemDiscount;
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
     * The image object associated to the line item's variant.
     */
    public Builder image(Image image) {
      this.image = image;
      return this;
    }

    /**
     * The variant unit price in shop and presentment currencies, without any discounts applied.
     */
    public Builder originalUnitPriceSet(MoneyBag originalUnitPriceSet) {
      this.originalUnitPriceSet = originalUnitPriceSet;
      return this;
    }

    /**
     * The total number of items.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * Whether the line item can be restocked or not.
     */
    public Builder restockable(boolean restockable) {
      this.restockable = restockable;
      return this;
    }

    /**
     * Whether the changes on the line item will result in a restock.
     */
    public Builder restocking(boolean restocking) {
      this.restocking = restocking;
      return this;
    }

    /**
     * The variant SKU number.
     */
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    /**
     * A list of changes that affect this line item.
     */
    public Builder stagedChanges(List<OrderStagedChange> stagedChanges) {
      this.stagedChanges = stagedChanges;
      return this;
    }

    /**
     * The title of the product.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The total price of uneditable lines in shop and presentment currencies.
     */
    public Builder uneditableSubtotalSet(MoneyBag uneditableSubtotalSet) {
      this.uneditableSubtotalSet = uneditableSubtotalSet;
      return this;
    }

    /**
     * The product variant associated with this line item. The value is null for custom line items and items where
     * the variant has been deleted.
     */
    public Builder variant(ProductVariant variant) {
      this.variant = variant;
      return this;
    }

    /**
     * The title of the variant.
     */
    public Builder variantTitle(String variantTitle) {
      this.variantTitle = variantTitle;
      return this;
    }
  }
}
