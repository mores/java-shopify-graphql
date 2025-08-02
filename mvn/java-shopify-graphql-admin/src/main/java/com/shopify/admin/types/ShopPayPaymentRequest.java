package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents a Shop Pay payment request.
 */
public class ShopPayPaymentRequest {
  /**
   * The discounts for the payment request order.
   */
  private List<ShopPayPaymentRequestDiscount> discounts;

  /**
   * The line items for the payment request.
   */
  private List<ShopPayPaymentRequestLineItem> lineItems;

  /**
   * The presentment currency for the payment request.
   */
  private CurrencyCode presentmentCurrency;

  /**
   * The delivery method type for the payment request.
   */
  private ShopPayPaymentRequestDeliveryMethodType selectedDeliveryMethodType;

  /**
   * The shipping address for the payment request.
   */
  private ShopPayPaymentRequestContactField shippingAddress;

  /**
   * The shipping lines for the payment request.
   */
  private List<ShopPayPaymentRequestShippingLine> shippingLines;

  /**
   * The subtotal amount for the payment request.
   */
  private MoneyV2 subtotal;

  /**
   * The total amount for the payment request.
   */
  private MoneyV2 total;

  /**
   * The total shipping price for the payment request.
   */
  private ShopPayPaymentRequestTotalShippingPrice totalShippingPrice;

  /**
   * The total tax for the payment request.
   */
  private MoneyV2 totalTax;

  public ShopPayPaymentRequest() {
  }

  /**
   * The discounts for the payment request order.
   */
  public List<ShopPayPaymentRequestDiscount> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<ShopPayPaymentRequestDiscount> discounts) {
    this.discounts = discounts;
  }

  /**
   * The line items for the payment request.
   */
  public List<ShopPayPaymentRequestLineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<ShopPayPaymentRequestLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * The presentment currency for the payment request.
   */
  public CurrencyCode getPresentmentCurrency() {
    return presentmentCurrency;
  }

  public void setPresentmentCurrency(CurrencyCode presentmentCurrency) {
    this.presentmentCurrency = presentmentCurrency;
  }

  /**
   * The delivery method type for the payment request.
   */
  public ShopPayPaymentRequestDeliveryMethodType getSelectedDeliveryMethodType() {
    return selectedDeliveryMethodType;
  }

  public void setSelectedDeliveryMethodType(
      ShopPayPaymentRequestDeliveryMethodType selectedDeliveryMethodType) {
    this.selectedDeliveryMethodType = selectedDeliveryMethodType;
  }

  /**
   * The shipping address for the payment request.
   */
  public ShopPayPaymentRequestContactField getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(ShopPayPaymentRequestContactField shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  /**
   * The shipping lines for the payment request.
   */
  public List<ShopPayPaymentRequestShippingLine> getShippingLines() {
    return shippingLines;
  }

  public void setShippingLines(List<ShopPayPaymentRequestShippingLine> shippingLines) {
    this.shippingLines = shippingLines;
  }

  /**
   * The subtotal amount for the payment request.
   */
  public MoneyV2 getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(MoneyV2 subtotal) {
    this.subtotal = subtotal;
  }

  /**
   * The total amount for the payment request.
   */
  public MoneyV2 getTotal() {
    return total;
  }

  public void setTotal(MoneyV2 total) {
    this.total = total;
  }

  /**
   * The total shipping price for the payment request.
   */
  public ShopPayPaymentRequestTotalShippingPrice getTotalShippingPrice() {
    return totalShippingPrice;
  }

  public void setTotalShippingPrice(ShopPayPaymentRequestTotalShippingPrice totalShippingPrice) {
    this.totalShippingPrice = totalShippingPrice;
  }

  /**
   * The total tax for the payment request.
   */
  public MoneyV2 getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(MoneyV2 totalTax) {
    this.totalTax = totalTax;
  }

  @Override
  public String toString() {
    return "ShopPayPaymentRequest{discounts='" + discounts + "', lineItems='" + lineItems + "', presentmentCurrency='" + presentmentCurrency + "', selectedDeliveryMethodType='" + selectedDeliveryMethodType + "', shippingAddress='" + shippingAddress + "', shippingLines='" + shippingLines + "', subtotal='" + subtotal + "', total='" + total + "', totalShippingPrice='" + totalShippingPrice + "', totalTax='" + totalTax + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequest that = (ShopPayPaymentRequest) o;
    return Objects.equals(discounts, that.discounts) &&
        Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(presentmentCurrency, that.presentmentCurrency) &&
        Objects.equals(selectedDeliveryMethodType, that.selectedDeliveryMethodType) &&
        Objects.equals(shippingAddress, that.shippingAddress) &&
        Objects.equals(shippingLines, that.shippingLines) &&
        Objects.equals(subtotal, that.subtotal) &&
        Objects.equals(total, that.total) &&
        Objects.equals(totalShippingPrice, that.totalShippingPrice) &&
        Objects.equals(totalTax, that.totalTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discounts, lineItems, presentmentCurrency, selectedDeliveryMethodType, shippingAddress, shippingLines, subtotal, total, totalShippingPrice, totalTax);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The discounts for the payment request order.
     */
    private List<ShopPayPaymentRequestDiscount> discounts;

    /**
     * The line items for the payment request.
     */
    private List<ShopPayPaymentRequestLineItem> lineItems;

    /**
     * The presentment currency for the payment request.
     */
    private CurrencyCode presentmentCurrency;

    /**
     * The delivery method type for the payment request.
     */
    private ShopPayPaymentRequestDeliveryMethodType selectedDeliveryMethodType;

    /**
     * The shipping address for the payment request.
     */
    private ShopPayPaymentRequestContactField shippingAddress;

    /**
     * The shipping lines for the payment request.
     */
    private List<ShopPayPaymentRequestShippingLine> shippingLines;

    /**
     * The subtotal amount for the payment request.
     */
    private MoneyV2 subtotal;

    /**
     * The total amount for the payment request.
     */
    private MoneyV2 total;

    /**
     * The total shipping price for the payment request.
     */
    private ShopPayPaymentRequestTotalShippingPrice totalShippingPrice;

    /**
     * The total tax for the payment request.
     */
    private MoneyV2 totalTax;

    public ShopPayPaymentRequest build() {
      ShopPayPaymentRequest result = new ShopPayPaymentRequest();
      result.discounts = this.discounts;
      result.lineItems = this.lineItems;
      result.presentmentCurrency = this.presentmentCurrency;
      result.selectedDeliveryMethodType = this.selectedDeliveryMethodType;
      result.shippingAddress = this.shippingAddress;
      result.shippingLines = this.shippingLines;
      result.subtotal = this.subtotal;
      result.total = this.total;
      result.totalShippingPrice = this.totalShippingPrice;
      result.totalTax = this.totalTax;
      return result;
    }

    /**
     * The discounts for the payment request order.
     */
    public Builder discounts(List<ShopPayPaymentRequestDiscount> discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * The line items for the payment request.
     */
    public Builder lineItems(List<ShopPayPaymentRequestLineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * The presentment currency for the payment request.
     */
    public Builder presentmentCurrency(CurrencyCode presentmentCurrency) {
      this.presentmentCurrency = presentmentCurrency;
      return this;
    }

    /**
     * The delivery method type for the payment request.
     */
    public Builder selectedDeliveryMethodType(
        ShopPayPaymentRequestDeliveryMethodType selectedDeliveryMethodType) {
      this.selectedDeliveryMethodType = selectedDeliveryMethodType;
      return this;
    }

    /**
     * The shipping address for the payment request.
     */
    public Builder shippingAddress(ShopPayPaymentRequestContactField shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    /**
     * The shipping lines for the payment request.
     */
    public Builder shippingLines(List<ShopPayPaymentRequestShippingLine> shippingLines) {
      this.shippingLines = shippingLines;
      return this;
    }

    /**
     * The subtotal amount for the payment request.
     */
    public Builder subtotal(MoneyV2 subtotal) {
      this.subtotal = subtotal;
      return this;
    }

    /**
     * The total amount for the payment request.
     */
    public Builder total(MoneyV2 total) {
      this.total = total;
      return this;
    }

    /**
     * The total shipping price for the payment request.
     */
    public Builder totalShippingPrice(ShopPayPaymentRequestTotalShippingPrice totalShippingPrice) {
      this.totalShippingPrice = totalShippingPrice;
      return this;
    }

    /**
     * The total tax for the payment request.
     */
    public Builder totalTax(MoneyV2 totalTax) {
      this.totalTax = totalTax;
      return this;
    }
  }
}
