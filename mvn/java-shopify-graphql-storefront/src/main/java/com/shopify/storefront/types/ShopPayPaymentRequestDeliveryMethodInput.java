package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to create a delivery method for a Shop Pay payment request.
 */
public class ShopPayPaymentRequestDeliveryMethodInput {
  /**
   * The code of the delivery method.
   */
  private String code;

  /**
   * The label of the delivery method.
   */
  private String label;

  /**
   * The detail of the delivery method.
   */
  private String detail;

  /**
   * The amount for the delivery method.
   */
  private MoneyInput amount;

  /**
   * The minimum delivery date for the delivery method.
   */
  private String minDeliveryDate;

  /**
   * The maximum delivery date for the delivery method.
   */
  private String maxDeliveryDate;

  /**
   * The detail about when the delivery may be expected.
   */
  private String deliveryExpectationLabel;

  public ShopPayPaymentRequestDeliveryMethodInput() {
  }

  /**
   * The code of the delivery method.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * The label of the delivery method.
   */
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * The detail of the delivery method.
   */
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  /**
   * The amount for the delivery method.
   */
  public MoneyInput getAmount() {
    return amount;
  }

  public void setAmount(MoneyInput amount) {
    this.amount = amount;
  }

  /**
   * The minimum delivery date for the delivery method.
   */
  public String getMinDeliveryDate() {
    return minDeliveryDate;
  }

  public void setMinDeliveryDate(String minDeliveryDate) {
    this.minDeliveryDate = minDeliveryDate;
  }

  /**
   * The maximum delivery date for the delivery method.
   */
  public String getMaxDeliveryDate() {
    return maxDeliveryDate;
  }

  public void setMaxDeliveryDate(String maxDeliveryDate) {
    this.maxDeliveryDate = maxDeliveryDate;
  }

  /**
   * The detail about when the delivery may be expected.
   */
  public String getDeliveryExpectationLabel() {
    return deliveryExpectationLabel;
  }

  public void setDeliveryExpectationLabel(String deliveryExpectationLabel) {
    this.deliveryExpectationLabel = deliveryExpectationLabel;
  }

  @Override
  public String toString() {
    return "ShopPayPaymentRequestDeliveryMethodInput{code='" + code + "', label='" + label + "', detail='" + detail + "', amount='" + amount + "', minDeliveryDate='" + minDeliveryDate + "', maxDeliveryDate='" + maxDeliveryDate + "', deliveryExpectationLabel='" + deliveryExpectationLabel + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestDeliveryMethodInput that = (ShopPayPaymentRequestDeliveryMethodInput) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(label, that.label) &&
        Objects.equals(detail, that.detail) &&
        Objects.equals(amount, that.amount) &&
        Objects.equals(minDeliveryDate, that.minDeliveryDate) &&
        Objects.equals(maxDeliveryDate, that.maxDeliveryDate) &&
        Objects.equals(deliveryExpectationLabel, that.deliveryExpectationLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, label, detail, amount, minDeliveryDate, maxDeliveryDate, deliveryExpectationLabel);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The code of the delivery method.
     */
    private String code;

    /**
     * The label of the delivery method.
     */
    private String label;

    /**
     * The detail of the delivery method.
     */
    private String detail;

    /**
     * The amount for the delivery method.
     */
    private MoneyInput amount;

    /**
     * The minimum delivery date for the delivery method.
     */
    private String minDeliveryDate;

    /**
     * The maximum delivery date for the delivery method.
     */
    private String maxDeliveryDate;

    /**
     * The detail about when the delivery may be expected.
     */
    private String deliveryExpectationLabel;

    public ShopPayPaymentRequestDeliveryMethodInput build() {
      ShopPayPaymentRequestDeliveryMethodInput result = new ShopPayPaymentRequestDeliveryMethodInput();
      result.code = this.code;
      result.label = this.label;
      result.detail = this.detail;
      result.amount = this.amount;
      result.minDeliveryDate = this.minDeliveryDate;
      result.maxDeliveryDate = this.maxDeliveryDate;
      result.deliveryExpectationLabel = this.deliveryExpectationLabel;
      return result;
    }

    /**
     * The code of the delivery method.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * The label of the delivery method.
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * The detail of the delivery method.
     */
    public Builder detail(String detail) {
      this.detail = detail;
      return this;
    }

    /**
     * The amount for the delivery method.
     */
    public Builder amount(MoneyInput amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The minimum delivery date for the delivery method.
     */
    public Builder minDeliveryDate(String minDeliveryDate) {
      this.minDeliveryDate = minDeliveryDate;
      return this;
    }

    /**
     * The maximum delivery date for the delivery method.
     */
    public Builder maxDeliveryDate(String maxDeliveryDate) {
      this.maxDeliveryDate = maxDeliveryDate;
      return this;
    }

    /**
     * The detail about when the delivery may be expected.
     */
    public Builder deliveryExpectationLabel(String deliveryExpectationLabel) {
      this.deliveryExpectationLabel = deliveryExpectationLabel;
      return this;
    }
  }
}
