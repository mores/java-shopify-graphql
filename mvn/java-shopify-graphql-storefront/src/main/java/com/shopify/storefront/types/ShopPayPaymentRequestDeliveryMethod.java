package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a delivery method for a Shop Pay payment request.
 */
public class ShopPayPaymentRequestDeliveryMethod {
  /**
   * The amount for the delivery method.
   */
  private MoneyV2 amount;

  /**
   * The code of the delivery method.
   */
  private String code;

  /**
   * The detail about when the delivery may be expected.
   */
  private String deliveryExpectationLabel;

  /**
   * The detail of the delivery method.
   */
  private String detail;

  /**
   * The label of the delivery method.
   */
  private String label;

  /**
   * The maximum delivery date for the delivery method.
   */
  private String maxDeliveryDate;

  /**
   * The minimum delivery date for the delivery method.
   */
  private String minDeliveryDate;

  public ShopPayPaymentRequestDeliveryMethod() {
  }

  /**
   * The amount for the delivery method.
   */
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
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
   * The detail about when the delivery may be expected.
   */
  public String getDeliveryExpectationLabel() {
    return deliveryExpectationLabel;
  }

  public void setDeliveryExpectationLabel(String deliveryExpectationLabel) {
    this.deliveryExpectationLabel = deliveryExpectationLabel;
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
   * The label of the delivery method.
   */
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
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
   * The minimum delivery date for the delivery method.
   */
  public String getMinDeliveryDate() {
    return minDeliveryDate;
  }

  public void setMinDeliveryDate(String minDeliveryDate) {
    this.minDeliveryDate = minDeliveryDate;
  }

  @Override
  public String toString() {
    return "ShopPayPaymentRequestDeliveryMethod{amount='" + amount + "', code='" + code + "', deliveryExpectationLabel='" + deliveryExpectationLabel + "', detail='" + detail + "', label='" + label + "', maxDeliveryDate='" + maxDeliveryDate + "', minDeliveryDate='" + minDeliveryDate + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestDeliveryMethod that = (ShopPayPaymentRequestDeliveryMethod) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(code, that.code) &&
        Objects.equals(deliveryExpectationLabel, that.deliveryExpectationLabel) &&
        Objects.equals(detail, that.detail) &&
        Objects.equals(label, that.label) &&
        Objects.equals(maxDeliveryDate, that.maxDeliveryDate) &&
        Objects.equals(minDeliveryDate, that.minDeliveryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, code, deliveryExpectationLabel, detail, label, maxDeliveryDate, minDeliveryDate);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The amount for the delivery method.
     */
    private MoneyV2 amount;

    /**
     * The code of the delivery method.
     */
    private String code;

    /**
     * The detail about when the delivery may be expected.
     */
    private String deliveryExpectationLabel;

    /**
     * The detail of the delivery method.
     */
    private String detail;

    /**
     * The label of the delivery method.
     */
    private String label;

    /**
     * The maximum delivery date for the delivery method.
     */
    private String maxDeliveryDate;

    /**
     * The minimum delivery date for the delivery method.
     */
    private String minDeliveryDate;

    public ShopPayPaymentRequestDeliveryMethod build() {
      ShopPayPaymentRequestDeliveryMethod result = new ShopPayPaymentRequestDeliveryMethod();
      result.amount = this.amount;
      result.code = this.code;
      result.deliveryExpectationLabel = this.deliveryExpectationLabel;
      result.detail = this.detail;
      result.label = this.label;
      result.maxDeliveryDate = this.maxDeliveryDate;
      result.minDeliveryDate = this.minDeliveryDate;
      return result;
    }

    /**
     * The amount for the delivery method.
     */
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The code of the delivery method.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * The detail about when the delivery may be expected.
     */
    public Builder deliveryExpectationLabel(String deliveryExpectationLabel) {
      this.deliveryExpectationLabel = deliveryExpectationLabel;
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
     * The label of the delivery method.
     */
    public Builder label(String label) {
      this.label = label;
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
     * The minimum delivery date for the delivery method.
     */
    public Builder minDeliveryDate(String minDeliveryDate) {
      this.minDeliveryDate = minDeliveryDate;
      return this;
    }
  }
}
