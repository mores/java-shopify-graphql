package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents a line item for a Shop Pay payment request.
 */
public class ShopPayPaymentRequestLineItem {
  /**
   * The final item price for the line item.
   */
  private MoneyV2 finalItemPrice;

  /**
   * The final line price for the line item.
   */
  private MoneyV2 finalLinePrice;

  /**
   * The image of the line item.
   */
  private ShopPayPaymentRequestImage image;

  /**
   * The item discounts for the line item.
   */
  private List<ShopPayPaymentRequestDiscount> itemDiscounts;

  /**
   * The label of the line item.
   */
  private String label;

  /**
   * The line discounts for the line item.
   */
  private List<ShopPayPaymentRequestDiscount> lineDiscounts;

  /**
   * The original item price for the line item.
   */
  private MoneyV2 originalItemPrice;

  /**
   * The original line price for the line item.
   */
  private MoneyV2 originalLinePrice;

  /**
   * The quantity of the line item.
   */
  private int quantity;

  /**
   * Whether the line item requires shipping.
   */
  private Boolean requiresShipping;

  /**
   * The SKU of the line item.
   */
  private String sku;

  public ShopPayPaymentRequestLineItem() {
  }

  /**
   * The final item price for the line item.
   */
  public MoneyV2 getFinalItemPrice() {
    return finalItemPrice;
  }

  public void setFinalItemPrice(MoneyV2 finalItemPrice) {
    this.finalItemPrice = finalItemPrice;
  }

  /**
   * The final line price for the line item.
   */
  public MoneyV2 getFinalLinePrice() {
    return finalLinePrice;
  }

  public void setFinalLinePrice(MoneyV2 finalLinePrice) {
    this.finalLinePrice = finalLinePrice;
  }

  /**
   * The image of the line item.
   */
  public ShopPayPaymentRequestImage getImage() {
    return image;
  }

  public void setImage(ShopPayPaymentRequestImage image) {
    this.image = image;
  }

  /**
   * The item discounts for the line item.
   */
  public List<ShopPayPaymentRequestDiscount> getItemDiscounts() {
    return itemDiscounts;
  }

  public void setItemDiscounts(List<ShopPayPaymentRequestDiscount> itemDiscounts) {
    this.itemDiscounts = itemDiscounts;
  }

  /**
   * The label of the line item.
   */
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * The line discounts for the line item.
   */
  public List<ShopPayPaymentRequestDiscount> getLineDiscounts() {
    return lineDiscounts;
  }

  public void setLineDiscounts(List<ShopPayPaymentRequestDiscount> lineDiscounts) {
    this.lineDiscounts = lineDiscounts;
  }

  /**
   * The original item price for the line item.
   */
  public MoneyV2 getOriginalItemPrice() {
    return originalItemPrice;
  }

  public void setOriginalItemPrice(MoneyV2 originalItemPrice) {
    this.originalItemPrice = originalItemPrice;
  }

  /**
   * The original line price for the line item.
   */
  public MoneyV2 getOriginalLinePrice() {
    return originalLinePrice;
  }

  public void setOriginalLinePrice(MoneyV2 originalLinePrice) {
    this.originalLinePrice = originalLinePrice;
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
   * Whether the line item requires shipping.
   */
  public Boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(Boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  /**
   * The SKU of the line item.
   */
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  @Override
  public String toString() {
    return "ShopPayPaymentRequestLineItem{finalItemPrice='" + finalItemPrice + "', finalLinePrice='" + finalLinePrice + "', image='" + image + "', itemDiscounts='" + itemDiscounts + "', label='" + label + "', lineDiscounts='" + lineDiscounts + "', originalItemPrice='" + originalItemPrice + "', originalLinePrice='" + originalLinePrice + "', quantity='" + quantity + "', requiresShipping='" + requiresShipping + "', sku='" + sku + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestLineItem that = (ShopPayPaymentRequestLineItem) o;
    return Objects.equals(finalItemPrice, that.finalItemPrice) &&
        Objects.equals(finalLinePrice, that.finalLinePrice) &&
        Objects.equals(image, that.image) &&
        Objects.equals(itemDiscounts, that.itemDiscounts) &&
        Objects.equals(label, that.label) &&
        Objects.equals(lineDiscounts, that.lineDiscounts) &&
        Objects.equals(originalItemPrice, that.originalItemPrice) &&
        Objects.equals(originalLinePrice, that.originalLinePrice) &&
        quantity == that.quantity &&
        Objects.equals(requiresShipping, that.requiresShipping) &&
        Objects.equals(sku, that.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finalItemPrice, finalLinePrice, image, itemDiscounts, label, lineDiscounts, originalItemPrice, originalLinePrice, quantity, requiresShipping, sku);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The final item price for the line item.
     */
    private MoneyV2 finalItemPrice;

    /**
     * The final line price for the line item.
     */
    private MoneyV2 finalLinePrice;

    /**
     * The image of the line item.
     */
    private ShopPayPaymentRequestImage image;

    /**
     * The item discounts for the line item.
     */
    private List<ShopPayPaymentRequestDiscount> itemDiscounts;

    /**
     * The label of the line item.
     */
    private String label;

    /**
     * The line discounts for the line item.
     */
    private List<ShopPayPaymentRequestDiscount> lineDiscounts;

    /**
     * The original item price for the line item.
     */
    private MoneyV2 originalItemPrice;

    /**
     * The original line price for the line item.
     */
    private MoneyV2 originalLinePrice;

    /**
     * The quantity of the line item.
     */
    private int quantity;

    /**
     * Whether the line item requires shipping.
     */
    private Boolean requiresShipping;

    /**
     * The SKU of the line item.
     */
    private String sku;

    public ShopPayPaymentRequestLineItem build() {
      ShopPayPaymentRequestLineItem result = new ShopPayPaymentRequestLineItem();
      result.finalItemPrice = this.finalItemPrice;
      result.finalLinePrice = this.finalLinePrice;
      result.image = this.image;
      result.itemDiscounts = this.itemDiscounts;
      result.label = this.label;
      result.lineDiscounts = this.lineDiscounts;
      result.originalItemPrice = this.originalItemPrice;
      result.originalLinePrice = this.originalLinePrice;
      result.quantity = this.quantity;
      result.requiresShipping = this.requiresShipping;
      result.sku = this.sku;
      return result;
    }

    /**
     * The final item price for the line item.
     */
    public Builder finalItemPrice(MoneyV2 finalItemPrice) {
      this.finalItemPrice = finalItemPrice;
      return this;
    }

    /**
     * The final line price for the line item.
     */
    public Builder finalLinePrice(MoneyV2 finalLinePrice) {
      this.finalLinePrice = finalLinePrice;
      return this;
    }

    /**
     * The image of the line item.
     */
    public Builder image(ShopPayPaymentRequestImage image) {
      this.image = image;
      return this;
    }

    /**
     * The item discounts for the line item.
     */
    public Builder itemDiscounts(List<ShopPayPaymentRequestDiscount> itemDiscounts) {
      this.itemDiscounts = itemDiscounts;
      return this;
    }

    /**
     * The label of the line item.
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * The line discounts for the line item.
     */
    public Builder lineDiscounts(List<ShopPayPaymentRequestDiscount> lineDiscounts) {
      this.lineDiscounts = lineDiscounts;
      return this;
    }

    /**
     * The original item price for the line item.
     */
    public Builder originalItemPrice(MoneyV2 originalItemPrice) {
      this.originalItemPrice = originalItemPrice;
      return this;
    }

    /**
     * The original line price for the line item.
     */
    public Builder originalLinePrice(MoneyV2 originalLinePrice) {
      this.originalLinePrice = originalLinePrice;
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
     * Whether the line item requires shipping.
     */
    public Builder requiresShipping(Boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    /**
     * The SKU of the line item.
     */
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }
  }
}
