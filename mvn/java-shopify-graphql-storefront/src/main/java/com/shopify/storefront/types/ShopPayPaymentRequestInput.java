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
   * The delivery methods for the payment request.
   *   
   * The input must not contain more than `250` values.
   */
  private List<ShopPayPaymentRequestDeliveryMethodInput> deliveryMethods;

  /**
   * The discount codes for the payment request.
   *   
   * The input must not contain more than `250` values.
   */
  private List<String> discountCodes;

  /**
   * The discounts for the payment request order.
   *   
   * The input must not contain more than `250` values.
   */
  private List<ShopPayPaymentRequestDiscountInput> discounts;

  /**
   * The line items for the payment request.
   *   
   * The input must not contain more than `250` values.
   */
  private List<ShopPayPaymentRequestLineItemInput> lineItems;

  /**
   * The locale for the payment request.
   */
  private String locale;

  /**
   * The encrypted payment method for the payment request.
   */
  private String paymentMethod;

  /**
   * The presentment currency for the payment request.
   */
  private CurrencyCode presentmentCurrency;

  /**
   * The delivery method type for the payment request.
   */
  private ShopPayPaymentRequestDeliveryMethodType selectedDeliveryMethodType;

  /**
   * The shipping lines for the payment request.
   *   
   * The input must not contain more than `250` values.
   */
  private List<ShopPayPaymentRequestShippingLineInput> shippingLines;

  /**
   * The subtotal amount for the payment request.
   */
  private MoneyInput subtotal;

  /**
   * The total amount for the payment request.
   */
  private MoneyInput total;

  /**
   * The total shipping price for the payment request.
   */
  private ShopPayPaymentRequestTotalShippingPriceInput totalShippingPrice;

  /**
   * The total tax for the payment request.
   */
  private MoneyInput totalTax;

  public ShopPayPaymentRequestInput() {
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
   * The locale for the payment request.
   */
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
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
   * The subtotal amount for the payment request.
   */
  public MoneyInput getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(MoneyInput subtotal) {
    this.subtotal = subtotal;
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

  @Override
  public String toString() {
    return "ShopPayPaymentRequestInput{deliveryMethods='" + deliveryMethods + "', discountCodes='" + discountCodes + "', discounts='" + discounts + "', lineItems='" + lineItems + "', locale='" + locale + "', paymentMethod='" + paymentMethod + "', presentmentCurrency='" + presentmentCurrency + "', selectedDeliveryMethodType='" + selectedDeliveryMethodType + "', shippingLines='" + shippingLines + "', subtotal='" + subtotal + "', total='" + total + "', totalShippingPrice='" + totalShippingPrice + "', totalTax='" + totalTax + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestInput that = (ShopPayPaymentRequestInput) o;
    return Objects.equals(deliveryMethods, that.deliveryMethods) &&
        Objects.equals(discountCodes, that.discountCodes) &&
        Objects.equals(discounts, that.discounts) &&
        Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(locale, that.locale) &&
        Objects.equals(paymentMethod, that.paymentMethod) &&
        Objects.equals(presentmentCurrency, that.presentmentCurrency) &&
        Objects.equals(selectedDeliveryMethodType, that.selectedDeliveryMethodType) &&
        Objects.equals(shippingLines, that.shippingLines) &&
        Objects.equals(subtotal, that.subtotal) &&
        Objects.equals(total, that.total) &&
        Objects.equals(totalShippingPrice, that.totalShippingPrice) &&
        Objects.equals(totalTax, that.totalTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryMethods, discountCodes, discounts, lineItems, locale, paymentMethod, presentmentCurrency, selectedDeliveryMethodType, shippingLines, subtotal, total, totalShippingPrice, totalTax);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The delivery methods for the payment request.
     *   
     * The input must not contain more than `250` values.
     */
    private List<ShopPayPaymentRequestDeliveryMethodInput> deliveryMethods;

    /**
     * The discount codes for the payment request.
     *   
     * The input must not contain more than `250` values.
     */
    private List<String> discountCodes;

    /**
     * The discounts for the payment request order.
     *   
     * The input must not contain more than `250` values.
     */
    private List<ShopPayPaymentRequestDiscountInput> discounts;

    /**
     * The line items for the payment request.
     *   
     * The input must not contain more than `250` values.
     */
    private List<ShopPayPaymentRequestLineItemInput> lineItems;

    /**
     * The locale for the payment request.
     */
    private String locale;

    /**
     * The encrypted payment method for the payment request.
     */
    private String paymentMethod;

    /**
     * The presentment currency for the payment request.
     */
    private CurrencyCode presentmentCurrency;

    /**
     * The delivery method type for the payment request.
     */
    private ShopPayPaymentRequestDeliveryMethodType selectedDeliveryMethodType;

    /**
     * The shipping lines for the payment request.
     *   
     * The input must not contain more than `250` values.
     */
    private List<ShopPayPaymentRequestShippingLineInput> shippingLines;

    /**
     * The subtotal amount for the payment request.
     */
    private MoneyInput subtotal;

    /**
     * The total amount for the payment request.
     */
    private MoneyInput total;

    /**
     * The total shipping price for the payment request.
     */
    private ShopPayPaymentRequestTotalShippingPriceInput totalShippingPrice;

    /**
     * The total tax for the payment request.
     */
    private MoneyInput totalTax;

    public ShopPayPaymentRequestInput build() {
      ShopPayPaymentRequestInput result = new ShopPayPaymentRequestInput();
      result.deliveryMethods = this.deliveryMethods;
      result.discountCodes = this.discountCodes;
      result.discounts = this.discounts;
      result.lineItems = this.lineItems;
      result.locale = this.locale;
      result.paymentMethod = this.paymentMethod;
      result.presentmentCurrency = this.presentmentCurrency;
      result.selectedDeliveryMethodType = this.selectedDeliveryMethodType;
      result.shippingLines = this.shippingLines;
      result.subtotal = this.subtotal;
      result.total = this.total;
      result.totalShippingPrice = this.totalShippingPrice;
      result.totalTax = this.totalTax;
      return result;
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
     * The discount codes for the payment request.
     *   
     * The input must not contain more than `250` values.
     */
    public Builder discountCodes(List<String> discountCodes) {
      this.discountCodes = discountCodes;
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
     * The line items for the payment request.
     *   
     * The input must not contain more than `250` values.
     */
    public Builder lineItems(List<ShopPayPaymentRequestLineItemInput> lineItems) {
      this.lineItems = lineItems;
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
     * The encrypted payment method for the payment request.
     */
    public Builder paymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
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
     * The shipping lines for the payment request.
     *   
     * The input must not contain more than `250` values.
     */
    public Builder shippingLines(List<ShopPayPaymentRequestShippingLineInput> shippingLines) {
      this.shippingLines = shippingLines;
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
     * The total amount for the payment request.
     */
    public Builder total(MoneyInput total) {
      this.total = total;
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
  }
}
