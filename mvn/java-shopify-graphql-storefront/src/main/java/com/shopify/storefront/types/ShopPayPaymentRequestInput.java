package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields represent a Shop Pay payment request.
 */
public class ShopPayPaymentRequestInput {
  /**
   * The discount codes for the payment request.
   *   
   * The input must not contain more than `250` values.
   */
  private List<String> discountCodes;

  /**
   * The line items for the payment request.
   *   
   * The input must not contain more than `250` values.
   */
  private List<ShopPayPaymentRequestLineItemInput> lineItems;

  /**
   * The shipping lines for the payment request.
   *   
   * The input must not contain more than `250` values.
   */
  private List<ShopPayPaymentRequestShippingLineInput> shippingLines;

  /**
   * The total amount for the payment request.
   */
  private MoneyInput total;

  /**
   * The subtotal amount for the payment request.
   */
  private MoneyInput subtotal;

  /**
   * The discounts for the payment request order.
   *   
   * The input must not contain more than `250` values.
   */
  private List<ShopPayPaymentRequestDiscountInput> discounts;

  /**
   * The total shipping price for the payment request.
   */
  private ShopPayPaymentRequestTotalShippingPriceInput totalShippingPrice;

  /**
   * The total tax for the payment request.
   */
  private MoneyInput totalTax;

  /**
   * The delivery methods for the payment request.
   *   
   * The input must not contain more than `250` values.
   */
  private List<ShopPayPaymentRequestDeliveryMethodInput> deliveryMethods;

  /**
   * The delivery method type for the payment request.
   */
  private ShopPayPaymentRequestDeliveryMethodType selectedDeliveryMethodType;

  /**
   * The locale for the payment request.
   */
  private String locale;

  /**
   * The presentment currency for the payment request.
   */
  private CurrencyCode presentmentCurrency;

  /**
   * The encrypted payment method for the payment request.
   */
  private String paymentMethod;

  public ShopPayPaymentRequestInput() {
  }

  /**
   * The discount codes for the payment request.
   *   
   * The input must not contain more than `250` values.
   */
  public List<String> getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(List<String> discountCodes) {
    this.discountCodes = discountCodes;
  }

  /**
   * The line items for the payment request.
   *   
   * The input must not contain more than `250` values.
   */
  public List<ShopPayPaymentRequestLineItemInput> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<ShopPayPaymentRequestLineItemInput> lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * The shipping lines for the payment request.
   *   
   * The input must not contain more than `250` values.
   */
  public List<ShopPayPaymentRequestShippingLineInput> getShippingLines() {
    return shippingLines;
  }

  public void setShippingLines(List<ShopPayPaymentRequestShippingLineInput> shippingLines) {
    this.shippingLines = shippingLines;
  }

  /**
   * The total amount for the payment request.
   */
  public MoneyInput getTotal() {
    return total;
  }

  public void setTotal(MoneyInput total) {
    this.total = total;
  }

  /**
   * The subtotal amount for the payment request.
   */
  public MoneyInput getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(MoneyInput subtotal) {
    this.subtotal = subtotal;
  }

  /**
   * The discounts for the payment request order.
   *   
   * The input must not contain more than `250` values.
   */
  public List<ShopPayPaymentRequestDiscountInput> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<ShopPayPaymentRequestDiscountInput> discounts) {
    this.discounts = discounts;
  }

  /**
   * The total shipping price for the payment request.
   */
  public ShopPayPaymentRequestTotalShippingPriceInput getTotalShippingPrice() {
    return totalShippingPrice;
  }

  public void setTotalShippingPrice(
      ShopPayPaymentRequestTotalShippingPriceInput totalShippingPrice) {
    this.totalShippingPrice = totalShippingPrice;
  }

  /**
   * The total tax for the payment request.
   */
  public MoneyInput getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(MoneyInput totalTax) {
    this.totalTax = totalTax;
  }

  /**
   * The delivery methods for the payment request.
   *   
   * The input must not contain more than `250` values.
   */
  public List<ShopPayPaymentRequestDeliveryMethodInput> getDeliveryMethods() {
    return deliveryMethods;
  }

  public void setDeliveryMethods(List<ShopPayPaymentRequestDeliveryMethodInput> deliveryMethods) {
    this.deliveryMethods = deliveryMethods;
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
   * The locale for the payment request.
   */
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
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
   * The encrypted payment method for the payment request.
   */
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  @Override
  public String toString() {
    return "ShopPayPaymentRequestInput{discountCodes='" + discountCodes + "', lineItems='" + lineItems + "', shippingLines='" + shippingLines + "', total='" + total + "', subtotal='" + subtotal + "', discounts='" + discounts + "', totalShippingPrice='" + totalShippingPrice + "', totalTax='" + totalTax + "', deliveryMethods='" + deliveryMethods + "', selectedDeliveryMethodType='" + selectedDeliveryMethodType + "', locale='" + locale + "', presentmentCurrency='" + presentmentCurrency + "', paymentMethod='" + paymentMethod + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestInput that = (ShopPayPaymentRequestInput) o;
    return Objects.equals(discountCodes, that.discountCodes) &&
        Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(shippingLines, that.shippingLines) &&
        Objects.equals(total, that.total) &&
        Objects.equals(subtotal, that.subtotal) &&
        Objects.equals(discounts, that.discounts) &&
        Objects.equals(totalShippingPrice, that.totalShippingPrice) &&
        Objects.equals(totalTax, that.totalTax) &&
        Objects.equals(deliveryMethods, that.deliveryMethods) &&
        Objects.equals(selectedDeliveryMethodType, that.selectedDeliveryMethodType) &&
        Objects.equals(locale, that.locale) &&
        Objects.equals(presentmentCurrency, that.presentmentCurrency) &&
        Objects.equals(paymentMethod, that.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountCodes, lineItems, shippingLines, total, subtotal, discounts, totalShippingPrice, totalTax, deliveryMethods, selectedDeliveryMethodType, locale, presentmentCurrency, paymentMethod);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The discount codes for the payment request.
     *   
     * The input must not contain more than `250` values.
     */
    private List<String> discountCodes;

    /**
     * The line items for the payment request.
     *   
     * The input must not contain more than `250` values.
     */
    private List<ShopPayPaymentRequestLineItemInput> lineItems;

    /**
     * The shipping lines for the payment request.
     *   
     * The input must not contain more than `250` values.
     */
    private List<ShopPayPaymentRequestShippingLineInput> shippingLines;

    /**
     * The total amount for the payment request.
     */
    private MoneyInput total;

    /**
     * The subtotal amount for the payment request.
     */
    private MoneyInput subtotal;

    /**
     * The discounts for the payment request order.
     *   
     * The input must not contain more than `250` values.
     */
    private List<ShopPayPaymentRequestDiscountInput> discounts;

    /**
     * The total shipping price for the payment request.
     */
    private ShopPayPaymentRequestTotalShippingPriceInput totalShippingPrice;

    /**
     * The total tax for the payment request.
     */
    private MoneyInput totalTax;

    /**
     * The delivery methods for the payment request.
     *   
     * The input must not contain more than `250` values.
     */
    private List<ShopPayPaymentRequestDeliveryMethodInput> deliveryMethods;

    /**
     * The delivery method type for the payment request.
     */
    private ShopPayPaymentRequestDeliveryMethodType selectedDeliveryMethodType;

    /**
     * The locale for the payment request.
     */
    private String locale;

    /**
     * The presentment currency for the payment request.
     */
    private CurrencyCode presentmentCurrency;

    /**
     * The encrypted payment method for the payment request.
     */
    private String paymentMethod;

    public ShopPayPaymentRequestInput build() {
      ShopPayPaymentRequestInput result = new ShopPayPaymentRequestInput();
      result.discountCodes = this.discountCodes;
      result.lineItems = this.lineItems;
      result.shippingLines = this.shippingLines;
      result.total = this.total;
      result.subtotal = this.subtotal;
      result.discounts = this.discounts;
      result.totalShippingPrice = this.totalShippingPrice;
      result.totalTax = this.totalTax;
      result.deliveryMethods = this.deliveryMethods;
      result.selectedDeliveryMethodType = this.selectedDeliveryMethodType;
      result.locale = this.locale;
      result.presentmentCurrency = this.presentmentCurrency;
      result.paymentMethod = this.paymentMethod;
      return result;
    }

    /**
     * The discount codes for the payment request.
     *   
     * The input must not contain more than `250` values.
     */
    public Builder discountCodes(List<String> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
    }

    /**
     * The line items for the payment request.
     *   
     * The input must not contain more than `250` values.
     */
    public Builder lineItems(List<ShopPayPaymentRequestLineItemInput> lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * The shipping lines for the payment request.
     *   
     * The input must not contain more than `250` values.
     */
    public Builder shippingLines(List<ShopPayPaymentRequestShippingLineInput> shippingLines) {
      this.shippingLines = shippingLines;
      return this;
    }

    /**
     * The total amount for the payment request.
     */
    public Builder total(MoneyInput total) {
      this.total = total;
      return this;
    }

    /**
     * The subtotal amount for the payment request.
     */
    public Builder subtotal(MoneyInput subtotal) {
      this.subtotal = subtotal;
      return this;
    }

    /**
     * The discounts for the payment request order.
     *   
     * The input must not contain more than `250` values.
     */
    public Builder discounts(List<ShopPayPaymentRequestDiscountInput> discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * The total shipping price for the payment request.
     */
    public Builder totalShippingPrice(
        ShopPayPaymentRequestTotalShippingPriceInput totalShippingPrice) {
      this.totalShippingPrice = totalShippingPrice;
      return this;
    }

    /**
     * The total tax for the payment request.
     */
    public Builder totalTax(MoneyInput totalTax) {
      this.totalTax = totalTax;
      return this;
    }

    /**
     * The delivery methods for the payment request.
     *   
     * The input must not contain more than `250` values.
     */
    public Builder deliveryMethods(List<ShopPayPaymentRequestDeliveryMethodInput> deliveryMethods) {
      this.deliveryMethods = deliveryMethods;
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
     * The locale for the payment request.
     */
    public Builder locale(String locale) {
      this.locale = locale;
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
     * The encrypted payment method for the payment request.
     */
    public Builder paymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }
  }
}
