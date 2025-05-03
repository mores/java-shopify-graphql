package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents a single line in an order. There is one line item for each distinct product variant.
 */
public class OrderLineItem {
  /**
   * The number of entries associated to the line item minus the items that have been removed.
   */
  private int currentQuantity;

  /**
   * List of custom attributes associated to the line item.
   */
  private List<Attribute> customAttributes;

  /**
   * The discounts that have been allocated onto the order line item by discount applications.
   */
  private List<DiscountAllocation> discountAllocations;

  /**
   * The total price of the line item, including discounts, and displayed in the presentment currency.
   */
  private MoneyV2 discountedTotalPrice;

  /**
   * The total price of the line item, not including any discounts. The total price
   * is calculated using the original unit price multiplied by the quantity, and
   * it's displayed in the presentment currency.
   */
  private MoneyV2 originalTotalPrice;

  /**
   * The number of products variants associated to the line item.
   */
  private int quantity;

  /**
   * The title of the product combined with title of the variant.
   */
  private String title;

  /**
   * The product variant object associated to the line item.
   */
  private ProductVariant variant;

  public OrderLineItem() {
  }

  /**
   * The number of entries associated to the line item minus the items that have been removed.
   */
  public int getCurrentQuantity() {
    return currentQuantity;
  }

  public void setCurrentQuantity(int currentQuantity) {
    this.currentQuantity = currentQuantity;
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
   * The discounts that have been allocated onto the order line item by discount applications.
   */
  public List<DiscountAllocation> getDiscountAllocations() {
    return discountAllocations;
  }

  public void setDiscountAllocations(List<DiscountAllocation> discountAllocations) {
    this.discountAllocations = discountAllocations;
  }

  /**
   * The total price of the line item, including discounts, and displayed in the presentment currency.
   */
  public MoneyV2 getDiscountedTotalPrice() {
    return discountedTotalPrice;
  }

  public void setDiscountedTotalPrice(MoneyV2 discountedTotalPrice) {
    this.discountedTotalPrice = discountedTotalPrice;
  }

  /**
   * The total price of the line item, not including any discounts. The total price
   * is calculated using the original unit price multiplied by the quantity, and
   * it's displayed in the presentment currency.
   */
  public MoneyV2 getOriginalTotalPrice() {
    return originalTotalPrice;
  }

  public void setOriginalTotalPrice(MoneyV2 originalTotalPrice) {
    this.originalTotalPrice = originalTotalPrice;
  }

  /**
   * The number of products variants associated to the line item.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The title of the product combined with title of the variant.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The product variant object associated to the line item.
   */
  public ProductVariant getVariant() {
    return variant;
  }

  public void setVariant(ProductVariant variant) {
    this.variant = variant;
  }

  @Override
  public String toString() {
    return "OrderLineItem{currentQuantity='" + currentQuantity + "', customAttributes='" + customAttributes + "', discountAllocations='" + discountAllocations + "', discountedTotalPrice='" + discountedTotalPrice + "', originalTotalPrice='" + originalTotalPrice + "', quantity='" + quantity + "', title='" + title + "', variant='" + variant + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderLineItem that = (OrderLineItem) o;
    return currentQuantity == that.currentQuantity &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(discountAllocations, that.discountAllocations) &&
        Objects.equals(discountedTotalPrice, that.discountedTotalPrice) &&
        Objects.equals(originalTotalPrice, that.originalTotalPrice) &&
        quantity == that.quantity &&
        Objects.equals(title, that.title) &&
        Objects.equals(variant, that.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentQuantity, customAttributes, discountAllocations, discountedTotalPrice, originalTotalPrice, quantity, title, variant);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The number of entries associated to the line item minus the items that have been removed.
     */
    private int currentQuantity;

    /**
     * List of custom attributes associated to the line item.
     */
    private List<Attribute> customAttributes;

    /**
     * The discounts that have been allocated onto the order line item by discount applications.
     */
    private List<DiscountAllocation> discountAllocations;

    /**
     * The total price of the line item, including discounts, and displayed in the presentment currency.
     */
    private MoneyV2 discountedTotalPrice;

    /**
     * The total price of the line item, not including any discounts. The total price
     * is calculated using the original unit price multiplied by the quantity, and
     * it's displayed in the presentment currency.
     */
    private MoneyV2 originalTotalPrice;

    /**
     * The number of products variants associated to the line item.
     */
    private int quantity;

    /**
     * The title of the product combined with title of the variant.
     */
    private String title;

    /**
     * The product variant object associated to the line item.
     */
    private ProductVariant variant;

    public OrderLineItem build() {
      OrderLineItem result = new OrderLineItem();
      result.currentQuantity = this.currentQuantity;
      result.customAttributes = this.customAttributes;
      result.discountAllocations = this.discountAllocations;
      result.discountedTotalPrice = this.discountedTotalPrice;
      result.originalTotalPrice = this.originalTotalPrice;
      result.quantity = this.quantity;
      result.title = this.title;
      result.variant = this.variant;
      return result;
    }

    /**
     * The number of entries associated to the line item minus the items that have been removed.
     */
    public Builder currentQuantity(int currentQuantity) {
      this.currentQuantity = currentQuantity;
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
     * The discounts that have been allocated onto the order line item by discount applications.
     */
    public Builder discountAllocations(List<DiscountAllocation> discountAllocations) {
      this.discountAllocations = discountAllocations;
      return this;
    }

    /**
     * The total price of the line item, including discounts, and displayed in the presentment currency.
     */
    public Builder discountedTotalPrice(MoneyV2 discountedTotalPrice) {
      this.discountedTotalPrice = discountedTotalPrice;
      return this;
    }

    /**
     * The total price of the line item, not including any discounts. The total price
     * is calculated using the original unit price multiplied by the quantity, and
     * it's displayed in the presentment currency.
     */
    public Builder originalTotalPrice(MoneyV2 originalTotalPrice) {
      this.originalTotalPrice = originalTotalPrice;
      return this;
    }

    /**
     * The number of products variants associated to the line item.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The title of the product combined with title of the variant.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The product variant object associated to the line item.
     */
    public Builder variant(ProductVariant variant) {
      this.variant = variant;
      return this;
    }
  }
}
