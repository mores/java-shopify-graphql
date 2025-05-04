package com.shopify.storefront.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to create a line item for a Shop Pay payment request.
 */
public class ShopPayPaymentRequestLineItemInput {
  /**
   * The label of the line item.
   */
  private String label;

  /**
   * The quantity of the line item.
   */
  private int quantity;

  /**
   * The SKU of the line item.
   */
  private String sku;

  /**
   * Whether the line item requires shipping.
   */
  private Boolean requiresShipping;

  /**
   * The image of the line item.
   */
  private ShopPayPaymentRequestImageInput image;

  /**
   * The original line price for the line item.
   */
  private MoneyInput originalLinePrice;

  /**
   * The final line price for the line item.
   */
  private MoneyInput finalLinePrice;

  /**
   * The line discounts for the line item.
   *   
   * The input must not contain more than `250` values.
   */
  private List<ShopPayPaymentRequestDiscountInput> lineDiscounts;

  /**
   * The original item price for the line item.
   */
  private MoneyInput originalItemPrice;

  /**
   * The final item price for the line item.
   */
  private MoneyInput finalItemPrice;

  /**
   * The item discounts for the line item.
   *   
   * The input must not contain more than `250` values.
   */
  private List<ShopPayPaymentRequestDiscountInput> itemDiscounts;

  public ShopPayPaymentRequestLineItemInput() {
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
   * The quantity of the line item.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
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
   * The image of the line item.
   */
  public ShopPayPaymentRequestImageInput getImage() {
    return image;
  }

  public void setImage(ShopPayPaymentRequestImageInput image) {
    this.image = image;
  }

  /**
   * The original line price for the line item.
   */
  public MoneyInput getOriginalLinePrice() {
    return originalLinePrice;
  }

  public void setOriginalLinePrice(MoneyInput originalLinePrice) {
    this.originalLinePrice = originalLinePrice;
  }

  /**
   * The final line price for the line item.
   */
  public MoneyInput getFinalLinePrice() {
    return finalLinePrice;
  }

  public void setFinalLinePrice(MoneyInput finalLinePrice) {
    this.finalLinePrice = finalLinePrice;
  }

  /**
   * The line discounts for the line item.
   *   
   * The input must not contain more than `250` values.
   */
  public List<ShopPayPaymentRequestDiscountInput> getLineDiscounts() {
    return lineDiscounts;
  }

  public void setLineDiscounts(List<ShopPayPaymentRequestDiscountInput> lineDiscounts) {
    this.lineDiscounts = lineDiscounts;
  }

  /**
   * The original item price for the line item.
   */
  public MoneyInput getOriginalItemPrice() {
    return originalItemPrice;
  }

  public void setOriginalItemPrice(MoneyInput originalItemPrice) {
    this.originalItemPrice = originalItemPrice;
  }

  /**
   * The final item price for the line item.
   */
  public MoneyInput getFinalItemPrice() {
    return finalItemPrice;
  }

  public void setFinalItemPrice(MoneyInput finalItemPrice) {
    this.finalItemPrice = finalItemPrice;
  }

  /**
   * The item discounts for the line item.
   *   
   * The input must not contain more than `250` values.
   */
  public List<ShopPayPaymentRequestDiscountInput> getItemDiscounts() {
    return itemDiscounts;
  }

  public void setItemDiscounts(List<ShopPayPaymentRequestDiscountInput> itemDiscounts) {
    this.itemDiscounts = itemDiscounts;
  }

  @Override
  public String toString() {
    return "ShopPayPaymentRequestLineItemInput{label='" + label + "', quantity='" + quantity + "', sku='" + sku + "', requiresShipping='" + requiresShipping + "', image='" + image + "', originalLinePrice='" + originalLinePrice + "', finalLinePrice='" + finalLinePrice + "', lineDiscounts='" + lineDiscounts + "', originalItemPrice='" + originalItemPrice + "', finalItemPrice='" + finalItemPrice + "', itemDiscounts='" + itemDiscounts + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestLineItemInput that = (ShopPayPaymentRequestLineItemInput) o;
    return Objects.equals(label, that.label) &&
        quantity == that.quantity &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(requiresShipping, that.requiresShipping) &&
        Objects.equals(image, that.image) &&
        Objects.equals(originalLinePrice, that.originalLinePrice) &&
        Objects.equals(finalLinePrice, that.finalLinePrice) &&
        Objects.equals(lineDiscounts, that.lineDiscounts) &&
        Objects.equals(originalItemPrice, that.originalItemPrice) &&
        Objects.equals(finalItemPrice, that.finalItemPrice) &&
        Objects.equals(itemDiscounts, that.itemDiscounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, quantity, sku, requiresShipping, image, originalLinePrice, finalLinePrice, lineDiscounts, originalItemPrice, finalItemPrice, itemDiscounts);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The label of the line item.
     */
    private String label;

    /**
     * The quantity of the line item.
     */
    private int quantity;

    /**
     * The SKU of the line item.
     */
    private String sku;

    /**
     * Whether the line item requires shipping.
     */
    private Boolean requiresShipping;

    /**
     * The image of the line item.
     */
    private ShopPayPaymentRequestImageInput image;

    /**
     * The original line price for the line item.
     */
    private MoneyInput originalLinePrice;

    /**
     * The final line price for the line item.
     */
    private MoneyInput finalLinePrice;

    /**
     * The line discounts for the line item.
     *   
     * The input must not contain more than `250` values.
     */
    private List<ShopPayPaymentRequestDiscountInput> lineDiscounts;

    /**
     * The original item price for the line item.
     */
    private MoneyInput originalItemPrice;

    /**
     * The final item price for the line item.
     */
    private MoneyInput finalItemPrice;

    /**
     * The item discounts for the line item.
     *   
     * The input must not contain more than `250` values.
     */
    private List<ShopPayPaymentRequestDiscountInput> itemDiscounts;

    public ShopPayPaymentRequestLineItemInput build() {
      ShopPayPaymentRequestLineItemInput result = new ShopPayPaymentRequestLineItemInput();
      result.label = this.label;
      result.quantity = this.quantity;
      result.sku = this.sku;
      result.requiresShipping = this.requiresShipping;
      result.image = this.image;
      result.originalLinePrice = this.originalLinePrice;
      result.finalLinePrice = this.finalLinePrice;
      result.lineDiscounts = this.lineDiscounts;
      result.originalItemPrice = this.originalItemPrice;
      result.finalItemPrice = this.finalItemPrice;
      result.itemDiscounts = this.itemDiscounts;
      return result;
    }

    /**
     * The label of the line item.
     */
    public Builder label(String label) {
      this.label = label;
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
     * The SKU of the line item.
     */
    public Builder sku(String sku) {
      this.sku = sku;
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
     * The image of the line item.
     */
    public Builder image(ShopPayPaymentRequestImageInput image) {
      this.image = image;
      return this;
    }

    /**
     * The original line price for the line item.
     */
    public Builder originalLinePrice(MoneyInput originalLinePrice) {
      this.originalLinePrice = originalLinePrice;
      return this;
    }

    /**
     * The final line price for the line item.
     */
    public Builder finalLinePrice(MoneyInput finalLinePrice) {
      this.finalLinePrice = finalLinePrice;
      return this;
    }

    /**
     * The line discounts for the line item.
     *   
     * The input must not contain more than `250` values.
     */
    public Builder lineDiscounts(List<ShopPayPaymentRequestDiscountInput> lineDiscounts) {
      this.lineDiscounts = lineDiscounts;
      return this;
    }

    /**
     * The original item price for the line item.
     */
    public Builder originalItemPrice(MoneyInput originalItemPrice) {
      this.originalItemPrice = originalItemPrice;
      return this;
    }

    /**
     * The final item price for the line item.
     */
    public Builder finalItemPrice(MoneyInput finalItemPrice) {
      this.finalItemPrice = finalItemPrice;
      return this;
    }

    /**
     * The item discounts for the line item.
     *   
     * The input must not contain more than `250` values.
     */
    public Builder itemDiscounts(List<ShopPayPaymentRequestDiscountInput> itemDiscounts) {
      this.itemDiscounts = itemDiscounts;
      return this;
    }
  }
}
